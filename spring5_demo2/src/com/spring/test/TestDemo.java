package com.spring.test;

import com.spring.autowrite.Emp;
import com.spring.bean.Orders;
import com.spring.collectiontype.Book;
import com.spring.collectiontype.Course;
import com.spring.collectiontype.Stu;
import com.spring.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Transient;
import java.io.File;
import java.io.IOException;

public class TestDemo {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean10.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean11.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean12.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/bean13.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，获取创建bean实例");
        System.out.println(orders);

        //手动销毁实例
        context.close();
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean14.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
