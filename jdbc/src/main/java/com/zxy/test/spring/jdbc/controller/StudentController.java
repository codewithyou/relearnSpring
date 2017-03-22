package com.zxy.test.spring.jdbc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zxy.test.spring.jdbc.model.Student;
import com.zxy.test.spring.jdbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by zxy on 2017/3/21.
 */
@Controller
public class StudentController  {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String index() {
        System.out.print("dddddddffffffffffffffffff");
        return "index";
    }


    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList",this.studentService.getAll());
        mv.setViewName("all");
        return mv;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public ModelAndView findOne(@RequestParam("id") int  id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",this.studentService.getOne(id));
        mv.setViewName("userDetail");
        return mv;
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String del( @RequestParam("id") int  id) {
        int result  = this.studentService.delete(id);
        if(result != 0){
            System.out.println(" delete suc ! ");
        } else {
            System.err.println("del error !");
        }

        return "result";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void  update(Student student) {

    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/insert")
    public String insert(@RequestParam ("name") String name, @RequestParam ("age") int  age, @RequestParam ("sex") int sex, ModelMap modelMap) {
        Student student  = new Student();
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        int res = this.studentService.insert(student);
        String msg = "fail!";
        if(res == 1 ){
            msg = "suc!";
        }
        modelMap.put("msg",msg);
        return "result";
    }


}
