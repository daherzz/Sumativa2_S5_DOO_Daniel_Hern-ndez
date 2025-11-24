package model;

public class Persona {
    /**
    * Clase ubicada en el paquete model y representa una persona (Nombre, RUT y dirección)
    */
    
    private String nombre, rut;
    private Direccion direccion;
    
    public Persona() { 
    }

    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona {" + "Nombre: " + nombre + 
                ", RUT: " + rut + '}' +
                direccion;
    }

}
