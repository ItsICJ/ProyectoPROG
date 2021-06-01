/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Esta clase recoge la única variable del ticket
 * @author Iván Carrillo
 */
public class Ticket {
    
    private byte numero;

    /**
     * @param numero: identificación única de cada ticket
     */
    public Ticket(byte numero) {
        this.numero = numero;
    }
    /**
     * @return numero
     */
    public byte getNumero() {
        return numero;
    }
    /**
     * @param numero
     */
    public void setNumero(byte numero) {
        this.numero = numero;
    }
    
    
}
