package model;

/**
 *
 * @author flavio022
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
