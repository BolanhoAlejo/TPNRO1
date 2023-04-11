package ar.edu.unju.edm;

import java.util.Scanner;

public class Ejercicio1 {
	
	int año;
	
	Scanner entrada = new Scanner(System.in);

	public void EntradaAño() {
		System.out.println("Determinar si el año es bisiesto");
		System.out.print("Ingrese el año a evaluar: ");
		año = entrada.nextInt();
	}
	
	public void verif() {
		
		if((año % 4 == 0) && (año % 100 != 0 || año % 400 == 0)) {
			
			System.out.print(año + " es un año bisiesto");
			
		}else {
			
			System.out.print(año + " no es un año bisiesto");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Ejercicio1 fc = new Ejercicio1();
		fc.EntradaAño();
		fc.verif();
		
	}
	
}

