package com.aplicacion.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.web.entidad.Empleado;
import com.aplicacion.web.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicioImplementacion implements EmpleadoServicio {
	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> mostrarTodosLosEmpleados() {
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return repositorio.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		repositorio.deleteById(id);

	}

}
