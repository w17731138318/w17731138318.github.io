package com.wja.SecondChapter.demo3;

import org.junit.Test;

import static org.junit.Assert.*;


public class PigTest {
    @Test
    public void test() throws Exception {
        Pig.getInstance().say();
    }

}