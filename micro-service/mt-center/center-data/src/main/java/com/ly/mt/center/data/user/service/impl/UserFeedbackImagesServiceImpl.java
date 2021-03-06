package com.ly.mt.center.data.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ly.mt.center.data.user.mapper.UserFeedbackImagesMapper;
import com.ly.mt.center.data.user.service.UserFeedbackImagesService;
import com.ly.mt.center.data.user.entity.UserFeedbackImages;
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
public class UserFeedbackImagesServiceImpl extends BaseServiceImpl implements UserFeedbackImagesService {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserFeedbackImagesServiceImpl.class);
    @Resource
    UserFeedbackImagesMapper mapper;

    /**
     * @Description 保存UserFeedbackImages
     * @Author taoye
     */
    @Override
    public ResponseJson insertUserFeedbackImages(JSONObject jsonObject) {
        try {
            UserFeedbackImages userFeedbackImages = JSONObject.toJavaObject(jsonObject, UserFeedbackImages.class);
            if (StringUtil.isEmpty(userFeedbackImages.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "主键id不能为空");
            }
            mapper.insertUserFeedbackImages(userFeedbackImages);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("UserFeedbackImagesServiceImpl.insertUserFeedbackImages出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 删除UserFeedbackImages
     * @Author taoye
     */
    @Override
    public ResponseJson deleteUserFeedbackImages(JSONObject jsonObject) {
        try {
            UserFeedbackImages userFeedbackImages = JSONObject.toJavaObject(jsonObject, UserFeedbackImages.class);
            if (StringUtil.isEmpty(userFeedbackImages.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "删除条件不能为空");
            }
            mapper.deleteUserFeedbackImages(userFeedbackImages);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("UserFeedbackImagesServiceImpl.deleteUserFeedbackImages出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 更新UserFeedbackImages
     * @Author taoye
     */
    @Override
    public ResponseJson updateUserFeedbackImages(JSONObject jsonObject) {
        try {
            UserFeedbackImages userFeedbackImages = JSONObject.toJavaObject(jsonObject, UserFeedbackImages.class);
            if (StringUtil.isEmpty(userFeedbackImages.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "更新条件不能为空");
            }
            mapper.updateUserFeedbackImages(userFeedbackImages);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_SUCCESS);
        } catch (Exception e) {
            LOGGER.error("UserFeedbackImagesServiceImpl.updateUserFeedbackImagesById出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }


    /**
     * @Description 查询UserFeedbackImages
     * @Author taoye
     */
    @Override
    public ResponseJson getUserFeedbackImages(JSONObject jsonObject) {
        try {
            UserFeedbackImages userFeedbackImages = JSONObject.toJavaObject(jsonObject, UserFeedbackImages.class);
            if (StringUtil.isEmpty(userFeedbackImages.getId())) {
                return ResponseUtil.getResponseMsg(RESPONSE_CODE_ERROR, "查询条件不能为空");
            }
            userFeedbackImages = mapper.getUserFeedbackImages(userFeedbackImages);
            return ResponseUtil.getResponseObj(RESPONSE_CODE_SUCCESS, userFeedbackImages);
        } catch (Exception e) {
            LOGGER.error("UserFeedbackImagesServiceImpl.getUserFeedbackImages出错:", e);
            return ResponseUtil.getResponseCode(RESPONSE_CODE_ERROR);
        }
    }
}