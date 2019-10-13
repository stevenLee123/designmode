/**
 * @author Steven
 * @create 2019/10/13 11:53
 * @Description: 使用组合实体的客户端
 */
package com.steven.designmode.compositeentity;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
