/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitas;
import java.util.Scanner;

public class Pasien extends User {
    private int idpasien;
    private String lokasi;
    private int umur;
    private int tanggalLhr;
    private String keluhan;
    private String konsultasi;
    private String nama;
    private String email;
    private int password;
    
    public void inputPasien() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nama pasien : ");
        nama = sc.nextLine();
        super.setnama(nama);
        
        System.out.println("Id pasien : ");
        idpasien = sc.nextInt();
        
        System.out.println("Lokasi : ");
        lokasi = sc.nextLine();
        
        System.out.println("Tanggal Lahir : ");
        tanggalLhr = sc.nextInt();   
        
        System.out.println("umur : ");
        umur = sc.nextInt();  
        
        System.out.println("Email : ");
        email = sc.nextLine(); 
        super.setEmail(email);
       
    }
    public int getIdPasien() {
        return idpasien;
    }
    
    public String getLokasi() {
        return lokasi;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public int getTanggalLahir() {
        return tanggalLhr;
    }
    
    public String getKeluhan() {
        return keluhan;
    }
    
    public String getKonsultasi() {
        return konsultasi;
    }
    
    public void displayinfo(){
        System.out.println("ID Pasien" + getIdPasien());
        System.out.println("Nama Pasien" + super.getNama());
        System.out.println("Umur" + getUmur());
        System.out.println("Lokasi" + getLokasi());
        System.out.println("Tanggal Lahir" + getTanggalLahir());
        System.out.println("Keluhan" + getKeluhan());
        System.out.println("Konsultasi" + getKonsultasi());
    }
}
