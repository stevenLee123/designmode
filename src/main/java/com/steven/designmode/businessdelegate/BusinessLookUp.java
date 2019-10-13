/**
 * @author Steven
 * @create 2019/10/13 11:44
 * @Description: 查询业务实现，对业务代表提供服务
 */
package com.steven.designmode.businessdelegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
