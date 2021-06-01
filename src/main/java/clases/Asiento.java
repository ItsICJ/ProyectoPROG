/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase recoge todas las variables de los asientos
 * @author Iván Carrillo
 */
public class Asiento {
 
    private boolean ocupado;
    private float precio;

    /**
     * En este constructor tenemos todas las variables de esta clase
     * @param ocupado: comunica si el asiento está reservado o no lo está
     * @param precio: comunica el valor del asiento
     */
    public Asiento(boolean ocupado, float precio) {
        this.ocupado = ocupado;
        this.precio = precio;
    }
    /**
     * @return ocupado: si el asiento está ocupado (true) o no lo está (false)
     */
    public boolean isOcupado() {
        return ocupado;
    }
    /**
     * @param ocupado
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    /**
     * @return precio: valor del asiento
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
