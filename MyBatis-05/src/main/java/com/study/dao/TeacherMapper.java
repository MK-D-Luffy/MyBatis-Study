package com.study.dao;


import com.study.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select ("select * from teacher where id= #{tid} ;")
    Teacher getTeacherById(@Param ("tid") Integer id);


}
