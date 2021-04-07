
package Relasi;
import Entitas.Pasien;
import Entitas.Dokter;
import Entitas.User;
import java.util.Scanner;

public class PesanDokter extends Dokter{
    private String ruang;
    private String hariPraktek;
    private int tanggalPraktek;
    private String bulanPraktek;
    private int tahun;
    private int jamPraktek;
    private Pasien pasien;
    private Dokter dokter;
    private String namaPesanDokter;
    private int nomorAntrian;
    
    User pengguna = new Pasien();
    Pasien us = (Pasien) pengguna;
    public void setPesanDokter(Pasien[] pasien, int indeks, Dokter[] dokter, int nomorAntrian){
        Scanner sc = new Scanner(System.in); 
        super.setnama(pasien[indeks].getNama());
        System.out.print("Nama            : ");
        System.out.println(super.getNama());
        
        us.setUmur(pasien[indeks].getUmur());
        System.out.print("Umur            : ");
        System.out.println(us.getUmur());
        
        us.setTanggalLahir(pasien[indeks].getTanggalLahir());
        System.out.print("Tanggal Lahir   : ");
        System.out.println(us.getTanggalLahir());
        
        us.setLokasi(pasien[indeks].getLokasi());
        System.out.print("Lokasi          : ");
        System.out.println(us.getLokasi());
        
        System.out.println(" ");
        System.out.println("------ Dokter yang Tersedia ------");
        for (int i = 0; i<dokter[0].getValue(dokter); i++) {
            System.out.println((i+1) + ".Nama Dokter : " + dokter[i].getNama());
            System.out.println("***********************");
        }
        
        System.out.println(" ");
        System.out.print("Masukkan nama dokter : ");
        String input = sc.nextLine();
        
        for (int i = 0; i<dokter[0].getValue(dokter); i++) {
            if (input.intern() == dokter[i].getNama()) {
                namaPesanDokter = dokter[i].getNama();
            }
        }
        
        System.out.println(" ");
        System.out.println("Nama dokter yang dipesan: " + namaPesanDokter);
        
        System.out.print("Ruang       : ");
        ruang = sc.nextLine();
        
        System.out.print("Hari        : ");
        hariPraktek = sc.nextLine();
        
        System.out.print("Tanggal     : ");
        tanggalPraktek = sc.nextInt();
        
        System.out.print("Bulan       : ");
        bulanPraktek = sc.nextLine();
        bulanPraktek = sc.nextLine();
        
        System.out.print("Tahun       : ");
        tahun = sc.nextInt();
        
        System.out.print("Waktu       : ");
        jamPraktek = sc.nextInt();
        
        System.out.print("No. Antrian : ");
        this.nomorAntrian = nomorAntrian + 1;
        System.out.println(this.nomorAntrian);
    }
    
    public String getRuang() {
        return ruang;
    }
    
    public String getHariPraktek() {
        return hariPraktek;
    }
    
    public int getTanggalPraktek() {
        return tanggalPraktek;
    }
    
    public String getBulanPraktek() {
        return bulanPraktek;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public int getJamPraktek() {
        return jamPraktek;
    }
    
    public String getNamaPesanDokter() {
        return namaPesanDokter;
    }
    
    public int getNomorAntrian() {
        return nomorAntrian;
    }
    
    public int getValue(PesanDokter[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }

        return banyak;
    }
    
    public void displayinfo(PesanDokter[] Pesan){
        for (int i = 0; i<Pesan[0].getValue(Pesan); i++) {
            System.out.println(" ");
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println("Dokter yang dipilih : " + Pesan[i].getNamaPesanDokter());
            System.out.println("Nama Pasien         : " + Pesan[i].getNama());
            System.out.println("Ruang               : " + Pesan[i].getRuang());
            System.out.println("Hari                : " + Pesan[i].getHariPraktek());
            System.out.println("Tanggal             : " + Pesan[i].getTanggalPraktek());
            System.out.println("Bulan               : " + Pesan[i].getBulanPraktek());
            System.out.println("Tahun               : " + Pesan[i].getTahun());
            System.out.println("Nomor Antrian       : " + Pesan[i].getNomorAntrian());
        
            System.out.println(" ");
        }
    }
}
