/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class NodoPila {
    
    private RegistroParticipantes dato;
    private NodoPila sig;

    public NodoPila(RegistroParticipantes dato) {
        this.dato = dato;
        this.sig = null;
    }

    public RegistroParticipantes getDato() {
        return dato;
    }

    public void setDato(RegistroParticipantes dato) {
        this.dato = dato;
    }

    public NodoPila getSig() {
        return sig;
    }

    public void setSig(NodoPila sig) {
        this.sig = sig;
    }
}
