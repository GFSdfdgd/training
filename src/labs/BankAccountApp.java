/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

/**
 *
 * @author user
 */
public class BankAccountApp{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("46237436", 1000);
        BankAccount acc2 = new BankAccount("64535345", 2000);
        BankAccount acc3 = new BankAccount("53546455", 2500);
        BankAccount acc4 = new BankAccount("45754454", 3000);
        
        acc1.setName("Jim");
        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString()); 
    }
}

class BankAccount  implements IInterest{
    private static int id = 1000;
    private String accountNumber;
    private static final String routingNumber = "993344232";
    private String name;
    private String ssn;
    private double balance;
        
        public BankAccount(String ssn, double initDeposit){
            balance = initDeposit;
            this.ssn = ssn;
            id++;
            setAccountNumber();
        }
        
        private void setAccountNumber(){
            int random = (int) (Math.random() * 100);
            accountNumber = id + "" + random + ssn.substring(0, 2);
            System.out.println("Your account number is: " + accountNumber);
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public String getName(){
            return name;
        }
        
        public void payBill(double amount){
            balance -= amount;
            System.out.println("Paying bill: " + amount);
            showBalance();
        }
        
        public void makeDeposit(double amount){
            balance += amount;
            System.out.println("Making deposit: " + amount);
            showBalance();
        }
        
        public void showBalance(){
            System.out.println("Balance: " + balance);
        }

        @Override
        public void accrue() {
            balance *= (1 + rate / 100);
            System.out.println("Your balance with accrued interest: " + balance);
        }
        
        @Override
        public String toString(){
            return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]";
        }
}