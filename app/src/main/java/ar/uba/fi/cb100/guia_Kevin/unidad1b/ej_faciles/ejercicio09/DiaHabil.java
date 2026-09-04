package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_faciles.ejercicio09;

public class DiaHabil {
    public static void main(String[] args) {
    }
    public static String esDiaHabilStr(String s){
        String res1 = s;
        String res=switch (res1){
            case "L", "M", "X", "J", "V" -> "hábil";
            case "S", "D" -> "fin de semana";
            default -> "desconocido";
        };
        return res;
    }
}
