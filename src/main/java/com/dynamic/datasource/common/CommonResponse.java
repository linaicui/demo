package com.dynamic.datasource.common;

import com.dynamic.datasource.utils.JSONUtil;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/11
 **/
public class CommonResponse {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public CommonResponse setCode(ResponseCode responseCode) {
        this.code = responseCode.code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public CommonResponse setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSONUtil.toJSONString(this);
    }
}
