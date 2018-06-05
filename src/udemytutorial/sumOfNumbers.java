/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytutorial;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class sumOfNumbers {
    public static void main(String[] args){
        System.out.println("Sum of numbers from 1 to n equals: " + sumNumbers());
    }
    
    static double sumNumbers(){
        
       Scanner input = new Scanner(System.in);
       System.out.println("Select a value for n: ");
       double num = input.nextDouble();
       
        double sum = 0;
       
        sum = (1 + num) / 2 * num;
        System.out.println(sum);
        return sum;
    }
}
