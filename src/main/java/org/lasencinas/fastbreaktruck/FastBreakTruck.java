package org.lasencinas.fastbreaktruck;

import org.lasencinas.bebidas.Bebida;
import org.lasencinas.bebidas.FleebJuice;
import org.lasencinas.bebidas.TurbulentJuice;
import org.lasencinas.cereales.Cereales;
import org.lasencinas.cereales.Eyeholes;
import org.lasencinas.cereales.Smiggles;
import org.lasencinas.domain.Desayuno;
import org.lasencinas.juguetes.Juguete;
import org.lasencinas.juguetes.Plumbus;


public class FastBreakTruck {

    public static Desayuno prepararEyeHoles() {
        Cereales cereales = new Eyeholes();
        Bebida bebida = new TurbulentJuice();
        Desayuno desayuno = new Desayuno(bebida, cereales);
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Cereales cereales = new Smiggles();
        Bebida bebida = new FleebJuice();
        Desayuno desayuno = new Desayuno(bebida, cereales);
        return desayuno;
    }

    public static void incluirJuguete(Desayuno eyeDes) {
        Juguete juguete = new Plumbus();
        eyeDes.setJuguete(juguete);
    }
}
