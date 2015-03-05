package com.zubiri.matriculas;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Persona {
	
	static String dni;
	static String nombre;
	static String apellido;
	
public Persona(String dni, String nombre, String apellido) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(Scanner sc) {
		System.out.println("Dni del profesor:");
		this.setDni(sc.next());
		System.out.println("Nombre del profesor:");
		this.setNombre(sc.next());
		System.out.println("Apellido del profesor:");
		this.setApellido(sc.next());
}

	public String getDni() {
		return dni;
	}
	
	public static void setDni(String dni) {
		dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static void setNombre(String nombre) {
		nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public static void setApellido(String apellido) {
		apellido = apellido;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public static String formattedPersona() {
		
		String personaStr = 
				"DNI:" + dni + "\n" + 
				"NOMBRE" + nombre  + "\n" +
				"APELLIDO:" + apellido  + "\n" ;
				
				return personaStr;
	}
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void splitPersona(String personaStr, char separator) {
		
	}
}
