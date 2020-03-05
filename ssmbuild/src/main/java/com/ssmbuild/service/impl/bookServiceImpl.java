package com.ssmbuild.service.impl;

import com.ssmbuild.dao.booksDao;
import com.ssmbuild.pojo.books;
import com.ssmbuild.service.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("booksService")
public class bookServiceImpl implements booksService {

    @Autowired
    private booksDao booksDao;
    @Override
    public int addBook(books book) {
        return booksDao.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return booksDao.deleteBookById(id);
    }

    @Override
    public books updateBookById(books book) {
        return booksDao.updateBookById(book);
    }

    @Override
    public books queryBookById(int id) {
        return booksDao.queryBookById(id);
    }

    @Override
    public List<books> queryAllBooks() {
        return booksDao.queryAllBooks();
    }
}
