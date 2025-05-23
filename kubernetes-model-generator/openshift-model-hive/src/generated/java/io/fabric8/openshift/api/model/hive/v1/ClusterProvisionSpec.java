
package io.fabric8.openshift.api.model.hive.v1;

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
import io.fabric8.kubernetes.api.model.PodSpec;
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
 * ClusterProvisionSpec defines the results of provisioning a cluster.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "adminKubeconfigSecretRef",
    "adminPasswordSecretRef",
    "attempt",
    "clusterDeploymentRef",
    "clusterID",
    "infraID",
    "installLog",
    "metadataJSON",
    "podSpec",
    "prevClusterID",
    "prevInfraID",
    "prevProvisionName",
    "stage"
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
public class ClusterProvisionSpec implements Editable<ClusterProvisionSpecBuilder>, KubernetesResource
{

    @JsonProperty("adminKubeconfigSecretRef")
    private LocalObjectReference adminKubeconfigSecretRef;
    @JsonProperty("adminPasswordSecretRef")
    private LocalObjectReference adminPasswordSecretRef;
    @JsonProperty("attempt")
    private Integer attempt;
    @JsonProperty("clusterDeploymentRef")
    private LocalObjectReference clusterDeploymentRef;
    @JsonProperty("clusterID")
    private String clusterID;
    @JsonProperty("infraID")
    private String infraID;
    @JsonProperty("installLog")
    private String installLog;
    @JsonProperty("metadata")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    private Object metadata;
    @JsonProperty("metadataJSON")
    private String metadataJSON;
    @JsonProperty("podSpec")
    private PodSpec podSpec;
    @JsonProperty("prevClusterID")
    private String prevClusterID;
    @JsonProperty("prevInfraID")
    private String prevInfraID;
    @JsonProperty("prevProvisionName")
    private String prevProvisionName;
    @JsonProperty("stage")
    private String stage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ClusterProvisionSpec() {
    }

    public ClusterProvisionSpec(LocalObjectReference adminKubeconfigSecretRef, LocalObjectReference adminPasswordSecretRef, Integer attempt, LocalObjectReference clusterDeploymentRef, String clusterID, String infraID, String installLog, Object metadata, String metadataJSON, PodSpec podSpec, String prevClusterID, String prevInfraID, String prevProvisionName, String stage) {
        super();
        this.adminKubeconfigSecretRef = adminKubeconfigSecretRef;
        this.adminPasswordSecretRef = adminPasswordSecretRef;
        this.attempt = attempt;
        this.clusterDeploymentRef = clusterDeploymentRef;
        this.clusterID = clusterID;
        this.infraID = infraID;
        this.installLog = installLog;
        this.metadata = metadata;
        this.metadataJSON = metadataJSON;
        this.podSpec = podSpec;
        this.prevClusterID = prevClusterID;
        this.prevInfraID = prevInfraID;
        this.prevProvisionName = prevProvisionName;
        this.stage = stage;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("adminKubeconfigSecretRef")
    public LocalObjectReference getAdminKubeconfigSecretRef() {
        return adminKubeconfigSecretRef;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("adminKubeconfigSecretRef")
    public void setAdminKubeconfigSecretRef(LocalObjectReference adminKubeconfigSecretRef) {
        this.adminKubeconfigSecretRef = adminKubeconfigSecretRef;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("adminPasswordSecretRef")
    public LocalObjectReference getAdminPasswordSecretRef() {
        return adminPasswordSecretRef;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("adminPasswordSecretRef")
    public void setAdminPasswordSecretRef(LocalObjectReference adminPasswordSecretRef) {
        this.adminPasswordSecretRef = adminPasswordSecretRef;
    }

    /**
     * Attempt is which attempt number of the cluster deployment that this ClusterProvision is
     */
    @JsonProperty("attempt")
    public Integer getAttempt() {
        return attempt;
    }

    /**
     * Attempt is which attempt number of the cluster deployment that this ClusterProvision is
     */
    @JsonProperty("attempt")
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("clusterDeploymentRef")
    public LocalObjectReference getClusterDeploymentRef() {
        return clusterDeploymentRef;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("clusterDeploymentRef")
    public void setClusterDeploymentRef(LocalObjectReference clusterDeploymentRef) {
        this.clusterDeploymentRef = clusterDeploymentRef;
    }

    /**
     * ClusterID is a globally unique identifier for this cluster generated during installation. Used for reporting metrics among other places.
     */
    @JsonProperty("clusterID")
    public String getClusterID() {
        return clusterID;
    }

    /**
     * ClusterID is a globally unique identifier for this cluster generated during installation. Used for reporting metrics among other places.
     */
    @JsonProperty("clusterID")
    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    /**
     * InfraID is an identifier for this cluster generated during installation and used for tagging/naming resources in cloud providers.
     */
    @JsonProperty("infraID")
    public String getInfraID() {
        return infraID;
    }

    /**
     * InfraID is an identifier for this cluster generated during installation and used for tagging/naming resources in cloud providers.
     */
    @JsonProperty("infraID")
    public void setInfraID(String infraID) {
        this.infraID = infraID;
    }

    /**
     * InstallLog is the log from the installer.
     */
    @JsonProperty("installLog")
    public String getInstallLog() {
        return installLog;
    }

    /**
     * InstallLog is the log from the installer.
     */
    @JsonProperty("installLog")
    public void setInstallLog(String installLog) {
        this.installLog = installLog;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("metadata")
    @JsonDeserialize(using = io.fabric8.kubernetes.internal.KubernetesDeserializer.class)
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * MetadataJSON is a JSON representation of the ClusterMetadata produced by the installer. We don't use a runtime.RawExtension because ClusterMetadata isn't a runtime.Object. We don't use ClusterMetadata itself because we don't want our API consumers to need to pull in the installer code and its dependencies.
     */
    @JsonProperty("metadataJSON")
    public String getMetadataJSON() {
        return metadataJSON;
    }

    /**
     * MetadataJSON is a JSON representation of the ClusterMetadata produced by the installer. We don't use a runtime.RawExtension because ClusterMetadata isn't a runtime.Object. We don't use ClusterMetadata itself because we don't want our API consumers to need to pull in the installer code and its dependencies.
     */
    @JsonProperty("metadataJSON")
    public void setMetadataJSON(String metadataJSON) {
        this.metadataJSON = metadataJSON;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("podSpec")
    public PodSpec getPodSpec() {
        return podSpec;
    }

    /**
     * ClusterProvisionSpec defines the results of provisioning a cluster.
     */
    @JsonProperty("podSpec")
    public void setPodSpec(PodSpec podSpec) {
        this.podSpec = podSpec;
    }

    /**
     * PrevClusterID is the cluster ID of the previous failed provision attempt.
     */
    @JsonProperty("prevClusterID")
    public String getPrevClusterID() {
        return prevClusterID;
    }

    /**
     * PrevClusterID is the cluster ID of the previous failed provision attempt.
     */
    @JsonProperty("prevClusterID")
    public void setPrevClusterID(String prevClusterID) {
        this.prevClusterID = prevClusterID;
    }

    /**
     * PrevInfraID is the infra ID of the previous failed provision attempt.
     */
    @JsonProperty("prevInfraID")
    public String getPrevInfraID() {
        return prevInfraID;
    }

    /**
     * PrevInfraID is the infra ID of the previous failed provision attempt.
     */
    @JsonProperty("prevInfraID")
    public void setPrevInfraID(String prevInfraID) {
        this.prevInfraID = prevInfraID;
    }

    /**
     * PrevProvisionName is the name of the previous failed provision attempt.
     */
    @JsonProperty("prevProvisionName")
    public String getPrevProvisionName() {
        return prevProvisionName;
    }

    /**
     * PrevProvisionName is the name of the previous failed provision attempt.
     */
    @JsonProperty("prevProvisionName")
    public void setPrevProvisionName(String prevProvisionName) {
        this.prevProvisionName = prevProvisionName;
    }

    /**
     * Stage is the stage of provisioning that the cluster deployment has reached.
     */
    @JsonProperty("stage")
    public String getStage() {
        return stage;
    }

    /**
     * Stage is the stage of provisioning that the cluster deployment has reached.
     */
    @JsonProperty("stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    @JsonIgnore
    public ClusterProvisionSpecBuilder edit() {
        return new ClusterProvisionSpecBuilder(this);
    }

    @JsonIgnore
    public ClusterProvisionSpecBuilder toBuilder() {
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
