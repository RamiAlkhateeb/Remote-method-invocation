/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import shared.Cart;

/**
 *
 * @author rami
 */
public class Des {
    
    public static void main(String [] atfd) throws RemoteException , NotBoundException
    {
        Registry registry=LocateRegistry.getRegistry("localhost",1099);
        Cart c = (Cart) registry.lookup("rmi://localhost/store");
        
        c.init();
        System.out.println(c.viewstore());
    }
    
}
