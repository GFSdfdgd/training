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
public class NumbersCalc {
    public static void main(String[] args){
        
        printName();
        
        int A = 10, B = 20;
        addNumbers(A, B);
        
        int product = multiplyNumbers(A, B);
        System.out.println("Iloczyn liczb równa się: " + product);
    }
    
    static void printName(){
        System.out.println("My name is Tim");
    }
    
    static void addNumbers(int A, int B){
        int sum = A + B;
        System.out.println("Suma wynosi: " + sum);
    }
    
    static int multiplyNumbers(int valueA, int valueB){
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;
    }
}
