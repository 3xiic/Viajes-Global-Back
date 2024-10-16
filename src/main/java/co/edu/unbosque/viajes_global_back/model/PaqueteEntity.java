package co.edu.unbosque.viajes_global_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paquetes_turisticos")
public class PaqueteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_paquete;
	private int id_hotel;
	private int id_vuelo;
	private int id_actividad;
	private int precio;
	
	
	public PaqueteEntity() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id_paquete
	 * @param id_hotel
	 * @param id_vuelo
	 * @param id_actividad
	 * @param precio
	 */
	public PaqueteEntity(int id_paquete, int id_hotel, int id_vuelo, int id_actividad, int precio) {
		super();
		this.id_paquete = id_paquete;
		this.id_hotel = id_hotel;
		this.id_vuelo = id_vuelo;
		this.id_actividad = id_actividad;
		this.precio = precio;
	}

	/**
	 * @return the id_paquete
	 */
	public int getId_paquete() {
		return id_paquete;
	}
	/**
	 * @param id_paquete the id_paquete to set
	 */
	public void setId_paquete(int id_paquete) {
		this.id_paquete = id_paquete;
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
