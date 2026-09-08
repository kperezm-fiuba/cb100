package ar.uba.fi.cb100.guia_Kevin.unidad2.ej_faciles.ejercicio03;

public class IgvsEq {
    private IgvsEq() {}
    /*
    public static boolean[] igVsEq(){
        String s1 = new String("x");
        String s2 = new String("x");
        boolean[] res = new boolean[]{s1 == s2, s1.equals(s2)};
        return res;
    }
    */
    /**
     * compara dos string, por ref y por contenido
     * @param s1 primera cadena
     * @param s2 segunda cadena
     * @return {s1==s2, s1.equals(s2)}
     * */

    public static boolean[] comparar(String s1, String s2) { return new boolean[]{s1==s2, s1.equals(s2)}; }

    static void main(String[] args) {
        String s1 = new String("x");
        String s2 = new String("x");
        boolean[] direccionVsContenido = comparar(s1, s2);
        System.out.println("La respuesta al ej 01  facil es --> " + direccionVsContenido[0] + " y " + direccionVsContenido[1]);
    }
}
