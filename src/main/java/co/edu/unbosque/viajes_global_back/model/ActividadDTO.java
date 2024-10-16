package co.edu.unbosque.viajes_global_back.model;

public class ActividadDTO {
	private int id_actividad;
	private String nombre;
	private String descripcion;
	private int precio;
	private String ubicacion;
	
	public ActividadDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_actividad
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param ubicacion
	 */
	public ActividadDTO(int id_actividad, String nombre, String descripcion, int precio, String ubicacion) {
		super();
		this.id_actividad = id_actividad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the id_actividad
	 */
	public int getId_actividad() {
		return id_actividad;
	}

	/**
	 * @param id_actividad the id_actividad to set
	 */
	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
