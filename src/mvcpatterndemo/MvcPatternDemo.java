/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcpatterndemo;

/**
 *
 * @author muhammad padli septiana
 */
public class MvcPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // mengambil data mahasiswa
        Mahasiswa model = retrieveMahasiswaFromDatabase();
        
        MahasiswaView view = new MahasiswaView();
        
        MahasiswaController controller = new MahasiswaController(model, view);
        controller.updateView();
        
        //mengubah data nama mahasiswa
        controller.setNamaMahasiswa("Padli Euy");
        controller.setNimMahasiswa("08123456");
        controller.updateView();
    }
    
    private static Mahasiswa retrieveMahasiswaFromDatabase(){
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("20211699");
        mhs.setNama("Padli Septiana");
        return mhs;
        
    }
    
}

