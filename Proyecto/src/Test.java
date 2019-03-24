import java.sql.SQLException;

import LD.GestorBD;
/**
 * Clase con la que podemos comprobar si se se conecta a la Base de Datos
 * @author Industria 4.0
 *
 */

public class Test {

	
	public static void main( String args[] )
	{
		try {
			GestorBD.getInstance().connect();
			
			GestorBD.getInstance().disconnect();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
