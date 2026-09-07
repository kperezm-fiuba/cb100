package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_medio.ejercicio04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PuntoTestEj4 {
    @Test
    @DisplayName("Distancia al 0 ")
    void distanciaA0(){
        Punto p = new Punto(2,2);
        double  distanciaP = Math.sqrt(Math.pow(2,2) + Math.pow(2,2));
        Punto origen = new Punto(0,0);
        assertEquals(distanciaP, p.distanciaA(origen));
    }

}
