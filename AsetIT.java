/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp4;

/**
 *
 * @author Lenovo
 */
public class AsetIT {
    private String idAset;
    private String namaPerangkat;
    private String lokasi;
    private String statusKondisi;

    public AsetIT(String idAset, String namaPerangkat, String lokasi, String statusKondisi) {
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
    }

    public String getIdAset() {
        return idAset;
    }

    public void tampilkanInfoAset() {
        System.out.println("ID: " + idAset + 
                           " | Perangkat: " + namaPerangkat + 
                           " | Lokasi: " + lokasi + 
                           " | Kondisi: " + statusKondisi);
    }
}