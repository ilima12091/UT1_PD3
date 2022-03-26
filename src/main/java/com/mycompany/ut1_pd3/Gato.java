/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_pd3;

/**
 *
 * @author Ignacio
 */
public class Gato implements Mamifero {
    public String nombre;
    
    public Gato(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    public void maullar() {
        System.out.println("miau");
    }
    
    @Override
    public boolean respondeA(String nombre) {
        return false;
    }
    
    @Override
    public void caminar() {
        System.out.println(this.nombre + " está caminando");
    }

    @Override
    public void correr() {
        System.out.println(this.nombre + " está corriendo");
    }

    @Override
    public void saltar() {
        System.out.println(this.nombre + " está saltando");
    }
}
