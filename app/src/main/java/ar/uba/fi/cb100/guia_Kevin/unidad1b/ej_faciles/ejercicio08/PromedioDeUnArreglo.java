package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio08;

public class PromedioDeUnArreglo {
    public static void main(String[] args) {

    }
    public static int promedioDeUnArreglo(double[] a) {
        int res = 0;
        for (double x: a){
            res += x;
        }
        return res/a.length;
    }
}
