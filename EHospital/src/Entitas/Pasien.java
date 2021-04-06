
package Entitas;
import java.util.Scanner;

public class Pasien extends User{
    private int idpasien;
    private String lokasi;
    private int umur;
    private int tanggalLhr;
    
    public void inputPasien() {
        String nama, email;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nama pasien : ");
        nama = sc.nextLine();
        super.setnama(nama);
        
        System.out.print("Id pasien : ");
        idpasien = sc.nextInt();
        
        System.out.print("Lokasi : ");
        lokasi = sc.nextLine();
        lokasi = sc.nextLine();
        
        System.out.print("Tanggal Lahir : ");
        tanggalLhr = sc.nextInt();   
        
        System.out.print("umur : ");
        umur = sc.nextInt();  
        
        System.out.print("Email : ");
        email = sc.nextLine();
        email = sc.nextLine();
        super.setEmail(email);
       
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
        tabelPasien[0].setManualPasien("naga", "naga@gmail.com", 101, 12, "Bandung",21);
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
    
    public void displayinfo(){
        System.out.println("ID Pasien: " + getIdPasien());
        System.out.println("Nama Pasien: " + super.getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Email: " + getEmail());
        System.out.println("Lokasi: " + getLokasi());
        System.out.println("Tanggal Lahir: " + getTanggalLahir());
    }
}
