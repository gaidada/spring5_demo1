package com.test;

import com.config.TxConfig;
import com.entity.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TestMoney {
    @Test
    public void tesAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void test2() {
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());
        //获取在spring注册的对象
//        User user = (User) context.getBean("com.entity.User");
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }



}
