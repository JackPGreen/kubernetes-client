
package io.fabric8.openshift.api.model.miscellaneous.metal3.v1alpha1;

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
 * ProvisionStatus holds the state information for a single target.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "bootMode",
    "customDeploy",
    "firmware",
    "image",
    "raid",
    "rootDeviceHints",
    "state"
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
public class ProvisionStatus implements Editable<ProvisionStatusBuilder>, KubernetesResource
{

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("bootMode")
    private String bootMode;
    @JsonProperty("customDeploy")
    private CustomDeploy customDeploy;
    @JsonProperty("firmware")
    private FirmwareConfig firmware;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("raid")
    private RAIDConfig raid;
    @JsonProperty("rootDeviceHints")
    private RootDeviceHints rootDeviceHints;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ProvisionStatus() {
    }

    public ProvisionStatus(String iD, String bootMode, CustomDeploy customDeploy, FirmwareConfig firmware, Image image, RAIDConfig raid, RootDeviceHints rootDeviceHints, String state) {
        super();
        this.iD = iD;
        this.bootMode = bootMode;
        this.customDeploy = customDeploy;
        this.firmware = firmware;
        this.image = image;
        this.raid = raid;
        this.rootDeviceHints = rootDeviceHints;
        this.state = state;
    }

    /**
     * The hosts's ID from the underlying provisioning tool (e.g. the Ironic node UUID).
     */
    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    /**
     * The hosts's ID from the underlying provisioning tool (e.g. the Ironic node UUID).
     */
    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * BootMode indicates the boot mode used to provision the host.
     */
    @JsonProperty("bootMode")
    public String getBootMode() {
        return bootMode;
    }

    /**
     * BootMode indicates the boot mode used to provision the host.
     */
    @JsonProperty("bootMode")
    public void setBootMode(String bootMode) {
        this.bootMode = bootMode;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("customDeploy")
    public CustomDeploy getCustomDeploy() {
        return customDeploy;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("customDeploy")
    public void setCustomDeploy(CustomDeploy customDeploy) {
        this.customDeploy = customDeploy;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("firmware")
    public FirmwareConfig getFirmware() {
        return firmware;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("firmware")
    public void setFirmware(FirmwareConfig firmware) {
        this.firmware = firmware;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("raid")
    public RAIDConfig getRaid() {
        return raid;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("raid")
    public void setRaid(RAIDConfig raid) {
        this.raid = raid;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("rootDeviceHints")
    public RootDeviceHints getRootDeviceHints() {
        return rootDeviceHints;
    }

    /**
     * ProvisionStatus holds the state information for a single target.
     */
    @JsonProperty("rootDeviceHints")
    public void setRootDeviceHints(RootDeviceHints rootDeviceHints) {
        this.rootDeviceHints = rootDeviceHints;
    }

    /**
     * An indicator for what the provisioner is doing with the host.
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * An indicator for what the provisioner is doing with the host.
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonIgnore
    public ProvisionStatusBuilder edit() {
        return new ProvisionStatusBuilder(this);
    }

    @JsonIgnore
    public ProvisionStatusBuilder toBuilder() {
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
