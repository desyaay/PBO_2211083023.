/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_060423;

/**
 *
 * @author Asus
 */
public class StudentRecordExam {
    public static void main(String[] args){
        StudentRecord desya = new StudentRecord("Desya","Bogor");
        desya.nilai=0;
        desya.print("");
        
        System.out.println("Jumlah Record : "+StudentRecord.getStudentCount());
    }
}
