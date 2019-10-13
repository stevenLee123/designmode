/**
 * @author Steven
 * @create 2019/10/13 10:24
 * @Description: 访问元素的接口
 */
package com.steven.designmode.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
