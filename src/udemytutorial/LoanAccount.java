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
public class LoanAccount implements IRate {

    @Override
    public void setRate() {
        System.out.println("Rate");
    }

    @Override
    public void increaseRate() {
        System.out.println("Increase rate");
    }

    public void setTerm(int term){
        System.out.println("Setting the term to: " + term + " years.");
    }
    
    public void setAmortSchedule(){
        System.out.println("Amortization schedule");
    }
    
}
