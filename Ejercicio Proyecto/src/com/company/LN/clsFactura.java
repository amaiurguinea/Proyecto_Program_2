package com.company.LN;

import com.company.LP.clsMenu;

public class clsFactura extends clsPedido {
    public clsFactura(String nombre, String DNI, int IDcodigo) {
        super(nombre, DNI, IDcodigo);
    }

    private double precioTotal;

    public clsFactura(String nombre, String DNI, int IDcodigo, double precioTotal) {
        super(nombre, DNI, IDcodigo);
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
