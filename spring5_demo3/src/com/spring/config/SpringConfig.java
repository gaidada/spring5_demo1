package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//创建配置类，替代xml配置文件
@Configuration
@ComponentScan(basePackages = {"com.spring"})
public class SpringConfig {

}
