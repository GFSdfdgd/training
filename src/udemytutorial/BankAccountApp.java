/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytutorial;

/**
 *
 * @author user
 */
public class BankAccountApp {
    public static void main(String[] args){
        
        BankAccount acc1 = new BankAccount();
        //acc1.accountNumber = "021939012";
        acc1.setSsn("123124");
        System.out.println("SSN is: " + acc1.getSsn());
        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());
        //acc1.balance = 10000;
        
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);
       
        System.out.println(acc1.toString());
        
        /*BankAccount acc2 = new BankAccount("Checking Account"); 
        acc2.accountNumber = "574564656";
        
        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        acc3.accountNumber = "455745565";
        
        acc3.checkBalance();
        
        //Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.accountNumber = "23432423";
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());*/
            
   }
    
}
