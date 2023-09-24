package com.xtonline.dao;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String username;
    private Integer password;
    private String name;
    private String email;
    private Integer phone_number;
    private Course course;
    private Integer course_id;

}
