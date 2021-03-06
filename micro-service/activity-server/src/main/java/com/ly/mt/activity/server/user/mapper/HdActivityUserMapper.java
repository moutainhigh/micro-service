package com.ly.mt.activity.server.user.mapper;

import com.ly.mt.core.common.entity.hd.HdActivityUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HdActivityUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    int insert(HdActivityUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    int insertSelective(HdActivityUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    HdActivityUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HdActivityUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_activity_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HdActivityUser record);

    /**
     * 查询活动用户
     * @param shopAttDetailId
     * @param phone
     * @return
     */
    @Select("select * FROM hd_activity_user where hd_shop_att_detail_id = #{shopAttDetailId} and phone = #{phone}")
    List<HdActivityUser> findByShopAttDetailIdAndPhone(@Param("shopAttDetailId") Long shopAttDetailId,@Param("phone") String phone);

}