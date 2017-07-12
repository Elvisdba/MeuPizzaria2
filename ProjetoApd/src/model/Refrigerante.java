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
public class Refrigerante extends Item {
    private String marca;

    public Refrigerante() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Refrigerante{" + "marca=" + marca + '}';
    }
    
}
