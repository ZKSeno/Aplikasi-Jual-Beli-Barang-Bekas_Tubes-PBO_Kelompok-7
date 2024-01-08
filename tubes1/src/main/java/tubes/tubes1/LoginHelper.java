/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;

/**
 *
 * @author LENOVO
 */
public class LoginHelper {
    boolean status; // To store multiplication 
    private String isi; // To store division 
    int iduser;
    String namaToko;
    String namaPemilik;
    
    public LoginHelper(boolean s, String i, int id) 
    { 
        status = s;
        isi = i;
        iduser = id;
    } 
    
    public LoginHelper(boolean s, String nP, String nT) {
        status = s;
        namaPemilik = nP;
        namaToko = nT;
    }
    
    public String getIsi() {
        return isi;
    }
    public String getNamaToko() {
        return namaToko;
    }
}
