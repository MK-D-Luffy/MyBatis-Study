package com.study.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author 今天也要努力的小白
 * @creat 2020/5/25 22:46
 */
public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test() {
        System.out.println(getId());
    }
}
