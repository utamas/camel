
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.fhir.api.FhirRead;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.fhir.api.FhirRead
 */
public enum FhirReadApiMethod implements ApiMethod {

    RESOURCEBYID(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resource", Class.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYID_1(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resource", Class.class),
        arg("longId", Long.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYID_2(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resourceClass", String.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYID_3(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resourceClass", String.class),
        arg("longId", Long.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYID_4(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resource", Class.class),
        arg("stringId", String.class),
        arg("version", String.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYID_5(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceById",
        arg("resourceClass", String.class),
        arg("stringId", String.class),
        arg("ifVersionMatches", String.class),
        arg("version", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYURL(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceByUrl",
        arg("resource", Class.class),
        arg("iUrl", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYURL_1(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceByUrl",
        arg("resource", Class.class),
        arg("url", String.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYURL_2(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceByUrl",
        arg("resourceClass", String.class),
        arg("iUrl", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCEBYURL_3(
        org.hl7.fhir.instance.model.api.IBaseResource.class,
        "resourceByUrl",
        arg("resourceClass", String.class),
        arg("url", String.class),
        arg("ifVersionMatches", String.class),
        arg("returnNull", Boolean.class),
        arg("returnResource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("throwError", Boolean.class),
        arg("extraParameters", java.util.Map.class));

    

    private final ApiMethod apiMethod;

    private FhirReadApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FhirRead.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}