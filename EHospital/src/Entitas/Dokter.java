package Entitas;

public class Dokter {
    private String spesialisDokter;
    private String idDokter;

    public Dokter(String nama, String email, int password, String status, String idDokter, String spesialisDokter){
        super.setnama(nama);
        super.setEmail(email);
        super.setPassword(password);
        super.setStatus(status);
        this.idDokter = idDokter;
        this.spesialisDokter = spesialisDokter;
    }
    
    public String getidDokter(){
        return idDokter;
    }
    
    public String getspesialisDokter(){
        return spesialisDokter;
    }
    
    public String getjadwalDokter(){
        return jadwalDokter;
    }
    
    public void dataPreview(Dokter[] tabeldokter){
        tabeldokter = new Dokter[5];
        
        tabeldokter[0] = new Dokter("dr. Fathaya", "fathaya@gmail.com", 123, "Online", "FNA","Spesialis Dokter Jantung");
        tabeldokter[1] = new Dokter("dr. Eral", "eral@gmail.com", 345, "Offline", "MUH","Spesialis Dokter Cinta");
        tabeldokter[2] = new Dokter("dr. Carolin", "carol@gmail.com", 567, "Online", "CRL","Spesialis Dokter Mata");        
        tabeldokter[3] = new Dokter("dr. Amanda", "manda@gmail.com", 890, "Busy", "AMD","Spesialis Dokter Otopsi");        
        tabeldokter[4] = new Dokter("dr. Ranran", "rana@gmail.com", 555, "Online", "RNA","Spesialis Dokter Anak");        
        
        for (int i=0; i<tabeldokter.length; i++ ){
            tabeldokter[i].displayinfo();
        }
    }
    
    public void displayinfo(){
        System.out.println("ID Dokter     : " + getidDokter());
        System.out.println("Nama Dokter   : " + super.getNama());
        System.out.println("Email Dokter  : " + super.getEmail());
        System.out.println("Status        : " + super.getStatus());
        System.out.println("Spesialis Dokter  :" + getspesialisDokter());
        System.out.println(" ");
    }
}
