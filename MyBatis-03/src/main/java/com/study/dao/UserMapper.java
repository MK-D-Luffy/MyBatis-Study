package com.study.dao;


import com.study.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 今天也要元气满满啊！
 * 今天也要加油啊！
 * 道路,很远!脚步,更长!
 */
public interface UserMapper {
    User getUserById(Integer id);

    List<User> getUserByLimit(Map<String,Integer> map);
}
