package model;

/**
 *
 * @author flavio022
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
