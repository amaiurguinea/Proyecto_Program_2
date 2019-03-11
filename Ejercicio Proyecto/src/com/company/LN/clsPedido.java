package com.company.LN;

public class clsPedido extends clsCliente {

    private int IDcodigo;

    public clsPedido(String nombre, String DNI, int IDcodigo) {
        super(nombre, DNI);
        this.IDcodigo = IDcodigo;
    }

    public int getIDcodigo() {
        return IDcodigo;
    }

    public void setIDcodigo(int IDcodigo) {
        this.IDcodigo = IDcodigo;
    }
}


