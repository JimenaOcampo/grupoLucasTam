package alumno.edu.pb2.ar;

import java.time.LocalDate;
import java.util.ArrayList;
//(el vuelo tiene a la ruta)
public class Vuelo {
	private Integer numeroDeVuelo;
	private LocalDate fechaDeVuelo;

	//tengo que crear una lista de rutas
	private ArrayList<Ruta> listaRutas;
	

	public Vuelo(Ruta nuevaRuta, Integer numeroDeVuelo, LocalDate fechaDelVuelo) {
		this.numeroDeVuelo=numeroDeVuelo;
		this.fechaDeVuelo=fechaDelVuelo;
		listaRutas=new ArrayList<>();
		
	}
	
	


	
	


	//	--------------------------------------
	public Boolean registrarRuta(Ruta nuevaRuta) {
	return this.listaRutas.add(nuevaRuta);
	
	}
	
	public Integer obtenerCantidadDeRutas() {
	return this.listaRutas.size();
	}
	
    public Boolean buscarRutasPorId(Integer id) {
		Boolean respuesta=false;
		// este for se usa para recorrer un arraylist....
		
       		//objeto    // nombre    //list
		for(Ruta misRutas : listaRutas) {
	    	  
			
			if(misRutas.getId().equals(id)) {
	    		  respuesta=true;
	      }
		}
		return respuesta;
 }

    
    
    
	

public  Boolean modificarTiempoDeVueloDeMiRuta(Double nuevoTiempoDeVuelo,Integer id, Double tiempoDeVuelo) {
	//arranco diciendo que no se pudo

	//System.out.println(listaRutas.size()); verifique que no esta vacio
	
	 Boolean respuesta = false;
	 
	for (Ruta ruta : listaRutas) {
	if(ruta.getId().equals(id)&&ruta.getTiempoVuelo().equals(tiempoDeVuelo)) 
		ruta.setTiempoVuelo(nuevoTiempoDeVuelo);
	respuesta=true;
	
	 }	
	return respuesta;	
}


	
	
	
	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}



	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}



	public LocalDate getFechaDeVuelo() {
		return fechaDeVuelo;
	}



	public void setFechaDeVuelo(LocalDate fechaDeVuelo) {
		this.fechaDeVuelo = fechaDeVuelo;
	}







}
