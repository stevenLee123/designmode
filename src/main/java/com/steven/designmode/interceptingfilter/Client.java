/**
 * @author Steven
 * @create 2019/10/13 12:29
 * @Description:
 */
package com.steven.designmode.interceptingfilter;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
