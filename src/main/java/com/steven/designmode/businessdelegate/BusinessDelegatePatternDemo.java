/**
 * @author Steven
 * @create 2019/10/13 11:45
 * @Description: 业务代表模式
 */
package com.steven.designmode.businessdelegate;

public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
