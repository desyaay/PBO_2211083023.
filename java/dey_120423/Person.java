/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_120423;

/**
 *
 * @author Asus
 */
public class Person {
    protected String name; //bisa diturunkan langsung ke sub class
    protected String address; 

     /** 
     * Default constructor 
     */ 
     public Person(){ 
        System.out.println("Inside Person:Constructor"); 
        name = ""; 
        address = ""; 
     } 
     /** 
     * Constructor dengan dua parameter 
     */ 
     public Person( String name, String address ){ 
        this.name = name; 
        this.address = address; 
     } 
     /** 
     * Method accessor 
     */ 
     public String getName(){ 
        System.out.println("getName Person");
        return name; 
     } 
     public String getAddress(){ 
        return address; 
     } 
     public void setName( String name ){ 
        this.name = name; 
     } 
     public void setAddress( String add ){ 
        this.address = add; 
     }
}
