/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Interfaces;

import Modelo.Clases.AbstractElectronico;

/**
 *
 * @author vallje02
 */
public interface IControlUniversal extends IContolTV, IControlDVD {

    public void encender();

    public void apagar();

    public void subirVolumen();

    public void bajarVolumen();

    //public void vinculaEquipo(AbstractElectronico equipo);
    //public boolean desVinculaEquipo(AbstractElectronico equipo);
    public void equipoActual(AbstractElectronico equipo) throws Exception;
}
