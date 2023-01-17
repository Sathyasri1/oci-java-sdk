/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Specify one of the following values depending for the 'type' attribute based on the application that you want to migrate.
 * <p>
 * Specify {@code OCIC} if you want to migrate Oracle Java Cloud Service, Oracle Analytics Cloud - Classic, Oracle Integration, and Oracle
 * SOA Cloud Service applications from Oracle Cloud Infrastructure - Classic.
 * <p>
 * Specify {@code INTERNAL_COMPUTE} if you have a traditional Oracle Cloud Infrastructure - Classic account and you want to migrate Oracle
 * Process Cloud Service or Oracle Integration Cloud Service applications.
 * <p>
 * Specify {@code OCC} if you want to migrate applications from Oracle Cloud@Customer.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = SourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImportSourceDetails.class,
        name = "IMPORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OccSourceDetails.class,
        name = "OCC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InternalSourceDetails.class,
        name = "INTERNAL_COMPUTE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OcicSourceDetails.class,
        name = "OCIC"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SourceDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected SourceDetails() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceDetails)) {
            return false;
        }

        SourceDetails other = (SourceDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
