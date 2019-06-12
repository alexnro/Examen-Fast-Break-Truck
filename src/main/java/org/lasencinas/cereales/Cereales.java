package org.lasencinas.cereales;

import org.lasencinas.interfaces.Item;
import org.lasencinas.interfaces.Packing;
import org.lasencinas.packing.Caja;

public abstract class Cereales implements Item {

    private Packing caja = new Caja();

    public Packing empaquetado() {
        return caja;
    }

    @Override
    public String toString() {
        String toString = "Item: " + this.nombre() + ", Empaquetado: " + this.empaquetado().envoltorio() + String.format(", Precio: %s", this.pvp());
        return toString;
    }
}
