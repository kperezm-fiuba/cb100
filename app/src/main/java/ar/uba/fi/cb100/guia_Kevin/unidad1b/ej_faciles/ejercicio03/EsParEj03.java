package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio03;

import java.util.Scanner;

public class EsParEj03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prestame un numero y te digo si es verdadero");
        String numStr =  sc.nextLine();
        int num = Integer.parseInt(numStr);
        System.out.println("Tu numero es " + (esParEj(num) ? "verdadero" : "falso"));
    }
    public static boolean esParEj(int x){
        return (x%2==0 ? true : false);
    }
}
