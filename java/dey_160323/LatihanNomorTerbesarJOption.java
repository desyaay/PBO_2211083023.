/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_160323;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class LatihanNomorTerbesarJOption {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int maxNumber = 0;
        
        JOptionPane.showMessageDialog(null,"Silahkan masukkan 10 nomor:");
        
        for (int i=0;i<numbers.length;i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-"+(i+1));
            numbers[i] = Integer.parseInt(input);
            
            if(numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,
                "Input terbesar yang diberikan oleh pengguna adalah: "+maxNumber);
    }
}
