package com.wja.SecondChapter.demo3;

/**
 * 单例模式 公有成员时静态工厂方法
 *      二
 */
public class Pig {
    private static final Pig PIG= new Pig();

    private Pig() {
    }
    public static Pig getInstance(){
        return PIG;
    }
    public void say(){
        System.out.println("I'm a pig");
    }
}
