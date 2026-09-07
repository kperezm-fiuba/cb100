package ar.uba.fi.cb100.guia_Kevin.unidad1b.ej_medio.ejercicio09;

//Enum con datos. Definí enum Moneda con un símbolo asociado a cada valor (constructor de
//enum) y untodo que lo devuelva


public enum Moneda {
    YENES("Y$"),
    DOLARES("US$"),
    PESOS("$");
    private final String simbolo;

    Moneda(String simbolo) {
        this.simbolo = simbolo;
    }
    /**
     * return el simbolo de la moneda
     * */
    public String simbolo() {
        return simbolo;
    }


}
