/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiomusik;

/**
 *
 * @author MyBook Hype AMD
 */
public class PelangganUmum extends Pelanggan {
    public PelangganUmum(String idPelanggan, String nama, String noTelepon, String alamat) {
        super(idPelanggan, nama, noTelepon, alamat);
    }
    
    @Override
    public String getInfo() {
        return "Pelanggan Umum: " + getNama();
    }
}
