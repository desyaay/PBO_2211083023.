/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_300323;

/**
 *
 * @author Asus
 */
public class Aritmatika {
    public static int tambah(int a, int b) 
        {
            return (a + b);
        }
    
        public static boolean cekGanjil(int a) 
        {
            return (a % 2 != 0);
        }
        
        public static int [] getGanjil(int n) 
        {
         int [] ganjil = new int[n];
         int j = 0;
      
         for (int i=1;j<n;i+=2)
         {
             ganjil[j]=i;
             j++;
         }
         return ganjil;
        }
        
        public static int [] getPrima(int z)
        {
            int [] prima = new int[z];
            int j = 0;
        
            
             for (int i = 2; i <= z; i++) {
             boolean isPrime = true;
             for (j = 2; j < i; j++) {
             if (i % j == 0) {
                isPrime = false;
                break;
            }
       }
             }
        return prima;
        }
}
        

        

