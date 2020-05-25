package com.study.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 今天也要努力的小白
 * @creat 2020/5/25 22:26
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;
}