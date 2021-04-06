package Entitas;

public class Dokter extends User{
    private String spesialisDokter;
    private String idDokter;
    
    public void setManualDokter(String nama, String email, int password, String status, String idDokter, String spesialisDokter){
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
    
    public void dataPreview(Dokter[] tabeldokter){
        for (int i = 1 ; i < 5 ; i ++) {
            tabeldokter[i] = new Dokter();
        }
        tabeldokter[0].setManualDokter("dr. Fathaya", "fathaya@gmail.com", 123, "Online", "FNA","Spesialis Dokter Jantung");
        tabeldokter[1].setManualDokter("dr. Eral", "eral@gmail.com", 345, "Offline", "MUH","Spesialis Dokter Cinta");
        tabeldokter[2].setManualDokter("dr. Carolin", "carol@gmail.com", 567, "Online", "CRL","Spesialis Dokter Mata");        
        tabeldokter[3].setManualDokter("dr. Cici", "cici@gmail.com", 890, "Busy", "CCI","Spesialis Dokter Otopsi");        
        tabeldokter[4].setManualDokter("dr. Ranran", "rana@gmail.com", 555, "Online", "RNA","Spesialis Dokter Anak");        
        
        /*for (int i=0; i<tabeldokter[0].getValue(tabeldokter); i++ ){
            tabeldokter[i].displayinfo();
        }*/
    }
    
    public int getValue(Dokter[] total){
        int banyak = 0;
        while (total[banyak] != null && banyak <= total.length) {
            banyak = banyak + 1;
        }

        return banyak;
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
