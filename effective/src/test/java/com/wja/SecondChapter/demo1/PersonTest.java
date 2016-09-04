package com.wja.SecondChapter.demo1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangweixin on 16/9/4.
 */
public class PersonTest {

    @Test
    public void testGetNewInstance() throws Exception {
        Person p=Person.getNewInstance();
        System.out.println(p);
    }

    @Test
    public void testGetNewInstance1() throws Exception {
        Person p=Person.getNewInstance("王小明");
        System.out.println(p);
    }

    @Test
    public void testGetNewInstance2() throws Exception {
        Person p=Person.getNewInstance("王小明","男");
        System.out.println(p);
    }
}