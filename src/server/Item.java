/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author rami
 */
public class Item {
    String name;
    String category;
    double price;
    int qnt;
    
    public Item(String name, String category, double price, int qnt) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.qnt = qnt;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    
    
    
}
