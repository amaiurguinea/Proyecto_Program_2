package LN;

/**
 * Datos generales de la empresa
 */

public class clsEmpresa {
    private String nombreE;
    private String direccion;
    private int cpostal;

    public clsEmpresa(String nombre, String direccion, int cpostal) {
        this.nombreE = nombre;
        this.direccion = direccion;
        this.cpostal = cpostal;
    }

    public String getNombre() {
        return nombreE;
    }

    public void setNombre(String nombre) {
        this.nombreE = nombre;
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
