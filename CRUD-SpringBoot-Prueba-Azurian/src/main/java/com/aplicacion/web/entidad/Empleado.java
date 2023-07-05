package com.aplicacion.web.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "apellido_Paterno", nullable = false, length = 50)
	private String apellido_Paterno;

	@Column(name = "apellido_Materno", nullable = false, length = 50)
	private String apellido_Materno;

	@Column(name = "correo", nullable = false, length = 50, unique = true)
	private String correo;

	@Column(name = "puesto", nullable = false, length = 50)
	private String puesto;

	public Empleado() {

	}

	public Empleado( String nombre, String apellido_Paterno, String apellido_Materno, String correo,
			String puesto) {
		super();
		this.nombre = nombre;
		this.apellido_Paterno = apellido_Paterno;
		this.apellido_Materno = apellido_Materno;
		this.correo = correo;
		this.puesto = puesto;
	}

	public Empleado(long id, String nombre, String apellido_Paterno, String apellido_Materno, String correo,
			String puesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido_Paterno = apellido_Paterno;
		this.apellido_Materno = apellido_Materno;
		this.correo = correo;
		this.puesto = puesto;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_Paterno() {
		return apellido_Paterno;
	}

	public void setApellido_Paterno(String apellido_Paterno) {
		this.apellido_Paterno = apellido_Paterno;
	}

	public String getApellido_Materno() {
		return apellido_Materno;
	}

	public void setApellido_Materno(String apellido_Materno) {
		this.apellido_Materno = apellido_Materno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido_Paterno=" + apellido_Paterno
				+ ", apellido_Materno=" + apellido_Materno + ", correo=" + correo + ", puesto=" + puesto + "]";
	}

}
