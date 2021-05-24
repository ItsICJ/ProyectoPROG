/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 * Clase principal
 * 
 * @author Ivan
 */
public class AgenciaViajes {
    
    private String direccion;
    private ArrayList<Aerolinea> aerolineas;

    public AgenciaViajes(String direccion, ArrayList<Aerolinea> aerolineas) {
        this.direccion = direccion;
        this.aerolineas = aerolineas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }

    public void setAerolineas(ArrayList<Aerolinea> aerolineas) {
        this.aerolineas = aerolineas;
    }

    @Override
    public String toString() {
        return "AgenciaViajes{" + "direccion=" + direccion + ", aerolineas=" + aerolineas + '}';
    }
    
    
}
