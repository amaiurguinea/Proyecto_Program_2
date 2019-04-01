package LN;

import java.util.ArrayList;
import java.util.List;

import Comun.ItfProperty;
import LD.PedidoBD;

public class clsGestor {

    public clsPedido crearPedido(double precioTotal) {
        clsPedido retorno;
        retorno = new clsPedido(0, null, null);
        retorno.setPrecioTotal(precioTotal);
        return retorno;
        }
        
        
        private static clsGestor miGestor = new clsGestor();
    	
    	public static clsGestor obtGestor()
    	{
    		return miGestor;
    	}

    	private List<clsPedido> Pedidos;
    	
    	private clsGestor()
    	{
    		Pedidos = new ArrayList<clsPedido>();
    	}

    	public boolean addPedido( int IDcodigo, String nombre, String DNI )
    	{
    		
    		clsPedido c = new clsPedido(IDcodigo, nombre, DNI );
    		
    		if( Pedidos.contains( c ) )
    		{
    			return false;
    		}
    		else
    		{
    			Pedidos.add( c );
    			return true;
    		}
    	}
    		
    	public String consultarclsCliente( int IDcodigo  )
    	{
    		
    		ItfProperty datoABuscar = new clsPedido( IDcodigo , null , null );
    		
    		int p = Pedidos.indexOf( datoABuscar );
    		
    		if( p != -1 )
    		{
    			datoABuscar = Pedidos.get(p); //obtener el objeto del contenedor
    			
    			String prop = (String) datoABuscar.getObjectProperty(Comun.clsConstantes.NOMBRE);
    					
    			return prop;
    		}
    		else
    		{
    			return null;
    		}
    	}

    	public boolean borrarPedido( int IDcodigo )
    	{
    		clsPedido clsPedido = new clsPedido(IDcodigo, null, null);
    		
    		return Pedidos.remove( clsPedido );
    	}
    	
    	public List<clsPedido> recuperarCoches(){
    		
    		
    		List<clsPedido> temp = PedidoBD.cargarListaclsPedido();		
    		
    		for( clsPedido c : temp )
    		{
    			if( Pedidos.contains( c ) == false )
    			{
    				Pedidos.add( c );
    			}
    		}
    		
    		return Pedidos;
    	
    	}

    	public void guardarDatos() {
    		
    		for(clsPedido c : Pedidos )
    		{
    			int IDcodigo= Integer.parseInt( c.getObjectProperty(Comun.clsConstantes.IDCODIGO) );
    			String nombre = (String) c.getObjectProperty(Comun.clsConstantes.NOMBRE );
    			String DNI = (String) c.getObjectProperty(Comun.clsConstantes.DNI );
    			
    			PedidoBD.insertarPedido(IDcodigo, nombre , DNI);
    		}
    		
    	}
    		
    }