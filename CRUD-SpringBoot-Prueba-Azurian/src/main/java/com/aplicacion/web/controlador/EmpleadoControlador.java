package com.aplicacion.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aplicacion.web.entidad.Empleado;
import com.aplicacion.web.servicio.EmpleadoServicio;

@Controller
public class EmpleadoControlador {
	@Autowired
	private EmpleadoServicio servicio;

	@GetMapping("/empleados")
	public String listarEmpleados(Model modelo) {
		modelo.addAttribute("empleados", servicio.mostrarTodosLosEmpleados());
		return "empleados";
	}

	@GetMapping("/empleado/nuevo")
	public String mostrarFormularioDeRegistroDeEmpleado(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado", empleado);
		return "crear_empleado";
	}

	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleados";
	}

	@GetMapping("/empleado/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("empleado", servicio.obtenerEmpleadoPorId(id));
		return "editar_empleado";
	}

	@PostMapping("/empleados/{id}")
	public String actualizarEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado empleado,
			Model model) {
		Empleado empleadoExistente = servicio.obtenerEmpleadoPorId(id);
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setApellido_Paterno(empleado.getApellido_Paterno());
		empleadoExistente.setApellido_Materno(empleado.getApellido_Materno());
		empleadoExistente.setCorreo(empleado.getCorreo());
		empleadoExistente.setPuesto(empleado.getPuesto());
		servicio.actualizarEmpleado(empleadoExistente);

		return "redirect:/empleados";

	}

	@GetMapping("/empleados/{id}")
	public String eliminarEmpleado(@PathVariable Long id) {
		servicio.eliminarEmpleado(id);
		return "redirect:/empleados";
	}

}
