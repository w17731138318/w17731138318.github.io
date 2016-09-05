package com.wja.SecondChapter.demo3;

/**
 * 单例模式三 通过一个包含单个元素的枚举类型
 */
public enum  Dog {
    INSTANCE;
    public void say(){
        System.out.println("I'm a dog");
    }
}
