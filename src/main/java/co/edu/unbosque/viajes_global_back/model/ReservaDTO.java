package co.edu.unbosque.viajes_global_back.model;

import java.sql.Date;


public class ReservaDTO {

	private int id_reserva;
	private int id_cliente;
	private int id_paquete;
	private Date fecha_reserva;
	private String estado_reserva;
	private String nombre;
	private String correo;
	private String celular;
		
	public ReservaDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_reserva
	 * @param id_cliente
	 * @param id_paquete
	 * @param fecha_reserva
	 * @param estado_reserva
	 * @param nombre
	 * @param correo
	 * @param celular
	 */
	public ReservaDTO(int id_reserva, int id_cliente, int id_paquete, Date fecha_reserva, String estado_reserva,
			String nombre, String correo, String celular) {
		super();
		this.id_reserva = id_reserva;
		this.id_cliente = id_cliente;
		this.id_paquete = id_paquete;
		this.fecha_reserva = fecha_reserva;
		this.estado_reserva = estado_reserva;
		this.nombre = nombre;
		this.correo = correo;
		this.celular = celular;
	}

	/**
	 * @return the id_reserva
	 */
	public int getId_reserva() {
		return id_reserva;
	}

	/**
	 * @param id_reserva the id_reserva to set
	 */
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	/**
	 * @return the id_cliente
	 */
	public int getId_cliente() {
		return id_cliente;
	}

	/**
	 * @param id_cliente the id_cliente to set
	 */
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
	 * @return the fecha_reserva
	 */
	public Date getFecha_reserva() {
		return fecha_reserva;
	}

	/**
	 * @param fecha_reserva the fecha_reserva to set
	 */
	public void setFecha_reserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	/**
	 * @return the estado_reserva
	 */
	public String getEstado_reserva() {
		return estado_reserva;
	}

	/**
	 * @param estado_reserva the estado_reserva to set
	 */
	public void setEstado_reserva(String estado_reserva) {
		this.estado_reserva = estado_reserva;
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
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

}
