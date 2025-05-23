
package io.fabric8.openshift.api.model.config.v1;

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
    "clientID",
    "issuerURL",
    "oidcProviderName"
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
public class OIDCClientReference implements Editable<OIDCClientReferenceBuilder>, KubernetesResource
{

    @JsonProperty("clientID")
    private String clientID;
    @JsonProperty("issuerURL")
    private String issuerURL;
    @JsonProperty("oidcProviderName")
    private String oidcProviderName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public OIDCClientReference() {
    }

    public OIDCClientReference(String clientID, String issuerURL, String oidcProviderName) {
        super();
        this.clientID = clientID;
        this.issuerURL = issuerURL;
        this.oidcProviderName = oidcProviderName;
    }

    /**
     * ClientID is the identifier of the OIDC client from the OIDC provider
     */
    @JsonProperty("clientID")
    public String getClientID() {
        return clientID;
    }

    /**
     * ClientID is the identifier of the OIDC client from the OIDC provider
     */
    @JsonProperty("clientID")
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * URL is the serving URL of the token issuer. Must use the https:// scheme.
     */
    @JsonProperty("issuerURL")
    public String getIssuerURL() {
        return issuerURL;
    }

    /**
     * URL is the serving URL of the token issuer. Must use the https:// scheme.
     */
    @JsonProperty("issuerURL")
    public void setIssuerURL(String issuerURL) {
        this.issuerURL = issuerURL;
    }

    /**
     * OIDCName refers to the `name` of the provider from `oidcProviders`
     */
    @JsonProperty("oidcProviderName")
    public String getOidcProviderName() {
        return oidcProviderName;
    }

    /**
     * OIDCName refers to the `name` of the provider from `oidcProviders`
     */
    @JsonProperty("oidcProviderName")
    public void setOidcProviderName(String oidcProviderName) {
        this.oidcProviderName = oidcProviderName;
    }

    @JsonIgnore
    public OIDCClientReferenceBuilder edit() {
        return new OIDCClientReferenceBuilder(this);
    }

    @JsonIgnore
    public OIDCClientReferenceBuilder toBuilder() {
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
