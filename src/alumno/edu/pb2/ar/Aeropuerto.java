package alumno.edu.pb2.ar;
//atributo
public class Aeropuerto {
	//el aeropuerto es solo el aeropuerto
private String codigo;
private String nombre;
private Long id;
private String direccion;
private  String nuevaDireccion;
//constructor	
	
	public Aeropuerto(Long id, String nombre, String codigo, String direccion) {
	this.codigo=codigo;
	this.direccion=direccion;
	this.id=id;
	this.nombre=nombre;
	this.nuevaDireccion=nuevaDireccion;
	
	}
	public Aeropuerto() {
	this.codigo=codigo;
	this.direccion=direccion;
	this.id=id;
	this.nombre=nombre;
	this.nuevaDireccion=nuevaDireccion;
	
	}

	//metodos
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNuevaDireccion() {
		return nuevaDireccion;
	}
	public void setNuevaDireccion(String nuevaDireccion) {
		this.nuevaDireccion = nuevaDireccion;
	}

}
