package LN;

public class clsBebida extends clsPedido {
    private String tipo1;
    private String tamaño1;
    private double precio1;

    public clsBebida(String nombre, String DNI, int IDcodigo , String tipo1, String tamaño1, double precio1) {
        super( IDcodigo, nombre, DNI  );
        this.tipo1 = tipo1;
        this.tamaño1 = tamaño1;
        this.precio1 = precio1;
    }


    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTamaño1() {
        return tamaño1;
    }

    public void setTamaño1(String tamaño1) {
        this.tamaño1 = tamaño1;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }
}
