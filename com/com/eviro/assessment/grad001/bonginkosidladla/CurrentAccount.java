/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001.bonginkosidladla;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CurrentAccount implements AccountService{
  private double balance;
  
  // to withdraw from Current account
  @Override
    public void withdraw(String accountNum, double amountToWithdraw){
        System.out.println("Account Type: Current");
        System.out.println("Account Number: "+accountNum); 
        
        try{
            // creating an instance of Account          
            Account accuntService = new Account();
            // fetch initial balance from database
            double initialBalance = accuntService.checkAccount(accountNum);
            System.out.println("Balance: R"+initialBalance); 
            // creating an instance of SystemDB 
            SystemDB data = new SystemDB();
            double overDraft = 0;
            ArrayList<Account> acclist = data.accountsData();
            // fetch overdraf for selected account number
            for(Account acc:acclist){        
               if(acc.getAccountNum().equals(accountNum)) {
                overDraft = acc.getOverDraft();
                System.out.println("Overdraft:  R"+overDraft); 
               }
            }
            // calculate available balance
            balance = overDraft + initialBalance;
            
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
}
