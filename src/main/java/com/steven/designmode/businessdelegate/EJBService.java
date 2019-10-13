/**
 * @author Steven
 * @create 2019/10/13 11:43
 * @Description:
 */
package com.steven.designmode.businessdelegate;


public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
