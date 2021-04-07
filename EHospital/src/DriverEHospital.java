import Entitas.Dokter;
import Entitas.Pasien;
import Relasi.PesanDokter;
import java.util.Scanner;

public class DriverEHospital {
    public static void main(String[] args) {
        Pasien[] psn = new Pasien[10];
        Dokter[] dokter = new Dokter[10];
        PesanDokter[] tabelpesan = new PesanDokter[10]; 
        Dokter[] tabeldokter = new Dokter[10];
        int nomorAntrian = 0;
        psn[0] = new Pasien();
        dokter[0] = new Dokter();
        tabelpesan[0] = new PesanDokter();
        int indekscari = 0;
        boolean Kebenaran = false;
        int globalindeks = 0;
        
        dokter[0].dataPreview(dokter);
        psn[0].dataPreview(psn);
        
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di E-Hospital");
        System.out.println("1. LOGIN");
        System.out.println("2. Registrasi");
        System.out.print("Masukan Pilihan Anda :");
        System.out.print(" ");
        
        int Masukan = input.nextInt();
        while (Masukan != 0) {
            if (Masukan == 1){
                System.out.println(psn[0].getValue(psn));
                System.out.print("Masukan email : ");
                String Username = input.nextLine();
                Username = input.nextLine();
                
                System.out.print("Masukan Password : ");
                String Password = input.nextLine();
                
                Kebenaran = false;
                indekscari = psn[0].cariDataUser(psn, Username, Password, indekscari);
                Kebenaran = psn[0].cekKebenaran(psn, Username, Password, Kebenaran);
                
                
                if (Kebenaran == true) {
                    System.out.println("Selamat Datang");
                    System.out.println("1. Pesan Dokter");
                    System.out.println("2. Periksa");
                    Masukan = input.nextInt();
                    while (Masukan != 0) {
                        if (Masukan == 1) {
                            globalindeks = tabelpesan[0].getValue(tabelpesan);
                            tabelpesan[globalindeks] = new PesanDokter();
                            //System.out.println(globalindeks);
                            tabelpesan[globalindeks].setPesanDokter(psn, globalindeks+1, dokter, nomorAntrian);
                            tabelpesan[0].displayinfo(tabelpesan);
                        } else if (Masukan == 2) {
                            
                        }
                        System.out.println("Selamat Datang");
                        System.out.println("1. Jadwal Dokter");
                        System.out.println("2. Periksa");
                        System.out.println(" ");
                        System.out.print("Masukan Pilihan menu : ");
                        Masukan = input.nextInt();
                    }
                }else{
                    System.out.println("Data Tidak Ada");
                }
                 
            }else if (Masukan == 2) {
                System.out.println(" ");
                System.out.println("===Registrasi Akun===");
                globalindeks = psn[0].getValue(psn);
                psn[globalindeks] = new Pasien();
                psn[globalindeks].inputPasien();
                System.out.println("---");
                psn[globalindeks].displayinfo(psn);
                
            }
        System.out.println("Selamat Datang di E-Hospital");
        System.out.println("1. LOGIN");
        System.out.println("2. Registrasi");
        System.out.print("Masukan Pilihan Anda : ");
        Masukan = input.nextInt();
        }
    }
}
