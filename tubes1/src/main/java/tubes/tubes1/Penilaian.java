/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;

/**
 *
 * @author LENOVO
 */
public class Penilaian implements Comparable<Penilaian>{
    protected int nilai;
    private String review;
    public int getNilai() {
        return nilai;
    }
    public String getReview() {
        return review;
    }
    public Penilaian(int nilai, String review) {
        this.nilai = nilai;
        this.review = review;
    }
    public void tampilkanPenilaian() {
        System.out.println(nilai);
        System.out.println(review);
    }
    @Override
    public int compareTo(Penilaian obj) {
        return (int) (this.nilai - obj.nilai);
    }
}
