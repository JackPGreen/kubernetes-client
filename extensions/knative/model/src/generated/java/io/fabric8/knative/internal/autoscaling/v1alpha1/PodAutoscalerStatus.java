
package io.fabric8.knative.internal.autoscaling.v1alpha1;

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
import io.fabric8.knative.pkg.apis.Condition;
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
 * PodAutoscalerStatus communicates the observed state of the PodAutoscaler (from the controller).
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actualScale",
    "annotations",
    "conditions",
    "desiredScale",
    "metricsServiceName",
    "observedGeneration",
    "serviceName"
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
public class PodAutoscalerStatus implements Editable<PodAutoscalerStatusBuilder>, KubernetesResource
{

    @JsonProperty("actualScale")
    private Integer actualScale;
    @JsonProperty("annotations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> annotations = new LinkedHashMap<>();
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Condition> conditions = new ArrayList<>();
    @JsonProperty("desiredScale")
    private Integer desiredScale;
    @JsonProperty("metricsServiceName")
    private String metricsServiceName;
    @JsonProperty("observedGeneration")
    private Long observedGeneration;
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PodAutoscalerStatus() {
    }

    public PodAutoscalerStatus(Integer actualScale, Map<String, String> annotations, List<Condition> conditions, Integer desiredScale, String metricsServiceName, Long observedGeneration, String serviceName) {
        super();
        this.actualScale = actualScale;
        this.annotations = annotations;
        this.conditions = conditions;
        this.desiredScale = desiredScale;
        this.metricsServiceName = metricsServiceName;
        this.observedGeneration = observedGeneration;
        this.serviceName = serviceName;
    }

    /**
     * ActualScale shows the actual number of replicas for the revision.
     */
    @JsonProperty("actualScale")
    public Integer getActualScale() {
        return actualScale;
    }

    /**
     * ActualScale shows the actual number of replicas for the revision.
     */
    @JsonProperty("actualScale")
    public void setActualScale(Integer actualScale) {
        this.actualScale = actualScale;
    }

    /**
     * Annotations is additional Status fields for the Resource to save some additional State as well as convey more information to the user. This is roughly akin to Annotations on any k8s resource, just the reconciler conveying richer information outwards.
     */
    @JsonProperty("annotations")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    /**
     * Annotations is additional Status fields for the Resource to save some additional State as well as convey more information to the user. This is roughly akin to Annotations on any k8s resource, just the reconciler conveying richer information outwards.
     */
    @JsonProperty("annotations")
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     */
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     */
    @JsonProperty("conditions")
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * DesiredScale shows the current desired number of replicas for the revision.
     */
    @JsonProperty("desiredScale")
    public Integer getDesiredScale() {
        return desiredScale;
    }

    /**
     * DesiredScale shows the current desired number of replicas for the revision.
     */
    @JsonProperty("desiredScale")
    public void setDesiredScale(Integer desiredScale) {
        this.desiredScale = desiredScale;
    }

    /**
     * MetricsServiceName is the K8s Service name that provides revision metrics. The service is managed by the PA object.
     */
    @JsonProperty("metricsServiceName")
    public String getMetricsServiceName() {
        return metricsServiceName;
    }

    /**
     * MetricsServiceName is the K8s Service name that provides revision metrics. The service is managed by the PA object.
     */
    @JsonProperty("metricsServiceName")
    public void setMetricsServiceName(String metricsServiceName) {
        this.metricsServiceName = metricsServiceName;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Service that was last processed by the controller.
     */
    @JsonProperty("observedGeneration")
    public Long getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Service that was last processed by the controller.
     */
    @JsonProperty("observedGeneration")
    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * ServiceName is the K8s Service name that serves the revision, scaled by this PA. The service is created and owned by the ServerlessService object owned by this PA.
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * ServiceName is the K8s Service name that serves the revision, scaled by this PA. The service is created and owned by the ServerlessService object owned by this PA.
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonIgnore
    public PodAutoscalerStatusBuilder edit() {
        return new PodAutoscalerStatusBuilder(this);
    }

    @JsonIgnore
    public PodAutoscalerStatusBuilder toBuilder() {
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
