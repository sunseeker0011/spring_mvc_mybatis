package com.ssmbuild.pojo;

public class books {
    private int bookId;
    private String bookName;
    private int bookCount;
    private String detail;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public books(int bookId, String bookName, int bookCount, String detail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.detail = detail;
    }

    public books() {
    }

    @Override
    public String toString() {
        return "books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", detail='" + detail + '\'' +
                '}';
    }
}
