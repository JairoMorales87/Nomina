package com.mx.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.EmpleadosDao;
import com.mx.dominio.Empleados;

@Service
public class EmpleadosServImp implements EmpleadosServ{
	
	@Autowired
	private EmpleadosDao empleadosDao;

	@Override
	public void guardar(Empleados empleados) {
		empleadosDao.save(empleados);
		
	}

	@Override
	public void editar(Empleados empleados) {
		empleadosDao.save(empleados);
		
	}

	@Override
	public void eliminar(Empleados empleados) {
		empleadosDao.delete(empleados);
		
	}

	@Override
	public Empleados buscar(Empleados empleados) {
		return (com.mx.dominio.Empleados) empleadosDao.findById(empleados.getIdEmpleado()).orElse(null);
	}

	@Override
	public List<Empleados> listar() {
		return (List<Empleados>) empleadosDao.findAll();
	}

	@Override
	public List<Empleados> FindByCalculo(Empleados empleados) {
		List<Empleados> lista = new ArrayList<>();
		lista = empleadosDao.findAll();
			
			double total = 0;
			for(Empleados e1 : lista) {
				if(e1.getRol().equals(empleados.getRol())) {
					total = e1.getSalario() - (e1.getSalario() *e1.getISR());
					total += total + (e1.getSalario()*e1.getVALESDESPENSA());
					total += total + (e1.getBONOENTREGA()*5);
					total += total + (e1.getBONOPORHORA()*(8));
					if(total >= 10000) {
						total = total - (e1.getSalario()* .03);
						System.out.println("Empleado" + e1.getNombre() + e1.getApellido() + "Tiene un sueldo Neto total de: " + total);
						empleadosDao.save(e1);
					}
					System.out.println("Empleado" + e1.getNombre() + e1.getApellido() + "Tiene un sueldo Neto total de: " + total);
					empleadosDao.save(e1);
				}
			}	
		
		return lista;
	}

	@Override
	public Optional<Empleados> buscarPorId(int id) {
		return empleadosDao.findById(id);
	}

	@Override
	public List<Empleados>BuscarPorMes(Empleados empleados) {
		double salarioT = 0;
		if (empleados.getNumeroEmpleado() == empleados.getNumeroEmpleado()) {
			salarioT = empleados.getSalario() - (empleados.getSalario()* empleados.getISR());
		    salarioT += salarioT + (empleados.getSalario()*empleados.getVALESDESPENSA());
		    salarioT += salarioT + (empleados.getBONOENTREGA()*5);
		    salarioT += salarioT + (empleados.getBONOPORHORA()*8);
		    if (salarioT >= 10000) {
		    	salarioT = salarioT - (empleados.getSalario()*.03);
		    	System.out.println("Empleado" + empleados.getNombre() + empleados.getApellido() + "Tiene un sueldo Neto total de: " + salarioT);
		    }
		}
		 empleadosDao.getEmpleadoByMes(empleados.getMES(),empleados.getSalario(), 
			/*	   (salarioT = empleados.getSalario() - (empleados.getSalario()* empleados.getISR());
				    salarioT += salarioT + (empleados.getSalario()*empleados.getVALESDESPENSA());
				    salarioT += salarioT + (empleados.getBONOENTREGA()*5);
				    salarioT += salarioT + (empleados.getBONOPORHORA()*8);
				    if (salarioT >= 10000) {
				    	salarioT = salarioT - (empleados.getSalario()*.03); }*/
				    	(empleados.getHORAS()*24), (empleados.getBONOPORHORA()*(10*8*24)),(empleados.getBONOENTREGA()*5*24),empleados.getNumeroEmpleado());
				    
		return null;
	}
	
}
