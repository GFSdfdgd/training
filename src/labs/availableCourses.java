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
public interface availableCourses {
    String[] courses = {"Computer Science", "Art", "History", "Mathematics", "Geology"};

    public void enroll() throws java.io.IOException;
    public void showCourses();
}
