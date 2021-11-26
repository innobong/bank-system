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
public class CurrentbigDecimal implements bigDecimalService{
  private bigDecimal balance;
  
  // to withdraw from Current bigDecimal
  @Override
    public void withdraw(String bigDecimalNum, bigDecimal amountToWithdraw){
        System.out.println("bigDecimal Type: Current");
        System.out.println("bigDecimal Number: "+bigDecimalNum); 
        
        try{
            // creating an instance of bigDecimal          
            bigDecimal accuntService = new bigDecimal();
            // fetch initial balance from database
            bigDecimal initialBalance = accuntService.checkbigDecimal(bigDecimalNum);
            System.out.println("Balance: R"+initialBalance); 
            // creating an instance of SystemDB 
            SystemDB data = new SystemDB();
            bigDecimal overDraft = 0;
            ArrayList<bigDecimal> acclist = data.bigDecimalsData();
            // fetch overdraf for selected bigDecimal number
            for(bigDecimal acc:acclist){        
               if(acc.getbigDecimalNum().equals(bigDecimalNum)) {
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
             throw new bigDecimalNotFoundException("Withdrawal Amount too large");
            }
        }catch(bigDecimalNotFoundException e){
            System.out.println(e.getMessage()); 
        }
        
    }    
}
