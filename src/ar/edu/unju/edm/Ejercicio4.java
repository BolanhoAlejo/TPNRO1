package ar.edu.unju.edm;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese el primer valor: ");
		int Valor1 = entrada.nextInt();
		
		System.out.print("Ingrese el segundo valor: ");
		int Valor2 = entrada.nextInt();

		
		if(Valor1 >= Valor2) {
			
			System.out.print("Ingrese valores correctos");
			
		}else {
			
			int i = Valor1;
			
			while(i <= Valor2) {
				
				if(i%2 == 0) {
					
					System.out.println(i + " Es un valor par");
					
				}else {
					
					System.out.println(i + " Es un valor impar");
					
				}
				
				i++;
				
			}
			
		}
		
		
	}

}
