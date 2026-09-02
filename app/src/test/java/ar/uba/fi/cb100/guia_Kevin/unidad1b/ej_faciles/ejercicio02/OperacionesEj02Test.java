package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesEj02Test {
    @Test
    @DisplayName("Suma enteros")
    void sumaTest() {
        assertEquals(10, OperacionesEj02.sumaNumEj02(20, -10));
    }

    @Test
    @DisplayName("Division por 0 me lanza excepcion")
    void divisionPor0Test() {
        assertThrows(ArithmeticException.class, () -> OperacionesEj02.divisionEj02(5,0));

    }
}
