package com.zxy.test.spring.jdbc.controller;

import com.zxy.test.spring.jdbc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zxy on 2017/3/22.
 * 页面传值测试
 */

@Controller
public class ChuanzhiController {


    private Student getStudent() {
        Student student = new Student();
        student.name = "name111";

        return student;
    }

    /**
     * 通过modelAndView来传值到页面！
     *
     * @return
     */
    @RequestMapping(value = "/viaModelAndView" )
    public ModelAndView viaModelAndView() {
        return new ModelAndView("/test/index","student",getStudent());
    }

    //使用ModelMap对象到页面，ModelMap数据会利用HttpServletRequest的Attribute传值
    @RequestMapping(value = "/viamodelmap",method = RequestMethod.GET)
    public String viaModeMap(ModelMap modelMap) {
        modelMap.put("student",getStudent());
        return "/test/index";
    }






}
