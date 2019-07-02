package com.marco.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "realtime_counters", type = "counter")
public class RealtimeCounter {

    @Id
    @Field(type = FieldType.Integer)
    private Integer id;

    @Field(type = FieldType.Date)
    @JsonProperty("date_stat")
    private Date dateStat;

    @Field(type = FieldType.Keyword)
    @JsonProperty("realtime_counter_id")
    private String realtimeCounterId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("counter_code")
    private String counterCode;

    @Field(type = FieldType.Long)
    @JsonProperty("entity_id")
    private Long entityId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("entity_type")
    private String entityType;

    @Field(type = FieldType.Keyword)
    @JsonProperty("entity_type_name")
    private String entityTypeName;

    @Field(type = FieldType.Keyword)
    @JsonProperty("entity_uuid")
    private String entityUuid;

    @Field(type = FieldType.Keyword)
    @JsonProperty("entity_name")
    private String entityName;

    @Field(type = FieldType.Long)
    @JsonProperty("counter_id")
    private Long counterId;

    @Field(type = FieldType.Long)
    @JsonProperty("tenant_id")
    private Long tenantId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("tenant_uuid")
    private String tenantUuid;

    @Field(type = FieldType.Keyword)
    @JsonProperty("tenant_name")
    private String tenantName;

    @Field(type = FieldType.Long)
    @JsonProperty("realtime_counter_value")
    private Long realtimeCounterValue;

    @Field(type = FieldType.Keyword)
    @JsonProperty("realtime_counter_value_string")
    private String realtimeCounterValueString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateStat() {
        return dateStat;
    }

    public void setDateStat(Date dateStat) {
        this.dateStat = dateStat;
    }

    public String getRealtimeCounterId() {
        return realtimeCounterId;
    }

    public void setRealtimeCounterId(String realtimeCounterId) {
        this.realtimeCounterId = realtimeCounterId;
    }

    public String getCounterCode() {
        return counterCode;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEntityTypeName() {
        return entityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }

    public String getEntityUuid() {
        return entityUuid;
    }

    public void setEntityUuid(String entityUuid) {
        this.entityUuid = entityUuid;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getCounterId() {
        return counterId;
    }

    public void setCounterId(Long counterId) {
        this.counterId = counterId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantUuid() {
        return tenantUuid;
    }

    public void setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Long getRealtimeCounterValue() {
        return realtimeCounterValue;
    }

    public void setRealtimeCounterValue(Long realtimeCounterValue) {
        this.realtimeCounterValue = realtimeCounterValue;
    }

    public String getRealtimeCounterValueString() {
        return realtimeCounterValueString;
    }

    public void setRealtimeCounterValueString(String realtimeCounterValueString) {
        this.realtimeCounterValueString = realtimeCounterValueString;
    }
}
