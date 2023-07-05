package com.aplicacion.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.web.entidad.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
	
}
