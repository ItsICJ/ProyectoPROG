/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase recoge la única variable que heredan varias de las otras clases
 * @author Iván Carrillo
 */
public class EntidadConNombre {
	
    private String nombre;

    /**
     * @param nombre:ya sea de un avión, cliente, etc
     */
    public EntidadConNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
