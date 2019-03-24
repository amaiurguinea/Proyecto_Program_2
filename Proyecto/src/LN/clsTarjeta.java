package LN;

/**
 * El usuario teclaria un Nº de tarjeta y posteriormente se e pediria introducir un PIN
 */




public class clsTarjeta extends clsFactura {

    private int nºTarjeta;
    private int pin;
    private final int cambio = 0;

    public clsTarjeta(String nombre, String DNI, int IDcodigo, int pin) {
        super(nombre, DNI, IDcodigo);
        this.nºTarjeta = nºTarjeta;
        this.pin = pin;
    }

    public int getNºTarjeta() {
        return nºTarjeta;
    }

    public void setNÂºTarjeta(int nºTarjeta) {
        this.nºTarjeta = nºTarjeta;
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
