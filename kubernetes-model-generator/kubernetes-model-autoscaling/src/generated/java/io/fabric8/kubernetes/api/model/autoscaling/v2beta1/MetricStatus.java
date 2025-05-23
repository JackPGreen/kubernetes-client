
package io.fabric8.kubernetes.api.model.autoscaling.v2beta1;

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
 * MetricStatus describes the last-read state of a single metric.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerResource",
    "external",
    "object",
    "pods",
    "resource",
    "type"
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
public class MetricStatus implements Editable<MetricStatusBuilder>, KubernetesResource
{

    @JsonProperty("containerResource")
    private ContainerResourceMetricStatus containerResource;
    @JsonProperty("external")
    private ExternalMetricStatus external;
    @JsonProperty("object")
    private ObjectMetricStatus object;
    @JsonProperty("pods")
    private PodsMetricStatus pods;
    @JsonProperty("resource")
    private ResourceMetricStatus resource;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MetricStatus() {
    }

    public MetricStatus(ContainerResourceMetricStatus containerResource, ExternalMetricStatus external, ObjectMetricStatus object, PodsMetricStatus pods, ResourceMetricStatus resource, String type) {
        super();
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = type;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("containerResource")
    public ContainerResourceMetricStatus getContainerResource() {
        return containerResource;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("containerResource")
    public void setContainerResource(ContainerResourceMetricStatus containerResource) {
        this.containerResource = containerResource;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("external")
    public ExternalMetricStatus getExternal() {
        return external;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("external")
    public void setExternal(ExternalMetricStatus external) {
        this.external = external;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("object")
    public ObjectMetricStatus getObject() {
        return object;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("object")
    public void setObject(ObjectMetricStatus object) {
        this.object = object;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("pods")
    public PodsMetricStatus getPods() {
        return pods;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("pods")
    public void setPods(PodsMetricStatus pods) {
        this.pods = pods;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("resource")
    public ResourceMetricStatus getResource() {
        return resource;
    }

    /**
     * MetricStatus describes the last-read state of a single metric.
     */
    @JsonProperty("resource")
    public void setResource(ResourceMetricStatus resource) {
        this.resource = resource;
    }

    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonIgnore
    public MetricStatusBuilder edit() {
        return new MetricStatusBuilder(this);
    }

    @JsonIgnore
    public MetricStatusBuilder toBuilder() {
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
