
package io.fabric8.kubernetes.api.model.resource.v1alpha2;

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
 * DriverAllocationResult contains vendor parameters and the allocation result for one request.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "namedResources",
    "vendorRequestParameters"
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
public class DriverAllocationResult implements Editable<DriverAllocationResultBuilder>, KubernetesResource
{

    @JsonProperty("namedResources")
    private NamedResourcesAllocationResult namedResources;
    @JsonProperty("vendorRequestParameters")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object vendorRequestParameters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DriverAllocationResult() {
    }

    public DriverAllocationResult(NamedResourcesAllocationResult namedResources, Object vendorRequestParameters) {
        super();
        this.namedResources = namedResources;
        this.vendorRequestParameters = vendorRequestParameters;
    }

    /**
     * DriverAllocationResult contains vendor parameters and the allocation result for one request.
     */
    @JsonProperty("namedResources")
    public NamedResourcesAllocationResult getNamedResources() {
        return namedResources;
    }

    /**
     * DriverAllocationResult contains vendor parameters and the allocation result for one request.
     */
    @JsonProperty("namedResources")
    public void setNamedResources(NamedResourcesAllocationResult namedResources) {
        this.namedResources = namedResources;
    }

    /**
     * DriverAllocationResult contains vendor parameters and the allocation result for one request.
     */
    @JsonProperty("vendorRequestParameters")
    public Object getVendorRequestParameters() {
        return vendorRequestParameters;
    }

    /**
     * DriverAllocationResult contains vendor parameters and the allocation result for one request.
     */
    @JsonProperty("vendorRequestParameters")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setVendorRequestParameters(Object vendorRequestParameters) {
        this.vendorRequestParameters = vendorRequestParameters;
    }

    @JsonIgnore
    public DriverAllocationResultBuilder edit() {
        return new DriverAllocationResultBuilder(this);
    }

    @JsonIgnore
    public DriverAllocationResultBuilder toBuilder() {
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
