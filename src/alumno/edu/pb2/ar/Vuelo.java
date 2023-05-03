package alumno.edu.pb2.ar;

import java.time.LocalDate;
import java.util.ArrayList;
//(el vuelo tiene a la ruta)
public class Vuelo {
	private Integer numeroDeVuelo;
	private LocalDate fechaDeVuelo;
	private Integer pasajeros;
	//tengo que crear una lista de rutas
	private ArrayList<Ruta> rutas;


	

	public Vuelo(Ruta ruta, Integer numeroDeVuelo, LocalDate fechaDelVuelo) {
		this.numeroDeVuelo=numeroDeVuelo;
		this.fechaDeVuelo=fechaDelVuelo;
		rutas = new ArrayList<>();
		
	}


		public Boolean modificarTiempoDeVueloDeMiRuta(Double nuevoTiempoDeVuelo,Integer id) {
	//arranco diciendo que no se pudo
	Boolean sePudo=false;
	
	for(Ruta ruta : rutas) {
		
	
		if(rutas.contains(id)) {
		 
		  sePudo=true;
		  }
		
	}
	
	
	return sePudo;
}
/*
public  Boolean modificarTiempoDeVueloDeMiRuta(Double nuevoTiempoDeVuelo) {
	//arranco diciendo que no se pudo
	Boolean sePudo=false;
	
		if(getTV()!=nuevoTiempoDeVuelo) {
			setTV(nuevoTiempoDeVuelo);
			sePudo=true;
			
		
	}
	return sePudo;
}
*/

	
	
	
	
	
	
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
