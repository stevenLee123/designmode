/**
 * @author Steven
 * @create 2019/10/13 11:53
 * @Description: 组合后的实体
 */
package com.steven.designmode.compositeentity;

public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
