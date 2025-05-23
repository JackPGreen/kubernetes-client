
package io.fabric8.tekton.v1beta1;

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
 * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "childReferences",
    "completionTime",
    "finallyStartTime",
    "pipelineResults",
    "pipelineSpec",
    "provenance",
    "runs",
    "skippedTasks",
    "spanContext",
    "startTime",
    "taskRuns"
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
public class PipelineRunStatusFields implements Editable<PipelineRunStatusFieldsBuilder>, KubernetesResource
{

    @JsonProperty("childReferences")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ChildStatusReference> childReferences = new ArrayList<>();
    @JsonProperty("completionTime")
    private String completionTime;
    @JsonProperty("finallyStartTime")
    private String finallyStartTime;
    @JsonProperty("pipelineResults")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PipelineRunResult> pipelineResults = new ArrayList<>();
    @JsonProperty("pipelineSpec")
    private PipelineSpec pipelineSpec;
    @JsonProperty("provenance")
    private Provenance provenance;
    @JsonProperty("runs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, PipelineRunRunStatus> runs = new LinkedHashMap<>();
    @JsonProperty("skippedTasks")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<SkippedTask> skippedTasks = new ArrayList<>();
    @JsonProperty("spanContext")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> spanContext = new LinkedHashMap<>();
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("taskRuns")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, PipelineRunTaskRunStatus> taskRuns = new LinkedHashMap<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PipelineRunStatusFields() {
    }

    public PipelineRunStatusFields(List<ChildStatusReference> childReferences, String completionTime, String finallyStartTime, List<PipelineRunResult> pipelineResults, PipelineSpec pipelineSpec, Provenance provenance, Map<String, PipelineRunRunStatus> runs, List<SkippedTask> skippedTasks, Map<String, String> spanContext, String startTime, Map<String, PipelineRunTaskRunStatus> taskRuns) {
        super();
        this.childReferences = childReferences;
        this.completionTime = completionTime;
        this.finallyStartTime = finallyStartTime;
        this.pipelineResults = pipelineResults;
        this.pipelineSpec = pipelineSpec;
        this.provenance = provenance;
        this.runs = runs;
        this.skippedTasks = skippedTasks;
        this.spanContext = spanContext;
        this.startTime = startTime;
        this.taskRuns = taskRuns;
    }

    /**
     * list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.
     */
    @JsonProperty("childReferences")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<ChildStatusReference> getChildReferences() {
        return childReferences;
    }

    /**
     * list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.
     */
    @JsonProperty("childReferences")
    public void setChildReferences(List<ChildStatusReference> childReferences) {
        this.childReferences = childReferences;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("completionTime")
    public String getCompletionTime() {
        return completionTime;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("completionTime")
    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("finallyStartTime")
    public String getFinallyStartTime() {
        return finallyStartTime;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("finallyStartTime")
    public void setFinallyStartTime(String finallyStartTime) {
        this.finallyStartTime = finallyStartTime;
    }

    /**
     * PipelineResults are the list of results written out by the pipeline task's containers
     */
    @JsonProperty("pipelineResults")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<PipelineRunResult> getPipelineResults() {
        return pipelineResults;
    }

    /**
     * PipelineResults are the list of results written out by the pipeline task's containers
     */
    @JsonProperty("pipelineResults")
    public void setPipelineResults(List<PipelineRunResult> pipelineResults) {
        this.pipelineResults = pipelineResults;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("pipelineSpec")
    public PipelineSpec getPipelineSpec() {
        return pipelineSpec;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("pipelineSpec")
    public void setPipelineSpec(PipelineSpec pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("provenance")
    public Provenance getProvenance() {
        return provenance;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("provenance")
    public void setProvenance(Provenance provenance) {
        this.provenance = provenance;
    }

    /**
     * Runs is a map of PipelineRunRunStatus with the run name as the key<br><p> <br><p> Deprecated: use ChildReferences instead. As of v0.45.0, this field is no longer populated and is only included for backwards compatibility with older server versions.
     */
    @JsonProperty("runs")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, PipelineRunRunStatus> getRuns() {
        return runs;
    }

    /**
     * Runs is a map of PipelineRunRunStatus with the run name as the key<br><p> <br><p> Deprecated: use ChildReferences instead. As of v0.45.0, this field is no longer populated and is only included for backwards compatibility with older server versions.
     */
    @JsonProperty("runs")
    public void setRuns(Map<String, PipelineRunRunStatus> runs) {
        this.runs = runs;
    }

    /**
     * list of tasks that were skipped due to when expressions evaluating to false
     */
    @JsonProperty("skippedTasks")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<SkippedTask> getSkippedTasks() {
        return skippedTasks;
    }

    /**
     * list of tasks that were skipped due to when expressions evaluating to false
     */
    @JsonProperty("skippedTasks")
    public void setSkippedTasks(List<SkippedTask> skippedTasks) {
        this.skippedTasks = skippedTasks;
    }

    /**
     * SpanContext contains tracing span context fields
     */
    @JsonProperty("spanContext")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> getSpanContext() {
        return spanContext;
    }

    /**
     * SpanContext contains tracing span context fields
     */
    @JsonProperty("spanContext")
    public void setSpanContext(Map<String, String> spanContext) {
        this.spanContext = spanContext;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * PipelineRunStatusFields holds the fields of PipelineRunStatus' status. This is defined separately and inlined so that other types can readily consume these fields via duck typing.
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * TaskRuns is a map of PipelineRunTaskRunStatus with the taskRun name as the key.<br><p> <br><p> Deprecated: use ChildReferences instead. As of v0.45.0, this field is no longer populated and is only included for backwards compatibility with older server versions.
     */
    @JsonProperty("taskRuns")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, PipelineRunTaskRunStatus> getTaskRuns() {
        return taskRuns;
    }

    /**
     * TaskRuns is a map of PipelineRunTaskRunStatus with the taskRun name as the key.<br><p> <br><p> Deprecated: use ChildReferences instead. As of v0.45.0, this field is no longer populated and is only included for backwards compatibility with older server versions.
     */
    @JsonProperty("taskRuns")
    public void setTaskRuns(Map<String, PipelineRunTaskRunStatus> taskRuns) {
        this.taskRuns = taskRuns;
    }

    @JsonIgnore
    public PipelineRunStatusFieldsBuilder edit() {
        return new PipelineRunStatusFieldsBuilder(this);
    }

    @JsonIgnore
    public PipelineRunStatusFieldsBuilder toBuilder() {
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
