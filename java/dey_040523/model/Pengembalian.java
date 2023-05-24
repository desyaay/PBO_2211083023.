/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dey_040523.model;

/**
 *
 * @author labor p1
 */
public class Pengembalian {

    private Peminjaman peminjaman;
    private String tglPengembalian;
    private int terlambat;
    private double denda;

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }
    
    public String getTglPengembalian(){
        return tglPengembalian;
    }
    
    public void setTglPengembalian(String tglPengembalian){
        this.tglPengembalian=tglPengembalian;
    }
    
    public int getTerlambat(){
        String tglKembali = peminjaman.getTglkembali();
        String tglPengembalian = this.tglPengembalian;
        
        return terlambat;
    }
    
    public double getDenda(){
        denda = terlambat * 500;
        return denda;
    }
}
