package ar.uba.fi.cb100.guia_Kevin.unidad2.ej_faciles.ejercicio04;

public class SeguroAnteNullEj04 {
    private SeguroAnteNullEj04() {}

    public static String seguro(String s){
        if (s!= null){
            return s;
        }
        return "";
    }
}
