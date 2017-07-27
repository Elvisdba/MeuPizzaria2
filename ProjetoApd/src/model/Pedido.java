package model;

/**
 *
 * @author flavi
 */
public class Pedido {
    private String data;
    private String id;
    private boolean status;
    private double valorTotal;
    private Item itens[];
    public Pedido(){
     
    }

    public String getData() {
        return data;
    }

    public String getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String toString() {
        return "Pedido{" + "data=" + data + ", id=" + id + ", status=" + status + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
