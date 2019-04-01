package LN;

public class clsPatatas extends clsPedido {
    private String tipo2;
    private double precio2;


    public clsPatatas(String nombre, String DNI, int IDcodigo , String tipo, double precio) {
    	super(IDcodigo, DNI, nombre);
        this.tipo2 = tipo;
        this.precio2 = precio;
    }

    public String getTipo() {
        return tipo2;
    }

    public void setTipo(String tipo) {
        this.tipo2 = tipo;
    }

    public double getPrecio() {
        return precio2;
    }

    public void setPrecio(double precio) {
        this.precio2 = precio;
    }
}
