package com.study.pojo;

import lombok.Data;

/**
 * @author 今天也要努力的小白
 * @creat 2020/5/25 16:28
 */
@Data
public class Student {
    private Integer id;
    private String name;
    //学生需要关联一个老师
    private Teacher teacher;
}
