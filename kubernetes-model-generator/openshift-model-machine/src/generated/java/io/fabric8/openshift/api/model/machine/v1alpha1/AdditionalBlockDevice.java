
package io.fabric8.openshift.api.model.machine.v1alpha1;

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
 * additionalBlockDevice is a block device to attach to the server.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "sizeGiB",
    "storage"
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
public class AdditionalBlockDevice implements Editable<AdditionalBlockDeviceBuilder>, KubernetesResource
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("sizeGiB")
    private Integer sizeGiB;
    @JsonProperty("storage")
    private BlockDeviceStorage storage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public AdditionalBlockDevice() {
    }

    public AdditionalBlockDevice(String name, Integer sizeGiB, BlockDeviceStorage storage) {
        super();
        this.name = name;
        this.sizeGiB = sizeGiB;
        this.storage = storage;
    }

    /**
     * name of the block device in the context of a machine. If the block device is a volume, the Cinder volume will be named as a combination of the machine name and this name. Also, this name will be used for tagging the block device. Information about the block device tag can be obtained from the OpenStack metadata API or the config drive.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the block device in the context of a machine. If the block device is a volume, the Cinder volume will be named as a combination of the machine name and this name. Also, this name will be used for tagging the block device. Information about the block device tag can be obtained from the OpenStack metadata API or the config drive.
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sizeGiB is the size of the block device in gibibytes (GiB).
     */
    @JsonProperty("sizeGiB")
    public Integer getSizeGiB() {
        return sizeGiB;
    }

    /**
     * sizeGiB is the size of the block device in gibibytes (GiB).
     */
    @JsonProperty("sizeGiB")
    public void setSizeGiB(Integer sizeGiB) {
        this.sizeGiB = sizeGiB;
    }

    /**
     * additionalBlockDevice is a block device to attach to the server.
     */
    @JsonProperty("storage")
    public BlockDeviceStorage getStorage() {
        return storage;
    }

    /**
     * additionalBlockDevice is a block device to attach to the server.
     */
    @JsonProperty("storage")
    public void setStorage(BlockDeviceStorage storage) {
        this.storage = storage;
    }

    @JsonIgnore
    public AdditionalBlockDeviceBuilder edit() {
        return new AdditionalBlockDeviceBuilder(this);
    }

    @JsonIgnore
    public AdditionalBlockDeviceBuilder toBuilder() {
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
