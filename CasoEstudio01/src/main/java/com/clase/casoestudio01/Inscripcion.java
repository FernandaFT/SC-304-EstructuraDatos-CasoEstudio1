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
    
    public ColaParticipantes getColaParticipantes(){
        return cola;
    }

    public ColaParticipantes getCola() {
        return cola;
    }

    public void setCola(ColaParticipantes cola) {
        this.cola = cola;
    }

    public PilaFichas getSub7() {
        return sub7;
    }

    public void setSub7(PilaFichas sub7) {
        this.sub7 = sub7;
    }

    public PilaFichas getSub9() {
        return sub9;
    }

    public void setSub9(PilaFichas sub9) {
        this.sub9 = sub9;
    }

    public PilaFichas getSub11() {
        return sub11;
    }

    public void setSub11(PilaFichas sub11) {
        this.sub11 = sub11;
    }
    
    
    /***
     * Registro a un nuevo participante en la cola.
     * @author Fernanda Fajardo
     * @param nombre El nuevo participante se le añadirá el nombre
     * @param edad El nuevo participante se le añadirá la edad
     * @param posicion El nuevo participante se le añadirá la posición
     * @param numeroCamisa El nuevo participante se le añadirá el número de camisa
     */
    public void registarParticipantes(String nombre, int edad, String posicion, int numeroCamisa){
        cola.encolar(new RegistroParticipantes(nombre, edad, posicion, numeroCamisa));
    }
    
    /***
     * Clasifica los participantes según su edad en tres grupos
     * - Menores o igual a 7 años en el grupo sub7
     * - Menosre o igual a 9 años en el grupo sub9
     * - El resto en el grupo sub11
     * @author Fernanda Fajardo
     * @throws Exception Si ocurre un error al desencolar un participante de la cola.
     */
    public void clasificaParticipantes() throws Exception{
        
        while (!cola.isEmpty()){
           RegistroParticipantes participante = cola.desencolar();
           if(participante.getEdad() <= 7){
               sub7.push(participante);
           }else if(participante.getEdad() <= 9){
               sub9.push(participante);
           }else {
               sub11.push(participante);
           }
        }
    }
}
