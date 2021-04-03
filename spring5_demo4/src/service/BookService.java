package service;

import dao.BookDao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //修改方法
    public void updateBook(Book book) {
        bookDao.updaateBook(book);
    }

    //删除方法
    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    //查询表记录数
    public int findCount() {
        return bookDao.selectCount();
    }

    //查询一个对象
    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }

    //查询集合
    public List<Book> findAll() {
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
