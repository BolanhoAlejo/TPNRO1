package ar.edu.unju.edm;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		while(true) {
			
			System.out.println("Ingrese un numero: ");
			n = entrada.nextInt();
			
			if(n>0) {
				
				for(int i=2;i<=n;i++) {
					
					int c = 2;
					boolean Verif = true;
					
					while(Verif && c < i) {
						
						if(i % c == 0) {
							
							Verif = false;
							
						}else {
							
							c++;
							
						}
						
						
					}
					
				if(Verif == true) {	
					
				System.out.println(i + " es un numero primo");
				
			}
				
				}
				
				{break;}
				
			}else {
				
				System.out.println("El valor ingresado no es correcto");
				
			}
			
		}

	}

}
