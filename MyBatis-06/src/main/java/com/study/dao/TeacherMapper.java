package com.study.dao;

import com.study.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacherById(@Param ("tid") Integer id);
    Teacher getTeacherById2(@Param ("tid") Integer id);
}
