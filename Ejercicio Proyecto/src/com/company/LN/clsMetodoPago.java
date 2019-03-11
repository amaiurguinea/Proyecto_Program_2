package com.company.LN;

public class clsMetodoPago {

    private double precio;
    private double cambio;


    public clsMetodoPago(double precio, double cambio) {
        this.precio = precio;
        this.cambio = cambio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
}
