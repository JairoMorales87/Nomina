package com.mx.servicios;

import java.util.List;
import java.util.Optional;

import com.mx.dominio.Empleados;

public interface EmpleadosServ {
	
public void guardar(Empleados empleados);
	
	public void editar(Empleados empleados);
	
	public void eliminar(Empleados empleados);
	
	public Empleados buscar(Empleados empleados);
	
	public List<Empleados> listar();
	
	public List<Empleados> FindByCalculo(Empleados empleados);
	
	public List<Empleados> BuscarPorMes(Empleados empleados);
	
	Optional<Empleados> buscarPorId(int id);


}
