package model;

/**
 *
 * @author flavio022
 */
public class Pizza extends Item {
    private String sabor;

    public Pizza() {
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Pizza{" + "sabor=" + sabor + '}';
    }
    
}
