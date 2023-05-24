/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dey_040523.controller;

import dey_040523.model.*;
import dey_040523.view.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class BukuController {
    private Formbuku formBuku ;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(Formbuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
      public void bersihForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtTahun().setText("");
    }
      
      public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudulBuku().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku,"Insert Ok"); 
    }
      
      public void updateBuku(){
        int index = formBuku.gettblBuku().getSelectedRow();
       buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudulBuku().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku,"Update Ok"); 
    }
      
      public void delete(){
            int index = formBuku.gettblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku,"Delete Ok"); 
    }
      
       public void getBuku(){
        int index = formBuku.gettblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if (buku!=null){
             formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
             formBuku.getTxtJudulBuku().setText(buku.getJudul());
             formBuku.getTxtPenerbit().setText(buku.getPenerbit());
             formBuku.getTxtPengarang().setText(buku.getPengarang());
             formBuku.getTxtTahun().setText(buku.getTahun());
        }
    }
        public void tampil(){
        DefaultTableModel tabelmodel =
                (DefaultTableModel) formBuku.gettblBuku().getModel();
        tabelmodel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku1 : list){
            Object row[] = {
                buku1.getKodeBuku(),
                buku1.getJudul(),
                buku1.getPenerbit(),
                buku1.getPengarang(),
                buku1.getTahun()
            };
            tabelmodel.addRow(row);
        }
    }
}
