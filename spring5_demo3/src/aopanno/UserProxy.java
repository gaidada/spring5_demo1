package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成代理对象
@Order(3) //多个增强类的优先级，值越小越优先
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* aopanno.User.add(..))")
    public void point() {

    }

    //前置通知
    @Before(value = "execution(* aopanno.User.add(..))")
    public void before() {
        System.out.println("before");
    }

    //最终通知
    @After(value = "execution(* aopanno.User.add(..))")
    public void after() {
        System.out.println("after");
    }

    //返回通知
    @AfterReturning(value = "execution(* aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    //异常通知
    @AfterThrowing(value = "point()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    //环绕通知
    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");

    }
}
