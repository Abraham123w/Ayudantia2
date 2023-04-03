package org.example;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String aNombre) {
        this.nombre = aNombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double aSalario) {
        this.salario = aSalario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String aCargo) {
        this.cargo = aCargo;
    }
}
