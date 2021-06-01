/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 * Esta es la clase principal del proyecto
 * Esta clase recoge todas las variables de las agencias de viajes
 * @author Iván Carrillo
 */
public class AgenciaViajes {
    
    private String direccion;
    private ArrayList<Aerolinea> aerolineas;

    /**
     * En este constructor tenemos todas las variables de esta clase
     * @param direccion: lugar en el que se encuentra la agencia de viajes
     * @param aerolineas: listado de aerolíneas con las que trabaja una agencia de viajes
     */
    public AgenciaViajes(String direccion, ArrayList<Aerolinea> aerolineas) {
        this.direccion = direccion;
        this.aerolineas = aerolineas;
    }
    /**
     * @return direccion: lugar en el que se encuentra la agencia de viajes
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * @return aerolineas: listado de aerolíneas con las que trabaja una agencia de viajes
     */
    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }
    /**
     * @param aerolineas
     */
    public void setAerolineas(ArrayList<Aerolinea> aerolineas) {
        this.aerolineas = aerolineas;
    }    
}
