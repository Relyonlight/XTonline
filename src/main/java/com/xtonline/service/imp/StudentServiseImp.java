package com.xtonline.service.imp;

import com.xtonline.dao.Student;
import com.xtonline.mapper.StudentMapper;
import com.xtonline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiseImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }
}
