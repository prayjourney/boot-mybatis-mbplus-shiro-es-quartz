package com.zgy.learn.webtoken.util;

import java.util.UUID;

/**
 * @author: pray-journey.io
 * @despcription:
 * @date: created in 2021-01-12
 * @modified :
 */
public interface JjwtConstant {
    String JWT_ID = UUID.randomUUID().toString();
    // 原始的秘钥
    String JWT_SECRET = "abc_helloWorld!!!++==!!!pp12";
    // 上面的JWT_SECRET使用base64转码成下面的JWT_SECRET
    // String JWT_SECRET = "YWJjX2hlbGxvV29ybGQhISErKz09ISEhcHAxMg==";
    int JWT_TTL = 60 * 60 * 1000;
}