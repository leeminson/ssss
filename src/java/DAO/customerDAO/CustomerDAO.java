/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.customerDAO;

import Model.order.Order;
import Model.user.Name;
import Model.user.customer.Customer;

/**
 *
 * @author pc
 */
public interface CustomerDAO {
    Customer[] getAllCus();
    void updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void addCustomer(Customer customer);
    Customer getCustomerbyId(int id);
    Customer[] getCustomerbyName(Name name);
    void viewOrder(Order order);
}
