/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class NodoCola {
    
    private RegistroParticipantes dato;
    private NodoCola sig;

    public NodoCola(RegistroParticipantes dato) {
        this.dato = dato;
        this.sig = null;
    }

    public RegistroParticipantes getDato() {
        return dato;
    }

    public void setDato(RegistroParticipantes dato) {
        this.dato = dato;
    }

    public NodoCola getSig() {
        return sig;
    }

    public void setSig(NodoCola sig) {
        this.sig = sig;
    }  
}
