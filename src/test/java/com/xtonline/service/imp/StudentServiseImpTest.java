package com.xtonline.service.imp;

import com.xtonline.App;
import com.xtonline.dao.Student;
import com.xtonline.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class StudentServiseImpTest {

    @Autowired
    private StudentService studentService;
    @Test
    public void add() {
        Student student = new Student();
        student.setUsername("测试1");
        student.setPassword(1111);
        studentService.add(student);
    }
}
