/**********************************************************************************************************
 * 
 * Nombre: Cristina Valtierra
 * Fecha: 31/10/2025
 * Modulo: Programación. - UD02. 
 * Tarea: PROG02 - Tarea: Evaluación01: Programa que muestra los intereses que genera un montante a partir
 * de los datos indicados por el usuario.
 * Autoevaluación: 
 * Descripción del programa: Se solicita datos al usuario y se muestran los resultados de los intereses
 * generados con los datos introducidos por el mismo.
 * URL: https://drive.google.com/file/d/18FXZdJ3uWUA_kuOacEQOuHWzGTUK0Jtm/view?usp=sharing
 **********************************************************************************************************/


package org.tareaEvaluacion01;

import java.util.Scanner;

public class CalculosDeposito {

	public static void main(String[] args) {
		
		// Creación del objeto Scanner para utilizar pidiendo datos por teclado
		Scanner scn = new Scanner(System.in);
		
		// Variables para el uso del programa
		int years = 0;
		double initialAmount = 0;
		double extraAmount = 0;
		double interestRate = 0;
		
					
		
		// Muestra el texto inicial solicitado
		initialText();

		// Solicitud de depósito a invertir
		System.out.print("\nIntroduce la cantidad del deposito inicial: ");
		initialAmount = scn.nextDouble();
		
		
		// Muestra los intereses totales generados con diferentes ratios en diferentes años
		showTotalInterest(initialAmount);
		
		
		// Solicitud de datos y recogida de los mismos en las variables	
		System.out.print("\n\nIntroduce la aportación anual a partir del segundo año: ");
		extraAmount = scn.nextDouble();
		
		System.out.print("Introduce la tasa de interés (%): ");
		interestRate = scn.nextDouble();
		
		System.out.print("Introduce la duración del depósito (años): ");
		years = scn.nextInt();
		
		// Cierre scanner
		scn.close();
		
		// Mostrando datos del capital aportado durante la duración del depósito	
		showAnualInterest(initialAmount, extraAmount, interestRate, years);
		
		
		
	}
	
	// Constantes
	private static final int MIN_YEARS = 5;
    private static final int MAX_YEARS = 8;
    private static final double INTEREST_STEP = 0.50;
    private static final double MIN_INTEREST = 1.00;
    private static final double MAX_INTEREST = 2.50;
    private static final double ROUND_FACTOR = 100.0;
	
	/*
	 * Método para visualizar el texto inicial 
	 */
	public static void initialText() {
		System.out.println("Este programa calcula los intereses obtenidos con un depósito a plazo fijo" 
						+ "\nPedirá la cantidad a invertir, la tasa de interés, la duración y la aportación anual" 
						+"\nCalculará los intereses totales para diferentes tasas de interés y plazos" 
						+"\nCalculará los intereses anuales y el nuevo capital durante la vida del depósito" 
						+"\nEmpezamos ya");
	}
	
	/*
	 * Método para el cálculo de interés total
	 * parámetro deposit -> cantidad sobre la que se calcula el interés
	 * parámetro interest -> ratio de interés a calcular
	 * parámetro years -> número de años
	 * return -> devuelve el interés total
	 */
	public static double totalInterest(double deposit, double interest, int years) {
		double totalInterest = 0;
		totalInterest = deposit * (interest /100) * years;
		return totalInterest;
	}
	
	
	
	/*
	 * Método para mostrar el interés total 
	 * initialDeposit -> cantidad inicial del depósito
	 */
	public static void showTotalInterest(double initialDeposit) {
		for(int years = MIN_YEARS; years <= MAX_YEARS; years++) {
			System.out.print("\n" + years + " años \t");
			for(double interest = MIN_INTEREST; interest <= MAX_INTEREST; interest += INTEREST_STEP) {
				System.out.print(roundNumber(totalInterest(initialDeposit, interest, years))
					+ ("(" + interest + "%)\t"));
			}
		}	
	}
	
	
	/*
	 * Método para el cálculo del interés anual 
	 * rate -> interés aplicado al depósito
	 * totalAmount -> cantidad total del depósito
	 * return -> devuelve el interés anual
	 */
	public static double anualInterest(double rate, double totalAmount) {
		double anualInterest = 0;
		anualInterest = totalAmount * (rate /100);
		return anualInterest;
	}
	
	
	/*
	 * Método para mostrar el resultado del interés anual 
	 * initialDeposit -> cantidad del depósito inicial
	 * extraDeposit -> cantidad del depósito extra que se añade cada nuevo año al depósito inicial
	 * rate -> interés aplicado al depósito
	 * years -> número de años a mantener el depósito
	 */
	public static void showAnualInterest(double initialDeposit, double extraDeposit, double rate, int years) {
		double totalDeposit = initialDeposit;
		for (int yrs = 1; yrs <= years; yrs++) {
			System.out.println("Año " + yrs 
							+"\n\tC.Inicial: " + roundNumber(totalDeposit)
							+"\n\tIntereses: " + roundNumber(anualInterest(rate, totalDeposit)));
			
			totalDeposit += extraDeposit + anualInterest(rate, totalDeposit);
		}
	}
	
	
	/*
	 * Método que convierte un número con formato a 2 decimales
	 * number -> número decimal a formatear a 2 decimales
	 * return -> devuelve un número formateado a 2 decimales 
	 */
	public static double roundNumber(double number) {
	    return Math.round(number * ROUND_FACTOR) / ROUND_FACTOR;
	}
	
}	
