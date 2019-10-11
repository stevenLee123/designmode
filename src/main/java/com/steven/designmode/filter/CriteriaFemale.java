/**
 * @program: designmode
 * @description: 过滤标准实现2
 * @author: steven
 * @create: 2019-10-11 08:07
 **/
package com.steven.designmode.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
