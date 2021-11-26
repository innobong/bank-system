/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001.bonginkosidladla;

/**
 *
 * @author Admin
 */
// to withdraw from account
public interface AccountService{
    public void withdraw(String accountNum, bigDecimal amountToWithdraw);
}


