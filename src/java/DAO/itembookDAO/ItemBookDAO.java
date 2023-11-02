/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.itembookDAO;

import Model.book.Author;
import Model.book.Publisher;
import Model.book.categorybook.CategoryBook;
import Model.itembook.ItemBook;

/**
 *
 * @author pc
 */
public interface ItemBookDAO {
    void addItemBook(ItemBook itembook);
    void deleteItemBook(ItemBook itembook);
    void updateItemBook(ItemBook itembook);
    ItemBook[] getAllItemBook(ItemBook itembook);
    ItemBook getItemBookbyId(int id);
    ItemBook[] searchItemBookbyAuthor(Author author);
    ItemBook[] searchItemBookbyPublisher(Publisher publisher);
    ItemBook[] searchItemBookbyCategoryBook(CategoryBook categorybook);
}
