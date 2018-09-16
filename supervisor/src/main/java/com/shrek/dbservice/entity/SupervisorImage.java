package com.shrek.dbservice.entity;

import java.util.Date;

public class SupervisorImage {
    private Integer supervisorImageId;

    private Integer supervisorId;

    private Integer imagesType;

    private String imagesUrl;

    private Integer displayOrder;

    private String imagesDesc;

    private String insertBy;

    private Integer updateBy;

    private Date insertTime;

    private Date updateTime;

    public Integer getSupervisorImageId() {
        return supervisorImageId;
    }

    public void setSupervisorImageId(Integer supervisorImageId) {
        this.supervisorImageId = supervisorImageId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public Integer getImagesType() {
        return imagesType;
    }

    public void setImagesType(Integer imagesType) {
        this.imagesType = imagesType;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl == null ? null : imagesUrl.trim();
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getImagesDesc() {
        return imagesDesc;
    }

    public void setImagesDesc(String imagesDesc) {
        this.imagesDesc = imagesDesc == null ? null : imagesDesc.trim();
    }

    public String getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy == null ? null : insertBy.trim();
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}