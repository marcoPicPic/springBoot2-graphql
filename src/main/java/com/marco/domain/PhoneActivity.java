package com.marco.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;


@Document(indexName = "phone_activities", type = "phoneactivity")
public class PhoneActivity {

    @Id
    @Field(type = FieldType.Integer)
    private Integer id;

    @Field(type = FieldType.Integer)
    @JsonProperty("tenant_id")
    private Integer tenantId;

    @Field(type = FieldType.Date)
    @JsonProperty("date_stat")
    private Date dateStat;

    @Field(type = FieldType.Keyword)
    @JsonProperty("tenant_name")
    private String tenantName;

    @Field(type = FieldType.Keyword)
    @JsonProperty("tenant_uuid")
    private String tenantUuid;

    @Field(type = FieldType.Keyword)
    @JsonProperty("queue_id")
    private Long queueId;

    @Field(type = FieldType.Long)
    @JsonProperty("real_time_queue_id")
    private Long realTimeQueueId;

    @Field(type = FieldType.Long)
    @JsonProperty("operator_id")
    private Long operatorId;

    @Field(type = FieldType.Long)
    @JsonProperty("transfer_from_operator_id")
    private Long transferFromOperatorId;

    @Field(type = FieldType.Long)
    @JsonProperty("transfer_to_operator_id")
    private Long transferToOperatorId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("acd_customer_id")
    private String acdCustomerId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("call_uuid")
    private String callUuid;

    @Field(type = FieldType.Long)
    @JsonProperty("attempt_id_nb")
    private Long attemptIdNb;

    @Field(type = FieldType.Long)
    @JsonProperty("call_type_id")
    private Long callTypeId;

    @Field(type = FieldType.Keyword)
    @JsonProperty("customer_phone")
    private String customerPhone;

    @Field(type = FieldType.Long)
    @JsonProperty("link_result_id")
    private Long linkResultId;

    @Field(type = FieldType.Long)
    @JsonProperty("event_state_id")
    private Long eventStateId;

    @Field(type = FieldType.Long)
    @JsonProperty("phone_state_id")
    private Long phoneStateId;

    @Field(type = FieldType.Long)
    @JsonProperty("phone_state_begin_time")
    private Long phoneStateBeginTime;

    @Field(type = FieldType.Keyword)
    @JsonProperty("queue_waiting_begin_time")
    private String queueWaitingBeginTime;

    @Field(type = FieldType.Long)
    @JsonProperty("queue_waiting_duration")
    private Long queueWaitingDuration;

    @Field(type = FieldType.Long)
    @JsonProperty("popup_begin_time")
    private Long popupBeginTime;

    @Field(type = FieldType.Long)
    @JsonProperty("popup_duration")
    private Long popupDuration;

    @Field(type = FieldType.Long)
    @JsonProperty("ringing_begin_time")
    private Long ringingBeginTime;

    @Field(type = FieldType.Long)
    @JsonProperty("ringing_duration")
    private Long ringingDuration;

    @Field(type = FieldType.Long)
    @JsonProperty("communication_begin_time")
    private Long communicationBeginTime;

    @Field(type = FieldType.Long)
    @JsonProperty("communication_duration")
    private Long communicationDuration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Date getDateStat() {
        return dateStat;
    }

    public void setDateStat(Date dateStat) {
        this.dateStat = dateStat;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantUuid() {
        return tenantUuid;
    }

    public void setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
    }

    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public Long getRealTimeQueueId() {
        return realTimeQueueId;
    }

    public void setRealTimeQueueId(Long realTimeQueueId) {
        this.realTimeQueueId = realTimeQueueId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getTransferFromOperatorId() {
        return transferFromOperatorId;
    }

    public void setTransferFromOperatorId(Long transferFromOperatorId) {
        this.transferFromOperatorId = transferFromOperatorId;
    }

    public Long getTransferToOperatorId() {
        return transferToOperatorId;
    }

    public void setTransferToOperatorId(Long transferToOperatorId) {
        this.transferToOperatorId = transferToOperatorId;
    }

    public String getAcdCustomerId() {
        return acdCustomerId;
    }

    public void setAcdCustomerId(String acdCustomerId) {
        this.acdCustomerId = acdCustomerId;
    }

    public String getCallUuid() {
        return callUuid;
    }

    public void setCallUuid(String callUuid) {
        this.callUuid = callUuid;
    }

    public Long getAttemptIdNb() {
        return attemptIdNb;
    }

    public void setAttemptIdNb(Long attemptIdNb) {
        this.attemptIdNb = attemptIdNb;
    }

    public Long getCallTypeId() {
        return callTypeId;
    }

    public void setCallTypeId(Long callTypeId) {
        this.callTypeId = callTypeId;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Long getLinkResultId() {
        return linkResultId;
    }

    public void setLinkResultId(Long linkResultId) {
        this.linkResultId = linkResultId;
    }

    public Long getEventStateId() {
        return eventStateId;
    }

    public void setEventStateId(Long eventStateId) {
        this.eventStateId = eventStateId;
    }

    public Long getPhoneStateId() {
        return phoneStateId;
    }

    public void setPhoneStateId(Long phoneStateId) {
        this.phoneStateId = phoneStateId;
    }

    public Long getPhoneStateBeginTime() {
        return phoneStateBeginTime;
    }

    public void setPhoneStateBeginTime(Long phoneStateBeginTime) {
        this.phoneStateBeginTime = phoneStateBeginTime;
    }

    public String getQueueWaitingBeginTime() {
        return queueWaitingBeginTime;
    }

    public void setQueueWaitingBeginTime(String queueWaitingBeginTime) {
        this.queueWaitingBeginTime = queueWaitingBeginTime;
    }

    public Long getQueueWaitingDuration() {
        return queueWaitingDuration;
    }

    public void setQueueWaitingDuration(Long queueWaitingDuration) {
        this.queueWaitingDuration = queueWaitingDuration;
    }

    public Long getPopupBeginTime() {
        return popupBeginTime;
    }

    public void setPopupBeginTime(Long popupBeginTime) {
        this.popupBeginTime = popupBeginTime;
    }

    public Long getPopupDuration() {
        return popupDuration;
    }

    public void setPopupDuration(Long popupDuration) {
        this.popupDuration = popupDuration;
    }

    public Long getRingingBeginTime() {
        return ringingBeginTime;
    }

    public void setRingingBeginTime(Long ringingBeginTime) {
        this.ringingBeginTime = ringingBeginTime;
    }

    public Long getRingingDuration() {
        return ringingDuration;
    }

    public void setRingingDuration(Long ringingDuration) {
        this.ringingDuration = ringingDuration;
    }

    public Long getCommunicationBeginTime() {
        return communicationBeginTime;
    }

    public void setCommunicationBeginTime(Long communicationBeginTime) {
        this.communicationBeginTime = communicationBeginTime;
    }

    public Long getCommunicationDuration() {
        return communicationDuration;
    }

    public void setCommunicationDuration(Long communicationDuration) {
        this.communicationDuration = communicationDuration;
    }

}