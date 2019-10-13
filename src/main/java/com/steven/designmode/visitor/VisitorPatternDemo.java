/**
 * @author Steven
 * @create 2019/10/13 10:35
 * @Description: 访问者模式客户端
 */
package com.steven.designmode.visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
