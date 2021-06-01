/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase recoge todas las variables de los aeropuertos y hereda de la clase EntidadConNombre
 * @author Iván Carrillo
 */
public class Aeropuerto extends EntidadConNombre{
    
    private String ciudad;
    
    /**
     * En este constructor tenemos todas las variables de esta clase
     * @param ciudad: nombre del lugar en el que se encuentra el aeropuerto
     * @param nombre: nombre del aeropuerto
     */
    public Aeropuerto(String ciudad, String nombre) {
        super(nombre);
        this.ciudad = ciudad;
    }
    /**
     * @return ciudad: nombre de la ciudad del aeropuerto
     */
    public String getCiudad() {
        return ciudad;
    }
    /**
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
