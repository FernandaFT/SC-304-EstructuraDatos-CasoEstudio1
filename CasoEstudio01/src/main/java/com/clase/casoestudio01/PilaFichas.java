/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class PilaFichas extends Pila{

    public PilaFichas() {
        super();
    }
    
    /***
     * Cuenta la cantidad de fichas en la pila.
     * @author Fernanda Fajardo
     * @return El número total de fichas en la pila.
     */
    public int cuentaFichas(){
        int contador = 0;
        NodoPila actual = this.getTop();
        while(actual != null){
            contador = contador +1;
            actual = actual.getSig();
        }
        return contador;
    }
}
