/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_120423;

/**
 *
 * @author Asus
 */
public class Student extends Person 
{ 
    public Student(){
        super("Desya","Padang");
        System.out.println("Inside Student:Constructor"); 
    }
    @Override
    public String getName(){ 
        System.out.println("getName Student");
        return name; 
     } 
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Desya";
        student.address = "Bogor";
    }
    
}
