package LN;

public class clsComida extends clsPedido{

    private String tipo;
    private String tamaño;
    private double precio;

    public clsComida(String tipo, String tamaño, double precio, int IDcodigo) {
        super(tamaño, tamaño, IDcodigo);

        this.tipo = tipo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
