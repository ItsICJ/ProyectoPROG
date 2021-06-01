/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase recoge todas las variables de los aviones
 * @author Iván Carrillo 
 */
public class Avion {
    
    private Asiento[][] asientos;
    private String modelo;
    private String matricula;

    /**
     * En este constructor tenemos todas las variables de esta clase
     * @param asientos: matriz de todos los asientos de un avión
     * @param modelo: de cada avión
     * @param matricula: de cada avión
     */
    public Avion(Asiento[][] asientos, String modelo, String matricula) {
        this.asientos = asientos;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    /**
     * @return asientos: matriz de todos los asientos de ujn avión
     */
    public Asiento[][] getAsientos() {
        return asientos;
    }
    /**
     * @param asientos
     */
    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    /**
     * @return modelo: de cada avión
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * @return matricula: de cada avión
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
