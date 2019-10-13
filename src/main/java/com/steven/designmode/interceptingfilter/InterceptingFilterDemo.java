/**
 * @author Steven
 * @create 2019/10/13 12:29
 * @Description: 拦截过滤器模式
 */
package com.steven.designmode.interceptingfilter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
