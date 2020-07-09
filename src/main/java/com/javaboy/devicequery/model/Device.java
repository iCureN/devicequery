package com.javaboy.devicequery.model;

import java.util.Date;

public class Device {
    private Integer id;

    private String uuid;

    private String assetNumber;

    private String assetClass;

    private String assetName;

    private String manuFacturer;

    private String model;

    private Date buyTime;

    private double purchaseValue;

    private String auditTime;

    private String nowUseLocation;

    private String nowUser;

    private String startUseTime;

    private String endUseTime;

    private String usePlace;

    private String remark;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getNowUseLocation() {
        return nowUseLocation;
    }

    public void setNowUseLocation(String nowUseLocation) {
        this.nowUseLocation = nowUseLocation;
    }

    public String getNowUser() {
        return nowUser;
    }

    public void setNowUser(String nowUser) {
        this.nowUser = nowUser;
    }

    public String getStartUseTime() {
        return startUseTime;
    }

    public void setStartUseTime(String startUseTime) {
        this.startUseTime = startUseTime;
    }

    public String getEndUseTime() {
        return endUseTime;
    }

    public void setEndUseTime(String endUseTime) {
        this.endUseTime = endUseTime;
    }

    public String getUsePlace() {
        return usePlace;
    }

    public void setUsePlace(String usePlace) {
        this.usePlace = usePlace;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "资产明细{" +
                " 资产编号:'" + assetNumber + '\'' +
                ", 资产类别:'" + assetClass + '\'' +
                ", 资产名称:'" + assetName + '\'' +
                ", 生产厂商:'" + manuFacturer + '\'' +
                ", 型号:'" + model + '\'' +
                ", 购买时间:" + buyTime +
                ", 购买原值:" + purchaseValue +
                ", 审核日期:'" + auditTime + '\'' +
                ", 使用人:'" + nowUser + '\'' +
                ", 开始使用时间:'" + startUseTime + '\'' +
                ", 结束使用时间:'" + endUseTime + '\'' +
                ", 使用地:'" + usePlace + '\'' +
                ", 备注:'" + remark + '\'' +
                '}';
    }
}