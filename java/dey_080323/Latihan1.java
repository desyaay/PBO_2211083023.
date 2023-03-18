/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Asus
 */
public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        char letter;
        boolean result=true;
        String str="";
        
        try {
        System.out.print("Masukkan angka = ");
        n = Integer.parseInt(dataIn.readLine());
        System.out.print("Letter = ");
        letter = (char)dataIn.read();
        System.out.print("Input Boolean = ");
        result = 
        System.out.print("Input String = ");
        str = dataIn.readLine();
        
        }
        catch (IOException e) {
        System.out.println("Number = "+n);
        System.out.println("Letter = "+letter);
        System.out.println("Result = "+result);
        System.out.println("Str = "+str);
        }
    }
}
