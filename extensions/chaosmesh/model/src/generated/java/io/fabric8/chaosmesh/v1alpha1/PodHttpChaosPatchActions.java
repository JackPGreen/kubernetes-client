
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
 * PodHttpChaosPatchActions defines possible patch-actions of HttpChaos.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "body",
    "headers",
    "queries"
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
public class PodHttpChaosPatchActions implements Editable<PodHttpChaosPatchActionsBuilder>, KubernetesResource
{

    @JsonProperty("body")
    private PodHttpChaosPatchBodyAction body;
    @JsonProperty("headers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<List<String>> headers = new ArrayList<>();
    @JsonProperty("queries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<List<String>> queries = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PodHttpChaosPatchActions() {
    }

    public PodHttpChaosPatchActions(PodHttpChaosPatchBodyAction body, List<List<String>> headers, List<List<String>> queries) {
        super();
        this.body = body;
        this.headers = headers;
        this.queries = queries;
    }

    /**
     * PodHttpChaosPatchActions defines possible patch-actions of HttpChaos.
     */
    @JsonProperty("body")
    public PodHttpChaosPatchBodyAction getBody() {
        return body;
    }

    /**
     * PodHttpChaosPatchActions defines possible patch-actions of HttpChaos.
     */
    @JsonProperty("body")
    public void setBody(PodHttpChaosPatchBodyAction body) {
        this.body = body;
    }

    /**
     * Headers is a rule to append http headers of target. For example: `[["Set-Cookie", "&lt;one cookie&gt;"], ["Set-Cookie", "&lt;another cookie&gt;"]]`.
     */
    @JsonProperty("headers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<List<String>> getHeaders() {
        return headers;
    }

    /**
     * Headers is a rule to append http headers of target. For example: `[["Set-Cookie", "&lt;one cookie&gt;"], ["Set-Cookie", "&lt;another cookie&gt;"]]`.
     */
    @JsonProperty("headers")
    public void setHeaders(List<List<String>> headers) {
        this.headers = headers;
    }

    /**
     * Queries is a rule to append uri queries of target(Request only). For example: `[["foo", "bar"], ["foo", "unknown"]]`.
     */
    @JsonProperty("queries")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<List<String>> getQueries() {
        return queries;
    }

    /**
     * Queries is a rule to append uri queries of target(Request only). For example: `[["foo", "bar"], ["foo", "unknown"]]`.
     */
    @JsonProperty("queries")
    public void setQueries(List<List<String>> queries) {
        this.queries = queries;
    }

    @JsonIgnore
    public PodHttpChaosPatchActionsBuilder edit() {
        return new PodHttpChaosPatchActionsBuilder(this);
    }

    @JsonIgnore
    public PodHttpChaosPatchActionsBuilder toBuilder() {
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
