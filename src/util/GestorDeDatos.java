package util;
import java.io.*;
import java.util.ArrayList;


public class GestorDeDatos {
    /**
     * Clase ubicada en el paquete util que permite interactuar con archivos fuera del programa (txt)
     */
    
        public static ArrayList<CentroCultivo> cargarArchivo(String rutaArchivo) {
        ArrayList<CentroCultivo> listaCentros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String comuna = datos[1].trim();
                    int toneladas = Integer.parseInt(datos[2].trim());
                    CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);
                    listaCentros.add(centro);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return listaCentros;
    }
    
     public static CentroCultivo buscarPorNombre(ArrayList<CentroCultivo> lista, String nombreBuscado) {
        for (CentroCultivo centro : lista) {
            if (centro.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return centro;
            }
        }
        return null; // No encontrado
    }
}