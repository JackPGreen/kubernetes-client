
package io.fabric8.chaosmesh.v1alpha1;

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

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path",
    "payload-process-num",
    "size"
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
public class DiskPayloadSpec implements Editable<DiskPayloadSpecBuilder>, KubernetesResource
{

    @JsonProperty("path")
    private String path;
    @JsonProperty("payload-process-num")
    private Integer payloadProcessNum;
    @JsonProperty("size")
    private String size;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DiskPayloadSpec() {
    }

    public DiskPayloadSpec(String path, Integer payloadProcessNum, String size) {
        super();
        this.path = path;
        this.payloadProcessNum = payloadProcessNum;
        this.size = size;
    }

    /**
     * specifies the location to fill data in. if path not provided, payload will read/write from/into a temp file, temp file will be deleted after writing
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * specifies the location to fill data in. if path not provided, payload will read/write from/into a temp file, temp file will be deleted after writing
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * specifies the number of process work on writing, default 1, only 1-255 is valid value
     */
    @JsonProperty("payload-process-num")
    public Integer getPayloadProcessNum() {
        return payloadProcessNum;
    }

    /**
     * specifies the number of process work on writing, default 1, only 1-255 is valid value
     */
    @JsonProperty("payload-process-num")
    public void setPayloadProcessNum(Integer payloadProcessNum) {
        this.payloadProcessNum = payloadProcessNum;
    }

    /**
     * specifies how many units of data will write into the file path. support unit: c=1, w=2, b=512, kB=1000, K=1024, MB=1000&#42;1000, M=1024&#42;1024, GB=1000&#42;1000&#42;1000, G=1024&#42;1024&#42;1024 BYTES. example : 1M | 512kB
     */
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    /**
     * specifies how many units of data will write into the file path. support unit: c=1, w=2, b=512, kB=1000, K=1024, MB=1000&#42;1000, M=1024&#42;1024, GB=1000&#42;1000&#42;1000, G=1024&#42;1024&#42;1024 BYTES. example : 1M | 512kB
     */
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonIgnore
    public DiskPayloadSpecBuilder edit() {
        return new DiskPayloadSpecBuilder(this);
    }

    @JsonIgnore
    public DiskPayloadSpecBuilder toBuilder() {
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
