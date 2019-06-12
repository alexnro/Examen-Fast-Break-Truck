package org.lasencinas.bebidas;

import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;
import org.lasencinas.packing.Tubo;

public abstract class Bebida implements Item {

    private Packing tubo = new Tubo();

    @Override
    public abstract String nombre();

    @Override
    public abstract float pvp();

    public Packing empaquetado() {
        return tubo;
    }

    @Override
    public String toString() {
        String toString = "Item: " + this.nombre() + ", Empaquetado: " + this.empaquetado().envoltorio() + String.format(", Precio: %s", this.pvp());
        return toString;
    }
}
