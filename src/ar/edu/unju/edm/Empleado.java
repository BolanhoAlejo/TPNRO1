package ar.edu.unju.edm;

import java.util.Calendar;

public class Empleado {
    private String nombre;
    private Calendar ingreso;
    private int legajo;
    private String email;
    private int horas;

    public Empleado() {

    }

    public Empleado(String nombre, Calendar ingreso, int legajo, String email, int horas) {
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.legajo = legajo;
        this.email = email;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getIngreso() {
        return ingreso;
    }

    public void setIngreso(Calendar ingreso) {
        this.ingreso = ingreso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSueldo() {
        if (horas <= 160) {
            return horas * 4000;
        } else {
            int exceso = horas - 160;
            return 160 * 4000 + exceso * 5500;
        }
    }
}
