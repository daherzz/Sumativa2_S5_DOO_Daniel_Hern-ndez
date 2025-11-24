package service;

import java.io.*;
import java.util.ArrayList;
import model.Direccion;
import model.Empleado;

public class EmpleadoService {
    /**
    * Clase ubicada en el paquete service y nos permite leer e interactuar con archivos externos
    */
    
    public ArrayList<Empleado> cargarEmpleados(String rutaArchivo) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String leerLinea;
            while((leerLinea = br.readLine()) != null){
                String[] datos = leerLinea.split(",");
                if (datos.length == 7) {
                    String nombre = datos[0].trim();
                    String rut = datos[1].trim();
                    String calle = datos[2].trim();
                    String ciudad = datos[3].trim();
                    String region = datos[4].trim();
                    String cargo = datos[5].trim();
                    int sueldo = Integer.parseInt(datos[6].trim());
                    
                    Direccion direccion = new Direccion(calle, ciudad, region);
                    Empleado empleado = new Empleado(nombre, rut, direccion, cargo, sueldo);
                    
                    empleados.add(empleado);
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer archivo");
        }
        return empleados;   
    } 
    
    
    public Empleado buscarPorRut (ArrayList<Empleado> empleados, String rut) {
        for (Empleado empl : empleados) {
            if (empl.getRut().equalsIgnoreCase(rut)) {
                return empl;
            }
        }
        return null;
    }

}
