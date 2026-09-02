package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio06;

import java.util.Scanner;

public class tablaDeMultiplicarEj06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero y te muestro la tabla de multiplicar");
        String strTabla = sc.nextLine();
        int numTabla = Integer.parseInt(strTabla);
        imprimirTabla(numTabla);

    }
    public static void imprimirTabla(int x){
        for (int i = 1; i <= 10; i++) {
            System.out.print("1 x " + x + " = " + (x * i) + "\n");
        }
    }
}
