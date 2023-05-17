/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsA;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Asus
 */
public class PelangganDaoImpl implements PelangganDao {
     List<Pelanggan> data = new ArrayList();
    
    public PelangganDaoImpl(){
        data.add(new Pelanggan("001","Desya","35","40","13","50"));
    }
    
    @Override
    public void save(Pelanggan pelanggan) {
        data.add(pelanggan);
    }
    
    @Override
    public void update(int index, Pelanggan pelanggan) {
        data.set(index, pelanggan);
    }
    
    public void delete (int index) {
        data.remove(index);
    }
    
    public Pelanggan getPelanggan (int index) {
        return data.get(index);
    }
    
    public List<Pelanggan> getAllPelanggan() {
        return data;
    }

}
