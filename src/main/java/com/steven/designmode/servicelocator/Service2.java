/**
 * @author Steven
 * @create 2019/10/13 13:49
 * @Description: 服务实现2
 */
package com.steven.designmode.servicelocator;

public class Service2  implements Service{
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
