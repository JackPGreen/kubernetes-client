
package io.fabric8.openshift.api.model.operator.v1;

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
 * SimpleMacvlanConfig contains configurations for macvlan interface.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ipamConfig",
    "master",
    "mode",
    "mtu"
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
public class SimpleMacvlanConfig implements Editable<SimpleMacvlanConfigBuilder>, KubernetesResource
{

    @JsonProperty("ipamConfig")
    private IPAMConfig ipamConfig;
    @JsonProperty("master")
    private String master;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("mtu")
    private Long mtu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public SimpleMacvlanConfig() {
    }

    public SimpleMacvlanConfig(IPAMConfig ipamConfig, String master, String mode, Long mtu) {
        super();
        this.ipamConfig = ipamConfig;
        this.master = master;
        this.mode = mode;
        this.mtu = mtu;
    }

    /**
     * SimpleMacvlanConfig contains configurations for macvlan interface.
     */
    @JsonProperty("ipamConfig")
    public IPAMConfig getIpamConfig() {
        return ipamConfig;
    }

    /**
     * SimpleMacvlanConfig contains configurations for macvlan interface.
     */
    @JsonProperty("ipamConfig")
    public void setIpamConfig(IPAMConfig ipamConfig) {
        this.ipamConfig = ipamConfig;
    }

    /**
     * master is the host interface to create the macvlan interface from. If not specified, it will be default route interface
     */
    @JsonProperty("master")
    public String getMaster() {
        return master;
    }

    /**
     * master is the host interface to create the macvlan interface from. If not specified, it will be default route interface
     */
    @JsonProperty("master")
    public void setMaster(String master) {
        this.master = master;
    }

    /**
     * mode is the macvlan mode: bridge, private, vepa, passthru. The default is bridge
     */
    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    /**
     * mode is the macvlan mode: bridge, private, vepa, passthru. The default is bridge
     */
    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * mtu is the mtu to use for the macvlan interface. if unset, host's kernel will select the value.
     */
    @JsonProperty("mtu")
    public Long getMtu() {
        return mtu;
    }

    /**
     * mtu is the mtu to use for the macvlan interface. if unset, host's kernel will select the value.
     */
    @JsonProperty("mtu")
    public void setMtu(Long mtu) {
        this.mtu = mtu;
    }

    @JsonIgnore
    public SimpleMacvlanConfigBuilder edit() {
        return new SimpleMacvlanConfigBuilder(this);
    }

    @JsonIgnore
    public SimpleMacvlanConfigBuilder toBuilder() {
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
