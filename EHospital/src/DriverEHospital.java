import Entitas.Pasien;
import Entitas.Dokter;

public class DriverEHospital {
    public static void main(String[] args) {
        Pasien psn = new Pasien();
        Dokter[] tabeldokter = new Dokter[10];
        
        tabeldokter[0] = new Dokter("dr. Fathaya", "fathaya@gmail.com", 123, "Online", "FNA","Spesialis Dokter Jantung");        
        tabeldokter[0].dataPreview(tabeldokter); 
        
        psn.inputPasien();
        psn.displayinfo();
    }
}
