/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.greetingclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RPCc {
    public static void main(String[] args) {
         try {
          
            LocateRegistry.createRegistry(1099); // port 1099
            greetingService service = new greetingServiceImpl();

            Naming.rebind("rmi://localhost:1099/greetingService", service);
            System.out.println("Server started. /n greetingService is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
