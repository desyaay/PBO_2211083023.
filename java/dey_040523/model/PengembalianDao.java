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
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int idx, Pengembalian pengembalian);
    void delete(int idx);
    Pengembalian getPengembalian(int idx);
    List<Pengembalian> getAllPengembalian();
}
