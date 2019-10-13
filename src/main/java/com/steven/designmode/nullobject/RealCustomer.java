/**
 * @author Steven
 * @create 2019/10/13 9:16
 * @Description: 真实对象
 */
package com.steven.designmode.nullobject;

public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
