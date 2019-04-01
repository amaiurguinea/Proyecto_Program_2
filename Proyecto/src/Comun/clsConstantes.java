package Comun;

public class clsConstantes {

	public enum enFicDatos {

		FICH_PEDIDOS("Pedidos.dat");
		
		//atributo
		private String IdCodigo;
		
		private enFicDatos( String IdCodigo )
		{
			this.IdCodigo = IdCodigo;
		}
		
		public String getIdCodigo()
		{
			return IdCodigo;
		}		
	}
	
	
	public static final String TIPO= "Tipo";
    public static final String TAMAÑO = "Tamaño";
    public static final String PRECIO=  "Precio";
    public static final String TIPO1= "Tipo1";
    public static final String TAMAÑO1 = "Tamaño1";
    public static final String PRECIO1=  "Precio1";
    public static final String TIPO2 = "Tipo2";
    public static final String PRECIO2 = "Precio2";
    public static final String NOMBRE ="Nombre";
    public static final String DNI = "DNI";
    public static final String NOMBREE = "NombreE";
    public static final String DIRECCION = "Direccion";
    public static final String CPOSTAL = "Cpostal";
    public static final String PRECIOTOTAL = "Preciototal";
    public static final String IMPORTE = " Importe";
    public static final String CAMBIO = "Cambio";
    public static final String PRECIOPEDIDO = "PrecioPedido";
    public static final String IDCODIGO = "IDCodigo";
    public static final String NºTARJETA = "nºTarjeta";
    public static final String PIN =  "pin";
    
    
	
}

	

