package com.wja.SecondChapter.demo2;

import static org.junit.Assert.*;
import com.wja.SecondChapter.demo2.Person;
/**
 * 构建器test
 */
public class PersonTest {
    public static void main(String[] args) {
        /**
         * Person p= new Person.Builder("王小明").setAge(23).setSex("男").setPhone("17731138318").setAddress("石家庄").build();
         *
         */
        Person p= new Person.Builder("王小明").setAge(23).setSex("男").setPhone("17731138318").setAddress("石家庄").build();
        Person p1= new Person.Builder("王小明").setPhone("17731138318").setAddress("石家庄").build();
        System.out.println(p1);
    }
}