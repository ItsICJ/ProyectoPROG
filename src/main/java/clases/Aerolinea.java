/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Esta clase recoge todas las variables de las aerolíneas y hereda de la clase EntidadConNombre
 * @author Iván Carrillo
 */
public class Aerolinea extends EntidadConNombre{
    
    private boolean asientoLibre;
    private HashSet<Avion> aviones;
    private ArrayList<Vuelo> vuelos;

    /**
     * En este constructor tenemos todas las variables de esta clase
     * 
     * @param nombre: heredada de entidad con nombre y recoge el nombre de la aerolínea
     * @param asientoLibre: comunica si hay un asiento libre o no
     * @param aviones: listado de aviones de la aerolínea
     * @param vuelos: listado de vuelos de la aerolínea
     */
	public Aerolinea(String nombre, boolean asientoLibre, HashSet<Avion> aviones, ArrayList<Vuelo> vuelos) {
		super(nombre);
		this.asientoLibre = asientoLibre;
		this.aviones = aviones;
		this.vuelos = vuelos;
	}
	public Aerolinea(String nombre) {
		super(nombre);
	}
	/**
	 * @return asientoLibre: true si está libre y false si está ocupado
	 */
	public boolean isAsientoLibre() {
        return asientoLibre;
    }
	/**
	 * @param asientoLibre
	 */
    public void setAsientoLibre(boolean asientoLibre) {
        this.asientoLibre = asientoLibre;
    }
    /**
     * @return aviones: listado de aviones
     */
    public HashSet<Avion> getAviones() {
        return aviones;
    }
    /**
     * @param aviones
     */
    public void setAviones(HashSet<Avion> aviones) {
        this.aviones = aviones;
    }
    /**
     * @return vuelos: listado de vuelos
     */
    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
    /**
     * @param vuelos
     */
    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    
}
