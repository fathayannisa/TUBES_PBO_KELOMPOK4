import Entitas.Dokter;
import Entitas.Pasien;
import Relasi.PesanDokter;

public class DriverEHospital {
    public static void main(String[] args) {
        Pasien[] psn = new Pasien[10];
        Dokter[] dokter = new Dokter[10];
        PesanDokter[] tabelpesan = new PesanDokter[10]; 
        int nomorAntrian = 0;
        psn[0] = new Pasien();
        dokter[0] = new Dokter();
        tabelpesan[0] = new PesanDokter();
        
        dokter[0].dataPreview(dokter);
        psn[0].dataPreview(psn);
        tabelpesan[0].setPesanDokter(psn, 1, dokter, nomorAntrian);
        tabelpesan[0].displayinfo(tabelpesan);
    }
}
