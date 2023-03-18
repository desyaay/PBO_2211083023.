/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class LatihanNilai {
    public static void main(String[] args) {
     BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        int avg;
        
        try {
             System.out.print("Entri Nilai A = ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B = ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai C = ");
            c = Integer.parseInt(dataIn.readLine());
            
            avg = (a+b+c)/3;
            System.out.println("Nilai Rata-Rata anda = "+avg);
            if(avg >= 60){
                System.out.println(":)");
            }
            else {
            System.out.println(":(");}
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
    }
}
