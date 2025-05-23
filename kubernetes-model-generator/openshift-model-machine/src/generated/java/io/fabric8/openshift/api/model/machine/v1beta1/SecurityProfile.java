
package io.fabric8.openshift.api.model.machine.v1beta1;

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
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
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
 * SecurityProfile specifies the Security profile settings for a virtual machine or virtual machine scale set.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "encryptionAtHost",
    "settings"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
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
public class SecurityProfile implements Editable<SecurityProfileBuilder>, KubernetesResource
{

    @JsonProperty("encryptionAtHost")
    private Boolean encryptionAtHost;
    @JsonProperty("settings")
    private SecuritySettings settings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public SecurityProfile() {
    }

    public SecurityProfile(Boolean encryptionAtHost, SecuritySettings settings) {
        super();
        this.encryptionAtHost = encryptionAtHost;
        this.settings = settings;
    }

    /**
     * encryptionAtHost indicates whether Host Encryption should be enabled or disabled for a virtual machine or virtual machine scale set. This should be disabled when SecurityEncryptionType is set to DiskWithVMGuestState. Default is disabled.
     */
    @JsonProperty("encryptionAtHost")
    public Boolean getEncryptionAtHost() {
        return encryptionAtHost;
    }

    /**
     * encryptionAtHost indicates whether Host Encryption should be enabled or disabled for a virtual machine or virtual machine scale set. This should be disabled when SecurityEncryptionType is set to DiskWithVMGuestState. Default is disabled.
     */
    @JsonProperty("encryptionAtHost")
    public void setEncryptionAtHost(Boolean encryptionAtHost) {
        this.encryptionAtHost = encryptionAtHost;
    }

    /**
     * SecurityProfile specifies the Security profile settings for a virtual machine or virtual machine scale set.
     */
    @JsonProperty("settings")
    public SecuritySettings getSettings() {
        return settings;
    }

    /**
     * SecurityProfile specifies the Security profile settings for a virtual machine or virtual machine scale set.
     */
    @JsonProperty("settings")
    public void setSettings(SecuritySettings settings) {
        this.settings = settings;
    }

    @JsonIgnore
    public SecurityProfileBuilder edit() {
        return new SecurityProfileBuilder(this);
    }

    @JsonIgnore
    public SecurityProfileBuilder toBuilder() {
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
