package alumno.edu.pb2.ar;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class RutaTest {
    @Test	
    public void QueSePuedaCrearUnaRuta() {
	
           //ATRIBUTOS
			String aeropuertoOrigen = "BA"; // Aeropuerto aeropuertoDestino= aeropuerto;
			String aeropuertoDestino = "CDB";
			Double tiempoDeVuelo = 2.3;
			Integer id = 02;
			
			//EJECUCION
			Ruta ruta = new Ruta(aeropuertoDestino, aeropuertoOrigen, id, tiempoDeVuelo);
		   
					
			//VALIDACION
			assertNotNull(ruta);
}	
    @Test	
    public void queSePuedaRegistrarUnaRuta() {
	
           //ATRIBUTOS
    	
			String aeropuertoOrigen = "BA"; // Aeropuerto aeropuertoDestino= aeropuerto;
			String aeropuertoDestino = "CDB";
			Double tiempoDeVuelo = 2.3;
			Integer id = 02;
			Double nuevoTiempoDeVuelo=5.0;

	     	/*es un objeto de tiempo, inmutable, que 
		     * guarda la fecha como una etapa de Año-mes-día.
		     *  Es uno de los objetos que podemos proponer para cambiar
		     *  por Date o Calendar, debido a los métodos que posee.*/
		   LocalDate fechaDelVuelo= LocalDate.of(2023, 05, 10);
	        Integer numeroDeVuelo=01;
			
			//EJECUCION
			Ruta nuevaRuta = new Ruta(aeropuertoDestino, aeropuertoOrigen, id, tiempoDeVuelo);
			Vuelo vuelo01 = new Vuelo(nuevaRuta, numeroDeVuelo, fechaDelVuelo);
			Boolean ingresoExitoso= vuelo01.registrarRuta(nuevaRuta);
					
			//VALIDACION
			assertNotNull(nuevaRuta);
			assertTrue(ingresoExitoso);
}	



    @Test
    public void QueSePuedaCambiarElTiempoDeVueloDeUnaRuta() {

//ATRIBUTOS
	String aeropuertoOrigen = "BA"; // Aeropuerto aeropuertoDestino= aeropuerto;
	String aeropuertoDestino = "CDB";
	Double tiempoDeVuelo = 2.3;
	Integer id = 02;
	Double nuevoTiempoDeVuelo=5.0;

     	/*es un objeto de tiempo, inmutable, que 
	     * guarda la fecha como una etapa de Año-mes-día.
	     *  Es uno de los objetos que podemos proponer para cambiar
	     *  por Date o Calendar, debido a los métodos que posee.*/
	   LocalDate fechaDelVuelo= LocalDate.of(2023, 05, 10);
        Integer numeroDeVuelo=01;
	
//EJECUCION
	//mis objetos
   
	Ruta nuevaRuta = new Ruta(aeropuertoDestino, aeropuertoOrigen, id, tiempoDeVuelo);

	Vuelo vuelo01 = new Vuelo(nuevaRuta, numeroDeVuelo, fechaDelVuelo);
	
	
	//mis metodos

      Boolean ingresoExitoso= vuelo01.registrarRuta(nuevaRuta);
	  Boolean rutaModificada= vuelo01.modificarTiempoDeVueloDeMiRuta(nuevoTiempoDeVuelo, id,tiempoDeVuelo);
	  
	  assertTrue(rutaModificada);

}
   

    
@Test
    public void QueSePuedaBuscarTodasLasRutasDeUnAeropuertoOrigen() {
	//ATRIBUTOS

	
	//EJECUCION
			
			
	//VALIDACION
}	
    @Test
	public void QueNoSePuedaCrearUnVueloConLaMismaRutaYQueSeSuperpongaEnElHorario() {

	
}	
	

}
