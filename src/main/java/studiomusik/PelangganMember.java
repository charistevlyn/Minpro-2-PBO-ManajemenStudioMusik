/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiomusik;

/**
 *
 * @author MyBook Hype AMD
 */
public class PelangganMember extends Pelanggan {
    private String jenisMember;
    public PelangganMember(String idPelanggan, String nama, String noTelepon,
                           String alamat, String jenisMember) {
        super(idPelanggan, nama, noTelepon, alamat);
        this.jenisMember = jenisMember;
    }
    public String getJenisMember() {
        return jenisMember;
    }
    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }
    
    @Override
    public String getInfo() {
        return "Pelanggan Member: " + getNama() +"-" +jenisMember;
    }
}
    

