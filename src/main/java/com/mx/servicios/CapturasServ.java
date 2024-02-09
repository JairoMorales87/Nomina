package com.mx.servicios;

import java.util.List;

import com.mx.dominio.Capturas;

public interface CapturasServ {
	
	public void guardar(Capturas capturas);
	
	public void editar(Capturas capturas);
	
	public void eliminar(Capturas capturas);
	
	public Capturas buscar(Capturas capturas);
	
	public List<Capturas> listar();

}
