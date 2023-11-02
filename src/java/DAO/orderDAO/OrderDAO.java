/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.orderDAO;

import Model.order.Order;

/**
 *
 * @author pc
 */
public interface OrderDAO {
    void addOrder(Order order);
    void deleteOrder(Order order);
    void updateOrder(Order order);
    Order getOrderbyId(int id);
    Order[] getAllOrder();
}
