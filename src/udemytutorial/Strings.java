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
public class Strings {
    public static void main(String[] args){
        
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lort of The Rings";
            if(bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }
        
        String browser = "Chrome";
            if(browser.equalsIgnoreCase("Chrome")){
                System.out.println("The browser is Chrome");
            }
        //Print the initials + last 4 digits of SSN    
        String firstName = "Tim";
        String lastName = "Short";
        String SSN = "9344294324";
        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,1));
        System.out.print(SSN.substring(6));
    }
}
