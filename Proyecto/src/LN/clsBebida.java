package LN;

public class clsBebida extends clsPedido {
    private String tipo1;
    private String tama�o1;
    private double precio1;

    public clsBebida(String nombre, String DNI, int IDcodigo , String tipo1, String tama�o1, double precio1) {
        super( IDcodigo, nombre, DNI  );
        this.tipo1 = tipo1;
        this.tama�o1 = tama�o1;
        this.precio1 = precio1;
    }


    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTama�o1() {
        return tama�o1;
    }

    public void setTama�o1(String tama�o1) {
        this.tama�o1 = tama�o1;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }
}
