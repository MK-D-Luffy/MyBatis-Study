package com.study.dao;

import com.study.pojo.User;
import sun.nio.cs.US_ASCII;

public interface UserMapper {

    User queryUserById(Integer id);

    Integer deleteUserById(Integer id);
}
