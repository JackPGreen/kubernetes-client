
package io.fabric8.chaosmesh.v1alpha1;

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
 * PodNetworkChaosSpec defines the desired state of PodNetworkChaos
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ipsets",
    "iptables",
    "tcs"
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
public class PodNetworkChaosSpec implements Editable<PodNetworkChaosSpecBuilder>, KubernetesResource
{

    @JsonProperty("ipsets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<RawIPSet> ipsets = new ArrayList<>();
    @JsonProperty("iptables")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<RawIptables> iptables = new ArrayList<>();
    @JsonProperty("tcs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<RawTrafficControl> tcs = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PodNetworkChaosSpec() {
    }

    public PodNetworkChaosSpec(List<RawIPSet> ipsets, List<RawIptables> iptables, List<RawTrafficControl> tcs) {
        super();
        this.ipsets = ipsets;
        this.iptables = iptables;
        this.tcs = tcs;
    }

    /**
     * The ipset on the pod
     */
    @JsonProperty("ipsets")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<RawIPSet> getIpsets() {
        return ipsets;
    }

    /**
     * The ipset on the pod
     */
    @JsonProperty("ipsets")
    public void setIpsets(List<RawIPSet> ipsets) {
        this.ipsets = ipsets;
    }

    /**
     * The iptables rules on the pod
     */
    @JsonProperty("iptables")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<RawIptables> getIptables() {
        return iptables;
    }

    /**
     * The iptables rules on the pod
     */
    @JsonProperty("iptables")
    public void setIptables(List<RawIptables> iptables) {
        this.iptables = iptables;
    }

    /**
     * The tc rules on the pod
     */
    @JsonProperty("tcs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<RawTrafficControl> getTcs() {
        return tcs;
    }

    /**
     * The tc rules on the pod
     */
    @JsonProperty("tcs")
    public void setTcs(List<RawTrafficControl> tcs) {
        this.tcs = tcs;
    }

    @JsonIgnore
    public PodNetworkChaosSpecBuilder edit() {
        return new PodNetworkChaosSpecBuilder(this);
    }

    @JsonIgnore
    public PodNetworkChaosSpecBuilder toBuilder() {
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
