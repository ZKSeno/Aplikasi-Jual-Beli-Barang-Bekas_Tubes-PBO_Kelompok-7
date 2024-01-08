/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.util.*;
import java.util.Map.*;

/**
 *
 * @author LENOVO
 */
public class keranjangBelanja {
    private String usernameKeranjang;
    private int jumlahBarang;
    private boolean statusKer = false;
    private double totalHarga = 0;
    private ArrayList<Barang> arrBarang;
    private HashMap<String, ArrayList<Barang>> keranjangBelanjaUser;
    
    /* public keranjangBelanja(String username) {
        super(username);
        if (!listUser.get(idUser).equals(username)) {
            setStatusKer(false);
        } else {
            setStatusKer(true);
        }
    } */
    
    public keranjangBelanja(String username) {
        this.usernameKeranjang = username;
        this.statusKer = true;
    }
    public int getJumlahBarang() {
        return jumlahBarang;
    }
    public double getTotalHarga() {
        return totalHarga;
    }
    public String getUsernameKer() {
        return usernameKeranjang;
    }
    public void setListBarang() {
        this.arrBarang = new ArrayList<>();
        this.keranjangBelanjaUser = new HashMap<>();
        System.out.println(usernameKeranjang);
    }
    public void tambahItem(Barang barang, int kuantitas) {
      if (statusKer == true) {
        arrBarang.add(new Barang(barang.getNamaBarang(), barang.setKuantitas(kuantitas), barang.getHarga(), barang.getKondisi()));
        keranjangBelanjaUser.put(usernameKeranjang, arrBarang);
      } else {
        System.out.println("Anda tidak bisa menambahkan item!");
      }
    }
    public void hapusItem(String nama) {
        arrBarang.removeIf(barang
                -> barang.getNamaBarang().equals(nama));
    }
    public void tampilkankeranjangBelanja() {
        for(Entry<String, ArrayList<Barang>> entry: keranjangBelanjaUser.entrySet()) {
            if (usernameKeranjang.equals(entry.getKey())) {
                System.out.println("Keranjang belanja user "+usernameKeranjang+" memiliki "+entry.getValue().size()+" barang: ");
                for (Barang keranjang : entry.getValue()) {
                    System.out.println("");
                    keranjang.tampilkanBarang(); 
                }
                totalHarga = hitungTotalHarga();
                System.out.println("");
                System.out.println("Total Harga: Rp. "+totalHarga);
                System.out.println("");
            }
        }
    }
    public String tampilkankeranjangBelanjaGUI() {
    StringBuilder builder = new StringBuilder();
    for(Entry<String, ArrayList<Barang>> entry: keranjangBelanjaUser.entrySet()) {
      if (usernameKeranjang.equals(entry.getKey())) {
        jumlahBarang = entry.getValue().size();
        for (Barang keranjang : entry.getValue()) {
          builder.append("\n");
          builder.append(keranjang.tampilkanBarangGUI()); 
        }
        totalHarga = hitungTotalHarga();
      }
    }
    return builder.toString();
}
    public double hitungTotalHarga() {
        double totalharga = 0;
        for(Entry<String, ArrayList<Barang>> entry: keranjangBelanjaUser.entrySet()) {
            for (Barang keranjang : entry.getValue()) {
                totalharga += keranjang.getTotal();
            }
        }
        return totalharga;   
    }
    
}
