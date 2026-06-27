/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20042016;

/**
 *
 * @author Nayla latifah hasna
 */
public class Author {
    //private variabel
    private final String name;
    private String email;
    private final char gender; // 'm' or 'f'
    
    //Contructs a Author instance with the given inputs
    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    //the public getters and setters for the private instance
    //no setter for name and gender as they are not  designed to
    /*returns the name*/
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public char getGender(){
        return gender;
    }
   
    //sets the email
    public void setEmail(String email){
        this.email = email;
    }
   //returns a self-descriptive String
    public String toString(){
        return name + "(" + gender + ") at " + email;
    }
}
