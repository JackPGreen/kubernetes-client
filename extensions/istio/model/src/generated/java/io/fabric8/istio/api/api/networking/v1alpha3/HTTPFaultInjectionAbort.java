
package io.fabric8.istio.api.api.networking.v1alpha3;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
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
 * Abort specification is used to prematurely abort a request with a pre-specified error code. The following example will return an HTTP 400 error code for 1 out of every 1000 requests to the "ratings" service "v1".<br><p> <br><p> ```yaml apiVersion: networking.istio.io/v1 kind: VirtualService metadata:<br><p> <br><p> 	name: ratings-route<br><p> <br><p> spec:<br><p> <br><p> 	hosts:<br><p> 	- ratings.prod.svc.cluster.local<br><p> 	http:<br><p> 	- route:<br><p> 	  - destination:<br><p> 	      host: ratings.prod.svc.cluster.local<br><p> 	      subset: v1<br><p> 	  fault:<br><p> 	    abort:<br><p> 	      percentage:<br><p> 	        value: 0.1<br><p> 	      httpStatus: 400<br><p> <br><p> ```<br><p> <br><p> The _httpStatus_ field is used to indicate the HTTP status code to return to the caller. The optional _percentage_ field can be used to only abort a certain percentage of requests. If not specified, no request will be aborted.
 */
@JsonDeserialize(using = io.fabric8.kubernetes.model.jackson.JsonUnwrappedDeserializer.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ErrorType",
    "percentage"
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
public class HTTPFaultInjectionAbort implements Editable<HTTPFaultInjectionAbortBuilder>, KubernetesResource
{

    @JsonProperty("ErrorType")
    @JsonUnwrapped
    private IsHTTPFaultInjectionAbortErrorType errorType;
    @JsonProperty("percentage")
    private Percent percentage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public HTTPFaultInjectionAbort() {
    }

    public HTTPFaultInjectionAbort(IsHTTPFaultInjectionAbortErrorType errorType, Percent percentage) {
        super();
        this.errorType = errorType;
        this.percentage = percentage;
    }

    /**
     * Abort specification is used to prematurely abort a request with a pre-specified error code. The following example will return an HTTP 400 error code for 1 out of every 1000 requests to the "ratings" service "v1".<br><p> <br><p> ```yaml apiVersion: networking.istio.io/v1 kind: VirtualService metadata:<br><p> <br><p> 	name: ratings-route<br><p> <br><p> spec:<br><p> <br><p> 	hosts:<br><p> 	- ratings.prod.svc.cluster.local<br><p> 	http:<br><p> 	- route:<br><p> 	  - destination:<br><p> 	      host: ratings.prod.svc.cluster.local<br><p> 	      subset: v1<br><p> 	  fault:<br><p> 	    abort:<br><p> 	      percentage:<br><p> 	        value: 0.1<br><p> 	      httpStatus: 400<br><p> <br><p> ```<br><p> <br><p> The _httpStatus_ field is used to indicate the HTTP status code to return to the caller. The optional _percentage_ field can be used to only abort a certain percentage of requests. If not specified, no request will be aborted.
     */
    @JsonProperty("ErrorType")
    @JsonUnwrapped
    public IsHTTPFaultInjectionAbortErrorType getErrorType() {
        return errorType;
    }

    /**
     * Abort specification is used to prematurely abort a request with a pre-specified error code. The following example will return an HTTP 400 error code for 1 out of every 1000 requests to the "ratings" service "v1".<br><p> <br><p> ```yaml apiVersion: networking.istio.io/v1 kind: VirtualService metadata:<br><p> <br><p> 	name: ratings-route<br><p> <br><p> spec:<br><p> <br><p> 	hosts:<br><p> 	- ratings.prod.svc.cluster.local<br><p> 	http:<br><p> 	- route:<br><p> 	  - destination:<br><p> 	      host: ratings.prod.svc.cluster.local<br><p> 	      subset: v1<br><p> 	  fault:<br><p> 	    abort:<br><p> 	      percentage:<br><p> 	        value: 0.1<br><p> 	      httpStatus: 400<br><p> <br><p> ```<br><p> <br><p> The _httpStatus_ field is used to indicate the HTTP status code to return to the caller. The optional _percentage_ field can be used to only abort a certain percentage of requests. If not specified, no request will be aborted.
     */
    @JsonProperty("ErrorType")
    public void setErrorType(IsHTTPFaultInjectionAbortErrorType errorType) {
        this.errorType = errorType;
    }

    /**
     * Abort specification is used to prematurely abort a request with a pre-specified error code. The following example will return an HTTP 400 error code for 1 out of every 1000 requests to the "ratings" service "v1".<br><p> <br><p> ```yaml apiVersion: networking.istio.io/v1 kind: VirtualService metadata:<br><p> <br><p> 	name: ratings-route<br><p> <br><p> spec:<br><p> <br><p> 	hosts:<br><p> 	- ratings.prod.svc.cluster.local<br><p> 	http:<br><p> 	- route:<br><p> 	  - destination:<br><p> 	      host: ratings.prod.svc.cluster.local<br><p> 	      subset: v1<br><p> 	  fault:<br><p> 	    abort:<br><p> 	      percentage:<br><p> 	        value: 0.1<br><p> 	      httpStatus: 400<br><p> <br><p> ```<br><p> <br><p> The _httpStatus_ field is used to indicate the HTTP status code to return to the caller. The optional _percentage_ field can be used to only abort a certain percentage of requests. If not specified, no request will be aborted.
     */
    @JsonProperty("percentage")
    public Percent getPercentage() {
        return percentage;
    }

    /**
     * Abort specification is used to prematurely abort a request with a pre-specified error code. The following example will return an HTTP 400 error code for 1 out of every 1000 requests to the "ratings" service "v1".<br><p> <br><p> ```yaml apiVersion: networking.istio.io/v1 kind: VirtualService metadata:<br><p> <br><p> 	name: ratings-route<br><p> <br><p> spec:<br><p> <br><p> 	hosts:<br><p> 	- ratings.prod.svc.cluster.local<br><p> 	http:<br><p> 	- route:<br><p> 	  - destination:<br><p> 	      host: ratings.prod.svc.cluster.local<br><p> 	      subset: v1<br><p> 	  fault:<br><p> 	    abort:<br><p> 	      percentage:<br><p> 	        value: 0.1<br><p> 	      httpStatus: 400<br><p> <br><p> ```<br><p> <br><p> The _httpStatus_ field is used to indicate the HTTP status code to return to the caller. The optional _percentage_ field can be used to only abort a certain percentage of requests. If not specified, no request will be aborted.
     */
    @JsonProperty("percentage")
    public void setPercentage(Percent percentage) {
        this.percentage = percentage;
    }

    @JsonIgnore
    public HTTPFaultInjectionAbortBuilder edit() {
        return new HTTPFaultInjectionAbortBuilder(this);
    }

    @JsonIgnore
    public HTTPFaultInjectionAbortBuilder toBuilder() {
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
