
package Relasi;
import Entitas.Pasien;
import Entitas.Dokter;
import java.util.Scanner;

public class PesanDokter {
    private String ruang;
    private String hariPraktek;
    private int tanggalPraktek;
    private int tahun;
    private int jamPraktek;
    private Pasien pasien;
    private Dokter dokter;
    
    public void setPesanDokter(Pasien[] pasien, Dokter[] dokter){
        Scanner sc = new Scanner(System.in); 
        
        this.pasien = pasien;
        System.out.print("Ruang : ");
        ruang = sc.nextLine();
        
        System.out.print("Hari : ");
        hariPraktek = sc.nextLine();
        
        System.out.print("Tanggal : ");
        tanggalPraktek = sc.nextInt();
        
        System.out.print("Tahun : ");
        tahun = sc.nextInt();
        
        System.out.print("Waktu : ");
        jamPraktek = sc.nextInt();
    }
}
