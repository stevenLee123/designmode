/**
 * @author Steven
 * @create 2019/10/13 10:27
 * @Description:
 */
package com.steven.designmode.visitor;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{
                new Mouse(), new Keyboard(), new Monitor()
        };
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
