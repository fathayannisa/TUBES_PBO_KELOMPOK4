import Entitas.Dokter;
import Entitas.Pasien;
import Relasi.PesanDokter;
import java.util.Scanner;

public class DriverEHospital {
    public static void main(String[] args) {
        Pasien[] psn = new Pasien[10];
        Dokter[] dokter = new Dokter[10];
        PesanDokter[] tabelpesan = new PesanDokter[10]; 
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
        System.out.println("Masukan Pilihan Anda : ");
        int Masukan = input.nextInt();
        while (Masukan != 0) {
            if (Masukan == 1){
                System.out.println("Masukan email");
                String Username = input.nextLine();
                System.out.println("Masukan Password");
                int Password = input.nextInt();
                
                for (int i = 0; i < psn[0].getValue(psn) ; i++) {
                    if (psn[i].getEmail().intern() == Username.intern() && psn[i].getPass() == Password){
                        indekscari = i;
                        Kebenaran = true;
                    }
                }
                
                if (Kebenaran == true) {
                    System.out.println("Selamat Datang");
                    System.out.println("1. Pesan Dokter");
                    System.out.println("2. Periksa");
                    Masukan = input.nextInt();
                    while (Masukan != 0) {
                        if (Masukan == 1) {
                            
                        } else if (Masukan == 2) {
                            
                        }
                        System.out.println("Selamat Datang");
                        System.out.println("1. Jadwal Dokter");
                        System.out.println("2. Periksa");
                        System.out.print("Masukan Pilihan menu : ");
                        Masukan = input.nextInt();
                    }
                }else{
                    System.out.println("Data Tidak Ada");
                }
                 
            }else if (Masukan == 2) {
                System.out.println("Registrasi Akun");
                globalindeks = psn[0].getValue(psn);
                psn[globalindeks] = new Pasien();
                psn[globalindeks].inputPasien();
                System.out.println("---");
                psn[globalindeks].displayinfo();
                
            }
        System.out.println("Selamat Datang di E-Hospital");
        System.out.println("1. LOGIN");
        System.out.println("2. Registrasi");
        System.out.println("Masukan Pilihan Anda : ");
        Masukan = input.nextInt();
        }
    }
}
