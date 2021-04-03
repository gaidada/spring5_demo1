package com.spring.service;

import com.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//注解里value属性可以省略，默认是类名首字母小写
@Service
public class UserService {
    //定义dao类型属性
    //不需要添加set方法
    @Autowired //根据类型注入
    private UserDao userDao;


    @Value(value = "zhangsan")
    private String name;

    public void add() {
        System.out.println("service add method");
        userDao.add();
    }
}
