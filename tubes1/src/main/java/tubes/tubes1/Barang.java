/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
public class Barang implements Comparable<Barang>{
    private String namaBarang;
    private int kuantitas;
    private double harga;
    private String kondisi;
    private int total;

    public String getNamaBarang() {
        return namaBarang;
    }
    public int getKuantitas() {
        return kuantitas;
    }
    public int getTotal() {
        return total;
    }
    public String getKondisi() {
        return kondisi;
    }
    public int setKuantitas(int kuantitas) {
        this.kuantitas -= kuantitas;
        return kuantitas;
    }
    
    public Barang(String namabarang, int kuantitas, double harga, String kondisi) {
        this.namaBarang = namabarang;
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.total = (int)getHarga()*kuantitas;
        this.kondisi = kondisi;
    }
    public double getHarga() {
        return harga;
    }
    public void tampilkanBarang() {
        System.out.println("Nama barang : "+getNamaBarang());
        System.out.println("Kuantitas barang : "+getKuantitas());
        System.out.println("Total : Rp. "+total+" (1 pcs: Rp."+(int)harga+")");
        System.out.println("Kondisi : "+getKondisi());
    }
    public String tampilkanBarangGUI() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nama barang : " + namaBarang);
        builder.append("\n");
        builder.append("Kuantitas barang : "+kuantitas);
        builder.append("\n");
        builder.append("Total : Rp. "+total+" (1 pcs: Rp."+(int)harga+")");
        builder.append("\n");
        builder.append("Kondisi : "+kondisi);
        builder.append("\n");
        return builder.toString();
    }
    @Override
    public int compareTo(Barang obj) {
        return (int) (this.harga - obj.harga);
    }
}
