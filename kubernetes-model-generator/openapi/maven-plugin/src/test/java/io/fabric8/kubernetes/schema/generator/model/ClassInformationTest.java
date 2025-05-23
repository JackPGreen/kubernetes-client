/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.schema.generator.model;

import io.fabric8.kubernetes.schema.generator.GeneratorSettings;
import io.fabric8.kubernetes.schema.generator.schema.SchemaUtils;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassInformationTest {

  private ClassInformation classInformation;

  @Nested
  class Interface {

    @BeforeEach
    void setUp() {
      final var schemaUtils = new SchemaUtils(GeneratorSettings.builder().build());
      final var schema = new ObjectSchema();
      schema.addExtension("x-kubernetes-fabric8-type", "interface");
      schema.addExtension("x-kubernetes-fabric8-implementation", "InterfaceImplementationOne,InterfaceImplementationTwo");
      final Map.Entry<String, Schema<?>> clazz = Map.entry("io.fabric8.kubernetes.Interface", schema);
      classInformation = new ClassInformation(schemaUtils, clazz, Collections.emptySet());
    }

    @Test
    void getKubernetesListType() {
      assertThat(classInformation.getKubernetesListType()).isNull();
    }

    @Test
    void getPackageName() {
      assertThat(classInformation.getPackageName()).isEqualTo("io.fabric8.kubernetes");
    }

    @Test
    void isInterface() {
      assertThat(classInformation.isInterface()).isTrue();
    }

    @Test
    void isEnum() {
      assertThat(classInformation.isEnum()).isFalse();
    }

    @Test
    void isHasMetadata() {
      assertThat(classInformation.isHasMetadata()).isFalse();
    }

    @Test
    void isNamespaced() {
      assertThat(classInformation.isNamespaced()).isFalse();
    }

    @Test
    void isEditable() {
      assertThat(classInformation.isEditable()).isFalse();
    }

    @Test
    void classType() {
      assertThat(classInformation.getClassType()).isEqualTo("interface");
    }

    @Test
    void getClassSimpleName() {
      assertThat(classInformation.getClassSimpleName()).isEqualTo("Interface");
    }

    @Test
    void getClassName() {
      assertThat(classInformation.getClassName()).isEqualTo("io.fabric8.kubernetes.Interface");
    }

    @Test
    void getImplementsExtends() {
      assertThat(classInformation.getImplementsExtends()).isEqualTo("extends KubernetesResource");
    }

    @Test
    void getJsonSubTypes() {
      assertThat(classInformation.getJsonSubTypes())
          .extracting(JsonSubTypes::getSubTypes)
          .asInstanceOf(InstanceOfAssertFactories.list(String.class))
          .containsExactly("InterfaceImplementationOne", "InterfaceImplementationTwo");
    }

    @Test
    void getImports() {
      assertThat(classInformation.getImports())
          .containsExactly(
              "com.fasterxml.jackson.annotation.JsonSubTypes",
              "com.fasterxml.jackson.annotation.JsonTypeInfo",
              "com.fasterxml.jackson.databind.annotation.JsonTypeResolver",
              "io.fabric8.kubernetes.api.model.KubernetesResource");
    }
  }

  @Nested
  class Enum {

    @BeforeEach
    void setUp() {
      final var schemaUtils = new SchemaUtils(GeneratorSettings.builder().build());
      final var schema = new ObjectSchema();
      schema.addExtension("x-kubernetes-fabric8-type", "enum");
      schema.addExtension("x-kubernetes-fabric8-enum-values", "ACTIVE(0),INACTIVE(1),AUTO(2)");
      final Map.Entry<String, Schema<?>> clazz = Map.entry("io.fabric8.kubernetes.Mode", schema);
      classInformation = new ClassInformation(schemaUtils, clazz, Collections.emptySet());
    }

    @Test
    void getKubernetesListType() {
      assertThat(classInformation.getKubernetesListType()).isNull();
    }

    @Test
    void getPackageName() {
      assertThat(classInformation.getPackageName()).isEqualTo("io.fabric8.kubernetes");
    }

    @Test
    void isInterface() {
      assertThat(classInformation.isInterface()).isFalse();
    }

    @Test
    void isEnum() {
      assertThat(classInformation.isEnum()).isTrue();
    }

    @Test
    void isHasMetadata() {
      assertThat(classInformation.isHasMetadata()).isFalse();
    }

    @Test
    void isNamespaced() {
      assertThat(classInformation.isNamespaced()).isFalse();
    }

    @Test
    void isEditable() {
      assertThat(classInformation.isEditable()).isFalse();
    }

    @Test
    void classType() {
      assertThat(classInformation.getClassType()).isEqualTo("enum");
    }

    @Test
    void getClassSimpleName() {
      assertThat(classInformation.getClassSimpleName()).isEqualTo("Mode");
    }

    @Test
    void getClassName() {
      assertThat(classInformation.getClassName()).isEqualTo("io.fabric8.kubernetes.Mode");
    }

    @Test
    void getImplementsExtends() {
      assertThat(classInformation.getImplementsExtends()).isEmpty();
    }

    @Test
    void getJsonSubTypes() {
      assertThat(classInformation.getJsonSubTypes()).isNull();
    }

    @Test
    void getImports() {
      assertThat(classInformation.getImports())
          .containsExactly(
              "com.fasterxml.jackson.annotation.JsonCreator");
    }
  }

  @Nested
  class HasOverride {

    @TempDir
    File overridesDirectory;

    @BeforeEach
    void setUp() {
      final var schemaUtils = new SchemaUtils(GeneratorSettings.builder()
          .overridesDirectory(overridesDirectory)
          .build());
      final var schema = new ObjectSchema();
      final Map.Entry<String, Schema<?>> clazz = Map.entry("io.fabric8.kubernetes.ClassWithOverride", schema);
      classInformation = new ClassInformation(schemaUtils, clazz, Collections.emptySet());
    }

    @Test
    void withoutOverride() {
      assertThat(classInformation.hasOverride()).isFalse();
    }

    @Test
    void withOverride() throws IOException {
      Files.createFile(
          Files.createDirectories(overridesDirectory.toPath().resolve("io").resolve("fabric8").resolve("kubernetes"))
              .resolve("ClassWithOverride.java"));
      assertThat(classInformation.hasOverride()).isTrue();
    }
  }

  @Nested
  class PackageClasses {
    @BeforeEach
    void setUp() {
      final var schemaUtils = new SchemaUtils(GeneratorSettings.builder()
          .packageMapping("io.k8s", "io.fabric8.kubernetes")
          .build());
      final var schema = new ObjectSchema();
      final Map.Entry<String, Schema<?>> clazz = Map.entry("io.fabric8.kubernetes.ClassInTest", schema);
      classInformation = new ClassInformation(schemaUtils, clazz, Set.of(
          "io.fabric8.kubernetes.ClassInPackage",
          "io.fabric8.kubernetes.other.ClassInOtherPackage",
          "io.k8s.ClassInMappedPackage"));
    }

    @Test
    void hasClassInPackage() {
      assertThat(classInformation.getPackageClasses()).contains("io.fabric8.kubernetes.ClassInPackage");
    }

    @Test
    void hasClassInMappedPackage() {
      assertThat(classInformation.getPackageClasses()).contains("io.fabric8.kubernetes.ClassInMappedPackage");
    }

    @Test
    void doesNotHaveClassInOtherPackage() {
      assertThat(classInformation.getPackageClasses())
          .hasSize(2)
          .doesNotContain("io.fabric8.kubernetes.other.ClassInOtherPackage");
    }
  }
}
