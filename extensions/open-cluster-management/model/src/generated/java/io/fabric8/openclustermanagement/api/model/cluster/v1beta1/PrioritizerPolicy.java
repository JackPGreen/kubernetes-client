
package io.fabric8.openclustermanagement.api.model.cluster.v1beta1;

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
 * PrioritizerPolicy represents the policy of prioritizer
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configurations",
    "mode"
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
public class PrioritizerPolicy implements Editable<PrioritizerPolicyBuilder>, KubernetesResource
{

    @JsonProperty("configurations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PrioritizerConfig> configurations = new ArrayList<>();
    @JsonProperty("mode")
    private String mode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PrioritizerPolicy() {
    }

    public PrioritizerPolicy(List<PrioritizerConfig> configurations, String mode) {
        super();
        this.configurations = configurations;
        this.mode = mode;
    }

    /**
     * PrioritizerPolicy represents the policy of prioritizer
     */
    @JsonProperty("configurations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<PrioritizerConfig> getConfigurations() {
        return configurations;
    }

    /**
     * PrioritizerPolicy represents the policy of prioritizer
     */
    @JsonProperty("configurations")
    public void setConfigurations(List<PrioritizerConfig> configurations) {
        this.configurations = configurations;
    }

    /**
     * Mode is either Exact, Additive, "" where "" is Additive by default. In Additive mode, any prioritizer not explicitly enumerated is enabled in its default Configurations, in which Steady and Balance prioritizers have the weight of 1 while other prioritizers have the weight of 0. Additive doesn't require configuring all prioritizers. The default Configurations may change in the future, and additional prioritization will happen. In Exact mode, any prioritizer not explicitly enumerated is weighted as zero. Exact requires knowing the full set of prioritizers you want, but avoids behavior changes between releases.
     */
    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    /**
     * Mode is either Exact, Additive, "" where "" is Additive by default. In Additive mode, any prioritizer not explicitly enumerated is enabled in its default Configurations, in which Steady and Balance prioritizers have the weight of 1 while other prioritizers have the weight of 0. Additive doesn't require configuring all prioritizers. The default Configurations may change in the future, and additional prioritization will happen. In Exact mode, any prioritizer not explicitly enumerated is weighted as zero. Exact requires knowing the full set of prioritizers you want, but avoids behavior changes between releases.
     */
    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonIgnore
    public PrioritizerPolicyBuilder edit() {
        return new PrioritizerPolicyBuilder(this);
    }

    @JsonIgnore
    public PrioritizerPolicyBuilder toBuilder() {
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
