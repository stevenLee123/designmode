/**
 * @author Steven
 * @create 2019/10/13 10:14
 * @Description: 抽象模板类，定义模板方法
 */
package com.steven.designmode.template;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
