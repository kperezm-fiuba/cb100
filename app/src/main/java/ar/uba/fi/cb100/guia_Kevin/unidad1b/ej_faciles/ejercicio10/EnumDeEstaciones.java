package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio10;

public enum EnumDeEstaciones {
    VERANO, OTONO, INVIERNO, PRIMAVERA;
    public static void imprimirEstaciones(){
        for (EnumDeEstaciones estacion : EnumDeEstaciones.values()){
            System.out.println(estacion);
        }

    }
    public static void main(String[] args) {
        imprimirEstaciones();
    }

}
