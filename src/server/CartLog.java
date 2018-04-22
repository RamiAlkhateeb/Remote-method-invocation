/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import shared.Cart;

/**
 *
 * @author rami
 */
public class CartLog extends UnicastRemoteObject implements Cart{

    ArrayList<Item> items = new ArrayList<>();
    int cartId;
    
    public CartLog() throws RemoteException{} 

    @Override
    public void addItem(String name, String category, double price, int qnt) throws RemoteException {
        Item item = new Item(name, category, price, qnt);
        items.add(item);
    }

    @Override
    public void deleteItem(String name, String category, double price, int qnt) throws RemoteException {
    }

    @Override
    public void caculateTotal() throws RemoteException {
    }

    @Override
    public void getCart(int cartid) throws RemoteException {
        
    }

    

}
