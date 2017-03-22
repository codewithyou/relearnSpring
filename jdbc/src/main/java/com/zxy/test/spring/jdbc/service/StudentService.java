package com.zxy.test.spring.jdbc.service;

import com.zxy.test.spring.jdbc.dao.impl.StudentDaoImpl;
import com.zxy.test.spring.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxy on 2017/3/21.
 */

@Service
public class StudentService  {

    @Autowired
    private StudentDaoImpl studentDao;

    public List<Student> getAll() {
        return this.studentDao.getAllStudent();
    }

    public Student getOne(int id ) {
        return this.studentDao.findStudent(id);
    }

    public int delete(int id) {
        return this.studentDao.delStudent(id);
    }

    public int insert(Student student) {
        return this.studentDao.insertStudent(student);
    }

}
