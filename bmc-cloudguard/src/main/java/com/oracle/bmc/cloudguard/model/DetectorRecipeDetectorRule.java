/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Detector Recipe Rule
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectorRecipeDetectorRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectorRecipeDetectorRule
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "detectorRuleId",
        "displayName",
        "description",
        "recommendation",
        "detector",
        "serviceType",
        "resourceType",
        "details",
        "managedListTypes",
        "candidateResponderRules",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "dataSourceId",
        "entitiesMappings"
    })
    public DetectorRecipeDetectorRule(
            String detectorRuleId,
            String displayName,
            String description,
            String recommendation,
            DetectorEnum detector,
            String serviceType,
            String resourceType,
            DetectorDetails details,
            java.util.List<ManagedListTypes> managedListTypes,
            java.util.List<CandidateResponderRule> candidateResponderRules,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String dataSourceId,
            java.util.List<EntitiesMapping> entitiesMappings) {
        super();
        this.detectorRuleId = detectorRuleId;
        this.displayName = displayName;
        this.description = description;
        this.recommendation = recommendation;
        this.detector = detector;
        this.serviceType = serviceType;
        this.resourceType = resourceType;
        this.details = details;
        this.managedListTypes = managedListTypes;
        this.candidateResponderRules = candidateResponderRules;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.dataSourceId = dataSourceId;
        this.entitiesMappings = entitiesMappings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the detector rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
        private String detectorRuleId;

        /**
         * The unique identifier of the detector rule.
         * @param detectorRuleId the value to set
         * @return this builder
         **/
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = detectorRuleId;
            this.__explicitlySet__.add("detectorRuleId");
            return this;
        }
        /**
         * Display name for DetectorRecipeDetectorRule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for DetectorRecipeDetectorRule.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description for DetectorRecipeDetectorRule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for DetectorRecipeDetectorRule.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Recommendation for DetectorRecipeDetectorRule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
        private String recommendation;

        /**
         * Recommendation for DetectorRecipeDetectorRule
         * @param recommendation the value to set
         * @return this builder
         **/
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            this.__explicitlySet__.add("recommendation");
            return this;
        }
        /**
         * detector for the rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * detector for the rule
         * @param detector the value to set
         * @return this builder
         **/
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /**
         * service type of the configuration to which the rule is applied
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private String serviceType;

        /**
         * service type of the configuration to which the rule is applied
         * @param serviceType the value to set
         * @return this builder
         **/
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /**
         * resource type of the configuration to which the rule is applied
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resource type of the configuration to which the rule is applied
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private DetectorDetails details;

        public Builder details(DetectorDetails details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * List of cloudguard managed list types related to this rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedListTypes")
        private java.util.List<ManagedListTypes> managedListTypes;

        /**
         * List of cloudguard managed list types related to this rule
         * @param managedListTypes the value to set
         * @return this builder
         **/
        public Builder managedListTypes(java.util.List<ManagedListTypes> managedListTypes) {
            this.managedListTypes = managedListTypes;
            this.__explicitlySet__.add("managedListTypes");
            return this;
        }
        /**
         * List of CandidateResponderRule related to this rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("candidateResponderRules")
        private java.util.List<CandidateResponderRule> candidateResponderRules;

        /**
         * List of CandidateResponderRule related to this rule
         * @param candidateResponderRules the value to set
         * @return this builder
         **/
        public Builder candidateResponderRules(
                java.util.List<CandidateResponderRule> candidateResponderRules) {
            this.candidateResponderRules = candidateResponderRules;
            this.__explicitlySet__.add("candidateResponderRules");
            return this;
        }
        /**
         * The date and time the detector recipe rule was created. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the detector recipe rule was created. Format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the detector recipe rule was updated. Format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the detector recipe rule was updated. Format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the DetectorRule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the DetectorRule.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The id of the attached DataSource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
        private String dataSourceId;

        /**
         * The id of the attached DataSource.
         * @param dataSourceId the value to set
         * @return this builder
         **/
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            this.__explicitlySet__.add("dataSourceId");
            return this;
        }
        /**
         * Data Source entities mapping for a Detector Rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
        private java.util.List<EntitiesMapping> entitiesMappings;

        /**
         * Data Source entities mapping for a Detector Rule
         * @param entitiesMappings the value to set
         * @return this builder
         **/
        public Builder entitiesMappings(java.util.List<EntitiesMapping> entitiesMappings) {
            this.entitiesMappings = entitiesMappings;
            this.__explicitlySet__.add("entitiesMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorRecipeDetectorRule build() {
            DetectorRecipeDetectorRule model =
                    new DetectorRecipeDetectorRule(
                            this.detectorRuleId,
                            this.displayName,
                            this.description,
                            this.recommendation,
                            this.detector,
                            this.serviceType,
                            this.resourceType,
                            this.details,
                            this.managedListTypes,
                            this.candidateResponderRules,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dataSourceId,
                            this.entitiesMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorRecipeDetectorRule model) {
            if (model.wasPropertyExplicitlySet("detectorRuleId")) {
                this.detectorRuleId(model.getDetectorRuleId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("recommendation")) {
                this.recommendation(model.getRecommendation());
            }
            if (model.wasPropertyExplicitlySet("detector")) {
                this.detector(model.getDetector());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("managedListTypes")) {
                this.managedListTypes(model.getManagedListTypes());
            }
            if (model.wasPropertyExplicitlySet("candidateResponderRules")) {
                this.candidateResponderRules(model.getCandidateResponderRules());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("dataSourceId")) {
                this.dataSourceId(model.getDataSourceId());
            }
            if (model.wasPropertyExplicitlySet("entitiesMappings")) {
                this.entitiesMappings(model.getEntitiesMappings());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique identifier of the detector rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRuleId")
    private final String detectorRuleId;

    /**
     * The unique identifier of the detector rule.
     * @return the value
     **/
    public String getDetectorRuleId() {
        return detectorRuleId;
    }

    /**
     * Display name for DetectorRecipeDetectorRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for DetectorRecipeDetectorRule.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description for DetectorRecipeDetectorRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for DetectorRecipeDetectorRule.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Recommendation for DetectorRecipeDetectorRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendation")
    private final String recommendation;

    /**
     * Recommendation for DetectorRecipeDetectorRule
     * @return the value
     **/
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * detector for the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * detector for the rule
     * @return the value
     **/
    public DetectorEnum getDetector() {
        return detector;
    }

    /**
     * service type of the configuration to which the rule is applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final String serviceType;

    /**
     * service type of the configuration to which the rule is applied
     * @return the value
     **/
    public String getServiceType() {
        return serviceType;
    }

    /**
     * resource type of the configuration to which the rule is applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resource type of the configuration to which the rule is applied
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final DetectorDetails details;

    public DetectorDetails getDetails() {
        return details;
    }

    /**
     **/
    public enum ManagedListTypes {
        CidrBlock("CIDR_BLOCK"),
        Users("USERS"),
        Groups("GROUPS"),
        Ipv4Address("IPV4ADDRESS"),
        Ipv6Address("IPV6ADDRESS"),
        ResourceOcid("RESOURCE_OCID"),
        Region("REGION"),
        Country("COUNTRY"),
        State("STATE"),
        City("CITY"),
        Tags("TAGS"),
        Generic("GENERIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagedListTypes.class);

        private final String value;
        private static java.util.Map<String, ManagedListTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedListTypes v : ManagedListTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedListTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedListTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedListTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * List of cloudguard managed list types related to this rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListTypes")
    private final java.util.List<ManagedListTypes> managedListTypes;

    /**
     * List of cloudguard managed list types related to this rule
     * @return the value
     **/
    public java.util.List<ManagedListTypes> getManagedListTypes() {
        return managedListTypes;
    }

    /**
     * List of CandidateResponderRule related to this rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("candidateResponderRules")
    private final java.util.List<CandidateResponderRule> candidateResponderRules;

    /**
     * List of CandidateResponderRule related to this rule
     * @return the value
     **/
    public java.util.List<CandidateResponderRule> getCandidateResponderRules() {
        return candidateResponderRules;
    }

    /**
     * The date and time the detector recipe rule was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the detector recipe rule was created. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the detector recipe rule was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the detector recipe rule was updated. Format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the DetectorRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the DetectorRule.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The id of the attached DataSource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
    private final String dataSourceId;

    /**
     * The id of the attached DataSource.
     * @return the value
     **/
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * Data Source entities mapping for a Detector Rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitiesMappings")
    private final java.util.List<EntitiesMapping> entitiesMappings;

    /**
     * Data Source entities mapping for a Detector Rule
     * @return the value
     **/
    public java.util.List<EntitiesMapping> getEntitiesMappings() {
        return entitiesMappings;
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
        sb.append("DetectorRecipeDetectorRule(");
        sb.append("super=").append(super.toString());
        sb.append("detectorRuleId=").append(String.valueOf(this.detectorRuleId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", recommendation=").append(String.valueOf(this.recommendation));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", managedListTypes=").append(String.valueOf(this.managedListTypes));
        sb.append(", candidateResponderRules=")
                .append(String.valueOf(this.candidateResponderRules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", dataSourceId=").append(String.valueOf(this.dataSourceId));
        sb.append(", entitiesMappings=").append(String.valueOf(this.entitiesMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectorRecipeDetectorRule)) {
            return false;
        }

        DetectorRecipeDetectorRule other = (DetectorRecipeDetectorRule) o;
        return java.util.Objects.equals(this.detectorRuleId, other.detectorRuleId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.recommendation, other.recommendation)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.managedListTypes, other.managedListTypes)
                && java.util.Objects.equals(
                        this.candidateResponderRules, other.candidateResponderRules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.entitiesMappings, other.entitiesMappings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.detectorRuleId == null ? 43 : this.detectorRuleId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendation == null ? 43 : this.recommendation.hashCode());
        result = (result * PRIME) + (this.detector == null ? 43 : this.detector.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.managedListTypes == null ? 43 : this.managedListTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.candidateResponderRules == null
                                ? 43
                                : this.candidateResponderRules.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.dataSourceId == null ? 43 : this.dataSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.entitiesMappings == null ? 43 : this.entitiesMappings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
