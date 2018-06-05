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
public class AccountApp {
    public static void main(String[] args){
        
        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.setAmortSchedule();
        la.setTerm(20);
        
        //Polymorphism changes where we are pointing
        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate(); 
    }
}
