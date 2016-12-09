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
public abstract class AbstractElectronico {

    protected final String nombre;

    public AbstractElectronico(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void encender() {
        System.out.println(nombre + "-Encendido");
    }

    public void apagar() {
        System.out.println(nombre + "-Apagado");
    }

    public void subirVolumen() {
        System.out.println(nombre + "-Subir Volumen");
    }

    public void bajarVolumen() {
        System.out.println(nombre + "-Bajar Volumen");
    }

    public String obtenerNombre() {
        return nombre;
    }

}
