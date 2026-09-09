## Formato de archivo de entrada

### Manejo de datos para recopilar registro:
- Fecha retiro(ISO AAAA-MM-DD)
- Padron
- Socio
- isbn
- Titulo
- fechaDev
    - Puede venir vacio (Prestamo Pendiente)

* El plazo de préstamo es de 14 dias corridos desde retiro
* Un prestamo *sin fecha de devolucion* todavia esta en poder de socio
* Dia de atraso
    * Dias de atraso cuentan desde (retiro + 14 dias)
    * Si prestamoe esta pendiente, se cuentan hastas fecha de corte que recibe programa.
    * Si no hay atraso, son 0 dias
* Multa es $150/dia, tope de $3000 por prestamo
* Socio queda en _estado_ CON_DEUDA si multaAcum > 0; sino AL_DIA
