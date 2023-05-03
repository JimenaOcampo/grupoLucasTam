package alumno.edu.pb2.ar;

import java.util.ArrayList;

public class Ruta {
	//la ruta es solo la ruta
	private String destino;
	private String origen;
	private Integer id;
	private Double tiempoVuelo;


	

	

	
//constructor
	public Ruta(String destino, String origen, Integer id, Double tiempoDeVuelo) {
		this.destino=destino;
		this.origen=origen;
		this.id=id;
		this.tiempoVuelo=tiempoDeVuelo;
		


		
	}
	public Ruta() {
		this.destino=destino;
		this.origen=origen;
		this.id=id;
		this.tiempoVuelo=tiempoVuelo;
	


		
	}

	

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Double getTiempoVuelo() {
		return tiempoVuelo;
	}

	public void setTiempoVuelo(Double tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	

}
