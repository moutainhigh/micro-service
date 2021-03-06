package com.ly.mt.core.redis.dict;

import com.ly.mt.core.redis.RedisKey;

import static com.ly.mt.core.redis.RedisKey.*;

/**
 * @Description 动态验证码类型
 * @Author taoye
 */
public enum DynamicCodeType {
    DYNAMIC_CODE_TYPE_MALL_H5_REGIST("101", REDIS_CODE_MALL_H5_REGIST, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_REGIST, "H5商城用户注册"),
    DYNAMIC_CODE_TYPE_MALL_H5_LOGIN("102", REDIS_CODE_MALL_H5_LOGIN, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_LOGIN, "H5商城用户登录"),
    DYNAMIC_CODE_TYPE_MALL_H5_PASSWORD("103", REDIS_CODE_MALL_H5_PASSWORD, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_PASSWORD, "H5商城修改密码"),
    DYNAMIC_CODE_TYPE_MALL_H5_BIND_MOBILE("104", REDIS_CODE_MALL_H5_BIND_MOBILE, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_BIND_MOBILE, "H5商城绑定手机"),

    DYNAMIC_CODE_TYPE_HOME_B_USER_REGIST("105", REDIS_CODE_HOME_B_USER_REGIST, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_REGIST, "到家b用户注册"),
    DYNAMIC_CODE_TYPE_HOME_B_USER_LONGIN("106", REDIS_CODE_HOME_B_USER_LONGIN, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_LOGIN, "到家b用户登录"),
    DYNAMIC_CODE_TYPE_HOME_B_USER_PASSWORD("107", REDIS_CODE_HOME_B_USER_PASSWORD, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_PASSWORD, "到家b绑定手机"),

    DYNAMIC_CODE_TYPE_CABINET_OPEN_DEVICE_LOGIN("108", REDIS_GZG_OPEN_DEVICE_LOGIN, AlSmsTemplate.SMS_TEMPLATE_CODE_MAll_H5_LOGIN, "格子柜维护人员打开柜门前登录验证"),
    DYNAMIC_CODE_TYPE_ACTIVITY_APPLY_SIGN_UP_CABINET("201", REDIS_CODE_ACTIVITY_APPLY_SIGN_UP_CABINET, AlSmsTemplate.SMS_TEMPLATE_CODE_ACTIVITY_APPLY_SIGN_UP_CABINET, "格子柜入驻报名验证码");

    private final String id;
    private final RedisKey redisKey;
    private final AlSmsTemplate alSmsTemplate;
    private final String desc;


    DynamicCodeType(String id, RedisKey redisKey, AlSmsTemplate alSmsTemplate, String desc) {
        this.id = id;
        this.redisKey = redisKey;
        this.alSmsTemplate = alSmsTemplate;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public RedisKey getRedisKey() {
        return redisKey;
    }

    public AlSmsTemplate getAlSmsTemplate() {
        return alSmsTemplate;
    }

    public String getDesc() {
        return desc;
    }

    public static DynamicCodeType getDynamicCodeTypeById(String id) {
        for (DynamicCodeType dynamicCodeType : DynamicCodeType.values()) {
            if (id.equals(dynamicCodeType.getId())) {
                return dynamicCodeType;
            }
        }
        return null;
    }
}