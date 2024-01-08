/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.util.*;
import static tubes.tubes1.User.idUser;

/**
 *
 * @author LENOVO
 */
public class Pembeli extends User implements Loginable {
    protected String usernamePem;
    private int iduser;
    private String email;
    protected boolean isLoggedIn;
    
    /* public Pembeli(String username) {
        super(username);
    }*/
    public Pembeli () {
        setStatusUser("Pembeli");   
    }   
    public void cekLogin(String usr, String pwd) throws LoginFailedException {  
        LoginHelper checkUser = TubesHelper.checkUser(listUser, usr);
        LoginHelper checkPassword = TubesHelper.checkPassword(getListPassword(), pwd);
        if (pwd.length() < 8) {
            isLoggedIn = false;
            throw new LoginFailedException("Login gagal! Password minimal 8 karakter", iduser);
        }
        if (checkUser.status == false) {
            isLoggedIn = false;
            throw new LoginFailedException("Login gagal! Username "+usr+" tidak terdaftar", iduser);
        }
        if (checkPassword.status == false) {
            isLoggedIn = false;
            throw new LoginFailedException("Login gagal! Password salah", iduser);
        }
        this.usernamePem = checkUser.getIsi();
        this.iduser = checkUser.iduser;
        LoginHelper checkEmail = TubesHelper.checkEmail(listEmail, iduser);
        this.email = checkEmail.getIsi();
        isLoggedIn = true;
    }
    @Override
    public void login(String usr, String pwd) throws LoginFailedException {
        do {
            try {
                cekLogin(usr, pwd);
                System.out.println("Anda telah login sebagai user "+usernamePem+" dengan ID User "+iduser);
                break;
            } catch (LoginFailedException e) {
                throw new LoginFailedException(e.getMessage(), iduser);
            } catch (NullPointerException n) {
                System.out.println("Sedang login dengan user "+getNama());
            }
        }  while (true); 
    }
    @Override
    public void tampilkanProfil() {
        if (isLoggedIn == true) {
            System.out.println("=== Profil User "+usernamePem+" ===");
            System.out.println("=== "+getStatusUser()+" ===");
            System.out.println("");
            System.out.println("Email: "+email);
            System.out.println("");
            System.out.println("==============");
            System.out.println("");
        } else {
            System.out.println("Login terlebih dahulu!");
        }
    }
    @Override
    public void logout() {
        isLoggedIn = false;
        System.out.println("Berhasil logout!");
    }
    
    
}
