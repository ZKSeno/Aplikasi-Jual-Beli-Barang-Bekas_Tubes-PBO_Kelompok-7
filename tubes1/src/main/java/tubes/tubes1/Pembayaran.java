/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO
 */
public class Pembayaran  {
    private String metodePembayaran;
    private LocalDateTime tanggalPembayaran;
    private String alamatPengiriman;
    private boolean status = false;
    public void tambahPembayaran(String metode, String alamat) {
        this.metodePembayaran = metode;
        this.alamatPengiriman = alamat;
        tanggalPembayaran = LocalDateTime.now();
        System.out.println("Anda akan melakukan pembayaran, detail sebagai berikut: ");
        System.out.println("Metode pembayaran: "+metodePembayaran);
        System.out.println("Tanggal pembayaran: "+tanggalPembayaran);
        System.out.println("Alamat: "+alamatPengiriman);
        this.status = true;
    }
    public void cekStatusPembayaran() {
        if (status == false) {
            System.out.println("Belum bayar!");
        } else {
            System.out.println("Sudah bayar!");
        }
    }
}
