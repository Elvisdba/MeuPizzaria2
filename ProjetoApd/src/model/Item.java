/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author flavi
 */
public class Item {
    private int quantidade;
    private double precoUnid;
    

    public Item() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnid() {
        return precoUnid;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnid(double precoUnid) {
        this.precoUnid = precoUnid;
    }

    @Override
    public String toString() {
        return "Item{" + "quantidade=" + quantidade + ", precoUnid=" + precoUnid + '}';
    }
    
}
