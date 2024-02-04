/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notification;

/**
 *
 * @author Tedii
 */
    public class pushNotification implements interfaceNotifikasi{
    
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim push notif ke : " + receiver + "dengan isi :");
        System.out.println(content);
}
    }
