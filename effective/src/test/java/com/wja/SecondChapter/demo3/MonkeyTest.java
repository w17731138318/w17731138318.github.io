package com.wja.SecondChapter.demo3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangweixin on 16/9/5.
 */
public class MonkeyTest {

    @Test
    public void testSay() throws Exception {
        Monkey.INSTANCE.say();
    }
}