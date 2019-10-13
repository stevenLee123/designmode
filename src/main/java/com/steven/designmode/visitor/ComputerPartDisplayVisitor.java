/**
 * @author Steven
 * @create 2019/10/13 10:32
 * @Description:
 */
package com.steven.designmode.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor  {
    @Override
    public void visit(ComputerPart computerPart) {
//        System.out.println(computerPart.getClass().getName());
        if(computerPart instanceof Mouse) {
            System.out.println("visit mouse...");
        } else if(computerPart instanceof Keyboard) {
            System.out.println("visit keyboard");
        } else if(computerPart instanceof Monitor) {
            System.out.println("visit Monitor");
        } else {
            System.out.println("all computer part");
        }
    }
}
