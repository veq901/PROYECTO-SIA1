/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosia1_sistemaventaseminarios;

/**
 *
 * Integrantes:
 * Constanza Contreras
 * Vicente Parada
 * Raul Rozas
 */
public class Asistente {
    private String idAsistente;
    private String nombre;
    private int edad;
    private String email;

    public Asistente(String idAsistente, String nombre, int edad, String email) {
        //Inserte validaciones pertinentes
        this.idAsistente = idAsistente;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    } 

    public String getidAsistente() {
        return idAsistente;
    }

    public String getEmail() {
        return email;
    }  

    public int getEdad() {
        return edad;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setidAsistente(String idAsistente) {
        this.idAsistente = idAsistente;
    }   

    public void setEmail(String email) {
        this.email = email;
    }  

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

