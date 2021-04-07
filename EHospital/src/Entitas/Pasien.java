
package Entitas;
import java.util.Scanner;

public class Pasien extends User{
    private int idpasien;
    private String lokasi;
    private int umur;
    private int tanggalLhr;
    
    public void inputPasien() {
        String nama, email, password;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nama pasien   : ");
        nama = sc.nextLine();
        super.setnama(nama);
        
        System.out.print("Id pasien     : ");
        idpasien = sc.nextInt();
        
        System.out.print("Lokasi        : ");
        lokasi = sc.nextLine();
        lokasi = sc.nextLine();
        
        System.out.print("Tanggal Lahir : ");
        tanggalLhr = sc.nextInt();   
        
        System.out.print("umur          : ");
        umur = sc.nextInt();  
        
        System.out.print("Email         : ");
        email = sc.nextLine();
        email = sc.nextLine();
        super.setEmail(email);
        
        System.out.print("Password      : ");
        password = sc.nextLine();
        super.setPassword(password);
       
    }
    
    public void setIdPasien(int idpasien) {
        this.idpasien = idpasien;
    }
    
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void setTanggalLahir(int tanggalLhr) {
        this.tanggalLhr = tanggalLhr;
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
    
    public void setManualPasien(String nama, String email,int idpasien, int umur, String lokasi, int tanggalLhr){
        super.setnama(nama);
        super.setEmail(email);
        this.idpasien = idpasien;
        this.umur = umur;
        this.lokasi = lokasi;
        this.tanggalLhr = tanggalLhr;
    }
    
    public void dataPreview(Pasien[] tabelPasien){
        for (int i = 1 ; i < 2 ; i ++) {
            tabelPasien[i] = new Pasien();
        }
        tabelPasien[0].setManualPasien("yaudah", "yaudah@gmail.com", 101, 12, "Bandung",21);
        tabelPasien[1].setManualPasien("inul", "inul@gmail.com", 102, 30, "Bali", 18);
        
        /*for (int i=0; i<tabelPasien[0].getValue(tabelPasien); i++ ){
            tabelPasien[i].displayinfo();
        }*/
    }
    
    public int getValue(Pasien[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }

        return banyak;
    }
    
    public int cariDataUser(Pasien[] tabelPasien,String x,String y,int indekscari){
        for (int i = 0; i < tabelPasien[0].getValue(tabelPasien) ; i++) {
            if (tabelPasien[i].getEmail().intern() == x.intern() && tabelPasien[i].getPass().intern() == y.intern()) {
                indekscari++;
            }
        }
        return indekscari;
    }

    public boolean cekKebenaran(Pasien[] tabelPasien,String x,String y,boolean kebenaran){
        for (int i = 0; i < tabelPasien[0].getValue(tabelPasien) ; i++) {
            if (tabelPasien[i].getEmail().intern() == x.intern() && tabelPasien[i].getPass().intern() == y.intern()) {
                kebenaran = true;
            }
        }
        return kebenaran;
    }
    
    public void displayinfo(Pasien[] psn){
        for (int i = 0; i < psn[0].getValue(psn); i++) {
            System.out.println("ID Pasien     : " + psn[i].getIdPasien());
            System.out.println("Nama Pasien   : " + psn[i].getNama());
            System.out.println("Umur          : " + psn[i].getUmur());
            System.out.println("Email         : " + psn[i].getEmail());
            System.out.println("Password      : " + psn[i].getPass());
            System.out.println("Lokasi        : " + psn[i].getLokasi());
            System.out.println("Tanggal Lahir : " + psn[i].getTanggalLahir());
            System.out.println(" ");
            System.out.println("--------------------------");
        }
    }
}
