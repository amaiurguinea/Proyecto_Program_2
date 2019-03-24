package LN;

public class clsComida extends clsPedido{

    private String tipo;
    private String tama�o;
    private double precio;

    public clsComida(String tipo, String tama�o, double precio, int IDcodigo) {
        super(tama�o, tama�o, IDcodigo);

        this.tipo = tipo;
        this.tama�o = tama�o;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTama�o() {
        return tama�o;
    }

    public void setTama�o(String tama�o) {
        this.tama�o = tama�o;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
