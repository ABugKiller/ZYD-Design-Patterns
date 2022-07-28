package com.ad.demo;

import java.util.regex.Pattern;

/**
 * @Author: Zhengyingdeng
 * @Version: v1.0.0
 * @Date: Create in 2:29 下午 2020/11/19
 */
public class RoleFilter extends SecurityFilter {
    private String urlPattern;
    private String roleName;

    public RoleFilter(String urlPattern, String roleName) {
        this.roleName = roleName;
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public void doFilter(HttpRequest request, HttpResponse response) {
        if (Pattern.matches(urlPattern, request.getUrl())) {
            if (null == request.getUser()) {
                response.writeString(String.format("当前路径[%s]必须要登录才能访问", request.getUrl()));
                return;
            }
            if (roleName != request.getCurrentRoleName()) {
                response.writeString(String.format("当前路径[%s]必须具有[%s]角色才能访问", request.getUrl(), roleName));
                return;
            }
        }

        doNext(request, response);
    }


}
