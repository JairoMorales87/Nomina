package com.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.dominio.Empleados;
import com.mx.servicios.EmpleadosServ;

@RestController
@RequestMapping("EMPLEADOS")
@CrossOrigin
public class EmpleadosWs {
	
	@Autowired
	EmpleadosServ empleadosServ;
	
	// http://localhost:7500/EMPLEADOS/listar
	@GetMapping("listar")
	public List<Empleados> listar(){
		var lista = empleadosServ.listar();
		return lista;
	}
	
	// http://localhost:7500/EMPLEADOS/buscar
	@PostMapping("buscar")
	public Empleados buscar(@RequestBody Empleados empleados) {
		empleados = empleadosServ.buscar(empleados);
		return empleados;
	}
	
	// http://localhost:7500/EMPLEADOS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Empleados empleados) {
		empleadosServ.guardar(empleados);
	}
	
	// http://localhost:7500/EMPLEADOS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Empleados empleados) {
		empleadosServ.editar(empleados);
	}
	
	// http://localhost:7500/EMPLEADOS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empleados empleados) {
		empleadosServ.eliminar(empleados);
	}
	
	// http://localhost:7500/EMPLEADOS/calculo
	@PostMapping("calculo")
	public Empleados FindByCalculo(@RequestBody Empleados empleados) {
		return (Empleados) empleadosServ.FindByCalculo(empleados);
		
	}
	
	// http://localhost:7500/EMPLEADOS/mes
	@PostMapping("mes")
	public Empleados BuscarPorMes(@RequestBody Empleados empleados) {
		return (Empleados) empleadosServ.BuscarPorMes(empleados);
	}
	
	// http://localhost:7500/EMPLEADOS/empleado/{id}
	@GetMapping("/empleado/{id}")
	public String buscarPorID(@PathVariable int id) {
		return "";
	}
}
