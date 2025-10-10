/******************************************************************************************************************
 * 
 * Nombre: Cristina Valtierra
 * Fecha: 24/09/2025
 * Modulo: Programación. 
 * UD01. 
 * Tarea: PROG01 - Tarea Práctica 01: Programa que muestra poema a través de métodos
 * Autoevaluación: 
 * Descripción del programa: Programa que muestra poema a través de métodos.
 * 
 ******************************************************************************************************************/


package org.tpractica01;

public class RinconSombra {

	public static void main(String[] args) {
	      
        /*System.out.println("Se encontraba el sauce en su rincón,");
        System.out.println("Vino el roble y le hizo sombra,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");*/
		
		primeraEstrofa();
        //System.out.println();
		lineaEnBlanco();

        /*System.out.println("Se encontraba el roble en su rincon,");
        System.out.println("Vino el abedul y le hizo sombra,");
        System.out.println("Sombreo el abedul al roble,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo");*/
        
        segundaEstrofa();
        //System.out.println();
        lineaEnBlanco();

        /* System.out.println("Se encontraba el abedul en su rincón,");
        System.out.println("Vino el pino y le hizo sombra,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al rio,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");*/
        
        terceraEstrofa();
        //System.out.println();
        lineaEnBlanco();

        /*System.out.println("Se encontraba el pino en su rincón,");
        System.out.println("Vino el cedro y le hizo sombra,");
        System.out.println("Sombreo el cedro al pino,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al rio,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");*/
        cuartaEstrofa();
        //System.out.println();
        lineaEnBlanco();

        /*System.out.println("Se encontraba el cedro en su rincón,");
        System.out.println("Vino el haya y le hizo sombra,");
        System.out.println("Sombreo el haya al cedro,");
        System.out.println("Sombreo el cedro al pino,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al roble,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");*/
        quintaEstrofa();
        //System.out.println();
        lineaEnBlanco();
	}
	
	// Método para imprimir linea en blanco de separación texto
	public static void lineaEnBlanco() {
		 System.out.println();
	}
	
	// Método para imprimir la primera estrofa
	public static void primeraEstrofa() {
		System.out.println("Se encontraba el sauce en su rincón,");
        System.out.println("Vino el roble y le hizo sombra,");
        System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");
	}
	
	// Método para imprimir la parte que se repite 
	public static void finPrimeraEstrofa() {
		System.out.println("Sombreo el roble al sauce,");
        System.out.println("El sauce a la sombra se quedo.");
	}
	
	// Método para imprimir la segunda estrofa
	public static void segundaEstrofa() {
		System.out.println("Se encontraba el roble en su rincon,");
        System.out.println("Vino el abedul y le hizo sombra,");
        System.out.println("Sombreo el abedul al roble,");
        
        finPrimeraEstrofa();
	}
	
	// Método para imprimir la tercera estrofa
	public static void terceraEstrofa() {    
        System.out.println("Se encontraba el abedul en su rincón,");
        System.out.println("Vino el pino y le hizo sombra,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al rio,");
        
        finPrimeraEstrofa();
        
	}
	
	// Método para imprimir la cuarta estrofa
	public static void cuartaEstrofa() {
		
		System.out.println("Se encontraba el pino en su rincón,");
        System.out.println("Vino el cedro y le hizo sombra,");
        System.out.println("Sombreo el cedro al pino,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al rio,");
     
        finPrimeraEstrofa();
	}
	
	// Método para imprimir la quinta estrofa
	public static void quintaEstrofa() {
		System.out.println("Se encontraba el cedro en su rincón,");
        System.out.println("Vino el haya y le hizo sombra,");
        System.out.println("Sombreo el haya al cedro,");
        System.out.println("Sombreo el cedro al pino,");
        System.out.println("Sombreo el pino al abedul,");
        System.out.println("Sombreo el abedul al roble,");
                
        finPrimeraEstrofa();
        
	}
	
	
	
}
