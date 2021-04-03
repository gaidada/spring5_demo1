package com.service;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = 3, readOnly = false)
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    //转账方法
    public void accountMoney() {

        //少钱
        userDao.reduceMoney();
        int i = 12 / 0;
        //多钱
        userDao.addMoney();
    }
}
