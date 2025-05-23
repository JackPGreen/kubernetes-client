
package io.fabric8.volcano.api.model.scheduling.v1beta1;

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
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * QueueSpec represents the template of Queue.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "affinity",
    "capability",
    "deserved",
    "extendClusters",
    "guarantee",
    "parent",
    "priority",
    "reclaimable",
    "type",
    "weight"
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
public class QueueSpec implements Editable<QueueSpecBuilder>, KubernetesResource
{

    @JsonProperty("affinity")
    private Affinity affinity;
    @JsonProperty("capability")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Quantity> capability = new LinkedHashMap<>();
    @JsonProperty("deserved")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Quantity> deserved = new LinkedHashMap<>();
    @JsonProperty("extendClusters")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Cluster> extendClusters = new ArrayList<>();
    @JsonProperty("guarantee")
    private Guarantee guarantee;
    @JsonProperty("parent")
    private String parent;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("reclaimable")
    private Boolean reclaimable;
    @JsonProperty("type")
    private String type;
    @JsonProperty("weight")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public QueueSpec() {
    }

    public QueueSpec(Affinity affinity, Map<String, Quantity> capability, Map<String, Quantity> deserved, List<Cluster> extendClusters, Guarantee guarantee, String parent, Integer priority, Boolean reclaimable, String type, Integer weight) {
        super();
        this.affinity = affinity;
        this.capability = capability;
        this.deserved = deserved;
        this.extendClusters = extendClusters;
        this.guarantee = guarantee;
        this.parent = parent;
        this.priority = priority;
        this.reclaimable = reclaimable;
        this.type = type;
        this.weight = weight;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("affinity")
    public Affinity getAffinity() {
        return affinity;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("affinity")
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("capability")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Quantity> getCapability() {
        return capability;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("capability")
    public void setCapability(Map<String, Quantity> capability) {
        this.capability = capability;
    }

    /**
     * The amount of resources configured by the user. This part of resource can be shared with other queues and reclaimed back.
     */
    @JsonProperty("deserved")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Quantity> getDeserved() {
        return deserved;
    }

    /**
     * The amount of resources configured by the user. This part of resource can be shared with other queues and reclaimed back.
     */
    @JsonProperty("deserved")
    public void setDeserved(Map<String, Quantity> deserved) {
        this.deserved = deserved;
    }

    /**
     * extendCluster indicate the jobs in this Queue will be dispatched to these clusters.
     */
    @JsonProperty("extendClusters")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<Cluster> getExtendClusters() {
        return extendClusters;
    }

    /**
     * extendCluster indicate the jobs in this Queue will be dispatched to these clusters.
     */
    @JsonProperty("extendClusters")
    public void setExtendClusters(List<Cluster> extendClusters) {
        this.extendClusters = extendClusters;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("guarantee")
    public Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("guarantee")
    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    /**
     * Parent define the parent of queue
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * Parent define the parent of queue
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * Priority define the priority of queue. Higher values are prioritized for scheduling and considered later during reclamation.
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority define the priority of queue. Higher values are prioritized for scheduling and considered later during reclamation.
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Reclaimable indicate whether the queue can be reclaimed by other queue
     */
    @JsonProperty("reclaimable")
    public Boolean getReclaimable() {
        return reclaimable;
    }

    /**
     * Reclaimable indicate whether the queue can be reclaimed by other queue
     */
    @JsonProperty("reclaimable")
    public void setReclaimable(Boolean reclaimable) {
        this.reclaimable = reclaimable;
    }

    /**
     * Type define the type of queue
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type define the type of queue
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * QueueSpec represents the template of Queue.
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonIgnore
    public QueueSpecBuilder edit() {
        return new QueueSpecBuilder(this);
    }

    @JsonIgnore
    public QueueSpecBuilder toBuilder() {
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
