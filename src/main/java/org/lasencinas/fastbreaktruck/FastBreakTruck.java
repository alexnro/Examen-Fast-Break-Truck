package org.lasencinas.fastbreaktruck;

import org.lasencinas.bebidas.Bebida;
import org.lasencinas.bebidas.TurbulentJuice;
import org.lasencinas.cereales.Cereales;
import org.lasencinas.cereales.Eyeholes;
import org.lasencinas.domain.Desayuno;


public class FastBreakTruck {

    public static Desayuno prepararEyeHoles() {
        Cereales cereales = new Eyeholes();
        Bebida bebida = new TurbulentJuice();
        Desayuno desayuno = new Desayuno(bebida, cereales);
        return desayuno;
    }
}
