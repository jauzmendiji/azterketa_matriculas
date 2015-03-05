package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Asignatura {

	static String nombre;
	static int creditos;
	static String profesor;
	
	public Asignatura(String nombre, int creditos, String profesor) {
		
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	public Asignatura(Scanner sc){
		
		System.out.println("Nombre de la asignatura: ");
		this.setNombre(sc.next());
		System.out.println("Creditos: ");
		this.setCreditos(sc.nextInt());
		System.out.println("Profesor: ");
		Profesor.añadirProfesor(sc);
	}

	public static String getNombre() {
		return nombre;
	}
	
	public static void setNombre(String nombre) {
		nombre = nombre;
	}
	
	public static int getCreditos() {
		return creditos;
	}
	
	public static void setCreditos(int creditos) {
		creditos = creditos;
	}
	
	public static String getProfesor() {
		return profesor;
	}
	
	public static void setProfesor(String strArray) {
		profesor = strArray;
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void splitAsignatura(String asignaturaStr, String separator) {
		
		String[] strArray = asignaturaStr.split(separator);
		this.setNombre(strArray[0]);
		this.setCreditos(Integer.parseInt(strArray[1]));
		this.setProfesor(strArray[2]);
		
	}

	public static void añadirAsignatura(Scanner sc) {
		
		System.out.println("Nombre de la asignatura:");
		setNombre(sc.next());

		do {
			try {
		System.out.println("Cantidad de creditos:");
		setCreditos(sc.nextInt());
			}catch(InputMismatchException exception){
				System.out.println("Eso no es un numero");
			}
		} while (getCreditos() != 0);
		System.out.println("Profesor:");
		Profesor.añadirProfesor(sc);
		
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public static String formattedAsignatura() {
		
		String asignaturaStr = 
				"NOMBRE:" + Asignatura.getNombre() + "\n" + 
				"CREDITOS:" + Asignatura.getCreditos()  + "\n" +
				"PROFESOR:" + Asignatura.getProfesor()  + "\n" ;
				
				return asignaturaStr;
	}

}
