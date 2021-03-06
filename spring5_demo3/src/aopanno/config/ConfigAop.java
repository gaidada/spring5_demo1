package aopanno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
