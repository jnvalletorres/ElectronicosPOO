/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Clases.ControlUniversal;
import Modelo.Clases.DVD;
import Modelo.Clases.TV;
import Modelo.Interfaces.IControlUniversal;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;

/**
 *
 * @author vallje02
 */
public class Implementacion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        IControlUniversal universal = new ControlUniversal();
        do {
            try {
                limpiarPantalla();
                imprimeMenu();
                System.out.println("");
                System.out.print("Escribe un número para entrar a la opción: ");
                opcion = s.nextInt();
                ejecutaOpcionMenu(universal, opcion);
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Implementacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Implementacion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (opcion != 18);
    }

    private static void limpiarPantalla() throws IOException, InterruptedException {
        String os = System.getProperty("os.name"); //Recogemos en una variable el tipo de su SO                              
        if (os.contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }

    private static void ejecutaOpcionMenu(IControlUniversal control, int opcion) throws Exception {
        switch (opcion) {
            case 1:
                TV tv = new TV("TV-Samsumg");
                control.equipoActual(tv);
                Thread.sleep(2000);
                break;
            case 2:
                DVD dvd = new DVD("DVD-Hitachi");
                control.equipoActual(dvd);
                Thread.sleep(2000);
                break;
            case 3:
                control.encender();
                Thread.sleep(2000);
                break;
            case 4:
                control.apagar();
                Thread.sleep(2000);
                break;
            case 5:
                control.subirVolumen();
                Thread.sleep(2000);
                break;
            case 6:
                control.bajarVolumen();
                Thread.sleep(2000);
                break;
            case 7:
                control.aceptar();
                Thread.sleep(2000);
                break;
            case 8:
                control.arriba();
                Thread.sleep(2000);
                break;
            case 9:
                control.abajo();
                Thread.sleep(2000);
                break;
            case 10:
                control.izquierda();
                Thread.sleep(2000);
                break;
            case 11:
                control.derecha();
                Thread.sleep(2000);
                break;
            case 12:
                control.siguiente();
                Thread.sleep(2000);
                break;
            case 13:
                control.anterior();
                Thread.sleep(2000);
                break;
            case 14:
                control.reproducir();
                Thread.sleep(2000);
                break;
            case 15:
                control.detener();
                Thread.sleep(2000);
                break;
            case 16:
                control.expulsar();
                Thread.sleep(2000);
                break;
            case 17:
                limpiarPantalla();
                System.exit(0);
                //Thread.sleep(2000);
                break;
        }
    }

    private static void imprimeMenu() {
        System.out.println("--------------------------Menú de la Aplicación--------------------------");
        //System.out.println("");
        System.out.println("Configuración:");
        System.out.println("1.- Asignar TV");
        System.out.println("2.- Asignar DVD");
        System.out.println("Opciones Genéricas:");
        System.out.println("3.- Encender");
        System.out.println("4.- Apagar");
        System.out.println("5.- Subir volumen");
        System.out.println("6.- Bajar volumen");
        System.out.println("Opciones de TV:");
        System.out.println("7.- Aceptar");
        System.out.println("8.- Arriba");
        System.out.println("9.- Abajo");
        System.out.println("10.- Izquierda");
        System.out.println("11.- Derecha");
        System.out.println("Opciones de DVD:");
        System.out.println("12.- Siguiente");
        System.out.println("13.- Anterior");
        System.out.println("14.- Reproducir");
        System.out.println("15.- Detener");
        System.out.println("16.- Expulsar");
        //System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("17.- Salir de la aplicación");
    }

}
