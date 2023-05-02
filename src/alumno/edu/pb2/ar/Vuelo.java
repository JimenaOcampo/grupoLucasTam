package alumno.edu.pb2.ar;

import java.time.LocalDate;
import java.util.ArrayList;
//(el vuelo tiene a la ruta)
public class Vuelo {
	private Integer numeroDeVuelo;
	private LocalDate fechaDeVuelo;
	private Ruta rutaDelVuelo;
	//tengo que crear una lista de rutas
	private ArrayList<Ruta> rutas;


	

	public Vuelo(Ruta rutaDelVuelo, Integer numeroDeVuelo, LocalDate fechaDelVuelo) {
		this.numeroDeVuelo=numeroDeVuelo;
		this.fechaDeVuelo=fechaDelVuelo;
		this.rutaDelVuelo=rutaDelVuelo;
	    rutas=new ArrayList<>();
		
	}

		public  Boolean modificarTiempoDeVueloDeMiRuta(Double nuevoTiempoDeVuelo,Double tiempoDeVuelo) {
	//arranco diciendo que no se pudo
	Boolean sePudo=false;
	
	for(Ruta ruta: rutas) {
		if(ruta.getTV().equals(tiempoDeVuelo)) {
		  ruta.setTV(nuevoTiempoDeVuelo);
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



	public Ruta getRutaDelVuelo() {
		return rutaDelVuelo;
	}



	public void setRutaDelVuelo(Ruta rutaDelVuelo) {
		this.rutaDelVuelo = rutaDelVuelo;
	}



	


	
	






}
