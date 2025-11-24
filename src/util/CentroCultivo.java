package util;

public class CentroCultivo {
    /**
     * Clase ubicada en el paquete util que representa a un centro de cultivo con los datos de nombre, comuna y produccion
     */
    
    private String nombre;
    private String comuna;
    private int toneladasProducidas;

    public CentroCultivo() {
    }

    public CentroCultivo(String nombre, String comuna, int toneladasProducidas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladasProducidas = toneladasProducidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getToneladasProducidas() {
        return toneladasProducidas;
    }

    public void setToneladasProducidas(int toneladasProducidas) {
        this.toneladasProducidas = toneladasProducidas;
    }

    @Override
    public String toString() {
        return "\nCentro de Cultivo: \n" + 
                "-Nombre: " + nombre +"\n" + 
                "-Comuna: " + comuna +"\n" + 
                "-Toneladas Producidas: " + toneladasProducidas + 
                "\n";
    }
    
}