/**
 * @author Steven
 * @create 2019/10/13 11:45
 * @Description: 业务访问客户端，持有业务服务接口
 */
package com.steven.designmode.businessdelegate;

public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
