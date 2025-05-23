
package io.fabric8.openshift.api.model.console.v1;

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
 * ConsoleQuickStartTask is a single step in a Quick Start.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "review",
    "summary",
    "title"
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
public class ConsoleQuickStartTask implements Editable<ConsoleQuickStartTaskBuilder>, KubernetesResource
{

    @JsonProperty("description")
    private String description;
    @JsonProperty("review")
    private ConsoleQuickStartTaskReview review;
    @JsonProperty("summary")
    private ConsoleQuickStartTaskSummary summary;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ConsoleQuickStartTask() {
    }

    public ConsoleQuickStartTask(String description, ConsoleQuickStartTaskReview review, ConsoleQuickStartTaskSummary summary, String title) {
        super();
        this.description = description;
        this.review = review;
        this.summary = summary;
        this.title = title;
    }

    /**
     * description describes the steps needed to complete the task. (includes markdown)
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * description describes the steps needed to complete the task. (includes markdown)
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ConsoleQuickStartTask is a single step in a Quick Start.
     */
    @JsonProperty("review")
    public ConsoleQuickStartTaskReview getReview() {
        return review;
    }

    /**
     * ConsoleQuickStartTask is a single step in a Quick Start.
     */
    @JsonProperty("review")
    public void setReview(ConsoleQuickStartTaskReview review) {
        this.review = review;
    }

    /**
     * ConsoleQuickStartTask is a single step in a Quick Start.
     */
    @JsonProperty("summary")
    public ConsoleQuickStartTaskSummary getSummary() {
        return summary;
    }

    /**
     * ConsoleQuickStartTask is a single step in a Quick Start.
     */
    @JsonProperty("summary")
    public void setSummary(ConsoleQuickStartTaskSummary summary) {
        this.summary = summary;
    }

    /**
     * title describes the task and is displayed as a step heading.
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * title describes the task and is displayed as a step heading.
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonIgnore
    public ConsoleQuickStartTaskBuilder edit() {
        return new ConsoleQuickStartTaskBuilder(this);
    }

    @JsonIgnore
    public ConsoleQuickStartTaskBuilder toBuilder() {
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
