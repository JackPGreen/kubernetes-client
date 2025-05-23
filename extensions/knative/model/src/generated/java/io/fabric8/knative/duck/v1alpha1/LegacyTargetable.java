
package io.fabric8.knative.duck.v1alpha1;

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
 * LegacyTargetable left around until we migrate to Addressable in the dependent resources. Addressable has more structure in the way it defines the fields. LegacyTargetable only assumed a single string in the Status field and we're moving towards defining proper structs under Status rather than strings. This is to support existing resources until they migrate.<br><p> <br><p> # Do not use this for anything new, use Addressable<br><p> <br><p> LegacyTargetable is the old schema for the addressable portion of the payload<br><p> <br><p> For new resources use Addressable.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domainInternal"
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
public class LegacyTargetable implements Editable<LegacyTargetableBuilder>, KubernetesResource
{

    @JsonProperty("domainInternal")
    private String domainInternal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public LegacyTargetable() {
    }

    public LegacyTargetable(String domainInternal) {
        super();
        this.domainInternal = domainInternal;
    }

    /**
     * LegacyTargetable left around until we migrate to Addressable in the dependent resources. Addressable has more structure in the way it defines the fields. LegacyTargetable only assumed a single string in the Status field and we're moving towards defining proper structs under Status rather than strings. This is to support existing resources until they migrate.<br><p> <br><p> # Do not use this for anything new, use Addressable<br><p> <br><p> LegacyTargetable is the old schema for the addressable portion of the payload<br><p> <br><p> For new resources use Addressable.
     */
    @JsonProperty("domainInternal")
    public String getDomainInternal() {
        return domainInternal;
    }

    /**
     * LegacyTargetable left around until we migrate to Addressable in the dependent resources. Addressable has more structure in the way it defines the fields. LegacyTargetable only assumed a single string in the Status field and we're moving towards defining proper structs under Status rather than strings. This is to support existing resources until they migrate.<br><p> <br><p> # Do not use this for anything new, use Addressable<br><p> <br><p> LegacyTargetable is the old schema for the addressable portion of the payload<br><p> <br><p> For new resources use Addressable.
     */
    @JsonProperty("domainInternal")
    public void setDomainInternal(String domainInternal) {
        this.domainInternal = domainInternal;
    }

    @JsonIgnore
    public LegacyTargetableBuilder edit() {
        return new LegacyTargetableBuilder(this);
    }

    @JsonIgnore
    public LegacyTargetableBuilder toBuilder() {
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
