/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author LENOVO
 */
public class TubesHelper {
    public static String usernameHelp;
    public static String isiHelp;
    public static String isi2Help;
    public static String isi3Help;
    public static int idHelp;
    public static String id2help;
    /* public static HashMap<String, Boolean> secondMap = new HashMap<>();
    public static HashMap<String, Boolean> copyMapStatusKer(HashMap<Integer, String> original, String username, boolean status) {
      for(Entry<Integer, String> entry: original.entrySet()) {
      if(entry.getValue() == null ? username == null : entry.getValue().equals(username)) {
        usernameHelp = entry.getValue();
        break;
      }
    } 
    secondMap.put(usernameHelp, status);
    return secondMap;
    } */
    public static LoginHelper checkUser(HashMap<Integer, String> list, String cari){
        boolean isItemFound = false;
        boolean isFound = false;
        for (int i = 0; i < list.size(); i++) {
            for(Entry<Integer, String> entry: list.entrySet()){
                if(entry.getValue().equals(cari)){
                    isItemFound = true;
                    isiHelp = entry.getValue();
                    idHelp = entry.getKey();
                }
            }
        }
        if (list.get(idHelp).equals(cari) && isItemFound) {
            isFound = true;
        }
        return new LoginHelper(isFound, isiHelp, idHelp);
    }
    public static LoginHelper checkPassword(HashMap<Integer, String> list, String cari){
        boolean isFound = false;
        if (list.get(idHelp).equals(cari)) {
            isFound = true;
        }
        return new LoginHelper(isFound, isiHelp, idHelp);
    }
    public static LoginHelper checkEmail(HashMap<Integer, String> list, int id){
        boolean isFound = false;
        for (int i = 0; i < list.size(); i++) {
            for(Entry<Integer, String> entry: list.entrySet()){
                if(entry.getKey().equals(id)){
                    isiHelp = entry.getValue();
                }
            }
        }
        return new LoginHelper(isFound, isiHelp, idHelp);
    }
    public static LoginHelper checkStatusUser(HashMap<Integer, String> list, int id){
        boolean isFound = false;
        if (list.get(idHelp).equals(id)) {
            isFound = true;
        }
        for (int i = 0; i < list.size(); i++) {
            for(Entry<Integer, String> entry: list.entrySet()){
                if(entry.getKey().equals(id)){
                    isi2Help = entry.getValue();
                }
            }
        }
        return new LoginHelper(isFound, isi2Help, idHelp);
    }
    public static LoginHelper checkToko(HashMap<String, String> list, String namaToko){
        boolean isFound = false;
        for (int i = 0; i < list.size(); i++) {
            for(Entry<String, String> entry: list.entrySet()){
                if(entry.getKey().equals(namaToko)){
                    id2help = entry.getKey();
                    isi3Help = entry.getValue();
                }
            }
        }
        if (list.get(id2help).equals(namaToko)) {
            isFound = true;
        }
        return new LoginHelper(isFound,isi3Help, id2help);
    }
}

