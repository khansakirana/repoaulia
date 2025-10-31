Oke! 👌 Kamu ingin dibuatkan **penjelasan lengkap (dokumentasi)** untuk program **Kasir Sederhana** milikmu — **dengan gaya penjelasan yang sama seperti contoh “Catatan Pengeluaran” di atas.**

Berikut versi lengkapnya 👇

---

# 💵 Program Kasir Sederhana

Program **Kasir Sederhana** adalah aplikasi berbasis **console** yang digunakan untuk mencatat transaksi pembelian barang di toko atau minimarket kecil.
Dibuat menggunakan bahasa pemrograman **Java**, program ini menerapkan konsep **Pemrograman Berorientasi Objek (Object-Oriented Programming / OOP)** seperti penggunaan **kelas, method, dan enkapsulasi data**.

---

## 🧩 Fitur Utama

1. **Input Barang**
   Pengguna dapat menambahkan daftar barang yang dibeli, termasuk nama barang, harga satuan, dan jumlah pembelian.

2. **Hitung Total Belanja**
   Program secara otomatis menghitung total harga berdasarkan jumlah barang yang dimasukkan.

3. **Input Pembayaran & Hitung Kembalian**
   Setelah total diketahui, pengguna dapat memasukkan jumlah uang yang dibayar, dan program akan menghitung kembalian secara otomatis.

4. **Cetak Struk Pembayaran**
   Program menampilkan nota/struk pembelian yang berisi daftar barang, jumlah, subtotal, total harga, uang bayar, dan kembalian.

---

## 🧱 Struktur Kelas

Program ini terdiri dari **dua kelas utama**:

### 1. `Barang`

Kelas `Barang` berfungsi untuk menangani proses input dan penyimpanan data barang.

**Atribut dan Method utama:**

* `inputBarang()` → Meminta input daftar barang dari pengguna.
* `inputNama()` → Mengambil nama barang dari pengguna.
* `inputAngka(String pesan)` → Membaca input numerik (harga/jumlah).
* `simpanBarang(String nama, int harga, int jumlah)` → Menyimpan data barang ke dalam list di kelas `Kasir`.

**Contoh logika:**

```java
static void simpanBarang(String nama, int harga, int jumlah) {
    Kasir.barangList.add(nama);
    Kasir.hargaList.add(harga);
    Kasir.jumlahList.add(jumlah);
}
```

---

### 2. `Kasir`

Kelas `Kasir` merupakan kelas utama yang mengelola keseluruhan alur program — mulai dari input, perhitungan, hingga menampilkan struk pembayaran.

**Atribut Utama:**

* `scanner` → objek `Scanner` untuk membaca input dari pengguna.
* `barangList` → daftar nama barang.
* `hargaList` → daftar harga barang.
* `jumlahList` → daftar jumlah tiap barang.

**Method Utama:**

* `tampilkanHeader()` → menampilkan judul program.
* `hitungTotal()` → menghitung total harga seluruh barang.
* `inputPembayaran(int total)` → meminta jumlah uang yang dibayarkan.
* `hitungKembalian(int bayar, int total)` → menghitung kembalian dari pembayaran.
* `tampilkanStruk(int total, int bayar, int kembalian)` → menampilkan nota pembelian lengkap.

---

## ⚙️ Cara Menjalankan Program

1. Pastikan Java sudah terinstal di komputer Anda (`java --version`).

2. Simpan kedua file di satu folder dengan nama:

    * `Kasir.java`
    * `Barang.java`

3. Jalankan melalui terminal atau IDE seperti **IntelliJ IDEA / NetBeans**:

   ```bash
   javac Kasir.java Barang.java
   java Kasir
   ```

4. Ketik nama barang, harga, dan jumlah sesuai petunjuk di layar.
   Ketik `selesai` jika sudah tidak ada barang yang ingin dimasukkan.

---

## 💡 Contoh Tampilan Program

```
=== KASIR SEDERHANA ===
Nama barang (ketik 'selesai' untuk berhenti): Sabun
Harga barang: 5000
Jumlah barang: 3
------------------------
Nama barang (ketik 'selesai' untuk berhenti): Pasta Gigi
Harga barang: 12000
Jumlah barang: 1
------------------------
Nama barang (ketik 'selesai' untuk berhenti): selesai

Total belanja: Rp27000
Masukkan uang bayar: 30000

=== STRUK PEMBAYARAN ===
Sabun x3 = Rp15000
Pasta Gigi x1 = Rp12000
------------------------
Total     : Rp27000
Bayar     : Rp30000
Kembalian : Rp3000
=== TERIMA KASIH ===
```

---

## 🧠 Konsep OOP yang Digunakan

| Konsep            | Penjelasan                                                                | Implementasi                                    |
| ----------------- | ------------------------------------------------------------------------- | ----------------------------------------------- |
| **Encapsulation** | Data barang disimpan melalui method khusus agar aman dan terstruktur.     | Method `simpanBarang()` di kelas `Barang`.      |
| **Abstraction**   | Kelas `Barang` memisahkan logika input dari perhitungan kasir.            | `Barang.inputNama()` dan `Kasir.hitungTotal()`. |
| **Modularity**    | Program dibagi ke dalam dua kelas untuk memisahkan tanggung jawab.        | `Barang.java` dan `Kasir.java`.                 |
| **Reusability**   | Method seperti `inputAngka()` dan `hitungTotal()` bisa digunakan kembali. | Pemanggilan method di berbagai bagian program.  |

---

## 💬 Custom Live Template (Optional)

Untuk mempercepat penulisan kode di **IntelliJ IDEA**, buat **Custom Live Template** untuk rumus perhitungan:

**Abbreviation:** `totalcalc`
**Template Text:**

```java
int total = $HARGA$ * $JUMLAH$;
```

Sekarang kamu cukup mengetik `totalcalc` → tekan `Tab` → rumus langsung muncul otomatis.

---

## 📚 Lisensi

Program **Kasir Sederhana** ini dibuat untuk keperluan **pembelajaran konsep dasar Java dan OOP**.
Dapat digunakan dan dimodifikasi bebas untuk tujuan akademik maupun pribadi.

---

 
