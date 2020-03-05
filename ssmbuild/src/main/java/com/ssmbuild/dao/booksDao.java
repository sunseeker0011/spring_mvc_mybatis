package com.ssmbuild.dao;

import com.ssmbuild.pojo.books;

import java.util.List;

public interface booksDao {
    //增加
    public int addBook(books book);
    //删除
    public int deleteBookById(int id);
    //跟新
    public books updateBookById(books book);
    //查询
    public books queryBookById(int id);
    //查询全部
    public List<books> queryAllBooks();
}
