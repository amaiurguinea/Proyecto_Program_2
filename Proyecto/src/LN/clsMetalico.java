package LN;

/**
 * Se le pediria al usuario introducir el importe con el pagar la factura y se haria una
 * operacion para realizarle el cambio
 */

public class clsMetalico extends clsFactura {

    private double importe;
    private double cambio;

    public clsMetalico(String nombre, String DNI, int IDcodigo, double importe, double cambio) {
        super(nombre, DNI, IDcodigo);
        this.importe = importe;
        this.cambio = cambio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
}
