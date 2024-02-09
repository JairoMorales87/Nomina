package com.mx.dominio;



import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "EMPLEADOS")
public class Empleados {
	
	@Id
	@Column(name = "ID_EMPLEADO", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idEmpleado;
	
	@Column(name = "NUMERO_EMPLEADO", columnDefinition = "NUMBER")
	int numeroEmpleado;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;
	
	@Column(name = "APELLIDO", columnDefinition = "NVARCHAR2(100)")
	String apellido;
	
	@Column(name = "ROL", columnDefinition = "NVARCHAR2(100)")
	String rol;
	
	@Column(name = "SALARIO", columnDefinition = "NUMBER")
	double salario;
	
	@Column(name = "HORAS", columnDefinition = "NUMBER")
	int HORAS;
	
	@Column(name = "DIASPORSEMANA", columnDefinition = "NUMBER")
	int DIASPORSEMANA;
	
	@Column(name = "BONOENTREGA", columnDefinition = "NUMBER")
	double BONOENTREGA;
	
	@Column(name = "BONOPORHORA", columnDefinition = "NUMBER")
	double BONOPORHORA;
	
	@Column(name = "ISR", columnDefinition = "NUMBER")
	double ISR;
	
	@Column(name = "VALESDESPENSA", columnDefinition = "NUMBER")
	double VALESDESPENSA;
	
	@Column(name = "MES", columnDefinition = "NVARCHAR2(100)")
	String MES;
	
	//@OneToMany(fetch = FetchType.EAGER)
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "captura", referencedColumnName = "id")
	Empleados empleados;
	
	public Empleados() {
		
	}

	public Empleados(int idEmpleado, int numeroEmpleado, String nombre, String apellido, String rol, double salario,
			int hORAS, int dIASPORSEMANA, double bONOENTREGA, double bONOPORHORA, double iSR, double vALESDESPENSA,
			String mES, Empleados empleados) {
		super();
		this.idEmpleado = idEmpleado;
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.rol = rol;
		this.salario = salario;
		HORAS = hORAS;
		DIASPORSEMANA = dIASPORSEMANA;
		BONOENTREGA = bONOENTREGA;
		BONOPORHORA = bONOPORHORA;
		ISR = iSR;
		VALESDESPENSA = vALESDESPENSA;
		MES = mES;
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", numeroEmpleado=" + numeroEmpleado + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", rol=" + rol + ", salario=" + salario + ", HORAS=" + HORAS
				+ ", DIASPORSEMANA=" + DIASPORSEMANA + ", BONOENTREGA=" + BONOENTREGA + ", BONOPORHORA=" + BONOPORHORA
				+ ", ISR=" + ISR + ", VALESDESPENSA=" + VALESDESPENSA + ", MES=" + MES + ", empleados=" + empleados
				+ "]\n";
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHORAS() {
		return HORAS;
	}

	public void setHORAS(int hORAS) {
		HORAS = hORAS;
	}

	public int getDIASPORSEMANA() {
		return DIASPORSEMANA;
	}

	public void setDIASPORSEMANA(int dIASPORSEMANA) {
		DIASPORSEMANA = dIASPORSEMANA;
	}

	public double getBONOENTREGA() {
		return BONOENTREGA;
	}

	public void setBONOENTREGA(double bONOENTREGA) {
		BONOENTREGA = bONOENTREGA;
	}

	public double getBONOPORHORA() {
		return BONOPORHORA;
	}

	public void setBONOPORHORA(double bONOPORHORA) {
		BONOPORHORA = bONOPORHORA;
	}

	public double getISR() {
		return ISR;
	}

	public void setISR(double iSR) {
		ISR = iSR;
	}

	public double getVALESDESPENSA() {
		return VALESDESPENSA;
	}

	public void setVALESDESPENSA(double vALESDESPENSA) {
		VALESDESPENSA = vALESDESPENSA;
	}

	public String getMES() {
		return MES;
	}

	public void setMES(String mES) {
		MES = mES;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}
	
}
