# Ejercicios Guia 1 Teoricas

1. ### Explicá con tus palabras qué es el bytecode y por qué permite “Write Once, Run Anywhere”.
   1. El bytecode es informacion que necesita y usa la JVM para poder darle intrucciones al procesador. Imagino que como
   la JVM se encarga de ser el intermediario entre la maquina y nosotros, el trabajo de interpretacion pasa a ser un tema
   que ya no nos incumba demasiado.{Aniadiendo que el **bytecode** es el archivo .class y que cada maquina tiene su 
   propia JVM}
2. ### ¿Qué diferencia hay entre el JDK, el JRE y la JVM?
   1. Empezando por el JDK, es el kit de desarrollode java que contiene por un lado el compilado *javac* y sus 
   herramientas. Luego dentro del JDK esta el JRE, que es el entorno de ejecucion de java que por un lado contiene las 
   bibliotecas estandar (API, y ademas otras cosas) y ademas tiene la JVM que como dijismos antes compila el archivo 
   *.class* para interpretarlo a codigo de maquina.
3. ### ¿Qué hace el compilador JIT y en qué momento actúa?
   1. El JIT es un compilador que traduce el archivo *.class* a codigo de maquina para que la CPU lo pueda ejecutar. Y
   efectivamente actua luego de que la JVM compile el archivo *.java*. {Además de optimizar las partes que más se usan} 
4. ### Diferenciá tipo primitivo y tipo por referencia. Dá un ejemplo de cada uno.
    1. Los tipos primitivos guardan la memoria el valor directamiente. Ej. *int, char boolean*. Y los tipos por 
   referencia solo guardan la *referencia* (la direccion) hacia donde esta el valor. Ej. *String, las clases, arreglos
   , etc*.
5. ### ¿Por qué 7 / 2 da 3 en Java? ¿Cómo obtendrías 3.5?
    1. Por que la division es entera . {Para obtener el numero decimal al menos 1 operendo debe ser del tipo *double*}
6. ### ¿Qué genera automáticamente un record? ¿Cuándo conviene usarlo?
    1. Un record genera automaticamente un ACCESOR,un metodo sin parametros con el mismo nombre que el componente.
    {Ademas de un constructor, y los metodos *equals, ToString, y hashcode*}
7. ### ¿Para qué sirve un enum? ¿Qué ventaja tiene sobre usar cadenas de texto?
    1. Para definir conjuntos FIJO y CONOCIDO de valores. Ventaja sobre cadenas de texto porque el compilador conoce
    todos los casos posibles. {Esto es porque hace más seguro porque como el compilador conoce todos los casos evita
   valores invalidos y permite que *switch* verif que estan todos cubiertos, porque switch te Obliga}
8. ###  ¿En qué se diferencia una excepción propia que extiende RuntimeException de una que extiende Exception?
    1. En que si extendemos *RunTimeException* se lanzan y se capturan libremente sin que el compilador se queje. Sin 
   embargo si extendemos *Exception* antes de siquiera compilar debemos hacernos cargo de la excepcion.(?)
9. ### ¿Por qué el orden de los bloques catch importa?
    1. Porque si ponemos los catch de menos a más especificos corremos el riesgo de que no se utilizen correctamente los
    catch de más abajo en el codigo
1. ### 
