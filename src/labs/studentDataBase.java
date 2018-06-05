
package labs;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class studentDataBase {
    public static void main(String[] args) throws java.io.IOException{
        
        Student s1 = new Student("John", "26315236", 5000);
        s1.setCity("Chicago");
        s1.setPhone("523 214 554");
        System.out.println();
        s1.showCourses();
        System.out.println();        
        System.out.println(s1.toString());
        System.out.println();
        s1.pay(1000);
        System.out.println();
        s1.enroll();
    }
}

class Student implements availableCourses{
    
    private String name;
    private String ssn;
    private static int id = 100;
    private String address;
    private String phone;
    private String email;
    private String city;
    private String state;
    private String userId;
    private double balance;
    
    public Student(String name, String ssn, double initDeposit){
        balance = initDeposit;
        this.ssn = ssn;
        this.email = email;
        this.name = name;
        email = name.toLowerCase() + "@university.com";
        System.out.println("Your assigned email address is: " + email);
        id++;
        setUserId();
    }
    
    private void setUserId(){
        int random = ThreadLocalRandom.current().nextInt(1000, 9000 + 1);
        userId = id + "" + random + ssn.substring(4, 8);
        System.out.println("Your user ID is: " + userId);
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    @Override
    public void showCourses(){
        System.out.println("Courses available at our university: " + Arrays.toString(courses));
    }
    
    @Override
    public void enroll() throws java.io.IOException{
        char choice, ignore;
        
        do{
            System.out.println("Choose a course you wish to enroll on:");
            System.out.println("1. Computer Science");
            System.out.println("2. Art");
            System.out.println("3. History");
            System.out.println("4. Mathematics");
            System.out.println("5. Geology");
            
            choice = (char) System.in.read();
            
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
        }while(choice < '1' | choice > '5');
        
        switch(choice){
            case '1':
                System.out.println("You have chosen Computer Science.");
                break;
            case '2': 
                System.out.println("You have chosen Art.");
                break;
            case '3':
                System.out.println("You have chosen History.");
                break;
            case '4':
                System.out.println("You have chosen Mathematics.");
                break;
            case '5':
                System.out.println("You have chosen Geology.");
                break;
            
        }
    }
    
    public void pay(double amount){
        balance -= amount;
        System.out.println("Paying monthly student fee of: " + amount);
        checkBalance();
    }
    
    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }
    
    @Override
    public String toString(){
        return "[Name: " + name + "]\n[Email: " + email + "]\n[Place of birth: " + city + "]\n[Phone number: " + phone + "]\n[Balance: " + balance + "]";
    }
}