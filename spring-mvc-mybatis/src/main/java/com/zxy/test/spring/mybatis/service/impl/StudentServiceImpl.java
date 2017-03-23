package com.zxy.test.spring.mybatis.service.impl;

import com.zxy.test.spring.mybatis.dao.StudentDao;
import com.zxy.test.spring.mybatis.model.Student;
import com.zxy.test.spring.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zxy on 2017/3/23.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudentById(int id) {
        return this.studentDao.getStudent(id);
    }


}
