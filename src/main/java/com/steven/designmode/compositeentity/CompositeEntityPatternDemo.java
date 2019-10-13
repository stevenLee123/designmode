/**
 * @author Steven
 * @create 2019/10/13 11:54
 * @Description: 组合实体模式客户端，只需要持有客户端即可
 */
package com.steven.designmode.compositeentity;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
