package Relasi;
import Entitas.Pasien;
import Entitas.Dokter;
import Entitas.User;
import java.util.Scanner;

public class PesanDokter extends Dokter{
    private String idPesanan;
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
        
        System.out.print("Masukkan Id Pesanan : ");
        idPesanan = sc.nextLine();
        
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
    
    public void setNamaPesanDokter(String namaPesanDokter){
       this.namaPesanDokter = namaPesanDokter;
    }
    
    public void setRuang(String ruang){
       this.ruang = ruang;
    }
    
    public void setIdPesanan(String idPesanan){
       this.idPesanan = idPesanan;
    }
    
    public void setHariPraktek(String hariPraktek){
       this.hariPraktek = hariPraktek;
    }
    
    public void setTanggalPraktek(int tanggalPraktek){
       this.tanggalPraktek = tanggalPraktek;
    }
    
    public void setBulanPraktek(String bulanPraktek){
       this.bulanPraktek = bulanPraktek;
    }
    
    public void setTahun(int tahun){
       this.tahun = tahun;
    }
    
    public void setJamPraktek(int jamPraktek){
       this.jamPraktek = jamPraktek;
    }
    
    public void setNomorAntrian(int nomorAntrian){
       this.nomorAntrian = nomorAntrian;
    }
    
    public String getRuang() {
        return ruang;
    }
    
    public String getIdPesanan() {
        return idPesanan;
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
    
    public void updateData(PesanDokter[] psndokter, int indeks, Dokter[] dokter, User[] user){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Masukkan nama : ");
        String nama = sc.nextLine();
        psndokter[indeks].setnama(nama);
        
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
                String Pesandokter = dokter[i].getNama();
                psndokter[indeks].setNamaPesanDokter(Pesandokter);
            }
        }
        
        System.out.println(" ");
        System.out.println("Nama dokter yang dipesan: " + psndokter[indeks].getNamaPesanDokter());
        
        System.out.print("Ruang       : ");
        ruang = sc.nextLine();
        psndokter[indeks].setRuang(ruang);
        
        System.out.print("Hari        : ");
        hariPraktek = sc.nextLine();
        psndokter[indeks].setHariPraktek(hariPraktek);
        
        System.out.print("Tanggal     : ");
        tanggalPraktek = sc.nextInt();
        psndokter[indeks].setTanggalPraktek(tanggalPraktek);
        
        System.out.print("Bulan       : ");
        bulanPraktek = sc.nextLine();
        bulanPraktek = sc.nextLine();
        psndokter[indeks].setBulanPraktek(bulanPraktek);
        
        System.out.print("Tahun       : ");
        tahun = sc.nextInt();
        psndokter[indeks].setTahun(tahun);
        
        System.out.print("Waktu       : ");
        jamPraktek = sc.nextInt();
        psndokter[indeks].setJamPraktek(jamPraktek);
        
        System.out.print("No. Antrian : ");
        System.out.println(this.nomorAntrian);  
    }
    
    public int cari(PesanDokter[] psndokter, String cari){
        int i = 0; 
        while(cari.intern() != psndokter[i].getIdPesanan() && i<psndokter[0].getValue(psndokter)){
            i++;
        }
        return i;
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
