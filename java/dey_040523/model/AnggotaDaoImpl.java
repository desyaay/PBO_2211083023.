/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_040523.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class AnggotaDaoImpl implements AnggotaDao{
    
    List<Anggota> data = new ArrayList();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("9811","Andi","Padang","L"));
    }
    
    @Override
    public void save(Anggota anggota) {
        data.add(anggota);
    }
    
    @Override
    public void update(int index, Anggota anggota) {
        data.set(index, anggota);
    }
    
    public void delete (int index) {
        data.remove(index);
    }
    
    public Anggota getAnggota (int index) {
        return data.get(index);
    }
    
    public List<Anggota> getAllAnggota() {
        return data;
    }

   
}
