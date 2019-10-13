/**
 * @author Steven
 * @create 2019/10/13 10:26
 * @Description:
 */
package com.steven.designmode.visitor;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
