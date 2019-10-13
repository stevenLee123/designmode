/**
 * @author Steven
 * @create 2019/10/13 12:17
 * @Description:
 */
package com.steven.designmode.interceptingfilter;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
