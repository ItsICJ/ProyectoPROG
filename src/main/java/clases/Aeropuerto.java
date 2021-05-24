/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Ivan
 */
public class Aeropuerto extends EntidadConNombre{
    
    private String ciudad;

    public Aeropuerto(String ciudad, String nombre) {
        super(nombre);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "ciudad=" + ciudad + '}';
    }
    
    
}
