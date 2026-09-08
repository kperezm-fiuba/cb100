
# Preguntas Teoricas *Memoria* 

1. ¿Qué se guarda en el stack y qué en el heap?
Dá un ejemplo de cada uno.
   - El stack (pila) guarda las variables locales y las llamadas a métodos; es rápido y se organiza solo
     (cada método, al terminar, libera su parte).
   - El heap (montículo) guarda los objetos que creás con
     new; es la zona de memoria dinámica

2. ¿Qué copia una asignación entre variables primitivas? ¿Y entre variables de objeto?
   - La 1era copia el valor
   - La 2da la referencia 

   *Idea clave*
   - La asignación en Java copia lo que hay en la caja de la variable: si la caja tiene un valor,
     copia el valor; si tiene una referencia (una flecha), copia la flecha. Nunca copia el objeto
     apuntado.

3. ¿En qué se diferencia una referencia de Java de un puntero de C?
   - Que en Java las refrencias SOLO sirven para acceder al objeto al cual apuntan (o ser null)
   - Mientras que en C, sirven para otras cosas anticuadas

    *Error comun*
   - Imprimir un objeto sin toString propio muestra algo como Cuenta@65ae6ba4: no es “la dirección
       de memoria”, es el nombre de la clase y un código de hash en hexadecimal. No lo uses como
       si fuera una dirección.

4. ¿Qué es null? ¿Cuándo se produce una NullPointerException y qué aporta Optional?
   - Es una referencia especial que no apunta a ningun objeto. 
   - Se produce cuando queremos acceder al objeto que apunta a la referencia null, y como null no apunta
   a ningun lugar, da NullPointerException.
   - Optional sirve para simbolizar "Puede no haber un valor". que nos obliga a pensar el caso vacio 

   *Idea Clave*
   - Los wrappers pueden ser *null* y los primitivos no 

5. Explicá la diferencia entre == y equals con un ejemplo donde den distinto.
   - El *==* compara identidad y el *equals* contenido 
   - Dos instancias de objeto PuntoCartesiano que tengan atributos x e y iguales pero que se hayan instanciado en 
   momentos distintos. 

    *Error comun*
   - Para comparar el contenido de objetos (textos, puntos, etc.) usá siempre equals, no ==. El ==
     entre objetos casi nunca es lo que querés (salvo para comparar contra null, donde sí se usa
     ==).

6. ¿Qué es el aliasing y qué riesgo trae cuando el objeto es mutable?
   - Es un evento que se da cuando dos variables apuntan al mismo objeto
   - El riesgo viene cuando estemos manipulando el objeto y sin darnos cuenta lo mutemos por  el aliasing
7. Si un método muta un objeto recibido por parámetro, ¿se ve afuera (del scope)? ¿Y si reasigna el
   parámetro? ¿Por qué?
   - Depende. Si solo modifico el objeto recibido por parametro, si. 
   - Si reasigna el parametro y el metodo no devuelve la referencia creada al crear ese nuevo objeto, no se ve de afuera
   - Porque cuando se reasigna el parametro hemos de corroborar que la referencia sobreviva a la llamada
   del metodo. De otra forma el GC lo va a eliminar en cuanto se termine el llamado del metodo.

    *Idea clave*
   - Si querés que un método le “cambie el objeto” al llamador, tenés dos opciones honestas:
   mutar el objeto recibido, o devolver el objeto nuevo con return para que el llamador lo asigne.
   Reasignar el parámetro adentro no hace nada visible afuera.


8. ¿Qué diferencia hay entre un objeto mutable y uno inmutable? ¿Qué ventaja tiene la
   inmutabilidad?
   - Un objeto es inmutable si su estado no puede cambiarse luego de ser creado. Uno mutable si
   - Que un objeto inmutable se puede compartir sin miedo. Porque nadie modificará el estado. Es seguro. 
   Por eso, cuando puedas preferi datos inmutables(record).

9. ¿Qué diferencia hay entre una copia superficial y una profunda?
   - Una copia superficial copia la "Estructura de más afuera". Si hay objetos internos,se comparten, 
   - y una copia 
   profunda copia copia tambien la estructura interna. Quedando asi independiente de la original. (Esto se hace a mano)

    *Error comun*
    - clone() sobre arreglos y la mayoría de las copias “de un nivel” (como Arrays.copyOf) son
      superficiales. Si la estructura tiene objetos mutables adentro y necesitás independencia real,
      tenés que copiar cada nivel vos.

10. ¿Cuándo el recolector de basura libera un objeto? ¿Qué es una fuga de memoria lógica?
    - La libera cuando ya no hay referencias a el. 
    - La fuga de memoria logica sucede cuando tenemos un objeto ,que no estamos usando, del cual tenemos referencia. 
    La GC no lo liberara hasta que soltemos la referencia