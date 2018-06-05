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
public class studentDbLab2 {
    public static void main(String[] args){
       Student stu1 = new Student("Janelle", "253753368");
       Student stu2 = new Student("Thomas", "565645645");
       Student stu3 = new Student("Elizabeth", "546547665");
       
       stu1.enroll("Math");
       stu1.enroll("English");
       stu1.enroll("History");
       
       stu1.showCourses();
       stu1.checkBalance();
       stu1.payTuition(600);
       stu1.checkBalance();
        System.out.println(stu1.toString());
       
    }
}

class Student{
   private static int id = 10;
   private String userId;
   private String name;
   private String ssn;
   private String email;
   private String phone;
   private String city;
   private String state ;
   private String courses = "";
   private static final int costOfCourse = 800;
   private int balance = 0;
   
   public Student(String name, String ssn){
       id++;    
       this.name = name;
       this.ssn = ssn;
       setUserID();
       setEmail();
   }
   
   private void setEmail(){
       email = name.toLowerCase() + "." + id + "@steduniversity.com";
       System.out.println("Your email is: " + email);
   }
   
   public String getEmail(){
       return email;
   }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
   
   
    
   private void setUserID(){
       int max = 90;
       int min = 10;
       int randNum = (int) (Math.random() *((max - min)));
       randNum += min;
       userId = id + "" + randNum + ssn.substring(7);
       System.out.println("Your User ID: " + userId);
   }
   
   public void enroll(String course){
       this.courses = this.courses + " " + course;
       balance += costOfCourse;
   }
   
   public void payTuition(int amount){
       balance -= amount;
       System.out.println("Payment: $" + amount);
   }
   
   public void checkBalance(){
       System.out.println("Balance: $" + balance);
   }
   
   public void showCourses(){
       System.out.println(courses);
   }
   
   public String toString(){
       return "[NAME: " + name + "\n[COURSES: " + courses + "]\n[BALANCE: " + balance +"]";
   }
}