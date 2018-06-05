/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytutorial;

public class BankAccount implements IRate {
    
    private String accountNumber;
    private static final String routingNumber = "343434";
    private String name;
    private String ssn;
    private String accountType;
    private double balance = 0;
    
    public BankAccount(){
        System.out.println("NEW ACCOUNT CREATED.");
    }
    // Overloading
    public BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }
    
    public BankAccount(String accountType, double initDeposit){
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
        String Msg = null;
        if(initDeposit < 1000){
            Msg = "ERROR: Minimum deposit must be at least $1000";
            
        }else{
            Msg ="THANKS FOR YOUR INITIAL DEPOSIT OF $" + initDeposit;
        }
        System.out.println(Msg);
        balance += initDeposit;
    }
    
    public void setName(String name){
        this.name = "Mr." + name;
    }
    
    public String getName(){
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    @Override
    public void setRate(){
        System.out.println("Setting rate");
    }
    @Override
    public void increaseRate(){
        System.out.println("Increasing rate");
    }

    void deposit(double amount){
        balance += amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount){
        balance += amount;
        showActivity("WITHDRAW");
    }
    
    private void showActivity(String activity){
        
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: " + balance);
    }
    
    void checkBalance(){
        System.out.println("Balance is: $" + balance);
    }
    
    void getStatus(){
    
    }
    
    @Override
    public String toString(){
        return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + ". BALANCE: $" + balance + " ]";
    }
}
