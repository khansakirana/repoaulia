import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas Kasir merupakan kelas utama dalam program.
 * <p>
 * Kelas ini berfungsi untuk mengelola proses input barang, menghitung total harga,
 * memproses pembayaran, menghitung kembalian, serta menampilkan struk pembelian.
 * <p>
 * Program ini menggunakan konsep Pemrograman Berorientasi Objek (OOP)
 * seperti modularisasi, enkapsulasi, dan penggunaan method statis.
 *
 * @author
 * @version 1.0
 */
public class Kasir {

    /** Scanner untuk membaca input dari pengguna. */
    static Scanner scanner = new Scanner(System.in);

    /** List untuk menyimpan nama barang yang dibeli. */
    static ArrayList<String> barangList = new ArrayList<>();

    /** List untuk menyimpan harga setiap barang. */
    static ArrayList<Integer> hargaList = new ArrayList<>();

    /** List untuk menyimpan jumlah pembelian tiap barang. */
    static ArrayList<Integer> jumlahList = new ArrayList<>();

    /**
     * Method utama program (entry point).
     * Menjalankan seluruh alur sistem kasir mulai dari input barang hingga menampilkan struk.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        tampilkanHeader();
        Barang.inputBarang();
        int total = hitungTotal();
        int bayar = inputPembayaran(total);
        int kembalian = hitungKembalian(bayar, total);
        tampilkanStruk(total, bayar, kembalian);
    }

    /**
     * Menampilkan header atau judul aplikasi kasir.
     */
    static void tampilkanHeader() {
        System.out.println("=== KASIR SEDERHANA ===");
    }

    /**
     * Menghitung total harga seluruh barang yang dibeli.
     *
     * @return total harga dari seluruh barang
     */
    static int hitungTotal() {
        int total = 0;
        for (int i = 0; i < barangList.size(); i++) {
            total += hargaList.get(i) * jumlahList.get(i);
        }
        return total;
    }

    /**
     * Meminta input jumlah uang yang dibayarkan pengguna.
     *
     * @param total total harga belanja
     * @return jumlah uang yang dibayarkan
     */
    static int inputPembayaran(int total) {
        System.out.println("Total belanja: Rp" + total);
        System.out.print("Masukkan uang bayar: ");
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Menghitung kembalian yang harus diberikan kepada pelanggan.
     *
     * @param bayar jumlah uang yang dibayarkan
     * @param total total harga belanja
     * @return jumlah kembalian (bayar - total)
     */
    static int hitungKembalian(int bayar, int total) {
        return bayar - total;
    }

    /**
     * Menampilkan nota/struk pembelian secara lengkap di layar.
     *
     * @param total     total harga belanja
     * @param bayar     jumlah uang yang dibayarkan
     * @param kembalian jumlah uang kembalian
     */
    static void tampilkanStruk(int total, int bayar, int kembalian) {
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        for (int i = 0; i < barangList.size(); i++) {
            int subtotal = hargaList.get(i) * jumlahList.get(i);
            System.out.println(barangList.get(i) + " x" + jumlahList.get(i) + " = Rp" + subtotal);
        }
        System.out.println("------------------------");
        System.out.println("Total     : Rp" + total);
        System.out.println("Bayar     : Rp" + bayar);
        System.out.println("Kembalian : Rp" + kembalian);
        System.out.println("=== TERIMA KASIH ===");
    }
}
