
package io.fabric8.openshift.api.model.console.v1;

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
 * ConsoleNotificationSpec is the desired console notification configuration.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "backgroundColor",
    "color",
    "link",
    "location",
    "text"
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
public class ConsoleNotificationSpec implements Editable<ConsoleNotificationSpecBuilder>, KubernetesResource
{

    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("color")
    private String color;
    @JsonProperty("link")
    private Link link;
    @JsonProperty("location")
    private String location;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ConsoleNotificationSpec() {
    }

    public ConsoleNotificationSpec(String backgroundColor, String color, Link link, String location, String text) {
        super();
        this.backgroundColor = backgroundColor;
        this.color = color;
        this.link = link;
        this.location = location;
        this.text = text;
    }

    /**
     * backgroundColor is the color of the background for the notification as CSS data type color.
     */
    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * backgroundColor is the color of the background for the notification as CSS data type color.
     */
    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * color is the color of the text for the notification as CSS data type color.
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * color is the color of the text for the notification as CSS data type color.
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * ConsoleNotificationSpec is the desired console notification configuration.
     */
    @JsonProperty("link")
    public Link getLink() {
        return link;
    }

    /**
     * ConsoleNotificationSpec is the desired console notification configuration.
     */
    @JsonProperty("link")
    public void setLink(Link link) {
        this.link = link;
    }

    /**
     * location is the location of the notification in the console. Valid values are: "BannerTop", "BannerBottom", "BannerTopBottom".
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * location is the location of the notification in the console. Valid values are: "BannerTop", "BannerBottom", "BannerTopBottom".
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * text is the visible text of the notification.
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * text is the visible text of the notification.
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonIgnore
    public ConsoleNotificationSpecBuilder edit() {
        return new ConsoleNotificationSpecBuilder(this);
    }

    @JsonIgnore
    public ConsoleNotificationSpecBuilder toBuilder() {
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
