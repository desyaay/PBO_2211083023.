/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dey_040523.controller;

import dey_040523.model.PeminjamanDao;
import dey_040523.model.Pengembalian;
import dey_040523.model.PengembalianDaoImpl;
import dey_040523.model.Peminjaman;
import dey_040523.model.PengembalianDao;
import dey_040523.model.PeminjamanDaoImpl;
import dey_040523.view.FormPengembalian;
import dey_040523.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor p1
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    Pengembalian pengembalian;
    Peminjaman peminjaman;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;

    public PengembalianController(FormPengembalian formPengembalian ) {
        this.formPengembalian = formPengembalian;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void clearForm(){
        formPengembalian.getTxtNobp().setText("");
        formPengembalian.getTxtNama().setText("");
        formPengembalian.getTxtTglKembali().setText("");
        formPengembalian.getTxtTglDikembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText("");
    }
    
    public void tampilDataPeminjaman(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPengembalian.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getKodeAnggota(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
