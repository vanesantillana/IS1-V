package com.example.dominio;

import java.util.Comparator;


public class Alumno {
	public String nombres;
	public String apellidoPaterno;
	public String apellidoMaterno;
	public Integer promedio;
	
	public Alumno() {
	}

	public Alumno(String nombres, String apellidoPaterno, String apellidoMaterno,
			Integer promedio) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.promedio = promedio;
	}
		
}
