package LN;

/**
 * El usuario teclaria un N� de tarjeta y posteriormente se e pediria introducir un PIN
 */




public class clsTarjeta extends clsFactura {

    private int n�Tarjeta;
    private int pin;
    private final int cambio = 0;

    public clsTarjeta(String nombre, String DNI, int IDcodigo, int pin) {
        super(nombre, DNI, IDcodigo);
        this.n�Tarjeta = n�Tarjeta;
        this.pin = pin;
    }

    public int getN�Tarjeta() {
        return n�Tarjeta;
    }

    public void setNºTarjeta(int n�Tarjeta) {
        this.n�Tarjeta = n�Tarjeta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCambio() {
        return cambio;
    }
}
