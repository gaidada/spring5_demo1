package aopanno;

import aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean2.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopxml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean3.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
