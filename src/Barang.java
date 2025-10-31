/**
 * Kelas Barang berfungsi untuk menangani proses input data barang,
 * seperti nama barang, harga, dan jumlah pembelian.
 * <p>
 * Data yang dimasukkan akan disimpan di dalam list milik kelas {@link Kasir}.
 *
 * @author
 * @version 1.0
 */
public class Barang {

    /**
     * Method untuk meminta input daftar barang dari pengguna secara berulang.
     * Pengguna dapat mengetik "selesai" untuk mengakhiri input.
     */
    static void inputBarang() {
        while (true) {
            System.out.print("Nama barang (ketik 'selesai' untuk berhenti): ");
            String nama = Kasir.scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) break;

            System.out.print("Harga barang: ");
            int harga = Integer.parseInt(Kasir.scanner.nextLine());

            System.out.print("Jumlah barang: ");
            int jumlah = Integer.parseInt(Kasir.scanner.nextLine());

            Kasir.barangList.add(nama);
            Kasir.hargaList.add(harga);
            Kasir.jumlahList.add(jumlah);
            System.out.println("------------------------");
        }
    }

    /**
     * Meminta input nama barang dari pengguna.
     *
     * @return nama barang dalam bentuk String
     */
    static String inputNama() {
        System.out.print("Nama barang: ");
        return Kasir.scanner.nextLine();
    }

    /**
     * Meminta input angka dari pengguna dengan pesan tertentu.
     *
     * @param pesan teks yang akan ditampilkan sebelum input
     * @return nilai integer yang dimasukkan pengguna
     */
    static int inputAngka(String pesan) {
        System.out.print(pesan);
        return Integer.parseInt(Kasir.scanner.nextLine());
    }

    /**
     * Menyimpan data barang (nama, harga, jumlah) ke dalam list yang dimiliki kelas {@link Kasir}.
     *
     * @param nama   nama barang
     * @param harga  harga barang per unit
     * @param jumlah jumlah barang yang dibeli
     */
    static void simpanBarang(String nama, int harga, int jumlah) {
        Kasir.barangList.add(nama);
        Kasir.hargaList.add(harga);
        Kasir.jumlahList.add(jumlah);
    }
}
