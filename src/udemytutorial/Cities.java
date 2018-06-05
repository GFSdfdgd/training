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
public class Cities {
    public static void main(String[] args){
        //Declare and define an array
        
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        
        System.out.println("");
        //Declare an array
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";
        
        /*for(int i = 0; i < states.length; i++){
            System.out.println(states[i]);
        }*/
        
        int n = 0;
        boolean stateFound = false;
        while (!stateFound){
            String state = states[n];
            System.out.println(state);
            if(state == "Texas"){
                System.out.println("STATE FOUND!");
                stateFound = true;
            }
            n++;
        }
    }
}
