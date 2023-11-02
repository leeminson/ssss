/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.accountDAO;

import Model.user.account.Account;

/**
 *
 * @author pc
 */
public interface AccountDAO {
    void checkLogin(String username,String password);
    void changePass(String password);
    Account getAccountbyId(int id);
}
