package ar.edu.unju.edm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio5 {
    Empleado empleado1, empleado2;
    Scanner entrada = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    void entrada() {
        empleado1 = new Empleado();
        System.out.println("Ingrese datos del empleado 1:");
        System.out.println("Nombre:");
        empleado1.setNombre(entrada.next());
        Calendar fecha1 = Calendar.getInstance();
        System.out.println("Fecha de ingreso:");
        try {
            fecha1.setTime(sdf.parse(entrada.next()));
        } catch (ParseException _e) {
            System.out.println("Formato invalido");
        }
        empleado1.setIngreso(fecha1);
        System.out.println("Legajo:");
        empleado1.setLegajo(entrada.nextInt());
        System.out.println("Email:");
        empleado1.setEmail(entrada.next());
        System.out.println("Horas trabajadas:");
        empleado1.setHoras(entrada.nextInt());

        System.out.println("Ingrese datos del empleado 2:");
        System.out.println("Nombre:");
        String nombre = entrada.next();
        Calendar fecha2 = Calendar.getInstance();
        System.out.println("Fecha de ingreso:");
        try {
            fecha2.setTime(sdf.parse(entrada.next()));
        } catch (ParseException _e) {
            System.out.println("Formato invalido");
        }
        System.out.println("Legajo:");
        int legajo = entrada.nextInt();
        System.out.println("Email:");
        String email = entrada.next();
        System.out.println("Horas trabajadas:");
        int horas = entrada.nextInt();
        empleado2 = new Empleado(nombre, fecha2, legajo, email, horas);
    }

    void mostrar() {
        System.out.println("Empleado 1");
        System.out.println("==========");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Fecha de ingreso: " + sdf.format(empleado1.getIngreso().getTime()));
        System.out.println("Legajo: " + empleado1.getLegajo());
        System.out.println("Email: " + empleado1.getEmail());
        System.out.println("Horas trabajadas: " + empleado1.getHoras());
        System.out.println("Sueldo: $" + empleado1.getSueldo());

        System.out.println("Empleado 2");
        System.out.println("==========");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Fecha de ingreso: " + sdf.format(empleado2.getIngreso().getTime()));
        System.out.println("Legajo: " + empleado2.getLegajo());
        System.out.println("Email: " + empleado2.getEmail());
        System.out.println("Horas trabajadas: " + empleado2.getHoras());
        System.out.println("Sueldo: $" + empleado2.getSueldo());
    }

public static void main(String[] args) {
	
	Ejercicio5 ej5 = new Ejercicio5();
	ej5.entrada();
	ej5.mostrar();
	
}
    
}