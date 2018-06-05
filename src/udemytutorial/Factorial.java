/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytutorial;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args){
        
        System.out.println("Your factorial equals " + factorial());
    }
    
    
//Write a function that computes the factorial value
   static int factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for counting factorial: ");
        int x = input.nextInt();
        
        int multi = 1;
        
        for(int i = 1; i <= x; i++){
            multi *= i;
        }
        
        return multi;
        
        //alternative version
        
        /*if(x == 0){
            return 1;
        }
        else if(x == 1){
            return 1;
        }
        
        int multi = x * factorial(x - 1);
        return multi;*/
   }
   
   
}