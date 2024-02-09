package com.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.dominio.Capturas;


public interface CapturasDao extends JpaRepository<Capturas, Integer> {

}
