package com.xtonline.controller;

import com.xtonline.dao.Student;
import com.xtonline.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stu")
public class StudentComtroller {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody Student student){
        System.out.println(student);
        studentService.add(student);
    }
}
