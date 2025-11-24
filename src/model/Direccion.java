package model;

public class Direccion {
    /**
     * Clase ubicada en el paquete model y representa una dirección (Calle, ciudad y región)
     */
    
    private String calle, ciudad, region;
    
    public Direccion() {
        
    }

    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "\nDireccion {" + "Calle: " + calle + 
                ", Ciudad: " + ciudad + 
                ", Region: " + region + 
                '}';
    }
    
}
