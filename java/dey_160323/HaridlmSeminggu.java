/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_160323;

/**
 *
 * @author Asus
 * Latihan Hari dalam seminggu menggunakan WHILE
 */
public class HaridlmSeminggu {
    public static void main (String[] args) {
        String[] days = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        int i = 0;
        
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
    }
}

