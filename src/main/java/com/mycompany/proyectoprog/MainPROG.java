/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprog;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import interfaces.Ventana;

/**
 * Clase principal (Main)
 * Esta clase contiene el Main del programa en la que se abre la interfaz y se ejecuta la melodía de acompañamiento
 * @author Iván Carrillo
 */
public class MainPROG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	

    	Ventana miVentana=new Ventana();
        try {
            
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("musica.wav")));
            sonido.start();

            
        } catch (Exception e) {
            System.out.println("" + e);
        }
    	
    }
    
}
