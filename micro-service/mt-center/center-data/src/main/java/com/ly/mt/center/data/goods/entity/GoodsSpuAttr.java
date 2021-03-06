package com.ly.mt.center.data.goods.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class GoodsSpuAttr {
    @ApiModelProperty(value = "主键id", required = true)
    private String id;
    @ApiModelProperty("商品Id")
    private String spu_id;
    @ApiModelProperty("商品属性Id")
    private String attr_id;
    @ApiModelProperty("创建日期")
    private String create_time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(String spu_id) {
        this.spu_id = spu_id;
    }

    public String getAttr_id() {
        return attr_id;
    }

    public void setAttr_id(String attr_id) {
        this.attr_id = attr_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}