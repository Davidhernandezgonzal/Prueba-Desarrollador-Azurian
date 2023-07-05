package com.aplicacion.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aplicacion.web.entidad.Empleado;
import com.aplicacion.web.repositorio.EmpleadoRepositorio;

@SpringBootApplication
public class CrudSpringBootPruebaAzurianApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootPruebaAzurianApplication.class, args);
	}

	@Autowired
	private EmpleadoRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception {
		/*
		Empleado empleado1 = new Empleado("David","Hernández","González","card.david@hotmail.com","Desarrollador");
		repositorio.save(empleado1);
		
		Empleado empleado2 = new Empleado("Daniel","Hernández","González","david_hernandezgow@hotmail.com","Probador");
		repositorio.save(empleado2);
		*/
	}

}
