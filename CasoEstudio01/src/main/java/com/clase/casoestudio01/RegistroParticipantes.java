/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase.casoestudio01;

/**
 *
 * @author fernandafajardo
 */
public class RegistroParticipantes {
    
    private String nombreCompleto;
    private int edad;
    private String posicion;
    private int numeroCamisa;

    public RegistroParticipantes() {
    }

    public RegistroParticipantes(String nombreCompleto, int edad, String posicion, int numeroCamisa) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nEdad: " + edad + " años" +
                "\nPosición: " + posicion + "\n";
    }  
}
