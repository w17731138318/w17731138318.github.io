package com.wja.SecondChapter.demo2;

/**
 * 第二条:多个构造器参数时考虑构建器
 * 使用方法:
 *      使用时 Builder 构造函数的参数必填,其他需要那个参数就调用那个方法,最后 调用 .build();
 *      Person p= new Person.Builder("王小明").setAge(23).setSex("男").setPhone("17731138318").setAddress("石家庄").build();
 *      Person p1= new Person.Builder("王小明").setPhone("17731138318").setAddress("石家庄").build();
 */
public class Person {
    private String name;
    private int age;//默认初始化值为0
    private String sex;
    private String phone;
    private String address;

    public static class Builder{
        private String name;
        private int age;//默认初始化值为0
        private String sex;
        private String phone;
        private String address;

        /*
        必须有名字
         */
        public Builder(String name){
            this.name =name;
        }

        public Builder setAge(int val){
            age=val;
            return this;
        }public Builder setSex(String val){
            sex=val;
            return this;
        }public Builder setPhone(String val){
            phone=val;
            return this;
        }public Builder setAddress(String val){
            address=val;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
    private Person(Builder builder){
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
        phone = builder.phone;
        address = builder.address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
