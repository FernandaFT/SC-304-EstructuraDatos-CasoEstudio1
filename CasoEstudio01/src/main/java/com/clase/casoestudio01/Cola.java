/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class Cola {
    
    private NodoCola frente;
    private NodoCola ultimo;
    
    public Cola(){
        this.frente = null;
        this.ultimo = null;
    }

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }
    
    /***
     * Agrega un nuevo Participante a la cola.
     * @param participante Participante será agregado a la cola.
     */
    public void encolar(RegistroParticipantes participante){
        
        NodoCola aux = new NodoCola(participante);
        if(this.ultimo != null){
            this.ultimo.setSig(aux);
        }else{
            this.frente = aux;
        }
        this.ultimo = aux;
    }
    
    /***
     * Elimina y devuelve el primer participante en la cola.
     * @return El RegistroParticipantes que estaba en el frente de la cola.
     * @throws Exception Sí la cola está vacía.
     */
    public RegistroParticipantes desencolar() throws Exception{
        
        if(this.frente == null){
            throw new Exception("Error: No se puede desencolar ya que está vacía.");
        }
        
        RegistroParticipantes participante = this.frente.getDato();// Acceso seguro para acceder al dato
        this.frente = this.frente.getSig();
        
        if(this.frente == null){
            this.ultimo = null;
        }
        return participante;
    }
    
    /***
     * Devuelve el participante que está al frente de la cola sin descolarlo.
     * @return El objeto RegistroParticipantes es el frente de la cola, o null si la cola está vacía.
     */
    public RegistroParticipantes frente(){
        return (this.frente != null) ? this.frente.getDato() : null;
    }
    
    public boolean isEmpty(){
        return frente == null;
    }
}
