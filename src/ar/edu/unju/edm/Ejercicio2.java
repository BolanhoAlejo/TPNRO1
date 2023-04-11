package ar.edu.unju.edm;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el numero de mes: ");
		int mes = sc.nextInt();
		
		switch(mes) {
		
		case 1: System.out.print("El mes ingresado es Enero");
			break;
		
		case 2: System.out.print("El mes ingresado es Febrero");
			break;
			
		case 3: System.out.print("El mes ingresado es Marzo");
			break;
			
		case 4: System.out.print("El mes ingresado es Abril");
			break;
		
		case 5: System.out.print("El mes ingresado es Mayo");
			break;
		
		case 6: System.out.print("El mes ingresado es Junio");
			break;
		
		case 7: System.out.print("El mes ingresado es Julio");
			break;
		
		case 8: System.out.print("El mes ingresado es Agosto");
			break;
		
		case 9: System.out.print("El mes ingresado es Septiembre");
			break;
		
		case 10: System.out.print("El mes ingresado es Octubre");
			break;
		
		case 11: System.out.print("El mes ingresado es Noviembre");
			break;
		
		case 12: System.out.print("El mes ingresado es Diciembre");
			break;
			
		default: System.out.print("No existe ese mes");
			break;
			
		}
}
		
}


