/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;

import java.util.*;
import java.util.Map;

import static tubes.tubes1.User.listUser;

public class Toko {
    private String namaPemilik;
    private String namaToko;
    private boolean statusKer = false;  
    private double totalHarga = 0;
    private ArrayList<Barang> arrBarang;
    private HashMap<String, String> arrToko;
    private HashMap<String, ArrayList<Barang>> StokToko;
    private ArrayList<Penilaian> review;
   
    
    /* public keranjangBelanja(String username) {
        super(username);
        if (!listUser.get(idUser).equals(username)) {
            setStatusKer(false);
        } else {
            setStatusKer(true);
        }
    } */
    
    public Toko() {
        this.arrBarang = new ArrayList<>();
        this.StokToko = new HashMap<>();
        this.arrToko = new HashMap<>();
    }
    public void setDataToko(String namatoko, String pemilikToko) {
        LoginHelper checkUser = TubesHelper.checkUser(listUser, pemilikToko);
        this.namaPemilik = checkUser.getIsi();
        arrToko.put(namatoko, namaPemilik);
        this.namaToko = cariNamaToko(namatoko);
    }
    public String cariNamaToko(String namaToko) {
        LoginHelper checkToko = TubesHelper.checkToko(arrToko, namaToko);
        return checkToko.getNamaToko();
    }
    public void tambahItem(Barang barang) {  
        arrBarang.add(barang);
        StokToko.put(namaToko, arrBarang);
    }
    public void hapusItem(String nama) {
        arrBarang.removeIf(barang
                -> barang.getNamaBarang().equals(nama));
    }
    public void tampilkanStok() {
        for(Map.Entry<String, ArrayList<Barang>> entry: StokToko.entrySet()) {
            if (namaToko.equals(entry.getKey())) {
                System.out.println("Keranjang belanja user "+namaToko+" memiliki "+entry.getValue().size()+" barang: ");
                for (Barang keranjang : entry.getValue()) {
                    System.out.println("");
                    keranjang.tampilkanBarang(); 
                }
            }
        }
    }
    public void tampilkanStokBerdasarkanHarga() {
        for(Map.Entry<String, ArrayList<Barang>> entry: StokToko.entrySet()) {
            if (namaToko.equals(entry.getKey())) {
                System.out.println("Keranjang belanja user "+namaToko+" memiliki "+entry.getValue().size()+" barang: ");
                ArrayList<Barang> listBarang = entry.getValue();
                Collections.sort(listBarang);
                for (Barang keranjang : listBarang) {
                    System.out.println("");
                    keranjang.tampilkanBarang(); 
                }
            }
        }
    }
    public void tampilkanToko() {
        System.out.println("Toko : "+namaToko);
        System.out.println("Toko ini dimiliki oleh "+namaPemilik);
    }
}
