package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	//A�o en el que se inscribi� por primera vez en alguna asignatura
	int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	public Alumno(String dni, String nombre, String apellido, int añoInscripcion, String ciclo) {
		super(dni, nombre, apellido);
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
	}
		
	public Alumno(Scanner sc){
		
		super(sc);
		System.out.println("Año de inscripcion: ");
		this.setAñoInscripcion(sc.nextInt());
		System.out.println("Ciclo: ");
		this.setCiclo(sc.next());
	}
	
	//Matr�culas realizadas a lo largo de los a�os en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

}
