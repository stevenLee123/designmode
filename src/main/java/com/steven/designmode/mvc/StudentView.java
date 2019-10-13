/**
 * @author Steven
 * @create 2019/10/13 11:33
 * @Description: view视图类
 */
package com.steven.designmode.mvc;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
