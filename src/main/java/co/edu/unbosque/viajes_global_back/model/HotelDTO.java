package co.edu.unbosque.viajes_global_back.model;


public class HotelDTO {
	
	private int id_hotel;
	private String nombre;
	private String direccion;
	private String ciudad;
	private String pais;
	private int precio_por_noche;

	public HotelDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_hotel
	 * @param nombre
	 * @param direccion
	 * @param ciudad
	 * @param pais
	 * @param precio_por_noche
	 */
	public HotelDTO(int id_hotel, String nombre, String direccion, String ciudad, String pais, int precio_por_noche) {
		super();
		this.id_hotel = id_hotel;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.precio_por_noche = precio_por_noche;
	}

	/**
	 * @return the id_hotel
	 */
	public int getId_hotel() {
		return id_hotel;
	}

	/**
	 * @param id_hotel the id_hotel to set
	 */
	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the precio_por_noche
	 */
	public int getPrecio_por_noche() {
		return precio_por_noche;
	}

	/**
	 * @param precio_por_noche the precio_por_noche to set
	 */
	public void setPrecio_por_noche(int precio_por_noche) {
		this.precio_por_noche = precio_por_noche;
	}
	
	
}
