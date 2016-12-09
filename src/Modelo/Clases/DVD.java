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
public class DVD extends AbstractElectronico {

    public DVD(String nombre) {
        super(nombre);
    }

    public void siguiente() {
        System.out.println(nombre + "-Siguiente Pista");
    }

    public void anterior() {
        System.out.println(nombre + "-Pista Anterior");
    }

    public void reproducir() {
        System.out.println(nombre + "-Reproducir");
    }

    public void detener() {
        System.out.println(nombre + "-Detener");
    }

    public void expulsar() {
        System.out.println(nombre + "-Expulsar Disco");
    }
}
