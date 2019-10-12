/**
 * @author Steven
 * @create 2019/10/12 15:41
 * @Description:
 */
package com.steven.designmode.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
