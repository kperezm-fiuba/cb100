package ar.uba.fi.cb100.guia_Kevin.unidad2.ej_faciles.ejercicio04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SeguroAnteNullEj04Test {
    @Test
    @DisplayName("Probando con null")
    void probandoConNull() {
        String nulo = null;
        assertEquals("", SeguroAnteNullEj04.seguro(nulo));
    }

    @Test
    @DisplayName("Probando con texto")
    void probandoConTexto() {
        String texto = "Texto";
        assertEquals(texto, SeguroAnteNullEj04.seguro(texto));
    }
}
