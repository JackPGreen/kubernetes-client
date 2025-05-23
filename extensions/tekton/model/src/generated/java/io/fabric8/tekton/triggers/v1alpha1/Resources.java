
package io.fabric8.tekton.triggers.v1alpha1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.GenericKubernetesResource;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customResource",
    "kubernetesResource"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class),
    @BuildableReference(GenericKubernetesResource.class),
    @BuildableReference(RawExtension.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class Resources implements Editable<ResourcesBuilder>, KubernetesResource
{

    @JsonProperty("customResource")
    private CustomResource customResource;
    @JsonProperty("kubernetesResource")
    private io.fabric8.tekton.triggers.v1alpha1.KubernetesResource kubernetesResource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Resources() {
    }

    public Resources(CustomResource customResource, io.fabric8.tekton.triggers.v1alpha1.KubernetesResource kubernetesResource) {
        super();
        this.customResource = customResource;
        this.kubernetesResource = kubernetesResource;
    }

    @JsonProperty("customResource")
    public CustomResource getCustomResource() {
        return customResource;
    }

    @JsonProperty("customResource")
    public void setCustomResource(CustomResource customResource) {
        this.customResource = customResource;
    }

    @JsonProperty("kubernetesResource")
    public io.fabric8.tekton.triggers.v1alpha1.KubernetesResource getKubernetesResource() {
        return kubernetesResource;
    }

    @JsonProperty("kubernetesResource")
    public void setKubernetesResource(io.fabric8.tekton.triggers.v1alpha1.KubernetesResource kubernetesResource) {
        this.kubernetesResource = kubernetesResource;
    }

    @JsonIgnore
    public ResourcesBuilder edit() {
        return new ResourcesBuilder(this);
    }

    @JsonIgnore
    public ResourcesBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    @JsonIgnore
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
