package alumno.edu.pb2.ar;

import java.util.ArrayList;
//la aerolinea tiene al aeropuerto y a los vuelo
public class Aerolinea {
//atributos
	private String nombre;
	
	//ya no vamos a usar array!!!
	//ArrayList ES UNA COLECCION QUE PROVIENE DE <> Y CRE UNA LISTA
	// en este caso llamada "aeropuertos"
	//ventajas "NO TENGO QQUE DECIRLE EL TOPE
	//DE ELEMENTOS A GUARDAR ES DINAMICO
	//NO USA LENGTH
	//NO HACE FANTA EL FOR NI IF NI NADA ES 
	//ES UNA COLECCION DIRECTA
	//INVESTIGAS TIPS DE COLECCIONES
	//tipos lista: "ArrayList" es como un array /// "LinkendList" 
	//los tipos de set no permiten duplicado: "HashSet"  /// "TreeSet"
	
	private ArrayList<Vuelo>vuelos;
	private ArrayList<Aeropuerto>aeropuertos;
	//lo que necesito depende de mi tablita "diagrama de decision" es este caso:
	//tiene un solo valor, contiene duplicados= arraylist.
	
	
//constructores
	public Aerolinea(String nombre) {
		this.nombre=nombre;
		aeropuertos=new ArrayList<>();
		vuelos=new ArrayList<>();
	}

	
	
//metodos
	
	
	public Boolean registrarAeropuerto(Aeropuerto aeropuerto) {
		/*El método add nos permite añadir un elemento al final 
		de la List si no le indicamos una posición o bien nos 
		permite añadir un elemento en una posición determinada 
		si le pasamos como parámetro la posición además del elemento*/
	return this.aeropuertos.add(aeropuerto);
	
	}

	public Integer obtenerCantidadDeAeropuertos() {
		/*Devuelve el tamaño, número de elementos, del ArrayList*/
	return this.aeropuertos.size();
	}

	public Aeropuerto buscarAeropuertoPorCodigo(String codigo) {
		
		// este for se usa para recorrer un arraylist....
		
       		//objeto    // nombre    //list
		for(Aeropuerto aeropuerto : aeropuertos) {
	    	  
			if(aeropuerto.getCodigo().equals(codigo))
	    		  return aeropuerto;
	      }
		
		return null;
	}
	
	public Aeropuerto buscarAeropuertoPorNombre(String nombre) {
		for(Aeropuerto aeropuerto : aeropuertos) {
	    	  
			if(aeropuerto.getNombre().equals(nombre))
	    		  return aeropuerto;
	      }
		return null;
	}

	
	public Boolean cambiarDireAeropuerto(String nuevaDierccion, String direccion) {
		//arranco diciendo que no se pudo
		Boolean sePudo=false;

		//recorro la lista
		for(Aeropuerto aeropuerto : aeropuertos) {
			//verifico que si esta la antigua direccion para modificarla
			  if(aeropuerto.getDireccion().equals(direccion)) {
				  //la cambio
				  aeropuerto.setDireccion(nuevaDierccion);
	    		  sePudo=true;
	    		 }
	     	  }
		return sePudo;
	}

//get set
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Aeropuerto> getAeropuertos() {
		return aeropuertos;
	}



	public void setAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
		this.aeropuertos = aeropuertos;
	}














	
}
