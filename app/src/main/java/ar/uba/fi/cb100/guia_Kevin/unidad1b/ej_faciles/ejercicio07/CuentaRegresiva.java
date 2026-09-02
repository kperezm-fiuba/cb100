package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio07;

public class CuentaRegresiva {
    public static void main(String[] args) {

    }
    public static void imprimirCuentaRegresiva(int n){
        int i = n;
        if (i > 0 ){
            while(0 < i){
                System.out.println("i");
                i--;
            }
        }
        else {
            while(1 > i){
                System.out.println("i");
                i++;
            }
        }
        System.out.println("!fin!");
    }
}
