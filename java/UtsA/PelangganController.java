/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtsA;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private Pelanggan pelanggan;
    private PelangganDao pelangganDao;
    
    public PelangganController(FormPelanggan formPelanggan) {
        this.formPelanggan = formPelanggan;
        pelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm() {
        formPelanggan.getTxtKodePelanggan().setText("");
        formPelanggan.getTxtNamaPelanggan().setText("");
        formPelanggan.getTxtMbi().setText("");
        formPelanggan.getTxtMbl().setText("");
        formPelanggan.getTxtTarif().setText("");
        formPelanggan.getTxtDiskon().setText("");
    }
    
    
    public void saveAnggota() {
        pelanggan = new Pelanggan();
        pelanggan.setKodePelanggan(formPelanggan.getTxtKodePelanggan().getText());
        pelanggan.setNamaPelanggan(formPelanggan.getTxtNamaPelanggan().getText());
        pelanggan.setMeterBulanIni(formPelanggan.getTxtMbi().getText());
        pelanggan.setMeterBulanLalu(formPelanggan.getTxtMbl().getText());
        pelanggan.setTarif(formPelanggan.getTxtTarif().getText());
        pelanggan.setDiskon(formPelanggan.getTxtDiskon().getText());
        pelangganDao.save(pelanggan);
        JOptionPane.showMessageDialog(formPelanggan, "Insert OK");
    }
    
    public void updatePelanggan() {
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = new Pelanggan();
        pelanggan.setKodePelanggan(formPelanggan.getTxtKodePelanggan().getText());
        pelanggan.setNamaPelanggan(formPelanggan.getTxtNamaPelanggan().getText());
        pelanggan.setMeterBulanIni(formPelanggan.getTxtMbi().getText());
        pelanggan.setMeterBulanLalu(formPelanggan.getTxtMbl().getText());
        pelanggan.setTarif(formPelanggan.getTxtTarif().getText());
        pelanggan.setDiskon(formPelanggan.getTxtDiskon().getText());
        pelangganDao.save(pelanggan);
        JOptionPane.showMessageDialog(formPelanggan, "Update OK");
    }
    
    public void getPelanggan() {
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = pelangganDao.getPelanggan(index);
        if(pelanggan != null) {
            formPelanggan.getTxtKodePelanggan().setText(pelanggan.getKodePelanggan());
            formPelanggan.getTxtNamaPelanggan().setText(pelanggan.getNamaPelanggan());
            formPelanggan.getTxtMbi().setText(pelanggan.getMeterBulanIni());
            formPelanggan.getTxtMbl().setText(pelanggan.getMeterBulanLalu());
            formPelanggan.getTxtTarif().setText(pelanggan.getTArif());
            formPelanggan.getTxtDiskon().setText(pelanggan.getDiskon());
        }
    }
    
    public void tampil() {
        DefaultTableModel tableModel =
                   (DefaultTableModel) formPelanggan.getTblPelanggan().getModel();
        tableModel.setRowCount(0);
        List<Pelanggan> list = pelangganDao.getAllPelanggan();
        for (Pelanggan pelanggan1 : list) {
            Object row[] = {
                pelanggan1.getKodePelanggan(),
                pelanggan1.getNamaPelanggan(),
                pelanggan1.getMeterBulanIni(),
                pelanggan1.getMeterBulanLalu(),
                pelanggan1.getTarif(),
                pelanggan1.getDiskon()
            };
            tableModel.addRow(row);
        }
    }

}
