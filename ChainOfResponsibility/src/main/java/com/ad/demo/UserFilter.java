package com.ad.demo;

import java.util.regex.Pattern;

/**
 * @Author: Zhengyingdeng
 * @Version: v1.0.0
 * @Date: Create in 2:17 下午 2020/11/19
 */
public class UserFilter extends SecurityFilter {
    private String urlPattern;

    public UserFilter(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    @Override public void doFilter(HttpRequest request, HttpResponse response) {
        if(Pattern.matches(urlPattern, request.getUrl())){
            if (null == request.getUser()){
                response.writeString(String.format("当前路径[%s]必须要登录才能访问", request.getUrl()));
                return;
            }
        }

        doNext(request, response);
    }
}
