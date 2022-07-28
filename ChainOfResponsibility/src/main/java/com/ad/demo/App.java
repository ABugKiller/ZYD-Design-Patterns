package com.ad.demo;

/**
 * @Author: Zhengyingdeng
 * @Version: v1.0.0
 * @Date: Create in 2:32 下午 2020/11/19
 */
public class App {

    public static void main(String[] args) {
        SecurityFilter userFilter = new UserFilter("^/user/.*");
        SecurityFilter roleFilter = new RoleFilter("^/admin/.*", "role_admin");
        SecurityFilter anonFilter = new AnonymousFilter("^/[^/]*");
        userFilter.setNext(roleFilter);
        roleFilter.setNext(anonFilter);
        userFilter.doFilter(new HttpRequest("/user/profile", null, null), new HttpResponse());
        userFilter.doFilter(new HttpRequest("/user/profile", "elvin", "role_user"), new HttpResponse());
        System.out.println("------------------");
        userFilter.doFilter(new HttpRequest("/admin/dashboard", "elvin", "role_user"), new HttpResponse());
        userFilter.doFilter(new HttpRequest("/admin/dashboard", "zenghui", "role_admin"), new HttpResponse());
        System.out.println("------------------");
        userFilter.doFilter(new HttpRequest("/about", "elvin", "role_user"), new HttpResponse());
        userFilter.doFilter(new HttpRequest("/about", null, null), new HttpResponse());
        System.out.println("------------------");
    }
}
