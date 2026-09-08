package ar.uba.fi.cb100.guia_Kevin.unidad2.ejercicio05;
import java.util.Optional;

public class OptionalConDefaultEj05 {
    private OptionalConDefaultEj05() {}

    public static String orDefault(Optional<String> o){
        if (o.isPresent()){
            return o.get();
        }
        return "N/A";
    }

    static void main(String[] args) {
        Optional<String> o1 = Optional.of("Texto");
        Optional<String> o2 = Optional.empty();
        System.out.println("Deberia tirar textito --> "+ orDefault(o1));
        System.out.println(" NO deberia tirar textito --> "+ orDefault(o2));
    }
}
