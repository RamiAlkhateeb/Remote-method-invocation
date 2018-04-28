/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;
import server.Category;

/**
 *
 * @author rami
 */
public interface Cart extends Remote {

    public void addItem(String name, Category category, double price, int qnt) throws RemoteException;

    public void deleteItem(String name, Category category, double price, int qnt) throws RemoteException;

    public void caculateTotal() throws RemoteException;
    
    public void getCart (int cartid) throws RemoteException;
    
    public String viewstore() throws RemoteException;
    
    public void init() throws RemoteException;
}
