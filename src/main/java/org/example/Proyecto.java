package org.example;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private Arraylist listaEmpleados;
    public GerenteProyecto unnamed_GerenteProyecto_;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String aNombre) {
        this.nombre = aNombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String aDescripcion) {
        this.descripcion = aDescripcion;
    }

    public void agregarEmpleado(Empleado aEmpleado) {
        throw new UnsupportedOperationException();
    }
}
