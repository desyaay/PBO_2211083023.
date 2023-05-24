/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_300323;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class AritmatikaExample {
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(10, 5);
        System.out.println("C : "+c);
        System.out.println("Ganjil? "+aritmatika.cekGanjil(c));
        
        int n = 5;
        int [] ganjil = aritmatika.getGanjil(n);
        System.out.println("bilangan ganjil sebanyak "+n+" adalah ");
        
        for (int i=0;i<ganjil.length;i++)
        {
            System.out.print(ganjil[i]+" ");
        }
        
        int z = 6;
        int [] prima= aritmatika.getPrima(z);
         System.out.println("\nbilangan prima sebanyak "+z+" adalah ");
         
          for (int i=2;i<prima.length;i++)
        {
            System.out.print(prima[i]+" ");
        }
    }
}
