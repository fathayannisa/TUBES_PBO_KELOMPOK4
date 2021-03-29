/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitas;

/**
 *
 * @author acer
 */
public class Dokter {
    private String jadwalDokter;
    private String spesialisDokter;
    private String idDokter;

    public Dokter(String nama, String email, int password, String status, String idDokter, String spesialisDokter, String jadwalDokter){
        super.setnama(nama);
        super.setEmail(email);
        super.setPassword(password);
        super.setStatus(status);
        this.idDokter = idDokter;
        this.jadwalDokter = jadwalDokter;
        this.spesialisDokter = spesialisDokter;
    }
    public String getidDokter(){
    return idDokter;
    }
    public String getspesialisDokter(){
    return spesialisDokter;
    }
    public String getjadwalDokter(){
    return jadwalDokter;
    }
    public void displayinfo(){
        System.out.println("ID Dokter" + getidDokter());
        System.out.println("Nama Dokter" + super.getNama());
        System.out.println("Spesialis Dokter" + getjadwalDokter());
        System.out.println("Jadwal Dokter" + getjadwalDokter());
        System.out.println("Email Dokter" + super.getEmail());
    }
}
