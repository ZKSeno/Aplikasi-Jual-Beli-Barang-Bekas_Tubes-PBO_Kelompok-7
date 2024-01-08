/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tubes.tubes1;
import java.util.*;
import java.util.Map.*;

/**
 *
 * @author LENOVO
 */
public class Tubes1 {
    public static void main(String[] args) throws LoginFailedException {
        /*
        Pembeli pembeli;
        StaffToko staff;
        Barang barang1 = new Barang("Sapu", 1, 3000.0, "baik");
        Barang barang2 = new Barang("Pel", 2, 4000.0, "baik");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Apakah Anda Pembeli atau Penjual?");
            String tipe = scanner.nextLine();
            if (tipe.equals("Pembeli")) {
                pembeli = new Pembeli();
                do {
                    do {
                    System.out.print("Masukkan username baru: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password baru: ");
                    String password = scanner.nextLine();
                    System.out.print("Masukkan email Anda: ");
                    String email = scanner.nextLine();
                    System.out.println("");
                    pembeli.setUserPembeli(username, password, email);
                    for (Entry<Integer, String> entry : pembeli.listUser.entrySet()) {
                        System.out.println(entry);
                    }
                    for (Entry<Integer, String> entry : pembeli.getListPassword().entrySet()) {
                        System.out.println(entry);
                    }
                        
                        
                    System.out.println("Apakah Anda ingin menambahkan pembeli baru? (Ya/Tidak)");
                    
                    String pilihan = scanner.nextLine();
                    
                    if (pilihan.equals("Ya")) {
                        
                        continue;
                    } else if (pilihan.equals("Tidak")) {
                        do {
                        System.out.println("Login ke Akun Anda:");
                        System.out.print("Masukkan username: ");
                        String username2 = scanner.nextLine();
                        System.out.print("Masukkan password: ");
                        String password2 = scanner.nextLine();
                        System.out.println("");
                        try {
                            pembeli.login(username2, password2);
                            pembeli.tampilkanProfil();
                            break;
                            
                        } catch (LoginFailedException l) {
                            System.out.println(l.getMessage());
                            System.out.println("");
                        } 
                        } while (true);
                        break;
                    } else {
                        System.out.println("Pilihan Anda tidak valid.");
                    }
                    } while (true);
                    break;
                } while (true); 
                barang1.tampilkanBarang();
                barang2.tampilkanBarang();
                System.out.println("");
                System.out.println( pembeli.isLoggedIn);
                System.out.println(pembeli.usernamePem);
                keranjangBelanja keranjang1;
                if (pembeli.isLoggedIn == false) {
                    System.out.println("Anda belum login!");
                } else {
                    keranjang1 = new keranjangBelanja(pembeli.usernamePem);
                    keranjang1.setListBarang();
                    keranjang1.tambahItem(barang2);
                    keranjang1.tambahItem(barang1);
                    keranjang1.tampilkankeranjangBelanja();
                }
                pembeli.logout();
                pembeli.tampilkanProfil();
                break;
            } else if (tipe.equals("Penjual")) {
                staff = new StaffToko();
                do {
                    do {
                    System.out.println("Apakah anda Manajer atau Pegawai?");
                    String status = scanner.nextLine();
                    System.out.print("Masukkan username baru: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password baru: ");
                    String password = scanner.nextLine();
                    System.out.print("Masukkan email Anda: ");
                    String email = scanner.nextLine();
                    System.out.println("");
                    staff.setUserStaff(username, password, email, status);
                    for (Entry<Integer, String> entry : staff.listUser.entrySet()) {
                        System.out.println("ID: "+entry.getKey()+", User: "+entry.getValue());
                    }
                    for (Entry<Integer, String> entry : staff.getListPassword().entrySet()) {
                        System.out.println("ID: "+entry.getKey()+", Pw: "+entry.getValue());
                    }
                    for (Entry<Integer, String> entry : staff.listStatusStaff.entrySet()) {
                        System.out.println("ID: "+entry.getKey()+", Jabatan: "+entry.getValue());
                    }
                        
                        
                    System.out.println("Apakah Anda ingin menambahkan staff baru? (Ya/Tidak)");
                    
                    String pilihan = scanner.nextLine();
                    
                    if (pilihan.equals("Ya")) {
                        
                        continue;
                    } else if (pilihan.equals("Tidak")) {
                        do {
                        System.out.println("Login ke Akun Anda:");
                        System.out.print("Masukkan username: ");
                        String username2 = scanner.nextLine();
                        System.out.print("Masukkan password: ");
                        String password2 = scanner.nextLine();
                        System.out.println("");
                        try {
                            staff.login(username2, password2);
                            staff.tampilkanProfil();
                            break;
                            
                        } catch (LoginFailedException l) {
                            System.out.println(l.getMessage());
                            System.out.println("");
                        } 
                        } while (true);
                        break;
                    } else {
                        System.out.println("Pilihan Anda tidak valid.");
                    }
                    } while (true);
                    
                
              
                    break;
                } while (true); 
                break;
            }
        } while (true);
        */
        
        
        TubesController app1 = new TubesController();
        app1.showDefaultView();
   
        
             
        
        
        
    }
}
