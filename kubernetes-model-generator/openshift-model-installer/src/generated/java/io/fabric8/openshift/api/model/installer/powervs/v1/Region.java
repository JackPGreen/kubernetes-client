
package io.fabric8.openshift.api.model.installer.powervs.v1;

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
 * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "COSRegion",
    "Description",
    "SysTypes",
    "VPCRegion",
    "VPCZones",
    "Zones"
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
public class Region implements Editable<RegionBuilder>, KubernetesResource
{

    @JsonProperty("COSRegion")
    private String cOSRegion;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("SysTypes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> sysTypes = new ArrayList<>();
    @JsonProperty("VPCRegion")
    private String vPCRegion;
    @JsonProperty("VPCZones")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> vPCZones = new ArrayList<>();
    @JsonProperty("Zones")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> zones = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Region() {
    }

    public Region(String cOSRegion, String description, List<String> sysTypes, String vPCRegion, List<String> vPCZones, List<String> zones) {
        super();
        this.cOSRegion = cOSRegion;
        this.description = description;
        this.sysTypes = sysTypes;
        this.vPCRegion = vPCRegion;
        this.vPCZones = vPCZones;
        this.zones = zones;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("COSRegion")
    public String getCOSRegion() {
        return cOSRegion;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("COSRegion")
    public void setCOSRegion(String cOSRegion) {
        this.cOSRegion = cOSRegion;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("SysTypes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getSysTypes() {
        return sysTypes;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("SysTypes")
    public void setSysTypes(List<String> sysTypes) {
        this.sysTypes = sysTypes;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("VPCRegion")
    public String getVPCRegion() {
        return vPCRegion;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("VPCRegion")
    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("VPCZones")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getVPCZones() {
        return vPCZones;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("VPCZones")
    public void setVPCZones(List<String> vPCZones) {
        this.vPCZones = vPCZones;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("Zones")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getZones() {
        return zones;
    }

    /**
     * Region describes resources associated with a region in Power VS. We're using a few items from the IBM Cloud VPC offering. The region names for VPC are different so another function of this is to correlate those.
     */
    @JsonProperty("Zones")
    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    @JsonIgnore
    public RegionBuilder edit() {
        return new RegionBuilder(this);
    }

    @JsonIgnore
    public RegionBuilder toBuilder() {
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
