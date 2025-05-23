
package io.fabric8.kubernetes.api.model;

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
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * SELinuxOptions are the labels to be applied to the container
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "role",
    "type",
    "user"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class SELinuxOptions implements Editable<SELinuxOptionsBuilder>, KubernetesResource
{

    @JsonProperty("level")
    private String level;
    @JsonProperty("role")
    private String role;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public SELinuxOptions() {
    }

    public SELinuxOptions(String level, String role, String type, String user) {
        super();
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    /**
     * Level is SELinux level label that applies to the container.
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * Level is SELinux level label that applies to the container.
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * User is a SELinux user label that applies to the container.
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User is a SELinux user label that applies to the container.
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonIgnore
    public SELinuxOptionsBuilder edit() {
        return new SELinuxOptionsBuilder(this);
    }

    @JsonIgnore
    public SELinuxOptionsBuilder toBuilder() {
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
