package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_medio.ejercicio04;


//Record Punto. Creá record Punto(double x, double y) con distanciaA(Punto o). Escribí dos
//tests.


public record Punto(double x, double y) {

    /* El constructor no hace falta porque ya intellIj crea el constructor
    , accesores  y los metodos equals, Hashcode y toString


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    */

    /**
     * Distancia Euclidea entre dos puntos
     *
     * @param o otro punto
     * @return distancia
     *
     * **/
    public double distanciaA(Punto o ){
        return Math.sqrt(Math.pow(x - o.x, 2) + Math.pow(y - o.y, 2));
    }


}
