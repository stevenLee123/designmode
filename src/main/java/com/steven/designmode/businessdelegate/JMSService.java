/**
 * @author Steven
 * @create 2019/10/13 11:44
 * @Description:
 */
package com.steven.designmode.businessdelegate;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
