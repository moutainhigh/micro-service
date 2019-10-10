package com.ly.mt.activity.server.shop.mapper;

import com.ly.mt.core.common.entity.hd.HdGoodsSpuInfo;
import com.ly.mt.core.common.entity.hd.HdShopAttDetail;
import com.ly.mt.core.common.entity.hd.dto.AttShopInfoDto;
import com.ly.mt.core.common.entity.hd.vo.HdShopAttDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description
 *
 * 活动门店信息商品操作dao
 *
 * @author panjingtian
 * @date 2019/6/14 4:35 PM
 */
@Mapper
public interface HdShopAttDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    int insert(HdShopAttDetail record);

    /**
     * 插入活动数据
     * 成功返回1 失败返回0
     * @param record
     * @return
     */
    int insertIgnore(HdShopAttDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    int insertSelective(HdShopAttDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    HdShopAttDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HdShopAttDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hd_shop_att_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HdShopAttDetail record);

    /**
     * 查询门店活动注册
     * @param activityId 活动id
     * @param phone 活动负责人手机号
     * @return
     */
    @Select("select * from hd_shop_att_detail where activity_id = #{activityId} and manager_phone = #{phone}")
    HdShopAttDetail findByActivityIdPhone(@Param("activityId") Long activityId,@Param("phone") String phone);

    /**
     * 查询是否注册了这玩意
     * @param attid 活动表主键
     * @param shopId 门店表主键
     * @return
     */
    @Select("SELECT * FROM hd_shop_att_detail where activity_id = #{attId} and shop_id = #{shopId}")
   List<HdShopAttDetail> findByAttIdAndShopId(@Param("attId")Long attid,@Param("shopId")Long shopId);


    /**
     * 查询商品spu
     * @param shopAttDetailId shop_att_detail_id
     * @return
     */
    @Select("SELECT * FROM goods_spu_info WHERE id IN" +
            "（ select goods_spu_info_id FROM hd_shop_att_goods_spu WHERE shop_att_detail_id = #{id})")
    List<HdGoodsSpuInfo> findShopAttGoodsSpu(@Param("id")Long shopAttDetailId);

    @Select("select * from hd_shop_att_detail where shop_id = #{shopId} and activity_id = #{activityId}")
    List<HdShopAttDetail> findByShopIdActivityId(@Param("shopId") Long shopId, @Param("activityId") Long activityId);

    @Select("SELECT ad.id as shop_att_detail_id , si.shop_name ,si.shop_address ,si.mobile FROM hd_shop_att_detail ad, shop_info si WHERE ad.activity_id= #{activityId} AND ad.shop_id = #{shopId} AND si.id = #{shopId}")
    List<AttShopInfoDto> findShopByShopIdActivityId(@Param("shopId") Long shopId, @Param("activityId") Long activityId);

    @Select("select * from hd_shop_att_detail where activity_id = #{activityId} and manager_phone = #{phone} and shop_id = #{shopId}")
    HdShopAttDetailVo findByActivityIdPhoneShopId(@Param("activityId") Long activityId,@Param("phone") String managerPhone,@Param("shopId") Long shopId);

    @Select("select * from hd_shop_att_detail where  manager_phone = #{phone}")
    List<HdShopAttDetail> selectByPhone(@Param("phone") String phone);

    @Select("select activity_id from hd_shop_att_detail where id = #{id}")
    Long findActivityIdById(@Param("id") Long shopAttDetailId);

    @Select("select * from hd_shop_att_detail where  manager_phone = #{phone} and activity_id = #{activityId}")
    List<HdShopAttDetail> findByPhoneActivityId(@Param("phone") String phone, @Param("activityId") Long activityId);
}