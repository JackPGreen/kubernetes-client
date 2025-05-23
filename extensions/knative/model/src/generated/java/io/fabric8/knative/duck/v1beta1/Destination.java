
package io.fabric8.knative.duck.v1beta1;

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
 * Destination represents a target of an invocation over HTTP.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "CACerts",
    "name",
    "namespace",
    "ref",
    "uri"
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
public class Destination implements Editable<DestinationBuilder>, KubernetesResource
{

    @JsonProperty("CACerts")
    private String cACerts;
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("name")
    private String name;
    @JsonProperty("namespace")
    private String namespace;
    @JsonProperty("ref")
    private ObjectReference ref;
    @JsonProperty("uri")
    private String uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Destination() {
    }

    public Destination(String cACerts, String apiVersion, String kind, String name, String namespace, ObjectReference ref, String uri) {
        super();
        this.cACerts = cACerts;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.ref = ref;
        this.uri = uri;
    }

    /**
     * CACerts are Certification Authority (CA) certificates in PEM format according to https://www.rfc-editor.org/rfc/rfc7468. If set, these CAs are appended to the set of CAs provided by the Addressable target, if any.
     */
    @JsonProperty("CACerts")
    public String getCACerts() {
        return cACerts;
    }

    /**
     * CACerts are Certification Authority (CA) certificates in PEM format according to https://www.rfc-editor.org/rfc/rfc7468. If set, these CAs are appended to the set of CAs provided by the Addressable target, if any.
     */
    @JsonProperty("CACerts")
    public void setCACerts(String cACerts) {
        this.cACerts = cACerts;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("ref")
    public ObjectReference getRef() {
        return ref;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("ref")
    public void setRef(ObjectReference ref) {
        this.ref = ref;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * Destination represents a target of an invocation over HTTP.
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonIgnore
    public DestinationBuilder edit() {
        return new DestinationBuilder(this);
    }

    @JsonIgnore
    public DestinationBuilder toBuilder() {
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
