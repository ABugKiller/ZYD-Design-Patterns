package com.ad.demo;

/**
 * @Author: Zhengyingdeng
 * @Version: v1.0.0
 * @Date: Create in 2:11 下午 2020/11/19
 */
public abstract class SecurityFilter {
    private SecurityFilter next;

    public SecurityFilter() {
    }

    public SecurityFilter(SecurityFilter next) {
        this.next = next;
    }

    public SecurityFilter getNext() {
        return next;
    }

    public void setNext(SecurityFilter next) {
        this.next = next;
    }

    /**
     * 调用下一个过滤器（如果不存在则直接返回）
     *
     * @param request  请求
     * @param response 响应
     */
    protected void doNext(HttpRequest request, HttpResponse response) {
        if (null != next) {
            next.doFilter(request, response);
        } else {
            System.out.println("已通过所有过滤器的过滤，当前默认行为为允许访问。当前请求已被接受。");
        }
    }

    /**
     * 执行过滤逻辑
     */
    public abstract void doFilter(HttpRequest request, HttpResponse response);
}
