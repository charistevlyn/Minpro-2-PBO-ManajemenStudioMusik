
package studiomusik;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
    static Scanner input = new Scanner(System.in);

    static ArrayList<Studio> daftarStudio = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Booking> daftarBooking = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n======================================");
            System.out.println("      SISTEM MANAJEMEN STUDIO MUSIK");
            System.out.println("======================================");
            System.out.println("1. Tambah Studio");
            System.out.println("2. Lihat Studio");
            System.out.println("3. Ubah Studio");
            System.out.println("4. Hapus Studio");
            System.out.println("5. Tambah Pelanggan");
            System.out.println("6. Lihat Pelanggan");
            System.out.println("7. Tambah Booking");
            System.out.println("8. Lihat Booking");
            System.out.println("9. Keluar");
            System.out.println("======================================");

            pilihan = inputAngka("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahStudio();
                    break;

                case 2:
                    lihatStudio();
                    break;

                case 3:
                    ubahStudio();
                    break;

                case 4:
                    hapusStudio();
                    break;

                case 5:
                    tambahPelanggan();
                    break;

                case 6:
                    lihatPelanggan();
                    break;

                case 7:
                    tambahBooking();
                    break;

                case 8:
                    lihatBooking();
                    break;

                case 9:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nMenu tidak tersedia!");
            }

        } while (pilihan != 9);
    }

    // =========================
    // MENU STUDIO
    // =========================

    static void tambahStudio() {

        System.out.println("\n--- TAMBAH DATA STUDIO ---");

        String id = inputTeks("ID Studio: ");

        if (cariStudio(id) != null) {
            System.out.println("ID Studio sudah digunakan!");
            return;
        }

        String nama = inputTeks("Nama Studio: ");
        String jenis = inputTeks("Jenis Studio: ");
        double harga = inputAngkaDouble("Harga per jam: ");

        Studio studio = new Studio(id, nama, jenis, harga);

        daftarStudio.add(studio);

        System.out.println("Data studio berhasil ditambahkan!");
    }

    static void lihatStudio() {

        System.out.println("\n--- DATA STUDIO ---");

        if (daftarStudio.isEmpty()) {
            System.out.println("Belum ada data studio.");
            return;
        }

        for (Studio studio : daftarStudio) {

            System.out.println("----------------------------");
            System.out.println("ID Studio    : " + studio.getIdStudio());
            System.out.println("Nama Studio  : " + studio.getNamaStudio());
            System.out.println("Jenis Studio : " + studio.getJenisStudio());
            System.out.println("Harga/Jam    : Rp" + studio.getHargaPerJam());
        }
    }

    static void ubahStudio() {

        System.out.println("\n--- UBAH DATA STUDIO ---");

        String id = inputTeks("Masukkan ID Studio: ");

        Studio studio = cariStudio(id);

        if (studio == null) {
            System.out.println("Studio tidak ditemukan!");
            return;
        }

        String nama = inputTeks("Nama Studio baru: ");
        String jenis = inputTeks("Jenis Studio baru: ");
        double harga = inputAngkaDouble("Harga per jam baru: ");

        studio.setNamaStudio(nama);
        studio.setJenisStudio(jenis);
        studio.setHargaPerJam(harga);

        System.out.println("Data studio berhasil diubah!");
    }

    static void hapusStudio() {

        System.out.println("\n--- HAPUS DATA STUDIO ---");

        String id = inputTeks("Masukkan ID Studio: ");

        Studio studio = cariStudio(id);

        if (studio == null) {
            System.out.println("Studio tidak ditemukan!");
            return;
        }

        daftarStudio.remove(studio);

        System.out.println("Data studio berhasil dihapus!");
    }

    static Studio cariStudio(String id) {

        for (Studio studio : daftarStudio) {

            if (studio.getIdStudio().equalsIgnoreCase(id)) {
                return studio;
            }
        }

        return null;
    }

    // =========================
    // MENU PELANGGAN
    // =========================

    static void tambahPelanggan() {

        System.out.println("\n--- TAMBAH DATA PELANGGAN ---");

        String id = inputTeks("ID Pelanggan: ");

        if (cariPelanggan(id) != null) {
            System.out.println("ID Pelanggan sudah digunakan!");
            return;
        }

        String nama = inputTeks("Nama: ");
        String noTelepon = inputTeks("No. Telepon: ");
        String alamat = inputTeks("Alamat: ");

        Pelanggan pelanggan =
                new Pelanggan(id, nama, noTelepon, alamat);

        daftarPelanggan.add(pelanggan);

        System.out.println("Data pelanggan berhasil ditambahkan!");
    }

    static void lihatPelanggan() {

        System.out.println("\n--- DATA PELANGGAN ---");

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }

        for (Pelanggan pelanggan : daftarPelanggan) {

            System.out.println("----------------------------");
            System.out.println("ID Pelanggan : "
                    + pelanggan.getIdPelanggan());
            System.out.println("Nama         : "
                    + pelanggan.getNama());
            System.out.println("No. Telepon  : "
                    + pelanggan.getNoTelepon());
            System.out.println("Alamat       : "
                    + pelanggan.getAlamat());
        }
    }

    static Pelanggan cariPelanggan(String id) {

        for (Pelanggan pelanggan : daftarPelanggan) {

            if (pelanggan.getIdPelanggan().equalsIgnoreCase(id)) {
                return pelanggan;
            }
        }

        return null;
    }

    // =========================
    // MENU BOOKING
    // =========================

    static void tambahBooking() {

        System.out.println("\n--- TAMBAH BOOKING ---");

        if (daftarStudio.isEmpty()) {
            System.out.println("Belum ada studio yang tersedia.");
            return;
        }

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }

        String idBooking = inputTeks("ID Booking: ");

        if (cariBooking(idBooking) != null) {
            System.out.println("ID Booking sudah digunakan!");
            return;
        }

        String idPelanggan =
                inputTeks("ID Pelanggan: ");

        if (cariPelanggan(idPelanggan) == null) {
            System.out.println("Pelanggan tidak ditemukan!");
            return;
        }

        String idStudio =
                inputTeks("ID Studio: ");

        if (cariStudio(idStudio) == null) {
            System.out.println("Studio tidak ditemukan!");
            return;
        }

        String tanggal =
                inputTeks("Tanggal Booking: ");

        String jam =
                inputTeks("Jam Booking: ");

        int durasi =
                inputAngka("Durasi (jam): ");

        if (durasi <= 0) {
            System.out.println("Durasi harus lebih dari 0!");
            return;
        }

        Booking booking = new Booking(
                idBooking,
                idPelanggan,
                idStudio,
                tanggal,
                jam,
                durasi
        );

        daftarBooking.add(booking);

        System.out.println("Booking berhasil ditambahkan!");
    }

    static void lihatBooking() {

        System.out.println("\n--- DATA BOOKING ---");

        if (daftarBooking.isEmpty()) {
            System.out.println("Belum ada data booking.");
            return;
        }

        for (Booking booking : daftarBooking) {

            System.out.println("----------------------------");
            System.out.println("ID Booking   : "
                    + booking.getIdBooking());
            System.out.println("ID Pelanggan : "
                    + booking.getIdPelanggan());
            System.out.println("ID Studio    : "
                    + booking.getIdStudio());
            System.out.println("Tanggal      : "
                    + booking.getTanggalBooking());
            System.out.println("Jam          : "
                    + booking.getJamBooking());
            System.out.println("Durasi       : "
                    + booking.getDurasi() + " jam");
        }
    }

    static Booking cariBooking(String id) {

        for (Booking booking : daftarBooking) {

            if (booking.getIdBooking().equalsIgnoreCase(id)) {
                return booking;
            }
        }

        return null;
    }

    // =========================
    // VALIDASI INPUT
    // =========================

    static String inputTeks(String pesan) {

        String hasil;

        do {
            System.out.print(pesan);
            hasil = input.nextLine().trim();

            if (hasil.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }

        } while (hasil.isEmpty());

        return hasil;
    }

    static int inputAngka(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);
                int angka = Integer.parseInt(input.nextLine());

                return angka;

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka!");
            }
        }
    }

    static double inputAngkaDouble(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);
                double angka = Double.parseDouble(input.nextLine());

                if (angka < 0) {
                    System.out.println("Harga tidak boleh negatif!");
                } else {
                    return angka;
                }

            } catch (NumberFormatException e) {

                System.out.println("Input harus berupa angka!");
            }
        }
    }
}
