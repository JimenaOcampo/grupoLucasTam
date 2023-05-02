package alumno.edu.pb2.ar;

import java.util.ArrayList;

public class Ruta {
	//la ruta es solo la ruta
	private String destino;
	private String origen;
	private Integer id;
	private Double tV;
	private ArrayList<Ruta> rutas;

	

	public Ruta(String destino, String origen, Integer id, Double tV) {
		this.destino=destino;
		this.origen=origen;
		this.id=id;
		this.tV=tV;
		rutas =new ArrayList<>();

		
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

	public Double getTV() {
		return tV;
	}

	public void setTV(Double tV) {
		this.tV = tV;
	}

}
