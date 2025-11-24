package model;

public class Empleado extends Persona {
    /**
    * Clase ubicada en el paquete model y representa un empleado (Nombre, RUT, dirección, cargo y sueldo)
    */
    
    private String cargo;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, String rut, Direccion direccion, String cargo, int sueldo ) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() { // Agregar datos de Persona
        return super.toString() +
                "\nEmpleado {" + 
                "Cargo: " + cargo + 
                ", Sueldo: $" + sueldo + 
                '}' +  "\n";
    }
    
}
