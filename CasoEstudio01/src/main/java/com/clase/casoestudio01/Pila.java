/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class Pila {
    
    private NodoPila top;
    
    public Pila(){
        top = null;
    }

    public NodoPila getTop() {
        return top;
    }

    public void setTop(NodoPila top) {
        this.top = top;
    }
    
    
    /***
     * Agrega un nuevo participante a la pila.
     * @param dato RegPart se agregará en la cima de la pila.
     */
    public void push(RegistroParticipantes dato){
        
        NodoPila miNodo = new NodoPila(dato);
        if(isEmpty()){
            top = miNodo;
        }else{
            miNodo.setSig(top);
            top = miNodo;
        }
    }
    
    /***
     * Elimina y devuelve el participante en el top de la pila.
     * @return El participante en el top de la pila, 0 {@code null} si la pila está vacía.
     */
    public RegistroParticipantes pop(){
        
        if(isEmpty()){
            System.out.println("Error: La pila está vacía, no se puede desapilar.");
            return null;
        }else{
            RegistroParticipantes dato = top.getDato();
            top = top.getSig();
            return dato;
        }
    }
    
    /**
     * Verifica si la pila esta vacía.
     * @return {@code true} si la pila no tiene elementos, {@code false} en caso contrario.
     */
    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
    
    /***
     * Imprime la pila de participantes.
     */
    public void print(){
        if(isEmpty()){
            System.out.println("La pila esta vacía");
        }else{
            NodoPila actual = top;
            while(actual != null){
                System.out.println(actual.getDato());
                actual = actual.getSig();
            }
        }
    }
}
