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
public class account {
    private int id;
    private String accountNum;
    private bigDecimal balance;
    private bigDecimal overDraft;

    public account(int id, String accountNum, bigDecimal balance, bigDecimal overDraft) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
        this.overDraft = overDraft;
    }

    public bigDecimal getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(bigDecimal overDraft) {
        this.overDraft = overDraft;
    }

    public account(int id, String accountNum, bigDecimal balance) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaccountNum() {
        return accountNum;
    }

    public void setaccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public bigDecimal getBalance() {
        return balance;
    }

    public void setBalance(bigDecimal balance) {
        this.balance = balance;
    }

    public account() {
    }
    
    public bigDecimal checkaccount(String accountNum) throws accountNotFoundException{
    
        boolean found = false;
        SystemDB data = new SystemDB();
        ArrayList<account> acclist = data.accountsData();
        
        for(account acc:acclist){
           if(acc.getaccountNum().equals(accountNum)) {
                found = true;
                balance = acc.getBalance();
           }
        }
        
        if(!found){
          throw new accountNotFoundException("account Number not found");
        }
        return balance;
    }
    
}


