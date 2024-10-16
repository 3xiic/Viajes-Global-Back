package co.edu.unbosque.viajes_global_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class ClienteEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_cliente;
private String correo;
private String usuario;
private String telefono;
private boolean eleccion_push;
private boolean eleccion_sms;
private boolean eleccion_email;

public ClienteEntity() {

}

public ClienteEntity(int id_cliente, String correo, String usuario, String telefono, boolean eleccion_push,
		boolean eleccion_sms, boolean eleccion_email) {
	super();
	this.id_cliente = id_cliente;
	this.correo = correo;
	this.usuario = usuario;
	this.telefono = telefono;
	this.eleccion_push = eleccion_push;
	this.eleccion_sms = eleccion_sms;
	this.eleccion_email = eleccion_email;
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
 * @return the usuario
 */
public String getUsuario() {
	return usuario;
}

/**
 * @param usuario the usuario to set
 */
public void setUsuario(String usuario) {
	this.usuario = usuario;
}

/**
 * @return the telefono
 */
public String getTelefono() {
	return telefono;
}

/**
 * @param telefono the telefono to set
 */
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

/**
 * @return the eleccion_push
 */
public boolean isEleccion_push() {
	return eleccion_push;
}

/**
 * @param eleccion_push the eleccion_push to set
 */
public void setEleccion_push(boolean eleccion_push) {
	this.eleccion_push = eleccion_push;
}

/**
 * @return the eleccion_sms
 */
public boolean isEleccion_sms() {
	return eleccion_sms;
}

/**
 * @param eleccion_sms the eleccion_sms to set
 */
public void setEleccion_sms(boolean eleccion_sms) {
	this.eleccion_sms = eleccion_sms;
}

/**
 * @return the eleccion_email
 */
public boolean isEleccion_email() {
	return eleccion_email;
}

/**
 * @param eleccion_email the eleccion_email to set
 */
public void setEleccion_email(boolean eleccion_email) {
	this.eleccion_email = eleccion_email;
}




}
