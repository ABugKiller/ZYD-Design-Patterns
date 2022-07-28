package com.ad.demo;

import java.util.regex.Pattern;

/**
 * @Author: Zhengyingdeng
 * @Version: v1.0.0
 * @Date: Create in 2:14 下午 2020/11/19
 */
public class AnonymousFilter extends SecurityFilter {
    private String urlPattern;

    public AnonymousFilter(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    @Override
    public void doFilter(HttpRequest request, HttpResponse response) {
        if (Pattern.matches(urlPattern, request.getUrl())) {
            response.writeString(String.format("当前路径[%s]允许匿名访问", request.getUrl()));
        } else {
            doNext(request, response);
        }
    }

}
