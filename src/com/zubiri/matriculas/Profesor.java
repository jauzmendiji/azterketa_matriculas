package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	String titulacion;
	String departamento;
	
	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento) {
		super(dni, nombre, apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
	}
	
	public Profesor(Scanner sc){
		
		super(sc);
		System.out.println("Titulacion: ");
		this.setTitulacion(sc.next());
		System.out.println("Departamento: ");
		this.setDepartamento(sc.next());
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	
	public static void setTitulacion(String titulacion) {
		titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public static void setDepartamento(String departamento) {
		departamento = departamento;
	}

	public static void añadirProfesor(Scanner sc) {
		System.out.println("DNI del profesor:");
		setDni(sc.next());
		System.out.println("Nombre del profesor:");
		setNombre(sc.next());
		System.out.println("Apellido del profesor:");
		setApellido(sc.next());
		System.out.println("Titulacion del profesor:");
		setTitulacion(sc.next());
		System.out.println("Departamento del profesor:");
		setDepartamento(sc.next());
		
	}
	
}
