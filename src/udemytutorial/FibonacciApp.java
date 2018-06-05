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
public class FibonacciApp {
    public static void main(String[] args){
        //Fibonacci number is defined by the previous two fibonacci numbers
        
        System.out.println(fib(5));
        
    }
    
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return(fib(n - 1) + fib(n - 2));
    }
}
