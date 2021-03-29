/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitas;

/**
 *
 * @author acer
 */
public class User {
    private String nama;
    private String email;
    private int password;
    private String status;
    
    public void setnama(String Nama){     
        nama = Nama;
    }    
    
    public void setEmail(String Email){
        email = Email;
    }
    
    public void setPassword(int Password){
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
    
    public int getPass(){
        return password;
    }
    
    public String getStatus(){
        return status;
    }
}
