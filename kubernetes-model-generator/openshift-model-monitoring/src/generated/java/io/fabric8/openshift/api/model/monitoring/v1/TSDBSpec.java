
package io.fabric8.openshift.api.model.monitoring.v1;

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

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outOfOrderTimeWindow"
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
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class TSDBSpec implements Editable<TSDBSpecBuilder>, KubernetesResource
{

    @JsonProperty("outOfOrderTimeWindow")
    private String outOfOrderTimeWindow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public TSDBSpec() {
    }

    public TSDBSpec(String outOfOrderTimeWindow) {
        super();
        this.outOfOrderTimeWindow = outOfOrderTimeWindow;
    }

    /**
     * Configures how old an out-of-order/out-of-bounds sample can be with respect to the TSDB max time.<br><p> <br><p> An out-of-order/out-of-bounds sample is ingested into the TSDB as long as the timestamp of the sample is &gt;= (TSDB.MaxTime - outOfOrderTimeWindow).<br><p> <br><p> This is an &#42;experimental feature&#42;, it may change in any upcoming release in a breaking way.<br><p> <br><p> It requires Prometheus &gt;= v2.39.0 or PrometheusAgent &gt;= v2.54.0.
     */
    @JsonProperty("outOfOrderTimeWindow")
    public String getOutOfOrderTimeWindow() {
        return outOfOrderTimeWindow;
    }

    /**
     * Configures how old an out-of-order/out-of-bounds sample can be with respect to the TSDB max time.<br><p> <br><p> An out-of-order/out-of-bounds sample is ingested into the TSDB as long as the timestamp of the sample is &gt;= (TSDB.MaxTime - outOfOrderTimeWindow).<br><p> <br><p> This is an &#42;experimental feature&#42;, it may change in any upcoming release in a breaking way.<br><p> <br><p> It requires Prometheus &gt;= v2.39.0 or PrometheusAgent &gt;= v2.54.0.
     */
    @JsonProperty("outOfOrderTimeWindow")
    public void setOutOfOrderTimeWindow(String outOfOrderTimeWindow) {
        this.outOfOrderTimeWindow = outOfOrderTimeWindow;
    }

    @JsonIgnore
    public TSDBSpecBuilder edit() {
        return new TSDBSpecBuilder(this);
    }

    @JsonIgnore
    public TSDBSpecBuilder toBuilder() {
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
