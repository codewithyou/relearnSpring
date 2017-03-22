package com.zxy.test.spring.jdbc.dao.impl;

import com.zxy.test.spring.jdbc.dao.StudentDao;
import com.zxy.test.spring.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zxy on 2017/3/21.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDatasource(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> getAllStudent() {
        List<Student> students = this.jdbcTemplate.query(
                "select *   from student ",
                new RowMapper<Student>() {
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student actor = new Student();
                        actor.setId(rs.getInt("id"));
                        actor.setName(rs.getString("name"));
                        actor.setAge(rs.getInt("age"));
                        actor.setSex(rs.getInt("sex"));
                        return actor;
                    }
                });

        return students;
    }

    public int insertStudent(Student student) {
        return this.jdbcTemplate.update(
                "insert into student (name, age,sex ) values (?, ?,?)",
                student.getName(), student.getAge(),student.getSex() );
    }

    public int delStudent(int id){
        return this.jdbcTemplate.update(
               "delete from student where id= ?",
                new Object [] {Long.valueOf(id)}
        );
    }

    public Student findStudent(int id) {
        Student student = this.jdbcTemplate.queryForObject(
                "select * from student where id = ?",
                new Object[]{id},
                new RowMapper<Student>() {
                    @Override
                    public Student  mapRow(ResultSet resultSet, int i) throws SQLException {
                        Student s = new Student();
                        s.setName(resultSet.getString("name"));;
                        s.setAge(resultSet.getInt("age"));;
                        s.setSex(resultSet.getInt("sex"));

                        return s;
                    }
                }
        );

        return student;
    }
}
