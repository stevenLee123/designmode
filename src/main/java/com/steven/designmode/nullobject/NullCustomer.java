/**
 * @author Steven
 * @create 2019/10/13 9:42
 * @Description:
 */
package com.steven.designmode.nullobject;

public class NullCustomer extends  AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
