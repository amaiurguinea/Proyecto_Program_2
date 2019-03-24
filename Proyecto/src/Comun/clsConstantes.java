package Comun;

public class clsConstantes {

	public enum enFicDatos {

		FICH_PEDIDOS("pedidos.dat");
		
		//atributo
		private int IdCodigo;
		
		private enFicDatos( int IdCodigo )
		{
			this.IdCodigo = IdCodigo;
		}
		
		public int getIdCodigo()
		{
			return IdCodigo;
		}		
	}
	
	
	public static final String TIPO= "Tipo";
    public static final String  TAMAÑO = "Tamaño";
    public static final double PRECIO=  "Precio";
    public static final String TIPO1= "Tipo1";
    public static final String TAMAÑO1 = "Tamaño1";
    public static final double PRECIO1=  "Precio1";
    public static final String TIPO2 = "Tipo2";
    public static final double PRECIO2 = "Precio2";
    public static final String NOMBRE ="Nombre";
    public static final String DNI = "DNI";
    public static final  String NOMBREE = "NombreE";
    public static final String DIRECCION = "Direccion";
    public static final int CPOSTAL = "Cpostal";
    public static final double PRECIOTOTAL = "Preciototal";
    public static final double IMPORTE = " Importe";
    public static final double CAMBIO = "Cambio";
    public static final double PRECIOPEDIDO = "PrecioPedido";
    public static final int IDCODIGO = "IDCodigo";
    public static final int NºTARJETA = "nºTarjeta";
    public static final int PIN =  "pin";
    
    
	
		
	
}
