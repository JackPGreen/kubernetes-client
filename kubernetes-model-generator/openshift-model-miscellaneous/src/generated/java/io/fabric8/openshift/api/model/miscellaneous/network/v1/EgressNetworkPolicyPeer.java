
package io.fabric8.openshift.api.model.miscellaneous.network.v1;

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
 * EgressNetworkPolicyPeer specifies a target to apply egress network policy to
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cidrSelector",
    "dnsName"
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
public class EgressNetworkPolicyPeer implements Editable<EgressNetworkPolicyPeerBuilder>, KubernetesResource
{

    @JsonProperty("cidrSelector")
    private String cidrSelector;
    @JsonProperty("dnsName")
    private String dnsName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public EgressNetworkPolicyPeer() {
    }

    public EgressNetworkPolicyPeer(String cidrSelector, String dnsName) {
        super();
        this.cidrSelector = cidrSelector;
        this.dnsName = dnsName;
    }

    /**
     * CIDRSelector is the CIDR range to allow/deny traffic to. If this is set, dnsName must be unset Ideally we would have liked to use the cidr openapi format for this property. But openshift-sdn only supports v4 while specifying the cidr format allows both v4 and v6 cidrs We are therefore using a regex pattern to validate instead.
     */
    @JsonProperty("cidrSelector")
    public String getCidrSelector() {
        return cidrSelector;
    }

    /**
     * CIDRSelector is the CIDR range to allow/deny traffic to. If this is set, dnsName must be unset Ideally we would have liked to use the cidr openapi format for this property. But openshift-sdn only supports v4 while specifying the cidr format allows both v4 and v6 cidrs We are therefore using a regex pattern to validate instead.
     */
    @JsonProperty("cidrSelector")
    public void setCidrSelector(String cidrSelector) {
        this.cidrSelector = cidrSelector;
    }

    /**
     * DNSName is the domain name to allow/deny traffic to. If this is set, cidrSelector must be unset
     */
    @JsonProperty("dnsName")
    public String getDnsName() {
        return dnsName;
    }

    /**
     * DNSName is the domain name to allow/deny traffic to. If this is set, cidrSelector must be unset
     */
    @JsonProperty("dnsName")
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    @JsonIgnore
    public EgressNetworkPolicyPeerBuilder edit() {
        return new EgressNetworkPolicyPeerBuilder(this);
    }

    @JsonIgnore
    public EgressNetworkPolicyPeerBuilder toBuilder() {
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
