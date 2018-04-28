/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import shared.Cart;

/**
 *
 * @author rami
 */
public class CartLog extends UnicastRemoteObject implements Cart{

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Category> categorys = new ArrayList<>();
    int cartId;
    
    public CartLog() throws RemoteException{} 

    @Override
    public void addItem(String name, Category category, double price, int qnt) throws RemoteException {
        Item item = new Item(name, category, price, qnt);
        items.add(item);
        
    }

    @Override
    public void deleteItem(String name, Category category, double price, int qnt) throws RemoteException {
    }

    @Override
    public void caculateTotal() throws RemoteException {
    }

    @Override
    public void getCart(int cartid) throws RemoteException {
        
    }
    
    @Override
    public void init()
    {
        categorys.add(new Category("Samsung"));
        categorys.add(new Category("Apple"));
        categorys.add(new Category("Htc"));
        categorys.add(new Category("Sony"));
        categorys.add(new Category("Huawei"));
        
        
        items.add(new Item("j5",categorys.get(0),65000,6));
        items.add(new Item("Z2",categorys.get(3),90000,5));
        
    }
    
    @Override
    public String viewstore()
    {
        
        return categorys.get(0).getName() + " "+ items.get(0).getName();
    }
    
    public static void main(String []args) throws RemoteException
    {
        
        Registry registry= LocateRegistry.createRegistry(1099);
        registry.rebind("rmi://localhost/store", new CartLog());
    }
    

}
