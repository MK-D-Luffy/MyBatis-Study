package com.study.dao;

import com.study.pojo.Blog;


import java.util.List;
import java.util.Map;
@SuppressWarnings("All")
public interface BlogMapper {

    Integer addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    Integer updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);

}
