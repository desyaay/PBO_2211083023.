/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dey_040523.model;

import java.util.*;

/**
 *
 * @author labor p1
 */
public class PengembalianDaoImpl implements PengembalianDao {
    
    List<Pengembalian> data = new ArrayList<>();
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int idx, Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Pengembalian getPengembalian(int idx){
        return data.get(idx);
    }
    public List<Pengembalian> getAllPengembalian(){
        return data;
    }
}
