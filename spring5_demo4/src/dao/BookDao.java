package dao;

import entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void updaateBook(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
