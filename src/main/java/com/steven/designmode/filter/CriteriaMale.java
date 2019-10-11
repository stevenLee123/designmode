/**
 * @program: designmode
 * @description: 过滤标准实现1
 * @author: steven
 * @create: 2019-10-11 08:06
 **/
package com.steven.designmode.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
