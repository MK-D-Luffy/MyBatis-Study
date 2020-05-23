package com.study.utils;
/**
 * 今天也要元气满满啊！
 * 今天也要加油啊！
 * 道路,很远!脚步,更长!
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 今天也要努力的小白
 * @creat 2020/5/22 17:16
 */
public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //使用Mybatis第一步：获取sqlSessionFactory对象，来创建sqlSession对象
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 通过sqlSessionFactory获取sqlSession对象
     * SqlSession完全包含了面向数据库执行 SQL 命令所需的所有方法。
     * 代替原来使用JDBC的执行部分，功能与PrepareStatement和DBUtils类似
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        //设置默认为事务自动提交状态
        return sqlSessionFactory.openSession(true);
    }

}
