package com.lxq18.learn.junit;

public class HttpResultUtil {
    public static String process200(HttpResult httpResult) {
        if (httpResult != null && 200 == httpResult.getStatusCode()) {
            return httpResult.getBody();
        }
        return null;
    }
}
