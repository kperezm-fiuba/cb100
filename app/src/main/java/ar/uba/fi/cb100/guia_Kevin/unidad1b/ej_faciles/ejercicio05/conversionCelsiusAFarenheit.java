package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio05;

public class conversionCelsiusAFarenheit {
    public static void main(String[] args) {

    }
    public static double conversionAFarenheit(double celsius) {
        if  (celsius < -273.15) {
            throw new IllegalArgumentException("Celsius debe ser mayor que -273.15");
        }
        return celsius * (double) 9/5 + 32;
    }
}
