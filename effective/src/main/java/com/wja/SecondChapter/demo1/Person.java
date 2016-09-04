package com.wja.SecondChapter.demo1;

/**
 * 第一条:考虑用静态工厂方法代替构造器
 */
public class Person {
    private String name;
    private int age;//默认初始化值为0
    private String sex;



    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    /**
     * 静态工厂方法
     * 返回实例属性为null
     * @return
     */
    public static Person getNewInstance(){
        return new Person();
    }

    /**
     * 静态工厂方法
     * @param name
     * @return
     */
    public static Person getNewInstance(String name){
        return new Person(name);

    }
    /**
     * 静态工厂方法
     * @param name
     * @return
     */
    public static Person getNewInstance(String name,String sex){
        return new Person(name,sex);

    }


    public static void main(String[] args) {
        /*
        构造器 new 对象
         */
        Person s=new Person();
        /*
        静态方法获取对象
         */
        Person s1=Person.getNewInstance();
        System.out.println("s1:"+s1);
        /*
        获取有值对象
         */
        Person s2=Person.getNewInstance("aaaa");
        System.out.println("s2:"+s2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
