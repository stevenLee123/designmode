/**
 * @author Steven
 * @create 2019/10/13 13:53
 * @Description: 服务定位器，持有服务列表缓存
 */
package com.steven.designmode.servicelocator;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
