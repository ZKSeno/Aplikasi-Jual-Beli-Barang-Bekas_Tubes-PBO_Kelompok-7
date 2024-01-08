/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tubes.tubes1;

/**
 *
 * @author LENOVO
 */
public interface Loginable {
    public abstract void login(String usr, String pwd) throws LoginFailedException;
    public abstract void logout();
}

