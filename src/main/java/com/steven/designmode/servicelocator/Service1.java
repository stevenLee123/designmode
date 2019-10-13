/**
 * @author Steven
 * @create 2019/10/13 13:48
 * @Description: 服务实现1
 */
package com.steven.designmode.servicelocator;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
