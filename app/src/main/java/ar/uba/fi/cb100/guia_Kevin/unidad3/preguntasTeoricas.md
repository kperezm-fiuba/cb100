# Preguntas teoricas Unidad 3


1. ¿Qué es la abstracción y por qué es la idea central de la POO?
   - Es quedarse con las partes escenciales del problema y ocultar los detalles , FALTA
2. ¿Qué define un TDA y por qué su contrato es independiente de la implementación?
   - El TDA define un contrato(Nombre, operaciones, invariante). Porque usando la Abstraccion, el TDA
   se enfoca solamente en qué hace el TDA y no cómo.
3. ¿Cuál es la diferencia entre una clase y un objeto?
   - (En POO)Una *clase* es un molde que define un *estado*(los datos, en campos) y un *comportamiento*(losmetodos)
   - Un *objeto* es una INSTANCIA concreta de esa clase(creada con new) con sus propios valores.
4. Explicá los tres pilares: encapsulamiento, herencia y polimorfismo.
   - Encapsular es ocultar el estado detrás de una interfaz que lo protege. Los campos se declaran
     private y sólo se tocan mediante métodos que garantizan los invariantes. Así nadie puede dejar el
     objeto en un estado inválido.

    *Error comun*
   - Exponer los campos como public rompeelencapsulamiento:cualquiera podría ponerunsaldonegativo.Laregla es campos
     privados, acceso controlado
   - Laherenciapermitequeunaclase(hija)reutilice y especialiceaotra(padre)conextends.Modela
     una relación “esun/una”:unPerroes unAnimal.Lahijaheredaelcomportamientodelpadreypuede
     agregar o redefinir lo suyo; con super accede al padre.
   - Polimorfismo significa “muchas formas”: una misma referencia del tipo padre puede apuntar a
     objetos de distintas subclases, y al llamar un método se ejecuta el del objeto real (despacho
     dinámico), no el del tipo de la variable.
   
5. ¿“Un auto tiene ruedas”pide herencia o composición?¿Y “un cuadrado es una figura”?. Justificá
   con la regla “es un / tiene un”.
   - Pide composicion ya que el auto tiene las ruedas y las ruedas no son autos
   - Pide herencia porque un cuadrado ES una figuar y cuadrado no tiene figura
6. ¿Cuándo usarías una interfaz y cuándo una clase abstracta?
   - Usaria una interfaz cuando quiero especificar el qué , dejando el como a cada implementacion
   
   *Idea clave*
   - Programá contra el contrato, no contra la implementación. Atributos, parámetros
   y retornos declarados por la interfaz (Figura, Notificador) — la implementación concreta
   aparece SOLO en el new. Beneficio doble: podés cambiar el cómo sin tocar a los usuarios, y
   podés testear con implementaciones falsas.

   - Clase abstracta cuando quiero compartir estado o código entre subclases emparentadas. 
   - Una clase implementa muchas interfaces pero hereda solo de 1 clase
   
7. ¿Por qué equals y hashCode deben ser consistentes? ¿Qué clase de estructura (que vas a ver en
   la Unidad 7) depende de esa consistencia para no “perder” objetos?
   - Para no generar errores a futuro
   - Tabla de Hash

    *Error comun*
    - equals y hashCode van siempre juntos: si redefinís uno, redefiní el otro de forma consistente.
      Romper esta regla causa errores muy difíciles de encontrar cuando uses tablas de hash.


8. ¿Para qué sirven los genéricos? Dá un ejemplo.
   - Para escribir clases y metodos que funcionan con cualquier tipo 
9. ¿Qué relaciones se representan en un diagrama UML de clases?
   - Relaciones de implementacion, herencia y asociacion  
10. Nombrá tres prácticas que hacen un código más mantenible.
    - Nombres claros
    - Responsabilidad unica 
    - Modularizacion
    *Idea clave*
    - Un código elegante no es el más “corto” ni el más “ingenioso”: es el que se entiende de
      un vistazo, es difícil de usar mal y fácil de cambiar. Ese es el estándar profesional al que
      apuntamos.

