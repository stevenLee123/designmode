/**
 * @author Steven
 * @create 2019/10/13 12:12
 * @Description:
 */
package com.steven.designmode.frontcontroller;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
