/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

import Modelo.Interfaces.IControlUniversal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vallje02
 */
public class ControlUniversal implements IControlUniversal {

    //private final List<AbstractElectronico> equipos;
    private AbstractElectronico equipoActual;
    //private TV tv;
    //private DVD dvd;

    public ControlUniversal() {
        //this.equipos = new ArrayList<>();
    }

    @Override
    public void encender() {
        if (esEquipoValido()) {
            equipoActual.encender();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void apagar() {
        if (esEquipoValido()) {
            equipoActual.apagar();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void subirVolumen() {
        if (esEquipoValido()) {
            equipoActual.subirVolumen();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void bajarVolumen() {
        if (esEquipoValido()) {
            equipoActual.bajarVolumen();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void siguiente() {
        if (esEquipoValido() && equipoActual instanceof DVD) {
            ((DVD) equipoActual).siguiente();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void anterior() {
        if (esEquipoValido() && equipoActual instanceof DVD) {
            ((DVD) equipoActual).anterior();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void reproducir() {
        if (esEquipoValido() && equipoActual instanceof DVD) {
            ((DVD) equipoActual).reproducir();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void detener() {
        if (esEquipoValido() && equipoActual instanceof DVD) {
            ((DVD) equipoActual).detener();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void expulsar() {
        if (esEquipoValido() && equipoActual instanceof DVD) {
            ((DVD) equipoActual).expulsar();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void aceptar() {
        if (esEquipoValido() && equipoActual instanceof TV) {
            ((TV) equipoActual).aceptar();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void arriba() {
        if (esEquipoValido() && equipoActual instanceof TV) {
            ((TV) equipoActual).arriba();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void abajo() {
        if (esEquipoValido() && equipoActual instanceof TV) {
            ((TV) equipoActual).abajo();
        } else {
            System.out.println("Fincionalidad no disponible");
        }
    }

    @Override
    public void izquierda() {
        if (esEquipoValido() && equipoActual instanceof TV) {
            ((TV) equipoActual).izquierda();
        } else {
            System.out.println("Fincionalidad no disponible");
        }

    }

    @Override
    public void derecha() {
        if (esEquipoValido() && equipoActual instanceof TV) {
            ((TV) equipoActual).derecha();
        }

    }

    /*
    @Override
    public void vinculaEquipo(AbstractElectronico equipo) {
        //equipos.add(equipo);
        tv = (TV) equipo;
    }

    @Override
    public boolean desVinculaEquipo(AbstractElectronico equipo) {
        return equipos.remove(equipos);
    }
     */
    @Override
    public void equipoActual(AbstractElectronico equipo) throws Exception {
        equipoActual = equipo;
        System.out.println("Equipo: " + equipo.obtenerNombre() + " vinculado");
    }

    protected boolean esEquipoValido() {
        boolean valor = true;
        try {
            if (equipoActual == null) {
                valor = false;
            }
        } finally {
            return valor;
        }
    }

}
