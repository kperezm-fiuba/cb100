package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio05;

import ar.uba.fi.cb100.guia.i01_intro.i02_facil.e02.Operaciones;
import ar.uba.fi.cb100.guia.i01_intro.i02_facil.e05.CelsiusAFahrenheit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class conversionCelsiusAFarenheitTest {
    @Test
    @DisplayName("0 Celsius son 32 Fahrenheit")
    void ceroGrados() {
        assertEquals(32.0, conversionCelsiusAFarenheit.conversionAFarenheit(0));
    }

    @Test
    @DisplayName("100 Celsius son 212 Fahrenheit")
    void cienGrados() {
        assertEquals(212.0, conversionCelsiusAFarenheit.conversionAFarenheit(100));
    }

    @Test
    @DisplayName("37 Celsius son 98.6 Fahrenheit")
    void temperaturaCorporal() {
        assertEquals(98.6, conversionCelsiusAFarenheit.conversionAFarenheit(37));
    }

    @Test
    @DisplayName("Numero menor a 0 abs lanza excepcion")
    void numeroMenorAAbsoluto(){
        assertThrows(IllegalArgumentException.class, () -> conversionCelsiusAFarenheit.conversionAFarenheit(-300.0));
    }
}
