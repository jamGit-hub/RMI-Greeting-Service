/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.greetingclient;


import java.rmi.Naming;
public class Client {

    public static void main(String[] args) {
        try {
            greetingService service = (greetingService) Naming.lookup("rmi://localhost:1099/greetingService");

            String greeting = service.greet("Ghala");
            System.out.println("Server Response: " + greeting);

            int count = service.counter("This is a test sentence for RMI example");
            System.out.println("Word Count: " + count);

        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
        
       
