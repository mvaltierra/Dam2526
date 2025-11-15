/********************************************************************************************************
 Nombre:   Cristina Valtierra.
 Fecha:    21/11/2025
 Modulo:   Programación.
 UD:       UD3 Estructuras de control.
 Tarea:    Tarea Evaluación 03. Realiza un programa en Java.
  
 Descripción del programa:   Programa para adivinar un número generado al azar entre 1 MAX_NUM
                               Se puede jugar todas las veces que se quiera
 Enlace autoevaluación:                          
**********************************************************************************************************/

package org.tareaEvaluacion01;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		
		// Inicializamos las variables con las que vamos a calcular las estadísticas    
		int numPartidas = 0;
		int numIntentos = 0;
		int mejorPartida = 1000000;

		// Inicialización de objeto Scanner
		Scanner scn = new Scanner(System.in);
		
		// Iniciación del programa
		presentacion();
	       
	    // Jugamos una partida
	    int resultado = jugarPartida(scn);
	         
	    // Mostramos los resultados
	    mostrarEstadisticas(numPartidas, numIntentos, mejorPartida);

	}
	
	
	
	/*
	 * Presentación del programa
	 * No necesita parámetros y no devuelve ningún valor
	 */
	 public static void presentacion() {
		System.out.println("El programa genera un número aleatorio del 1 al 100");
		System.out.println("El usuario o usuaria debe adivinarlo");
		System.out.println("El programa le dará pistas cada vez que falle");
		System.out.println();
	 }
	
	 /*
	  * Juega una partida: genera un número al azar y pide al usuario/a que lo adivine
	  * Da pistas, dice si el número a adivubar es mayor o menor.
	  * parámetro -> Scanner leerTeclado: para leer datos por teclado
	  * return -> devuelve un entero con el número de intentos que se han necesitado
	  */
	 public static int jugarPartida(Scanner leerTeclado) {
	     
	    int intentos = 0;
	    
	    return intentos;
	 }
	
	

	 /*
	  * Muestra los resultados de las partidas 
	  * parámetro -> numPartidas: número de partidas jugadas
	  * parámetro -> numIntentos: número de intentos que se han necesitados
	  * parámetro -> mejorPartida: número de intentos de la mejor partida
	  * return -> no devuelve ningún valor
	  */
	 public static void mostrarEstadisticas(int numPartidas, int numIntentos, int mejorPartida) {
	
	 }
	

}
