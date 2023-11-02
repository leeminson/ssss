/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.categorybookDAO;

import Model.book.categorybook.CategoryBook;

/**
 *
 * @author pc
 */
public interface CategoryBookDAO {
    void addCategoryBook(CategoryBook categorybook);
    void updateCategoryBook(CategoryBook categorybook);
    void deleteCategoryBook(CategoryBook categorybook);
    CategoryBook[] getAllCategoryBook();
    CategoryBook getCategoryBookbyId();
}
