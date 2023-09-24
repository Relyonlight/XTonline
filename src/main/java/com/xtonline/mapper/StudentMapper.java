package com.xtonline.mapper;

import com.xtonline.dao.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    //新增
    public void add(Student student);
}
