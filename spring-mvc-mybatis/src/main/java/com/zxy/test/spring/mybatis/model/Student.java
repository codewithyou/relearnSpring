package com.zxy.test.spring.mybatis.model;

/**
 * Created by zxy on 2017/3/21.
 */
public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String name;
    public int age;
    public int sex;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id;
}
