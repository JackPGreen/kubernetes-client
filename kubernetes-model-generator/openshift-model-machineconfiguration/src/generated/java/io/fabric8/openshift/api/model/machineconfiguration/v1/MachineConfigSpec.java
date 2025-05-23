
package io.fabric8.openshift.api.model.machineconfiguration.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * MachineConfigSpec is the spec for MachineConfig
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseOSExtensionsContainerImage",
    "config",
    "extensions",
    "fips",
    "kernelArguments",
    "kernelType",
    "osImageURL"
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
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class MachineConfigSpec implements Editable<MachineConfigSpecBuilder>, KubernetesResource
{

    @JsonProperty("baseOSExtensionsContainerImage")
    private String baseOSExtensionsContainerImage;
    @JsonProperty("config")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object config;
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> extensions = new ArrayList<>();
    @JsonProperty("fips")
    private Boolean fips;
    @JsonProperty("kernelArguments")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> kernelArguments = new ArrayList<>();
    @JsonProperty("kernelType")
    private String kernelType;
    @JsonProperty("osImageURL")
    private String osImageURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MachineConfigSpec() {
    }

    public MachineConfigSpec(String baseOSExtensionsContainerImage, Object config, List<String> extensions, Boolean fips, List<String> kernelArguments, String kernelType, String osImageURL) {
        super();
        this.baseOSExtensionsContainerImage = baseOSExtensionsContainerImage;
        this.config = config;
        this.extensions = extensions;
        this.fips = fips;
        this.kernelArguments = kernelArguments;
        this.kernelType = kernelType;
        this.osImageURL = osImageURL;
    }

    /**
     * BaseOSExtensionsContainerImage specifies the remote location that will be used to fetch the extensions container matching a new-format OS image
     */
    @JsonProperty("baseOSExtensionsContainerImage")
    public String getBaseOSExtensionsContainerImage() {
        return baseOSExtensionsContainerImage;
    }

    /**
     * BaseOSExtensionsContainerImage specifies the remote location that will be used to fetch the extensions container matching a new-format OS image
     */
    @JsonProperty("baseOSExtensionsContainerImage")
    public void setBaseOSExtensionsContainerImage(String baseOSExtensionsContainerImage) {
        this.baseOSExtensionsContainerImage = baseOSExtensionsContainerImage;
    }

    /**
     * MachineConfigSpec is the spec for MachineConfig
     */
    @JsonProperty("config")
    public Object getConfig() {
        return config;
    }

    /**
     * MachineConfigSpec is the spec for MachineConfig
     */
    @JsonProperty("config")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setConfig(Object config) {
        this.config = config;
    }

    /**
     * extensions contains a list of additional features that can be enabled on host
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getExtensions() {
        return extensions;
    }

    /**
     * extensions contains a list of additional features that can be enabled on host
     */
    @JsonProperty("extensions")
    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }

    /**
     * fips controls FIPS mode
     */
    @JsonProperty("fips")
    public Boolean getFips() {
        return fips;
    }

    /**
     * fips controls FIPS mode
     */
    @JsonProperty("fips")
    public void setFips(Boolean fips) {
        this.fips = fips;
    }

    /**
     * kernelArguments contains a list of kernel arguments to be added
     */
    @JsonProperty("kernelArguments")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getKernelArguments() {
        return kernelArguments;
    }

    /**
     * kernelArguments contains a list of kernel arguments to be added
     */
    @JsonProperty("kernelArguments")
    public void setKernelArguments(List<String> kernelArguments) {
        this.kernelArguments = kernelArguments;
    }

    /**
     * kernelType contains which kernel we want to be running like default (traditional), realtime, 64k-pages (aarch64 only).
     */
    @JsonProperty("kernelType")
    public String getKernelType() {
        return kernelType;
    }

    /**
     * kernelType contains which kernel we want to be running like default (traditional), realtime, 64k-pages (aarch64 only).
     */
    @JsonProperty("kernelType")
    public void setKernelType(String kernelType) {
        this.kernelType = kernelType;
    }

    /**
     * OSImageURL specifies the remote location that will be used to fetch the OS.
     */
    @JsonProperty("osImageURL")
    public String getOsImageURL() {
        return osImageURL;
    }

    /**
     * OSImageURL specifies the remote location that will be used to fetch the OS.
     */
    @JsonProperty("osImageURL")
    public void setOsImageURL(String osImageURL) {
        this.osImageURL = osImageURL;
    }

    @JsonIgnore
    public MachineConfigSpecBuilder edit() {
        return new MachineConfigSpecBuilder(this);
    }

    @JsonIgnore
    public MachineConfigSpecBuilder toBuilder() {
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
