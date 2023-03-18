/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_150323;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class LatihanNilai2 {
     public static void main(String[] args){
        int a;
        int b;
        int c;
        
        int avg;
        a =Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 1 "));
        b =Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 2 "));
        c =Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 3 "));
        
        avg= (a+b+c)/3;
        
        String msg = "Rata-Rata Nilai = "+avg;
        JOptionPane.showMessageDialog(null, msg);
        
        if(avg >= 60) {
            String smiley = ":)";
            JOptionPane.showMessageDialog(null, smiley);
        }
        else {
         String ismiley = ":(";
            JOptionPane.showMessageDialog(null, ismiley);
        }
    }
}