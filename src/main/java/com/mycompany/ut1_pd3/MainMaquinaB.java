/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_pd3;

/**
 *
 * @author Ignacio
 */
public class MainMaquinaB {

    public static void main(String[] args) {
        Gato gato = new Gato("GatoTest");
        System.out.println(gato.getNombre());
        gato.maullar();
        System.out.println(gato.respondeA("GatoTest"));
        System.out.println(gato.respondeA("Test"));
    }
}
