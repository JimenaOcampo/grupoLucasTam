package alumno.edu.pb2.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AeropuertoTest {
	
	
	
	@Test
	public void queSePuedaCrearUnAeropuerto() {
		//ATRIBUTOS
		String nombreDelAeropuerto="Bariloche";
		Long id=1L;
	    String codigo ="BRC";
	    String direccion = "xxxxx 123 ";
	    	
		
		//EJECUCION
		Aeropuerto brc =new Aeropuerto(id,nombreDelAeropuerto,codigo,direccion);		
						
		//VALIDACION
		//validamos el objeto brc, para verificar q no este vacio
		assertNotNull(brc);
	}
	
	
}

