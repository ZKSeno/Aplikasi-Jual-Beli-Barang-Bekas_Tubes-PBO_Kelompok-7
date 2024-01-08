/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.util.*;
import java.util.Map.*;

public abstract class User {
    protected static int idUser = 0;
    protected static HashMap<Integer, String> listUser;
    private HashMap<Integer, String> listPassword;
    private HashMap<Integer, String> listStatus;
    protected HashMap<Integer, String> listEmail;
    protected HashMap<Integer, String> listStatusStaff;
    /* protected HashMap<String, Boolean> statusKerListUser; */
    private String nama;
    private String password;
    private String email;
    private String statusUser;
    private String statusStaff; 
    public String getNama() {
        return nama;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getStatusUser() {
        return statusUser;
    }
    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }
    
    public String getStatusStaff() {
        return statusStaff;
    }

    public void setStatusStaff(String statusStaff) {
        this.statusStaff = statusStaff;
    }
    public HashMap<Integer, String> getListPassword() {
        return listPassword;
    }
    public User () {
        this.listUser = new HashMap<>();
        this.listPassword = new HashMap<>();
        this.listEmail = new HashMap<>();
        this.listStatus = new HashMap<>();
        this.listStatusStaff = new HashMap<>();
    }
    /* public User(String username) {
        this.statusKerListUser = new HashMap<>();
        for (Entry<Integer, String> entry : listUser.entrySet()) {
            if (listUser.get(idUser).equals(username)) {
                this.statusKerListUser = TubesHelper
                        .copyMapStatusKer(listUser, entry.getValue(), statusKer);
                break;
            } else {
                continue;
            }
        }
    } */
    public void setUserPembeli(String username, String password, String email) {
        this.idUser += 1;
        this.nama = username;
        this.password = password;
        this.email = email;
        listUser.put(idUser, nama);
        listPassword.put(idUser, password);
        listEmail.put(idUser, email);
        listStatus.put(idUser, statusUser);
    }
    public void setUserStaff(String username, String password, String email, String status) {
        this.idUser += 1;
        this.nama = username;
        this.password = password;
        this.email = email;
        this.statusStaff = status;
        listUser.put(idUser, nama);
        listPassword.put(idUser, password);
        listStatus.put(idUser, statusUser);
        listStatusStaff.put(idUser, statusStaff);
    }
    public abstract void tampilkanProfil();
    
    
}
