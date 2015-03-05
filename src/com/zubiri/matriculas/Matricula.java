package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Matricula extends Asignatura {
	
	static int añoMatriculacion;
    static double precio;
    private static ArrayList<Matricula> listaMatricula = new ArrayList<Matricula>();
    
    public Matricula(String nombre, int creditos, String profesor, int añoMatriculacion, int precio) {
		super(nombre, creditos, profesor);
		this.añoMatriculacion = añoMatriculacion;
		this.precio = precio;
	}
    
    public Matricula(Scanner sc){
		
		super(sc);
		System.out.println("Año de matriculacion: ");
		this.setAñoMatriculacion(sc.nextInt());
		System.out.println("Precio: ");
		this.setPrecio(sc.nextInt());
	}
    
	public static int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public static void setAñoMatriculacion(int añoMatriculacion) {
		añoMatriculacion = añoMatriculacion;
	}
	
	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precio) {
		precio = precio;
	}
	
	public static void nuevaMatricula(Scanner sc) {
		
		do {
			try {
		System.out.println("Año matriculacion:");
		setAñoMatriculacion(sc.nextInt());
			}catch(InputMismatchException exception){
				System.out.println("Eso no es numero");
				sc.nextLine();
			}
		} while (getAñoMatriculacion() != 0);
		do {
			try {
		System.out.println("Precio:");
		setPrecio(sc.nextInt());
			}catch(InputMismatchException exception){
		System.out.println("Eso no es numero");
		sc.nextLine();}
		} while (getAñoMatriculacion() != 0);
		
		Matricula matricula = new Matricula(nombre, añoMatriculacion, profesor, añoMatriculacion, añoMatriculacion);
		listaMatricula.add(matricula);
	}

	
	public static void mostrarMatricula() {
	
			System.out.println("\tAsignatura:\n" + Asignatura.formattedAsignatura());
			System.out.println("\tAño Matriculacion: " + getAñoMatriculacion());
			System.out.println("\tPrecio: " + getPrecio());
		}
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		
		System.out.println("Nuevo precio con descuento:");
		return precio = (precio*porcentaje)/100;
		
	}

}
