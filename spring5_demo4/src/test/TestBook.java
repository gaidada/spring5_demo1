package test;

import entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("Java");
        book.setUstatus("A");
        bookService.addBook(book);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("python");
        book.setUstatus("p");
        bookService.updateBook(book);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findCount();
        System.out.println(count);
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findOne("1");
        System.out.println(book);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> bookList = bookService.findAll();
        System.out.println(bookList);
    }

    @Test
    public void test7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"10", "C", "C"};
        Object[] o2 = {"11", "Go", "Go"};
        Object[] o3 = {"12", "C++", "C++"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"C++", "C++", "10"};
        Object[] o2 = {"GO", "GO", "11"};
        Object[] o3 = {"C#", "C#", "12"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    @Test
    public void test9() {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"10"};
        Object[] o2 = {"11"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchDelete(batchArgs);
    }
}
