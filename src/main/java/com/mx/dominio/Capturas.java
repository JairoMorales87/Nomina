package com.mx.dominio;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAPTURAS")
public class Capturas {
	
	@Id
	@Column(name = "ID_CAPTURA", columnDefinition = "NUMBER")
	int idCaptura;
	
	@Column(name = "MES", columnDefinition = "NVARCHAR2(100)")
	String mes;
	
	@Column(name = "CANTIDAD_ENTREGAR", columnDefinition = "NUMBER")
	int cantidadEntregas;
	
	@Column(name = "ID_EMPLEADO", columnDefinition = "NUMBER")
	int idEmpleado;
	
	//@ManyToMany(mappedBy = "CAPTURAS", cascade = CascadeType.ALL)
	//List<Empleados> lista = new ArrayList<Empleados>();
	
	public Capturas() {
		
	}

	public Capturas(int idCaptura, String mes, int cantidadEntregas, int idEmpleado) {
		super();
		this.idCaptura = idCaptura;
		this.mes = mes;
		this.cantidadEntregas = cantidadEntregas;
		this.idEmpleado = idEmpleado;
	}

	@Override
	public String toString() {
		return "capturas [idCaptura=" + idCaptura + ", mes=" + mes + ", cantidadEntregas=" + cantidadEntregas
				+ ", idEmpleado=" + idEmpleado + "]\n";
	}

	public int getIdCaptura() {
		return idCaptura;
	}

	public void setIdCaptura(int idCaptura) {
		this.idCaptura = idCaptura;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getCantidadEntregas() {
		return cantidadEntregas;
	}

	public void setCantidadEntregas(int cantidadEntregas) {
		this.cantidadEntregas = cantidadEntregas;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	

}
