package co.edu.unbosque.viajes_global_back.model;

import java.sql.Date;

public class VueloDTO {
	private int id_vuelo;
	private String aerolinea;
	private String origen;
	private String destino;
	private Date fecha_salida;
	private Date fecha_llegada;
	private int precio;
	
	public VueloDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id_vuelo
	 * @param aerolinea
	 * @param origen
	 * @param destino
	 * @param fecha_salida
	 * @param fecha_llegada
	 * @param precio
	 */
	public VueloDTO(int id_vuelo, String aerolinea, String origen, String destino, Date fecha_salida,
			Date fecha_llegada, int precio) {
		super();
		this.id_vuelo = id_vuelo;
		this.aerolinea = aerolinea;
		this.origen = origen;
		this.destino = destino;
		this.fecha_salida = fecha_salida;
		this.fecha_llegada = fecha_llegada;
		this.precio = precio;
	}


	
	/**
	 * @return the id_vuelo
	 */
	public int getId_vuelo() {
		return id_vuelo;
	}
	/**
	 * @param id_vuelo the id_vuelo to set
	 */
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	/**
	 * @return the aerolinea
	 */
	public String getAerolinea() {
		return aerolinea;
	}
	/**
	 * @param aerolinea the aerolinea to set
	 */
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the fecha_salida
	 */
	public Date getFecha_salida() {
		return fecha_salida;
	}
	/**
	 * @param fecha_salida the fecha_salida to set
	 */
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	/**
	 * @return the fecha_llegada
	 */
	public Date getFecha_llegada() {
		return fecha_llegada;
	}
	/**
	 * @param fecha_llegada the fecha_llegada to set
	 */
	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
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
	
	
}
