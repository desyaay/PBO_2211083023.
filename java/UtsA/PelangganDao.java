/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsA;


import java.util.List;

/**
 *
 * @author Asus
 */
public interface PelangganDao {
    void save (Pelanggan pelanggan);
    void update (int index, Pelanggan pelanggan);
    void delete (int index);
    Pelanggan getPelanggan (int index);
    public  List <Pelanggan> getAllPelanggan();

    }
