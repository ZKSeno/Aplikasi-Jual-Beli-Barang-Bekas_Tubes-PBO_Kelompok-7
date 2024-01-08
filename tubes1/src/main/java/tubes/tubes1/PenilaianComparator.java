/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class PenilaianComparator implements Comparator<Penilaian> {
    @Override
    public int compare(Penilaian o1, Penilaian o2) {
        return (int) (o1.nilai - o2.nilai);
    }
}
