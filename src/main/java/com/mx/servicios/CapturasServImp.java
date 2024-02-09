package com.mx.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.CapturasDao;
import com.mx.dominio.Capturas;

@Service
public class CapturasServImp implements CapturasServ {

	@Autowired
	CapturasDao capturasDao;
	
	@Override
	public void guardar(Capturas capturas) {
		capturasDao.save(capturas);
		
	}

	@Override
	public void editar(Capturas capturas) {
		capturasDao.save(capturas);
		
	}

	@Override
	public void eliminar(Capturas capturas) {
		capturasDao.delete(capturas);
		
	}

	@Override
	public Capturas buscar(Capturas capturas) {
		return (com.mx.dominio.Capturas) capturasDao.findById(capturas.getIdCaptura()).orElse(null);
	}

	@Override
	public List<Capturas> listar() {
		return (List<Capturas>) capturasDao.findAll();
	}
		
}
