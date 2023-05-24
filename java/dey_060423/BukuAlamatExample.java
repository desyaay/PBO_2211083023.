/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_060423;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Asus
 */
public class BukuAlamatExample {
    public void main(String[] args) throws IOException{
        BukuAlamat data[] = new BukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int pil = 0;
        int index = 0;
        while(pil !=5) {
            System.out.println("1. Entri Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Tampilkan");
            System.out.println("5. Exit");
            pil = Integer.parseInt(dataIn.readLine());
            
            switch(pil) {
                case 1 -> {
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("Nama : ");
                    temp.setNama(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;}
                case 2 -> {
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("Alamat : ");
                    temp.setAlamat(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;}
                case 3 -> {
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("No Telpon : ");
                    temp.setNomortelpon(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;}
                case 4 -> {
                    BukuAlamat temp = new BukuAlamat();
                    System.out.print("Email : ");
                    temp.setEmail(dataIn.readLine());
                    data[index] = temp;
                    index++;
                    break;}
            }
            break;
        }
    }
}
