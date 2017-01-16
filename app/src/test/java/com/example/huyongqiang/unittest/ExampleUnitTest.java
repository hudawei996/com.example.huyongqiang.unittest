package com.example.huyongqiang.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 * 单元测试类
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        //使用期望值，和调用类中的方法计算出来的结果是否一致，来作单元测试
        assertEquals(4, MainActivity.Count(2, 2));
    }
}