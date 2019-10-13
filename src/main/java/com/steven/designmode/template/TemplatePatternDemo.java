/**
 * @author Steven
 * @create 2019/10/13 10:21
 * @Description:
 */
package com.steven.designmode.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
