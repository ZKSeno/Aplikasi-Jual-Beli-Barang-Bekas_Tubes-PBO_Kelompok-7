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
public class StaffToko extends User implements Loginable {
    protected boolean isLoggedIn;
   
    protected String usernameStf;
    protected String statusStaffToko;
    private int iduser;
    
    public StaffToko () {
        setStatusUser("Staff Toko");
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
        this.usernameStf = checkUser.getIsi();
        this.iduser = checkUser.iduser;
        LoginHelper checkStatusStaff = TubesHelper.checkStatusUser(listStatusStaff, iduser);
        this.statusStaffToko = checkStatusStaff.getIsi();
        isLoggedIn = true;
    }
    @Override
    public void login(String usr, String pwd) throws LoginFailedException {
        do {
            try {
                cekLogin(usr, pwd);
                System.out.println("Anda telah login sebagai user "+usernameStf+" dengan ID User "+iduser);
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
            System.out.println("=== Profil User "+usernameStf+" ===");
            System.out.println("=== "+getStatusUser()+" ===");
            System.out.println("");
            System.out.println("Email: "+getEmail());
            System.out.println("Status: "+statusStaffToko);
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