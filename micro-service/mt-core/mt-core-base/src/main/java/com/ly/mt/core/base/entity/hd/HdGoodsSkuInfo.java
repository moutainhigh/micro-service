package com.ly.mt.core.base.entity.hd;

import java.io.Serializable;
import java.util.Date;
/** @deprecated */
public class HdGoodsSkuInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.spu_id
     *
     * @mbggenerated
     */
    private Long spuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.sku_status
     *
     * @mbggenerated
     */
    private Integer skuStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.bar_code
     *
     * @mbggenerated
     */
    private String barCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.market_price
     *
     * @mbggenerated
     */
    private Double marketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.wholesale_price
     *
     * @mbggenerated
     */
    private Double wholesalePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.attributes
     *
     * @mbggenerated
     */
    private String attributes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.product_no
     *
     * @mbggenerated
     */
    private String productNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.name_gy
     *
     * @mbggenerated
     */
    private String nameGy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_sku_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_sku_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.id
     *
     * @return the value of goods_sku_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.id
     *
     * @param id the value for goods_sku_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.name
     *
     * @return the value of goods_sku_info.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.name
     *
     * @param name the value for goods_sku_info.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.code
     *
     * @return the value of goods_sku_info.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.code
     *
     * @param code the value for goods_sku_info.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.spu_id
     *
     * @return the value of goods_sku_info.spu_id
     *
     * @mbggenerated
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.spu_id
     *
     * @param spuId the value for goods_sku_info.spu_id
     *
     * @mbggenerated
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.sku_status
     *
     * @return the value of goods_sku_info.sku_status
     *
     * @mbggenerated
     */
    public Integer getSkuStatus() {
        return skuStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.sku_status
     *
     * @param skuStatus the value for goods_sku_info.sku_status
     *
     * @mbggenerated
     */
    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.bar_code
     *
     * @return the value of goods_sku_info.bar_code
     *
     * @mbggenerated
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.bar_code
     *
     * @param barCode the value for goods_sku_info.bar_code
     *
     * @mbggenerated
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.market_price
     *
     * @return the value of goods_sku_info.market_price
     *
     * @mbggenerated
     */
    public Double getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.market_price
     *
     * @param marketPrice the value for goods_sku_info.market_price
     *
     * @mbggenerated
     */
    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.wholesale_price
     *
     * @return the value of goods_sku_info.wholesale_price
     *
     * @mbggenerated
     */
    public Double getWholesalePrice() {
        return wholesalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.wholesale_price
     *
     * @param wholesalePrice the value for goods_sku_info.wholesale_price
     *
     * @mbggenerated
     */
    public void setWholesalePrice(Double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.attributes
     *
     * @return the value of goods_sku_info.attributes
     *
     * @mbggenerated
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.attributes
     *
     * @param attributes the value for goods_sku_info.attributes
     *
     * @mbggenerated
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.product_no
     *
     * @return the value of goods_sku_info.product_no
     *
     * @mbggenerated
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.product_no
     *
     * @param productNo the value for goods_sku_info.product_no
     *
     * @mbggenerated
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.create_time
     *
     * @return the value of goods_sku_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.create_time
     *
     * @param createTime the value for goods_sku_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.name_gy
     *
     * @return the value of goods_sku_info.name_gy
     *
     * @mbggenerated
     */
    public String getNameGy() {
        return nameGy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.name_gy
     *
     * @param nameGy the value for goods_sku_info.name_gy
     *
     * @mbggenerated
     */
    public void setNameGy(String nameGy) {
        this.nameGy = nameGy == null ? null : nameGy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_sku_info.update_time
     *
     * @return the value of goods_sku_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_sku_info.update_time
     *
     * @param updateTime the value for goods_sku_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_sku_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", spuId=").append(spuId);
        sb.append(", skuStatus=").append(skuStatus);
        sb.append(", barCode=").append(barCode);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", wholesalePrice=").append(wholesalePrice);
        sb.append(", attributes=").append(attributes);
        sb.append(", productNo=").append(productNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", nameGy=").append(nameGy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}