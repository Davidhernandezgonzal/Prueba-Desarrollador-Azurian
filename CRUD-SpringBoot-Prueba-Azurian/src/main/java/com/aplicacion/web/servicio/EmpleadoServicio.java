package com.aplicacion.web.servicio;

import java.util.List;

import com.aplicacion.web.entidad.Empleado;

public interface EmpleadoServicio {
	
	public List<Empleado> mostrarTodosLosEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleadoPorId(Long id);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);
	
}
