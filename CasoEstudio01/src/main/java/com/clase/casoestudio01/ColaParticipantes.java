/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class ColaParticipantes extends Cola {

    public ColaParticipantes() {
        super();
    }
    
    /***
     * Cuenta la cantidad de participantes en la cola.
     * @author Fernanda Fajardo
     * @return El número total de participantes en la cola.
     */
    public int cuentaParticipantes(){
        int contador = 0;
        NodoCola actual = this.getFrente();
        while(actual != null){
            contador = contador +1;
            actual = actual.getSig();
        }
        return contador;
    }
}
