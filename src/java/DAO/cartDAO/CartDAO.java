/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.cartDAO;

import Model.cart.Cart;
import Model.itembook.ItemBook;
import Model.user.User;

/**
 *
 * @author pc
 */
public interface CartDAO {
    void deleteCart(Cart cart);
    void updateCart(Cart cart);
    void getItemBook(ItemBook itemBook);
    void getUser(User user);
}
