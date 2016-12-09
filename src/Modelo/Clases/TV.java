/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author vallje02
 */
public class TV extends AbstractElectronico {

    public TV(String nombre) {
        super(nombre);
    }

    public void aceptar() {
        System.out.println(nombre + "-Aceptar");
    }

    public void arriba() {
        System.out.println(nombre + "-Arriba");
    }

    public void abajo() {
        System.out.println(nombre + "-Abajo");
    }

    public void izquierda() {
        System.out.println(nombre + "-Izquierda");
    }

    public void derecha() {
        System.out.println(nombre + "-Derecha");
    }

}
