/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDateTime;

/**
 * Esta clase recoge las variables de los vuelos
 * @author Iván Carrillo
 */
public class Vuelo {
 
    private Aerolinea aerolinea;
    private LocalDateTime fecha;
    private int codVuelo;
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    private Avion avion;
    
    /**
     * 
     * @param aerolinea: a la que pertenece el vuelo
     * @param fecha: salida del vuelo
     * @param codVuelo: identificación única del vuelo
     * @param aeropuertoOrigen: lugar de salida
     * @param aeropuertoDestino: lugar de llegada
     * @param avion: al que pertenece el vuelo
     */
    public Vuelo(Aerolinea aerolinea, LocalDateTime fecha, int codVuelo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, Avion avion) {
        this.aerolinea = aerolinea;
        this.fecha = fecha;
        this.codVuelo = codVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.avion = avion;
    }
    /**
     * @return aerolinea
     */
    public Aerolinea getAerolinea() {
        return aerolinea;
    }
    /**
     * @param aerolinea
     */
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
    /**
     * @return fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }
    /**
     * @param fecha
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    /**
     * @return codVuelo
     */
    public int getCodVuelo() {
        return codVuelo;
    }
    /**
     * @param codVuelo
     */
    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }
    /**
     * @return aeropuertoOrigen
     */
    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }
    /**
     * @param aeropuertoOrigen
     */
    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }
    /**
     * @return aeropuertoDestino
     */
    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }
    /**
     * @param aeropuertoDestino
     */
    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }
    /**
     * @return avion
     */
    public Avion getAvion() {
        return avion;
    }
    /**
     * @param avion
     */
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    
}
