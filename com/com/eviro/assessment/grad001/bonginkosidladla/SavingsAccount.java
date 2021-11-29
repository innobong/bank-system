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
public class SavingsAccount implements AccountService{
    
    private double balance;

    // to withdraw from savings account
    @Override
    public void withdraw(String accountNum, double amountToWithdraw){
        System.out.println("Account Type: Savings");
        System.out.println("Account Number: "+accountNum); 
        
        try{
            // creating an instance of Account         
            Account accunt = new Account();
            // Check if account does exist
            balance = accunt.checkAccount(accountNum);
            System.out.println("Balance: R"+balance);
            // Check if Withdrawal Amount greater than balance
            if(balance>=amountToWithdraw){
               // calculate new balance after withdrawal 
               balance -= amountToWithdraw;
               System.out.println("withdraw:  -R"+amountToWithdraw); 
               // print new balance 
               System.out.println("New Balance: R"+balance); 
               System.out.println("");
              
           }else{
             // Throw exception if Withdrawal Amount is too large    
             throw new AccountNotFoundException("Withdrawal Amount too large");
            }
        }catch(AccountNotFoundException e){
            System.out.println(e.getMessage()); 
        }
        
    }

    public SavingsAccount() {
    }
}
