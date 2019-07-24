package com.dynamic.datasource;

/**
 * @Author linjunmin
 * @Description //TODO $
 * @Date 2019/6/27
 **/
public class TestHttpRequest {
    public static void main(String[] args) {
        try {
            HttpRequester request = new HttpRequester();
            HttpRespons hr = request.sendGet("http://mgr-test.mysteelcms.com/cmsweb/login4Db.ms?id=210639");

            System.out.println(hr.getUrlString());
            System.out.println(hr.getProtocol());
            System.out.println(hr.getHost());
            System.out.println(hr.getPort());
            System.out.println(hr.getContentEncoding());
            System.out.println(hr.getMethod());

            System.out.println(hr.getContent());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
