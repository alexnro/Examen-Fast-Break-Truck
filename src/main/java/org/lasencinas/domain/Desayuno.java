package org.lasencinas.domain;

import org.lasencinas.bebidas.Bebida;
import org.lasencinas.cereales.Cereales;
import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;
import org.lasencinas.juguetes.Juguete;

public class Desayuno implements Item {

    private Bebida bebida = null;
    private Cereales cereales = null;
    private Juguete juguete = null;
    private float coste = 0;
    private boolean existeJuguete = false;

    public Desayuno(Bebida bebida, Cereales cereales) {
        this.bebida = bebida;
        this.cereales = cereales;
    }

    public void mostrarItems() {
        System.out.println("\n" + cereales.toString());
        System.out.println(bebida.toString());
        if (existeJuguete) {
            System.out.println(juguete.toString());
        }
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
        this.setExisteJuguete(true);

    }

    public void setExisteJuguete(boolean existeJuguete) {
        this.existeJuguete = existeJuguete;
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
