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
public class BukuDaoImpl implements BukuDao {
   
    
    List<Buku> data = new ArrayList();
    
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index,Buku buku){
         data.set(index, buku);
    }
    public void delete(int index){
         data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAllBuku(){
        return data;
    }
}