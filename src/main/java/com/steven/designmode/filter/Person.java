/**
 * @program: designmode
 * @description: 被过滤实体
 * @author: steven
 * @create: 2019-10-11 08:04
 **/
package com.steven.designmode.filter;

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
