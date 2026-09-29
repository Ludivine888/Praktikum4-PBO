/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp4;

/**
 *
 * @author Lenovo
 */
public class MainAset {
    public static void main(String[] args) {
        ManajemenAset manajemen = new ManajemenAset();

        System.out.println("=== 1. MENAMBAHKAN DATA ASET ===");
        manajemen.tambahAset(new AsetIT("AST-01", "Server Database", "Ruang Server Lt. 2", "Baik"));
        manajemen.tambahAset(new AsetIT("AST-02", "Core Router", "Ruang Jaringan", "Baik"));
        manajemen.tambahAset(new AsetIT("AST-03", "Cisco Switch", "Ruang NOC", "Rusak"));
        manajemen.tambahAset(new AsetIT("AST-04", "Workstation PC", "Lab Komputer 1", "Baik"));

        System.out.println("\n=== 2. MENAMPILKAN SEMUA ASET ===");
        manajemen.tampilkanSemuaAset();

        System.out.println("\n=== 3. MENGHAPUS ASET (ID: AST-03) ===");
        manajemen.hapusAset("AST-03");

        System.out.println("\n=== 4. DAFTAR ASET SETELAH PENGHAPUSAN ===");
        manajemen.tampilkanSemuaAset();
    }
}