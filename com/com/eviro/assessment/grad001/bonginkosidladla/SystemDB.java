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
public class SystemDB {
    
    // Populating the database
    ArrayList<Account> accountsData(){
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(new Account(101,"1",2000));
        accountList.add(new Account(102,"2",5000));
        accountList.add(new Account(103,"3",1000, 10000.0));
        accountList.add(new Account(104,"4",-5000, 20000.0));
        return accountList;
}

    public SystemDB() {
    }
    
    
}
