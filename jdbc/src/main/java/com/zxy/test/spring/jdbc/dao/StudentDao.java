package com.zxy.test.spring.jdbc.dao;

import com.zxy.test.spring.jdbc.model.Student;

import java.util.List;

/**
 * Created by zxy on 2017/3/21.
 */
public interface StudentDao {

     List<Student> getAllStudent() ;

     int insertStudent(Student student) ;

     int delStudent(int id);

     Student findStudent(int id) ;
}
