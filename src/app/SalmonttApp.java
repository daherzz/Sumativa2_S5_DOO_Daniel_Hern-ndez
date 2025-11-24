package app;

import java.util.ArrayList;
import java.util.Scanner;
import model.Empleado;
import service.EmpleadoService;

public class SalmonttApp {
    /**
    * Clase principal ubicada en el paquete app que nos permite iniciar el programa
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abrirArchivo = null;
        int seleccion;
        
        while (true) {
        System.out.println("Ingrese 1 para abrir archivo .txt o ingrese 2 para abrir archivo .csv");

        try {
            seleccion = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Dato ingresado no valido\n");
            continue;
        }

        if (seleccion == 1) {
            abrirArchivo = "src/service/ListaDeEmpleados1.txt";
            break;
        } else if (seleccion == 2) {
            abrirArchivo = "src/service/ListaDeEmpleados2.csv";
            break;
        } else {
            System.out.println("Seleccion no valida\n");
        }
    }
        
        System.out.println("* * * * * * * * * * * * * * * * * *");
        
        System.out.println("\nLista de empleados en la fabrica: \n");
        EmpleadoService servicio = new EmpleadoService();
        ArrayList<Empleado> lista = servicio.cargarEmpleados(abrirArchivo);
        
        for (Empleado emple : lista) {
            System.out.println(emple);
        }
        
        System.out.println("* * * * * * * * * * * * * * * * * *");
        
        String buscarPorRut = null;
        boolean finalizar = false;
        
        do {
            
            System.out.println("\nIngrese un rut para buscar (sin puntos y con guion): ");
            buscarPorRut = sc.nextLine().trim();
            
            Empleado encontrado = servicio.buscarPorRut(lista, buscarPorRut);
            if (encontrado != null) {
                System.out.println("\nEmpleado encontrado en la lista: \n");
                System.out.println(encontrado);
                System.out.println("* * * * * * * * * * * * * * * * * *");
                finalizar = true;
            } else {
                System.out.println("\nEmpleado no encontrado en la lista, intente nuevamente");
                finalizar = false;
            }
            
        } while (finalizar != true);
        
        
        
        
        
        System.out.println("\nAplicacion cerrada, hasta la proxima!\n");

    }
    
}
