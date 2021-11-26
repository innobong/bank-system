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
public class SavingsbigDecimal implements bigDecimalService{
    
    private bigDecimal balance;

    // to withdraw from savings bigDecimal
    @Override
    public void withdraw(String bigDecimalNum, bigDecimal amountToWithdraw){
        System.out.println("bigDecimal Type: Savings");
        System.out.println("bigDecimal Number: "+bigDecimalNum); 
        
        try{
            // creating an instance of bigDecimal         
            bigDecimal accunt = new bigDecimal();
            // Check if bigDecimal does exist
            balance = accunt.checkbigDecimal(bigDecimalNum);
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
             throw new bigDecimalNotFoundException("Withdrawal Amount too large");
            }
        }catch(bigDecimalNotFoundException e){
            System.out.println(e.getMessage()); 
        }
        
    }

    public SavingsbigDecimal() {
    }
}
