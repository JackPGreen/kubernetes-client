
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
    "database",
    "exception",
    "latency",
    "mysqlConnectorVersion",
    "pid",
    "port",
    "sqlType",
    "table"
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
public class PMJVMMySQLSpec implements Editable<PMJVMMySQLSpecBuilder>, KubernetesResource
{

    @JsonProperty("database")
    private String database;
    @JsonProperty("exception")
    private String exception;
    @JsonProperty("latency")
    private Integer latency;
    @JsonProperty("mysqlConnectorVersion")
    private String mysqlConnectorVersion;
    @JsonProperty("pid")
    private Integer pid;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("sqlType")
    private String sqlType;
    @JsonProperty("table")
    private String table;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PMJVMMySQLSpec() {
    }

    public PMJVMMySQLSpec(String database, String exception, Integer latency, String mysqlConnectorVersion, Integer pid, Integer port, String sqlType, String table) {
        super();
        this.database = database;
        this.exception = exception;
        this.latency = latency;
        this.mysqlConnectorVersion = mysqlConnectorVersion;
        this.pid = pid;
        this.port = port;
        this.sqlType = sqlType;
        this.table = table;
    }

    /**
     * the match database default value is "", means match all database
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * the match database default value is "", means match all database
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * The exception which needs to throw for action `exception` or the exception message needs to throw in action `mysql`
     */
    @JsonProperty("exception")
    public String getException() {
        return exception;
    }

    /**
     * The exception which needs to throw for action `exception` or the exception message needs to throw in action `mysql`
     */
    @JsonProperty("exception")
    public void setException(String exception) {
        this.exception = exception;
    }

    /**
     * The latency duration for action 'latency' or the latency duration in action `mysql`
     */
    @JsonProperty("latency")
    public Integer getLatency() {
        return latency;
    }

    /**
     * The latency duration for action 'latency' or the latency duration in action `mysql`
     */
    @JsonProperty("latency")
    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    /**
     * the version of mysql-connector-java, only support 5.X.X(set to "5") and 8.X.X(set to "8") now
     */
    @JsonProperty("mysqlConnectorVersion")
    public String getMysqlConnectorVersion() {
        return mysqlConnectorVersion;
    }

    /**
     * the version of mysql-connector-java, only support 5.X.X(set to "5") and 8.X.X(set to "8") now
     */
    @JsonProperty("mysqlConnectorVersion")
    public void setMysqlConnectorVersion(String mysqlConnectorVersion) {
        this.mysqlConnectorVersion = mysqlConnectorVersion;
    }

    /**
     * the pid of Java process which needs to attach
     */
    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    /**
     * the pid of Java process which needs to attach
     */
    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * the port of agent server, default 9277
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * the port of agent server, default 9277
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * the match sql type default value is "", means match all SQL type. The value can be 'select', 'insert', 'update', 'delete', 'replace'.
     */
    @JsonProperty("sqlType")
    public String getSqlType() {
        return sqlType;
    }

    /**
     * the match sql type default value is "", means match all SQL type. The value can be 'select', 'insert', 'update', 'delete', 'replace'.
     */
    @JsonProperty("sqlType")
    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    /**
     * the match table default value is "", means match all table
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * the match table default value is "", means match all table
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    @JsonIgnore
    public PMJVMMySQLSpecBuilder edit() {
        return new PMJVMMySQLSpecBuilder(this);
    }

    @JsonIgnore
    public PMJVMMySQLSpecBuilder toBuilder() {
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
