package LN;

import LP.clsMenu;

public class clsFactura extends clsPedido {
    public clsFactura(String nombre, String DNI, int IDcodigo) {
        super(IDcodigo, DNI, nombre);
    }

    private double precioTotal;

    public clsFactura(String nombre, String DNI, int IDcodigo, double precioTotal) {
        super(IDcodigo, DNI, nombre);
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
