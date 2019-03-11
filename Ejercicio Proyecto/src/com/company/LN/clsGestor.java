package com.company.LN;

public class clsGestor {

    public clsFactura crearFactura(double precioTotal) {
        clsFactura retorno;
        retorno = new clsFactura();
        retorno.setPrecioTotal(precioTotal);
        return retorno;

    }
}
