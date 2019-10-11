/**
 * @program: designmode
 * @description: 过滤标准实现3
 * @author: steven
 * @create: 2019-10-11 08:09
 **/
package com.steven.designmode.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
