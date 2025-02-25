/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class Inscripcion {
    
    private ColaParticipantes cola;
    private PilaFichas sub7, sub9, sub11;
    
    public Inscripcion(){
        cola = new ColaParticipantes();
        sub7 = new PilaFichas();
        sub9 = new PilaFichas();
        sub11 = new PilaFichas();
    }
    
    public void registarParticipantes(String nombre, int edad, String posicon, int numeroCamisa){
        cola.encolar(new RegistroParticipantes(nombre, edad, posicion, numeroCamisa));
    }
}
