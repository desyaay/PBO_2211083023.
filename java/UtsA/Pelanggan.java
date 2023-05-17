/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsA;

/**
 *
 * @author Asus
 */
public class Pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String meterBulanIni;
    private String meterBulanLalu;
    private String tarif;
    private String diskon;
    
    public Pelanggan() {}
    
    public Pelanggan(String kodePelanggan, String namaPelanggan, String meterBulanIni, 
            String meterBulanLalu, String tarif, String diskon) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        this.tarif = tarif;
        this.diskon = diskon;
    }
    
    public String getKodePelanggan() {
        return kodePelanggan;
    }
    
    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }
    
     public String getNamaPelanggan() {
        return namaPelanggan;
    }
    
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
     public String getMeterBulanIni() {
        return meterBulanIni;
    }
    
    public void setMeterBulanIni(String meterBulanIni) {
        this.meterBulanIni = meterBulanIni;
    }
    
     public String getMeterBulanLalu() {
        return meterBulanLalu;
    }
    
    public void setMeterBulanLalu(String meterBulanLalu) {
        this.meterBulanLalu = meterBulanLalu;
    }
    
     public String getTarif() {
        return tarif;
    }
    
    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
    
     public String getDiskon() {
        return diskon;
    }
    
    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }
}
