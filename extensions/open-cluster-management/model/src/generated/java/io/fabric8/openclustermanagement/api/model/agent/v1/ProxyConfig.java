
package io.fabric8.openclustermanagement.api.model.agent.v1;

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
 * ProxyConfig defines the global proxy env for OCP cluster
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "httpProxy",
    "httpsProxy",
    "noProxy"
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
public class ProxyConfig implements Editable<ProxyConfigBuilder>, KubernetesResource
{

    @JsonProperty("httpProxy")
    private String httpProxy;
    @JsonProperty("httpsProxy")
    private String httpsProxy;
    @JsonProperty("noProxy")
    private String noProxy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ProxyConfig() {
    }

    public ProxyConfig(String httpProxy, String httpsProxy, String noProxy) {
        super();
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
    }

    /**
     * HTTPProxy is the URL of the proxy for HTTP requests.  Empty means unset and will not result in an env var.
     */
    @JsonProperty("httpProxy")
    public String getHttpProxy() {
        return httpProxy;
    }

    /**
     * HTTPProxy is the URL of the proxy for HTTP requests.  Empty means unset and will not result in an env var.
     */
    @JsonProperty("httpProxy")
    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    /**
     * HTTPSProxy is the URL of the proxy for HTTPS requests.  Empty means unset and will not result in an env var.
     */
    @JsonProperty("httpsProxy")
    public String getHttpsProxy() {
        return httpsProxy;
    }

    /**
     * HTTPSProxy is the URL of the proxy for HTTPS requests.  Empty means unset and will not result in an env var.
     */
    @JsonProperty("httpsProxy")
    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    /**
     * NoProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in an env var. The API Server of Hub cluster should be added here. And If you scale up workers that are not included in the network defined by the networking.machineNetwork[].cidr field from the installation configuration, you must add them to this list to prevent connection issues.
     */
    @JsonProperty("noProxy")
    public String getNoProxy() {
        return noProxy;
    }

    /**
     * NoProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in an env var. The API Server of Hub cluster should be added here. And If you scale up workers that are not included in the network defined by the networking.machineNetwork[].cidr field from the installation configuration, you must add them to this list to prevent connection issues.
     */
    @JsonProperty("noProxy")
    public void setNoProxy(String noProxy) {
        this.noProxy = noProxy;
    }

    @JsonIgnore
    public ProxyConfigBuilder edit() {
        return new ProxyConfigBuilder(this);
    }

    @JsonIgnore
    public ProxyConfigBuilder toBuilder() {
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
