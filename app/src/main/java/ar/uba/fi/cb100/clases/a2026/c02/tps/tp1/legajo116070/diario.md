# Tp Registro de prestamos de biblioteca

## Primeros pensamientos

* El programa se desarrolla por consola.
  * El programa recibe el archivo de entrada y 
  luego escribe los resportes en disco
* Procesar archivos de la bibliteca, validarlo
* Luego hacer reportes
  * Detalle de multas por socio
  * Ranking de titulos más pedidos

- Tenemos un archivo **por suerte** no muy grande *prestamos.csv*
  - Tiene un formatoen especial donde vamos a tener que 
  manejarnos con varias instancias
    - Esas instancias pueden ser, linea valida
    - linea invalida, se guarda el moitvo junto con 
    el nro real del archivo y sigue. Luego inf
    cuantas descarto y por qué

1. La clase *Prestamo* con la firma de 1 consturctor
y sus condiciones. Además de algunos metodos a implementar (sin firma)
  - Esta tiene un metodo para observar multas individ

2. La interfaz *RegistroDePrestamo* con la firma de los metodos a implementar
  - Este tiene el metodo para devolver el ranking de titulos más pedidos 
3. El TDA *Clase* **Registro sobre Arreglo** que implementa la intefaz previa
4. Clase **Lector**

