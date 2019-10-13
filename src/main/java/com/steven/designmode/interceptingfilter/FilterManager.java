/**
 * @author Steven
 * @create 2019/10/13 12:18
 * @Description:
 */
package com.steven.designmode.interceptingfilter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
