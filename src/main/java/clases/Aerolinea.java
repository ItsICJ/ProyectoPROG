/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Ivan
 */
public class Aerolinea extends EntidadConNombre{
    
    private boolean asientoLibre;
    private HashSet<Avion> aviones;
    private ArrayList<Vuelo> vuelos;


	public Aerolinea(String nombre, boolean asientoLibre, HashSet<Avion> aviones, ArrayList<Vuelo> vuelos) {
		super(nombre);
		this.asientoLibre = asientoLibre;
		this.aviones = aviones;
		this.vuelos = vuelos;
	}

	public boolean isAsientoLibre() {
        return asientoLibre;
    }

    public void setAsientoLibre(boolean asientoLibre) {
        this.asientoLibre = asientoLibre;
    }

    public HashSet<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(HashSet<Avion> aviones) {
        this.aviones = aviones;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    
}
