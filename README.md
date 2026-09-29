# Praktikum4-PBO

# Tugas Praktikum PBO 4 - Java Collections & Manipulasi Objek

**Nama:** Ibrey Diba Tarigan  
**NIM:** L0325027  
**Program Studi:** Informatika  

---

## Penjelasan Alur dan Cara Kerja Program

Program ini dirancang untuk mensimulasikan sistem manajemen inventaris perangkat IT (CRUD sederhana) menggunakan **Java Collections Framework**. Sistem dibagi menjadi tiga *class* utama yang saling berinteraksi:

### 1. Class `AsetIT` (Sebagai Model / Entitas)
Class ini bertindak sebagai *blueprint* untuk setiap objek perangkat keras. 
* Terdapat empat atribut utama: `idAset`, `namaPerangkat`, `lokasi`, dan `statusKondisi`.
* Saat objek baru dibuat, atribut-atribut tersebut langsung diisi melalui sebuah **Parameterized Constructor**. 
* Class ini juga memiliki method `tampilkanInfoAset()` yang bertugas merangkai dan mencetak informasi detail dari satu aset secara rapi ke layar.

### 2. Class `ManajemenAset` (Sebagai Pengelola / Struktur Data)
Class ini bertanggung jawab atas penyimpanan dan manipulasi data.
* **Penyimpanan:** Menggunakan `ArrayList<AsetIT>` bernama `daftarAset`. `ArrayList` dipilih karena sifatnya yang dinamis, ukurannya bisa bertambah dan berkurang otomatis tanpa perlu deklarasi batas indeks di awal layaknya *Array* biasa.
* **Operasi Tambah (`tambahAset`):** Menerima objek `AsetIT` yang dilempar dari *Main* dan memasukannya ke dalam *list* menggunakan fungsi bawaan `.add()`.
* **Operasi Baca (`tampilkanSemuaAset`):** Menggunakan perulangan **For-Each** untuk menelusuri isi `ArrayList`. Pada setiap iterasinya, method ini memanggil fungsi `tampilkanInfoAset()` milik masing-masing objek.
* **Operasi Hapus (`hapusAset`):** Proses pencarian dan penghapusan dilakukan menggunakan **Iterator**. Penggunaan *Iterator* sangat krusial di sini karena memungkinkan program untuk menghapus elemen dari koleksi *saat proses perulangan sedang berlangsung* secara aman, sehingga terhindar dari *error* `ConcurrentModificationException`. Jika iterasi menemukan `idAset` yang cocok, perintah `iterator.remove()` akan dieksekusi.

### 3. Class `MainAset` (Sebagai Tester / Main Method)
Class ini berisi eksekusi skenario yang diminta:
1. Melakukan instansiasi objek `ManajemenAset`.
2. Menambahkan 4 data *dummy* aset IT ke dalam memori.
3. Memanggil method untuk mencetak seluruh aset untuk memverifikasi data masuk.
4. Menjalankan perintah penghapusan salah satu aset berdasarkan `idAset` (dalam kasus ini: "AST-03").
5. Menampilkan kembali daftar aset untuk membuktikan bahwa aset "AST-03" sudah benar-benar hilang dari `ArrayList`.

---

## Output Eksekusi Terminal

```text
=== 1. MENAMBAHKAN DATA ASET ===
Aset berhasil ditambahkan: AST-01
Aset berhasil ditambahkan: AST-02
Aset berhasil ditambahkan: AST-03
Aset berhasil ditambahkan: AST-04

=== 2. MENAMPILKAN SEMUA ASET ===
ID: AST-01 | Perangkat: Server Database | Lokasi: Ruang Server Lt. 2 | Kondisi: Baik
ID: AST-02 | Perangkat: Core Router | Lokasi: Ruang Jaringan | Kondisi: Baik
ID: AST-03 | Perangkat: Cisco Switch | Lokasi: Ruang NOC | Kondisi: Rusak
ID: AST-04 | Perangkat: Workstation PC | Lokasi: Lab Komputer 1 | Kondisi: Baik

=== 3. MENGHAPUS ASET (ID: AST-03) ===
Aset dengan ID AST-03 berhasil dihapus.

=== 4. DAFTAR ASET SETELAH PENGHAPUSAN ===
ID: AST-01 | Perangkat: Server Database | Lokasi: Ruang Server Lt. 2 | Kondisi: Baik
ID: AST-02 | Perangkat: Core Router | Lokasi: Ruang Jaringan | Kondisi: Baik
ID: AST-04 | Perangkat: Workstation PC | Lokasi: Lab Komputer 1 | Kondisi: Baik
