package com.cloudyoung.crm.dealer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class BrandGroup implements Serializable {
    /**
     * 主营品牌组ID
     */
    private Integer brandGroupId;

    /**
     * 主营品牌组名称
     */
    private String brandGroupName;

    /**
     * 主营品牌组类型
     */
    private Integer brandGroupTypeId;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * LOGO地址
     */
    private String logoUrl;

    /**
     * 状态标识  1  有效  0 无效
     */
    private Byte isActive;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getBrandGroupId() {
        return brandGroupId;
    }

    public void setBrandGroupId(Integer brandGroupId) {
        this.brandGroupId = brandGroupId;
    }

    public String getBrandGroupName() {
        return brandGroupName;
    }

    public void setBrandGroupName(String brandGroupName) {
        this.brandGroupName = brandGroupName;
    }

    public Integer getBrandGroupTypeId() {
        return brandGroupTypeId;
    }

    public void setBrandGroupTypeId(Integer brandGroupTypeId) {
        this.brandGroupTypeId = brandGroupTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BrandGroup other = (BrandGroup) that;
        return (this.getBrandGroupId() == null ? other.getBrandGroupId() == null : this.getBrandGroupId().equals(other.getBrandGroupId()))
            && (this.getBrandGroupName() == null ? other.getBrandGroupName() == null : this.getBrandGroupName().equals(other.getBrandGroupName()))
            && (this.getBrandGroupTypeId() == null ? other.getBrandGroupTypeId() == null : this.getBrandGroupTypeId().equals(other.getBrandGroupTypeId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLogoUrl() == null ? other.getLogoUrl() == null : this.getLogoUrl().equals(other.getLogoUrl()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrandGroupId() == null) ? 0 : getBrandGroupId().hashCode());
        result = prime * result + ((getBrandGroupName() == null) ? 0 : getBrandGroupName().hashCode());
        result = prime * result + ((getBrandGroupTypeId() == null) ? 0 : getBrandGroupTypeId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandGroupId=").append(brandGroupId);
        sb.append(", brandGroupName=").append(brandGroupName);
        sb.append(", brandGroupTypeId=").append(brandGroupTypeId);
        sb.append(", remark=").append(remark);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", isActive=").append(isActive);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}