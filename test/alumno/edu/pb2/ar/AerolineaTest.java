package alumno.edu.pb2.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaTest {

	@Test
	public void queSePuedaCrearUnaAerolinea() {
		//ATRIBUTOS
		String nombreAerolinea="AeroJaim";
		
		//EJECUCION
		Aerolinea fb =new Aerolinea(nombreAerolinea);		
						
		//VALIDACION
		//validamos el objeto brc, para verificar q no este vacio
		assertNotNull(fb);
	}
	@Test
	public void queSePuedaRegistrarUnAeropuertoEnUnaAerolinea() {
		//ATRIBUTOS
		
		String nombreAerolinea="AeroJaim";
		
		
		
		String nombreDelAeropuerto="Bariloche";
		Long id=1L;
	    String codigo ="BRC";
	    String direccion = "xxxxx 123 ";
	    	
		
		//EJECUCION
		Aerolinea fb= new Aerolinea(nombreAerolinea);
		Aeropuerto brc =new Aeropuerto(id,nombreDelAeropuerto,codigo,direccion);
		Boolean exitoso =fb.registrarAeropuerto(brc);
		
		
		//VALIDACION
		  assertTrue(exitoso);
		  Integer cantidadDeAeropuertosEsperados=1;
		  //(defino "1" solo porque es este caso necesito uno)
		  Integer cantidadDeAeropuertosObtenidos= fb.obtenerCantidadDeAeropuertos();
		  assertEquals(cantidadDeAeropuertosEsperados,cantidadDeAeropuertosObtenidos);	
	}
	
	//la aerolinea es la q busca el aeropuerto---------------------------------------------
	public void queSepuedaBuscarUnAeropuertoPorCodigo() {
		//ATRIBUTOS
		String nombreDelAeropuerto="Bariloche";
		Long id=1L;
	    String codigo ="BRC";
	    String direccion = "xxxxx 123 ";
	    String nombreAerolinea = "AeroJaim";
		
		//EJECUCION
	    //objetos
		Aeropuerto aeropuerto = new Aeropuerto(id, nombreDelAeropuerto, codigo, direccion);
		Aerolinea AeroJaim = new Aerolinea(nombreAerolinea);
		AeroJaim.registrarAeropuerto(aeropuerto);
		//metodos
		Aeropuerto aeropuertoBuscado= AeroJaim.buscarAeropuertoPorCodigo(codigo);
		
				
		//VALIDACION
		assertEquals(codigo,aeropuertoBuscado.getCodigo());
	}

	@Test
	public void queSepuedaBuscarUnAeropuertoPorNombre() {
		//ATRIBUTOS
		String nombreDelAeropuerto="Bariloche";
		Long id=1L;
		String codigo="BRC";
		String direccion="xxxxx 123";
		String nombreAerolinea="AeroJaim";
			
		//EJECUCION
		//objetos
		Aeropuerto aeropuerto = new Aeropuerto(id, nombreDelAeropuerto, codigo, direccion);
		Aerolinea AeroJaim = new Aerolinea(nombreAerolinea);
		//los uno
		AeroJaim.registrarAeropuerto(aeropuerto);	
		//metodo:
		Aeropuerto busquedaPorNombre=AeroJaim.buscarAeropuertoPorNombre(nombreDelAeropuerto);
		//VALIDACION
		assertEquals(nombreDelAeropuerto,busquedaPorNombre.getNombre());

	}
	
	@Test
	public void queSepuedaCambiarLaDireccionDeUnAeropuerto() {
	
		//ATRIBUTOS
				Long id = 1L;
				String nombreDelAeropuerto="Bariloche";
				String codigo = "BRC";
				String direccion = "xxx123";
				String nuevaDierccion= "xxx125";
				String nombreAerolinea="AeroJaim";
			
			

				// EJECUCION
				//creo objetos
				Aeropuerto aeropuerto = new Aeropuerto(id, nombreDelAeropuerto, codigo, direccion);
				Aerolinea AeroJaim = new Aerolinea(nombreAerolinea);
				AeroJaim.registrarAeropuerto(aeropuerto);
				//metodos
				Boolean sePudoCAmbiarDire= AeroJaim.cambiarDireAeropuerto(nuevaDierccion,direccion);
			
				//VALIDACION
				
				assertTrue(sePudoCAmbiarDire);
	}	

	

}
