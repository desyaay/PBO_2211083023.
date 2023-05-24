/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dey_040523.model;
import java.util.List;
/**
 *
 * @author labor p1
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int idx, Peminjaman peminjaman);
    void delete(int idx);
    Peminjaman getPeminjaman(int idx);
    List<Peminjaman> getAllPeminjaman();
}
