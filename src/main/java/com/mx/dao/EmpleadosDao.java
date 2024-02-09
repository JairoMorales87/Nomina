package com.mx.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mx.dominio.Empleados;

public interface EmpleadosDao extends JpaRepository<Empleados, Integer>{
	
	List<Empleados> findByNombreAndApellidos(String nombre, String apellido);

	void findByNombreAndApellidos(Empleados empleados);
	
	@Query(value = "SELECT * FROM EMPLEADOS WHERE MES = ? AND NUMERO_EMPLEADO = ? ", nativeQuery = true)
	public List<Empleados> getEmpleadoByMes(String Mes, double Salario, int Horas, double BonoEntregas, double BonoPorHoras,int NumeroEmpleado);
	
}
