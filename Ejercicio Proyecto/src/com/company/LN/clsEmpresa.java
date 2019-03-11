package com.company.LN;

/**
 * Datos generales de la empresa
 */

public class clsEmpresa {
    private String nombre;
    private String direccion;
    private int cpostal;

    public clsEmpresa(String nombre, String direccion, int cpostal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cpostal = cpostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCpostal() {
        return cpostal;
    }

    public void setCpostal(int cpostal) {
        this.cpostal = cpostal;
    }
}
