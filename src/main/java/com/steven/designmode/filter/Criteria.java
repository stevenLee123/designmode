/**
 * @program: designmode
 * @description: 过滤标准接口
 * @author: steven
 * @create: 2019-10-11 08:05
 **/
package com.steven.designmode.filter;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
