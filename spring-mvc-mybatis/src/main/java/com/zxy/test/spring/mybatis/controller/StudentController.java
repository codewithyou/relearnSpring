package com.zxy.test.spring.mybatis.controller;

import com.zxy.test.spring.mybatis.model.Student;
import com.zxy.test.spring.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by zxy on 2017/3/23.
 */
@Controller
@RequestMapping("/student")
public class StudentController  {

    //@Resource的作用相当于@Autowired，只不过@Autowired按byType自动注入，而@Resource默认按 byName自动注入罢了。
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getById/{id}")
    public  String getById(@RequestParam("id") String id, ModelMap map){
        if(id == null || "".equals(id)) {
            return "404";
        }
        int i = Integer.parseInt(id);
        Student s =  this.studentService.getStudentById(i);
        map.put("student",s);

        return "studentDetail" ;

    }
}
