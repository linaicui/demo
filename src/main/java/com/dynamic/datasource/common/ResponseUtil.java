package com.dynamic.datasource.common;

import com.dynamic.datasource.utils.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/11
 **/
public class ResponseUtil {

    private static final Logger logger = LoggerFactory.getLogger(ResponseUtil.class);

    /**
     * return response with default success or error message by status
     *
     * @param resultStatus
     * @return
     */
    public static CommonResponse generateResponse(boolean resultStatus) {
        CommonResponse commonResponse = new CommonResponse();
        if (resultStatus) {
            commonResponse
                    .setCode(ResponseCode.SUCCESS)
                    .setMessage(CommonConstant.DEFAULT_SUCCESS_MESSAGE);
        } else {
            commonResponse
                    .setCode(ResponseCode.FAIL)
                    .setMessage(CommonConstant.DEFAULT_FAIL_MESSAGE);
        }
        return commonResponse;
    }

    /**
     * return response with custom message by status
     *
     * @param message
     * @param resultStatus
     * @return
     */
    public static CommonResponse generateResponse(String message, boolean resultStatus) {
        CommonResponse commonResponse = new CommonResponse();
        if (resultStatus) {
            commonResponse
                    .setCode(ResponseCode.SUCCESS)
                    .setMessage(message);
        } else {
            commonResponse
                    .setCode(ResponseCode.FAIL)
                    .setMessage(message);
        }
        return commonResponse;
    }

    /**
     * return response with data,if data is null,return no data message,or return data
     *
     * @param data
     * @return
     */
    public static CommonResponse generateResponse(Object data) {
        CommonResponse commonResponse = new CommonResponse();
        if (data != null) {
            commonResponse
                    .setCode(ResponseCode.SUCCESS)
                    .setMessage(CommonConstant.DEFAULT_SUCCESS_MESSAGE)
                    .setData(data);
        } else {
            commonResponse
                    .setCode(ResponseCode.SUCCESS)
                    .setMessage(CommonConstant.NO_RESULT_MESSAGE);

        }
        return commonResponse;
    }

    /**
     * Handler response information
     *
     * @param response
     * @param object
     * @return
     */
    public static HttpServletResponse handlerResponse(HttpServletResponse response, Object object) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setStatus(200);
        try {
            response.getWriter().write(JSONUtil.toJSONString(object));
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return response;
    }
}
