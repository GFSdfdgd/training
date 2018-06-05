/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemytutorial;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class arrayFunctions {
    public static void main(String[] args){
        
        int[] numArray = new int[]{50, -2, 24, 2, 5, 11, -44, 241, 12, 0};
        
        //for(int i = 0; i < numArray.length; i++){
        //    numArray[i] = i;
            
        //}
        
        System.out.println("Minimal value for an array is: " + getMinValue(numArray));
        System.out.println("Average value for an array is: " + getAvgValue(numArray));
        System.out.println("Maximum value for an array is: " + getMaxValue(numArray));
    }
    
    static double getMinValue(int[] numArray){
        double minValue = numArray[0];
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] < minValue){
                minValue = numArray[i];
            }
        }
        
        return minValue;
    }
    
    static double getAvgValue(int[] numArray){
        double sum = 0;
        //return (getMinValue(numArray) + getMaxValue(numArray)) / 2;
        for(int n = 0; n < numArray.length; n++){
            sum += numArray[n];
        }
        return sum / numArray.length;
    }
    
    static double getMaxValue(int[] numArray){
        double maxValue = numArray[0];
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] > maxValue){
                maxValue = numArray[i];
            }
        }
        return maxValue;
    }
}
