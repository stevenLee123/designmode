/**
 * @author Steven
 * @create 2019/10/13 11:56
 * @Description: 对象访问接口
 */
package com.steven.designmode.dataaccessobject;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
