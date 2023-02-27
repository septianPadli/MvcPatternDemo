/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpatterndemo;

/**
 *
 * @author muhammad padli septiana
 */
public class MahasiswaController {
    private Mahasiswa model;
    private MahasiswaView view;
    
    public MahasiswaController (Mahasiswa model, MahasiswaView view){
        this.model = model;
        this.view = view;
    }
    public String getNimMahasiswa() {
        return model.getNim();
    }
    public void setNimMahasiswa(String nim) {
        model.setNim(nim);
    }
    public String getNamaMahasiswa() {
        return model.getNama();
    }
    public void setNamaMahasiswa(String nama) {
        model.setNama(nama);
    }
    public void updateView(){
        view.cetakDetailMahasiswa(model.getNim(), model.getNama());
    }
}
