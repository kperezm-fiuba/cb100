package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_dificiles.ejercicio01;

//FizzBuzz. Del 1 al n: “Fizz” si es múltiplo de 3, “Buzz” si de 5, “FizzBuzz” si de ambos, y el
//número si no. Resolvelo con un switch expression sobre un boolean combinado.


public class FizzBuzz {
    /**Const privado. Clase de utilidades no se instancia*/
    private FizzBuzz() {

    }

    // El profe lo hizo sin switch expression y los test son los esperables.

    /*
    private int numeroN;

    public FizzBuzz(int n) {
        this.numeroN = n;
    }

    public int getNumeroN() {
        return numeroN;
    }

    public int fizzBuzz(int n){
        String resultado = switch (n){
            case int nCase when nCase % 3 == 0 ->  "Fizz";
            case int nCase when  nCase % 5 == 0 ->  "Buzz";
            default -> Integer.toString(nCase);
        }
    }
    */

}
