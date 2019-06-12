package org.lasencinas.domain;

import org.lasencinas.bebidas.Bebida;
import org.lasencinas.cereales.Cereales;
import org.lasencinas.fastbreaktruck.FastBreakTruck;
import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;

public class Desayuno implements Item {

    Bebida bebida = null;
    Cereales cereales = null;
    float coste = 0;

    public Desayuno(Bebida bebida, Cereales cereales) {
        this.bebida = bebida;
        this.cereales = cereales;
    }

    public void mostrarItems() {
        System.out.println("\n" + cereales.toString());
        System.out.println(bebida.toString());
    }

    public float getCoste() {
        coste = bebida.pvp() + cereales.pvp();
        return coste;
    }

    public String nombre() {
        return null;
    }

    public Packing empaquetado() {
        return null;
    }

    public float pvp() {
        return 0;
    }
}
