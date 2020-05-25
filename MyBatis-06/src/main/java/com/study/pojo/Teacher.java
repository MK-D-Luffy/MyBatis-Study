package com.study.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 今天也要努力的小白
 * @creat 2020/5/25 16:27
 */
@Data
public class Teacher {
    private Integer id;
    private String name;
    //一个老师拥有多个学生
    private List<Student> students;
}
