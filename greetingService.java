/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.greetingclient;

    import java.rmi.Remote;
import java.rmi.RemoteException;

public interface greetingService extends Remote {

    String greet(String name) throws RemoteException;

    int counter(String s) throws RemoteException;
}
    

