package LD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import LN.clsPedido;
 
public class PedidoBD 
{	
	
  public static List<clsPedido> cargarListaPedidos()
  {
    ArrayList<clsPedido> vectorBD = new ArrayList<>();
    
    try
    {
      // Todos los accesos a bases de datos deben ir entre try/catch
      // Establecemos una conexi�n con nuestra base de datos
      GestorBD.getInstance().connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement stmt = GestorBD.getInstance().createStatement();
       
      //hay una tabla coches en la BD
      ResultSet rs = stmt.executeQuery("SELECT * FROM Coches");
       
      // Tratamos los resultado obtenidos en la consulta SQL
      while(rs.next())
      {
    	  
        clsPedido nuevoPedido = new clsPedido(rs.getInt("IdCodigo"),
                                        rs.getString("nombre"),
                                        rs.getString("DNI"));                                        
        vectorBD.add(nuevoPedido);
      }  
       
    }
    catch(SQLException se)
    {
         
        se.printStackTrace();
    }
    
    return vectorBD;
  }
   
  
  
  public static clsPedido buscarPedido(int IdCodigo ) 
  {
	try {
		GestorBD.getInstance().connect();

		Statement sentencia = GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = sentencia.executeQuery("SELECT * FROM Pedidos where IdCosigo = '" + IdCodigo + "'");

		String nombre = rs.getString("nombre");
		String dni = rs.getString("dni");

		clsPedido c = new clsPedido(IdCodigo , dni, nombre);

		return c;
	} catch (SQLException se) {
		se.printStackTrace();

		return null;
	} 
  }  
  
  public static boolean existePedido(int IdCodigo )
  {
    try
    {
       GestorBD.getInstance().connect();
         
      // Creamos y ejecutamos una sentencia SQL
      Statement sentencia = 
      GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
            
      ResultSet rs = sentencia.executeQuery("SELECT * FROM Pedidos where IdCodigo = '" + IdCodigo +"'" );
       
      System.out.println("SELECT * FROM Pedidos where IdCodigo = '" + IdCodigo +"'");
      
      if ( rs.first() == false )
      {
    	  return false;
      }
      else
      {
    	  return true;
      }
       
    }
    catch (SQLException se)
    {
        se.printStackTrace();
        
        return false;
    }    
  }
 
  public static void insertarPedido( int IdCodigo , String nombre, String DNI )
  {     
    try
    {
      GestorBD.getInstance().connect();
       
      Statement sentencia =  GestorBD.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,             
                                           ResultSet.CONCUR_UPDATABLE);
 
      boolean r = existePedido( IdCodigo );
       
      if(r == false)
      {         
    	 String query ="insert into Pedido values('"+ IdCodigo + "'" +
                ",'"+ nombre+"',"+ DNI +")";
             
         sentencia.executeUpdate(query);
      }
      else
      {
          System.out.println("Pedido Existente!");
      }
       
      GestorBD.getInstance().disconnect();
     
    }
    catch(SQLException se)
    {
        se.printStackTrace();
    }
 }



public static List<clsPedido> cargarListaclsPedido() {
	// TODO Auto-generated method stub
	return null;
}

}
