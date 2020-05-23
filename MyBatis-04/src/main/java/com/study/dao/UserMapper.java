package com.study.dao;


import com.study.pojo.User;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * 今天也要元气满满啊！
 * 今天也要加油啊！
 * 道路,很远!脚步,更长!
 */
public interface UserMapper {

    @Select ("select * from user")
    List<User> getAllUsers();

    /**
     * 当方法存在多个参数(非引用数据类型)时,必须加上@Parm注解,
     * 通过#{}获取参数时会自动获取@Parm注解中声明的参数名。
     */
    @Select ("select * from user where id=#{id}")
    User getUserById(@Param ("id") Integer id);


    @Insert ("insert into user(`id`,`name`,`pwd`) values (#{id},#{username},#{password});")
    int addUser(User user);


    @Delete ("delete from user where id=#{uid} ")
    int deleteUserById(@Param ("uid") Integer id);


    @Update ("update user set name=#{username} ,pwd=#{password} where id=#{id} ")
    int updateUser(User user);

}
