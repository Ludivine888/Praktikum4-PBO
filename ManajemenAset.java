/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp4;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenAset {
    private ArrayList<AsetIT> daftarAset;

    public ManajemenAset() {
        this.daftarAset = new ArrayList<>();
    }

    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
        System.out.println("Aset berhasil ditambahkan: " + asetbaru.getIdAset());
    }

    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Daftar aset kosong.");
            return;
        }
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    public void hapusAset(String idAset) {
        Iterator<AsetIT> iterator = daftarAset.iterator();
        boolean ditemukan = false;

        while (iterator.hasNext()) {
            AsetIT aset = iterator.next();
            if (aset.getIdAset().equalsIgnoreCase(idAset)) {
                iterator.remove();
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID " + idAset + " tidak ditemukan!");
        }
    }
}