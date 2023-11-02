/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.bookDAO;

import Model.book.Author;
import Model.book.Book;
import Model.book.Publisher;
import Model.book.categorybook.CategoryBook;
import Model.book.feedback.FeedBack;

/**
 *
 * @author pc
 */
public interface BookDAO {
    void addBook(Book book);
    void deleteBook(Book book);
    void updateBook(Book book);
    Book[] searchBookbyAuthor(Author author);
    Book[] searchBookbyPublisher(Publisher publisher);
    Book[] searchBookbyCategoryBook(CategoryBook categorybook);
    FeedBack[] getFeedBack(Book book);
    Author[] getAuthor(Book book);
    Publisher getPublisher(Book book);
    CategoryBook getCategoryBook(Book book);
    Book[] getAllBook();
    Book getBookbyId(Book book);
}
