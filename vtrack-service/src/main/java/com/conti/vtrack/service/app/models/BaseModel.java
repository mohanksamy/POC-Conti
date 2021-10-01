package com.conti.vtrack.service.app.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public abstract class BaseModel implements Serializable {

    protected static final String dateTimeFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";//"yyyy-MM-dd HH:mm:ss:SSS";
 
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @JsonFormat(pattern = dateTimeFormat)
    protected Date createdAt;

    protected String createdBy;
    
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @JsonFormat(pattern = dateTimeFormat)
    protected Date modifiedAt;

    protected String modifiedBy;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}