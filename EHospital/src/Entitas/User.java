
package Entitas;

public class User {
    
    private String nama;
    private String email;
    private String password;
    private String status;
    
    public void setnama(String Nama){     
        nama = Nama;
    }    
    
    public void setEmail(String Email){
        email = Email;
    }
    
    public void setPassword(String Password){
        password = Password;
    }
    
    public void setStatus(String Status){
        status = Status;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPass(){
        return password;
    }
    
    public String getStatus(){
        return status;
    }
}
