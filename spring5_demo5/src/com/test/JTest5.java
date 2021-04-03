package com.test;

import com.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:resource/bean1.xml")
@SpringJUnitConfig(locations = "classpath:resource/bean1.xml")

public class JTest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test2() {
        userService.accountMoney();
    }
}
