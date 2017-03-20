package com.zxy.test.srping.from.controller;

import com.zxy.test.srping.from.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zxy on 2017/3/20.
 */
@Controller
public class FromController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        System.out.println(" student ");
        //在jsp中使用Spring框架标签form:form会自动绑定Model的一个属性值到当前form的实体对象，默认是command属性，这样绑定会就可以在form表单里使用该对象的属性了。
        ModelAndView mv = null;
        try {
            mv = new ModelAndView("student", "command", new Student());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("command")Student student, ModelMap model) {
        System.out.println(" addStudent ");
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "result";
    }


}
