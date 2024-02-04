/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notification;

/**
 *
 * @author Tedii
 */
public class Main {
    public static void main(String[] args) {
        String emailPenerima = "hengker@pro.com";
        String nomerHP = "198364983";
        String mobileID = "android-245262";
        
        emailNotification emailNotif = new emailNotification();
        smsNotification smsNotif = new smsNotification();
        pushNotification pushNotif = new pushNotification();
        
        String message = "Let's Green and Bring the World to Life";
        
        emailNotif.sendMessage(emailPenerima,message);
        smsNotif.sendMessage (nomerHP,message);
        pushNotif.sendMessage (mobileID,message);
                
    }
}
    