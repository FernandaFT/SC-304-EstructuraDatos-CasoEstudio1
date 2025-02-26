/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class CasoEstudio01 {

    public static void main(String[] args) throws Exception {
        
        Inscripcion participante = new Inscripcion();
        
        participante.registarParticipantes("Mario Chavez", 7, "Portero", 33);
        participante.registarParticipantes("Samuel Rodríguez", 9, "Delantero", 10);
        participante.registarParticipantes("Juan Castro", 11, "Defensa", 4);
        participante.registarParticipantes("Luis Pérez", 6, "Defensa", 7);
        participante.registarParticipantes("Matías Contreras", 10, "Delantero", 15);
        participante.registarParticipantes("Isabella Domínguez", 8, "Portero", 9);
        participante.registarParticipantes("Tomas Ramírez", 8, "Defensa", 5);
        participante.registarParticipantes("Rosa Muñoz", 7, "Delantera", 12);
        participante.registarParticipantes("Pablo Porras", 7, "Delantero", 18);
        
        // Invocar al método cuentaParticipantes()
        int cantidadP = participante.getColaParticipantes().cuentaParticipantes();
        System.out.println("\nSe han registrado " + cantidadP + " participantes al torneo.\n");
        
        //Invocar el método que imprime la cola para desplegar los 9 participantes
        System.out.println("Lista de participantes inscritos");
        participante.getColaParticipantes().imprimirCola();
        
        //Invocar al método clasificaParticipantes()
        participante.clasificaParticipantes();
        
        //Invocar el método cuentaFichas()
        System.out.println("Clasificación de participantes");
        System.out.println("En la pila de Niños de 7 años o menos hay " + participante.getSub7().cuentaFichas() + " fichas.");
        System.out.println("En la pila de Niños de 8 y 9 años hay " + participante.getSub9().cuentaFichas() + " fichas.");
        System.out.println("En la pila de Niños 10 y 11 hay " + participante.getSub11().cuentaFichas() + " fichas.");
    }
}
