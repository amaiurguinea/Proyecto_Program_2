package LN;

public class clsMetodoPago {

    private double precioPedido;
    private double cambio;


    public clsMetodoPago(double precio, double cambio) {
        this.precioPedido = precio;
        this.cambio = cambio;
    }

    public double getPrecio() {
        return precioPedido;
    }

    public void setPrecio(double precio) {
        this.precioPedido = precio;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
}
