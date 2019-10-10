package com.ly.mt.core.common.entity.hd;

import java.io.Serializable;
import java.util.Date;

public class HdActivityUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.hd_shop_att_detail_id
     *
     * @mbggenerated
     */
    private Long hdShopAttDetailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.user_status
     *
     * @mbggenerated
     */
    private String userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hd_activity_user.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 年龄
     */
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.id
     *
     * @return the value of hd_activity_user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.id
     *
     * @param id the value for hd_activity_user.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.hd_shop_att_detail_id
     *
     * @return the value of hd_activity_user.hd_shop_att_detail_id
     *
     * @mbggenerated
     */
    public Long getHdShopAttDetailId() {
        return hdShopAttDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.hd_shop_att_detail_id
     *
     * @param hdShopAttDetailId the value for hd_activity_user.hd_shop_att_detail_id
     *
     * @mbggenerated
     */
    public void setHdShopAttDetailId(Long hdShopAttDetailId) {
        this.hdShopAttDetailId = hdShopAttDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.user_id
     *
     * @return the value of hd_activity_user.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.user_id
     *
     * @param userId the value for hd_activity_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.sex
     *
     * @return the value of hd_activity_user.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.sex
     *
     * @param sex the value for hd_activity_user.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.phone
     *
     * @return the value of hd_activity_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.phone
     *
     * @param phone the value for hd_activity_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.user_status
     *
     * @return the value of hd_activity_user.user_status
     *
     * @mbggenerated
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.user_status
     *
     * @param userStatus the value for hd_activity_user.user_status
     *
     * @mbggenerated
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.create_time
     *
     * @return the value of hd_activity_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.create_time
     *
     * @param createTime the value for hd_activity_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hd_activity_user.update_time
     *
     * @return the value of hd_activity_user.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hd_activity_user.update_time
     *
     * @param updateTime the value for hd_activity_user.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
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
        sb.append(", hdShopAttDetailId=").append(hdShopAttDetailId);
        sb.append(", userId=").append(userId);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public HdActivityUser() {

    }


    public HdActivityUser(Long id, Long hdShopAttDetailId, Long userId, String sex, String phone, String userStatus, Date createTime, Date updateTime, Integer age) {
        this.id = id;
        this.hdShopAttDetailId = hdShopAttDetailId;
        this.userId = userId;
        this.sex = sex;
        this.phone = phone;
        this.userStatus = userStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.age = age;
    }
}