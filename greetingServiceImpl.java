/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.greetingclient;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class greetingServiceImpl extends UnicastRemoteObject implements greetingService{
    
    protected greetingServiceImpl() throws RemoteException {
        super();
    }
     public String greet(String name) throws RemoteException {
        return "Hii, " + name + "! WELCOME.";
    }
     
     public int counter(String sentence) throws RemoteException {
           if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }
    
}
