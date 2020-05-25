package com.study.dao;

import com.study.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
    @Insert("insert into blog (id, title, author, create_time, views) " +
            "values (#{id}, #{title}, #{author}, #{createTime}, #{views});")
    int addBlog(Blog blog);
}
