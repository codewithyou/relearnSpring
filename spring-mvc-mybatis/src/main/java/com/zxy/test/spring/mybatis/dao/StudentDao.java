package com.zxy.test.spring.mybatis.dao;

import com.zxy.test.spring.mybatis.model.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;



@Repository
public interface StudentDao {
     //此处的方法名必须和mapper中的映射文件中的id同名
     Student getStudent(int id) ;

}
