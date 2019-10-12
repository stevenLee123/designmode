/**
 * @author Steven
 * @create 2019/10/12 16:12
 * @Description: 保存状态的列表
 */
package com.steven.designmode.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
