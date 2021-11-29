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
public class Account {
    private int id;
    private String accountNum;
    private double balance;
    private double overDraft;

    public Account(int id, String accountNum, double balance, double overDraft) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public Account(int id, String accountNum, double balance) {
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

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }
    
    public double checkAccount(String accountNum) throws AccountNotFoundException{
    
        boolean found = false;
        SystemDB data = new SystemDB();
        ArrayList<Account> acclist = data.accountsData();
        
        for(Account acc:acclist){
           if(acc.getAccountNum().equals(accountNum)) {
                found = true;
                balance = acc.getBalance();
           }
        }
        
        if(!found){
          throw new AccountNotFoundException("Account Number not found");
        }
        return balance;
    }
    
}


