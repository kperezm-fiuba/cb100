package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio02;

public class OperacionesEj02 {
    public static void main(String[] args) {

    }
    private OperacionesEj02(){}
    public static int sumaNumEj02(int a, int b) { return a + b;}
    public static int restaNumEj02(int a, int b) { return a - b;}
    public static int productoEj02(int a, int b) {return a * b;}
    public static double divisionEj02(int a, int b) {
        if  (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

}
