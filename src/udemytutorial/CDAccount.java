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
public class CDAccount extends BankAccount implements IRate {
    
    String interestRate;
    
    void compount(){
        System.out.println("Compounding interest");
    }
}
