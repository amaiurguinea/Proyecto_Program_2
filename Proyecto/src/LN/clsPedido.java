package LN;

import Comun.ItfProperty;

public class clsPedido extends clsCliente implements ItfProperty{

    private int IDcodigo;

    public clsPedido(int iDcodigo, String nombre, String DNI) {
        super( nombre, DNI);
        this.IDcodigo = IDcodigo;
    }

    public int getIDcodigo() {
        return IDcodigo;
    }

    public void setIDcodigo(int IDcodigo) {
        this.IDcodigo = IDcodigo;
    }

	public void setPrecioTotal(double precioTotal) {
		// TODO Auto-generated method stub
		
	}

	public String getObjectProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setObjectProperty(String propiedad, Object valor) {
		// TODO Auto-generated method stub
		
	}
}


