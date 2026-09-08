/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiomusik;

/**
 *
 * @author MyBook Hype AMD
 */
public class Booking {
  
    
    private String idBooking;
    private String idPelanggan;
    private String idStudio;
    private String tanggalBooking;
    private String jamBooking;
    private int durasi;

    // Constructor
    public Booking(String idBooking, String idPelanggan, String idStudio,
                   String tanggalBooking, String jamBooking, int durasi) {
        this.idBooking = idBooking;
        this.idPelanggan = idPelanggan;
        this.idStudio = idStudio;
        this.tanggalBooking = tanggalBooking;
        this.jamBooking = jamBooking;
        this.durasi = durasi;
    }

    // Getter
    public String getIdBooking() {
        return idBooking;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getIdStudio() {
        return idStudio;
    }

    public String getTanggalBooking() {
        return tanggalBooking;
    }

    public String getJamBooking() {
        return jamBooking;
    }

    public int getDurasi() {
        return durasi;
    }

    // Setter
    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setIdStudio(String idStudio) {
        this.idStudio = idStudio;
    }

    public void setTanggalBooking(String tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public void setJamBooking(String jamBooking) {
        this.jamBooking = jamBooking;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}

