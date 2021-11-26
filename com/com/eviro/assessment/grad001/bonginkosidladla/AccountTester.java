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
public class AccountTester {

    /**
     
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {    
        // creating an instance of Savings account
        SavingsAccount savingsAccount = new SavingsAccount();
        // creating an inatance of Account account
        CurrentAccount currentAccount = new CurrentAccount();
        
        savingsAccount.withdraw("1", 100000);
        savingsAccount.withdraw("2", 300);
        
        currentAccount.withdraw("3", 200);
        currentAccount.withdraw("4", 15000);
    } 
}
