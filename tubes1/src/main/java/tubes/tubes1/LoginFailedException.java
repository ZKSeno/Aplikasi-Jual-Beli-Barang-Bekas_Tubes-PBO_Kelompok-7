/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tubes1;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class LoginFailedException extends Exception {
    private static HashMap<Integer, Integer> failedcount = new HashMap<>();
    private int userid;
    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userid = user;
        if (!failedcount.containsKey(userid)) {
            failedcount.put(userid, 1);
        } else {
            // Jika userid sudah ada di failedcount, increment nilainya
            failedcount.put(userid, failedcount.get(userid) + 1);
        }
    }
    public int getFailedCounter(int userid) {
        return failedcount.getOrDefault(userid, 0);
    }
    public int getUserId() {
        return userid;
    }
}
