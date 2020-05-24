package cn.ddoesc.production.pojo;

import java.io.Serializable;
import java.util.Date;

public class production_order implements Serializable {
    /**
     * 序
     */
    private Integer id;

    /**
     * 计划单编号
     */
    private String scheduleId;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 描述
     */
    private String productDescribe;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 出库单编号
     */
    private String qutboundOrderId;

    /**
     * 单位
     */
    private String amountUnit;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 总金额
     */
    private Integer aggregate;

    /**
     * 制定时间
     */
    private Date reviewTime;

    /**
     * 审核状态
     */
    private String checkedAudit;

    /**
     * 生成状态
     */
    private String productionGenerate;

    /**
     * 计划单审核状态
     */
    private String addStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId == null ? null : scheduleId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQutboundOrderId() {
        return qutboundOrderId;
    }

    public void setQutboundOrderId(String qutboundOrderId) {
        this.qutboundOrderId = qutboundOrderId == null ? null : qutboundOrderId.trim();
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit == null ? null : amountUnit.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAggregate() {
        return aggregate;
    }

    public void setAggregate(Integer aggregate) {
        this.aggregate = aggregate;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getCheckedAudit() {
        return checkedAudit;
    }

    public void setCheckedAudit(String checkedAudit) {
        this.checkedAudit = checkedAudit == null ? null : checkedAudit.trim();
    }

    public String getProductionGenerate() {
        return productionGenerate;
    }

    public void setProductionGenerate(String productionGenerate) {
        this.productionGenerate = productionGenerate == null ? null : productionGenerate.trim();
    }

    public String getAddStatus() {
        return addStatus;
    }

    public void setAddStatus(String addStatus) {
        this.addStatus = addStatus == null ? null : addStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productDescribe=").append(productDescribe);
        sb.append(", quantity=").append(quantity);
        sb.append(", qutboundOrderId=").append(qutboundOrderId);
        sb.append(", amountUnit=").append(amountUnit);
        sb.append(", price=").append(price);
        sb.append(", aggregate=").append(aggregate);
        sb.append(", reviewTime=").append(reviewTime);
        sb.append(", checkedAudit=").append(checkedAudit);
        sb.append(", productionGenerate=").append(productionGenerate);
        sb.append(", addStatus=").append(addStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
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
        production_order other = (production_order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScheduleId() == null ? other.getScheduleId() == null : this.getScheduleId().equals(other.getScheduleId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductDescribe() == null ? other.getProductDescribe() == null : this.getProductDescribe().equals(other.getProductDescribe()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getQutboundOrderId() == null ? other.getQutboundOrderId() == null : this.getQutboundOrderId().equals(other.getQutboundOrderId()))
            && (this.getAmountUnit() == null ? other.getAmountUnit() == null : this.getAmountUnit().equals(other.getAmountUnit()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAggregate() == null ? other.getAggregate() == null : this.getAggregate().equals(other.getAggregate()))
            && (this.getReviewTime() == null ? other.getReviewTime() == null : this.getReviewTime().equals(other.getReviewTime()))
            && (this.getCheckedAudit() == null ? other.getCheckedAudit() == null : this.getCheckedAudit().equals(other.getCheckedAudit()))
            && (this.getProductionGenerate() == null ? other.getProductionGenerate() == null : this.getProductionGenerate().equals(other.getProductionGenerate()))
            && (this.getAddStatus() == null ? other.getAddStatus() == null : this.getAddStatus().equals(other.getAddStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScheduleId() == null) ? 0 : getScheduleId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductDescribe() == null) ? 0 : getProductDescribe().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getQutboundOrderId() == null) ? 0 : getQutboundOrderId().hashCode());
        result = prime * result + ((getAmountUnit() == null) ? 0 : getAmountUnit().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAggregate() == null) ? 0 : getAggregate().hashCode());
        result = prime * result + ((getReviewTime() == null) ? 0 : getReviewTime().hashCode());
        result = prime * result + ((getCheckedAudit() == null) ? 0 : getCheckedAudit().hashCode());
        result = prime * result + ((getProductionGenerate() == null) ? 0 : getProductionGenerate().hashCode());
        result = prime * result + ((getAddStatus() == null) ? 0 : getAddStatus().hashCode());
        return result;
    }
}