package com.wja.SecondChapter.demo3;

import java.io.Serializable;

/**
 * 单例模式:公有静态成员是个final 域
 * 一
 */
public class Monkey implements Serializable{
    public static final Monkey INSTANCE = new Monkey();

    public Monkey() {
    }
    private Object readResolve(){
        return INSTANCE;
    }
    public void say(){
        System.out.println("I'm a monkey");
    }
}
