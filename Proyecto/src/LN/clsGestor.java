package LN;

public class clsGestor {

    public clsPedido crearPedido(double precioTotal) {
        clsPedido retorno;
        retorno = new clsPedido(null, null, 0);
        retorno.setPrecioTotal(precioTotal);
        return retorno;

    }
}
