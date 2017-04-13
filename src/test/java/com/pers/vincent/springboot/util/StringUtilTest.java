package com.pers.vincent.springboot.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: vincent
 * Date: 2017/4/12
 * Comment: 字符串工具类测试
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StringUtilTest {

    @Before
    public void setUp() {

    }

    @Test
    public void isNotNullTest() {
        String s = " test ";
        Assert.assertTrue(StringUtil.isNotNull(s));
    }

    @Test
    public void isNullTest() {
        String s = " ";
        Assert.assertTrue(StringUtil.isNull(s));
    }

    @Test
    public void toStringTest() {
        byte[] bytes = {1, 1, 1};
        Assert.assertNotNull(StringUtil.toString(bytes));
    }

    @Test
    public void isEqualsTest() {
        String s1 = "s1";
        String s2 = "s2";
        Assert.assertFalse(StringUtil.isEquals(s1, s2));
    }

    @Test
    public void isNumberTest() {
        String s = "123";
        Assert.assertTrue(StringUtil.isNumber(s));
    }

    @Test
    public void parseShortTest() {
        String s = "123";
        Assert.assertNotNull(StringUtil.parseShort(s));
    }

    @Test
    public void parseIntTest() {
        String s = "123";
        Assert.assertNotNull(StringUtil.parseInteger(s));
    }

    @Test
    public void parseLongTest() {
        String s = "123";
        Assert.assertNotNull(StringUtil.parseLong(s));
    }

    @Test
    public void randomUUID() {
        Assert.assertNotNull(StringUtil.randomUUID());
    }
}
