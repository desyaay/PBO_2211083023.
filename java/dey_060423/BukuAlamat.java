/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_060423;

/**
 *
 * @author Asus
 */
public class BukuAlamat {
     private String nama;
    private String alamat;
    private String nomortelpon;
    private String email;
    int setNomortelpon;
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama =nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat =alamat;
    }
    public String getNomortelpon(){
        return nomortelpon;
    }
    public void setNomortelpon(String nomortelpon){
        this.nomortelpon =nomortelpon;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public String getEmail(){
        return email;
    }
}