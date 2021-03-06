package com.ly.mt.center.data.shop.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ly.mt.center.data.shop.mapper.ShopLicensesMapper;
import com.ly.mt.center.data.shop.service.ShopLicensesService;
import com.ly.mt.center.data.shop.entity.ShopLicenses;
import com.ly.mt.base.service.impl.BaseServiceImpl;
import com.ly.mt.core.base.entity.ResponseJson;
import com.ly.mt.core.base.util.ResponseUtil;
import com.ly.mt.core.base.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.ly.mt.core.base.entity.ResponseCode.RESPONSE_CODE_ERROR;
import static com.ly.mt.core.base.entity.ResponseCode.RESPONSE_CODE_SUCCESS;

@Service
public class ShopLicensesServiceImpl extends BaseServiceImpl implements ShopLicensesService {
    private final static Logger LOGGER = LoggerFactory.getLogger(ShopLicensesServiceImpl.class);
    @Resource
    ShopLicensesMapper mapper;

    /**
     * @Description 保存ShopLicenses
     * @Author taoye
     */
    @Override
    public ResponseJson insertShopLicenses(JSONObject jsonObject) {
        try {
            ShopLicenses shopLicenses = JSONObject.toJavaObject(jsonObject, ShopLicenses.class);
            if (StringUtil.isEmpty(shopLicenses.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "主键id不能为空");
            }
            mapper.insertShopLicenses(shopLicenses);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("ShopLicensesServiceImpl.insertShopLicenses出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 删除ShopLicenses
     * @Author taoye
     */
    @Override
    public ResponseJson deleteShopLicenses(JSONObject jsonObject) {
        try {
            ShopLicenses shopLicenses = JSONObject.toJavaObject(jsonObject, ShopLicenses.class);
            if (StringUtil.isEmpty(shopLicenses.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "删除条件不能为空");
            }
            mapper.deleteShopLicenses(shopLicenses);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("ShopLicensesServiceImpl.deleteShopLicenses出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 更新ShopLicenses
     * @Author taoye
     */
    @Override
    public ResponseJson updateShopLicenses(JSONObject jsonObject) {
        try {
            ShopLicenses shopLicenses = JSONObject.toJavaObject(jsonObject, ShopLicenses.class);
            if (StringUtil.isEmpty(shopLicenses.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "更新条件不能为空");
            }
            mapper.updateShopLicenses(shopLicenses);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("ShopLicensesServiceImpl.updateShopLicensesById出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 查询ShopLicenses
     * @Author taoye
     */
    @Override
    public ResponseJson getShopLicenses(JSONObject jsonObject) {
        try {
            ShopLicenses shopLicenses = JSONObject.toJavaObject(jsonObject, ShopLicenses.class);
            if (StringUtil.isEmpty(shopLicenses.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "查询条件不能为空");
            }
            shopLicenses = mapper.getShopLicenses(shopLicenses);
            return ResponseUtil.getResponseObj(RESPONSE_CODE_SUCCESS, shopLicenses);
        } catch (Exception e) {
            LOGGER.error("ShopLicensesServiceImpl.getShopLicenses出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }
}