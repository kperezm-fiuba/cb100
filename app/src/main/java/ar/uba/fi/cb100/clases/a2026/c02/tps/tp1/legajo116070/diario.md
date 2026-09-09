# Tp Registro de prestamos de biblioteca

## Primeros pensamientos

* El programa se desarrolla por consola.
  - El programa recibe el archivo de entrada y 
  luego escribe los reportes en disco
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
   - Lee el archivo con Files.readAllLines
     - Ignorando blancos y comentarios
   - arma prestamo por cada linea VALID
   - Por cada linea invalida guarda un mensaje con el nro de linea 
   real del archivo
5. Clase Reporteador y la de los exportadores. 
  - Reporteador
    - Arma las filas del reporte
  - Exportadores 
    - las escriben en el disco
      - Las filas van ordenadas por
        multa descendente y, a igual multa, por nombre de socio alfabético.
  - Hay que implementar dos exp pero el programa principal no debe saber cual de los 2 esta usando
6. Clase Tp1
   - Contiene el main(). 
   - Recibe por parámetro el archivo de entrada y la fecha de corte; 
   - si no se los pasan, usa los valores por defecto, de manera que corriendo el programa sin argumentos se obtenga exactamente la salida de
     la sección siguiente.



### BETA_1.0

- Habiendo leido el formato del registro esperado, empiezo por un enfoque bottom up
- Empiezo pensando la clase PRestamo
