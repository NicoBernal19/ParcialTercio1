# AeroDescuentos

### 1 De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

  - Si la edad es mayor a 135.
  - Si los días de antelación son negativos.
  - Si la tarifa base es negativa.
  - Si la edad es negativa.
  
```
/**
calcular la tarifa de cada billete según el trayecto, la antelación 
en la que se obtiene el billete y la edad del pasajero, de acuerdo 
con la normativa 005.
@param tarifaBase valor base del vuelo
@param diasAntelacion dias de antelación del vuelo
@param edad - edad del pasajero
@throws ExcepcionParametrosInvalidos NEGATIVE_DAYS, si los días de antelacion son negativos.
				     INVALID_AGE, si la edad del pasajero es negativa.
				     MORE_THAN_MAX_AGE, si la edad del pasajero es mayor a la establecida con la normativa.
				     NEGATIVE_FEE, si el valor de la tarifa es negativo.
				     
**/
public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)
```


### 2 En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:

   | Número | Clase de equivalencia | Resultado |
   | ------ | --------------------- | --------- |
   | 1 | Días negativos | Incorrecto |
   | 2 | Días positivos | Correcto |
   | 3 | Edad negativa | Incorrecto |
   | 4 | Edad mayor a 135| Incorrecto |
   | 5 | Edad mayor o igual a 0 y menor a 136 | Correcto |
   | 6 | Tarifa base negativa | Incorrecto |
   | 7 | Tarifa base positiva | Correcto |

### 3 Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.

   | Número | Ejemplo | ResultadoEsperado |
   | ------ | --------------------- | -------- |
   | 1 | calculoTarifa(5000000, -80, 30) | Incorrecto |
   | 2 | calculoTarifa(500000, 20, 30) | Correcto |
   | 3 | calculoTarifa(5000000, 20, -30) | Incorrecto |
   | 4 | calculoTarifa(5000000, 136, 30) | Incorrecto |
   | 5 | calculoTarifa(5000000, 20, 30) | Correcto |
   | 6 | calculoTarifa(-5000000, 20, 30) | Incorrecto |
   | 7 | calculoTarifa(5000000, 20, 30) | Correcto |

### 4 A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o de frontera de las mismas.

   - Las condiciones limite de la edad son -1, 0, 135 y 136
   - Las condiciones limite de los días de antelacion son -1 y 0
   - Las condiciones limite de la tarifa son -1 y 0
 
# 5 Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.

   | Número | Ejemplo | ResultadoEsperado |
   | ------ | --------------------- | --------- |
   | 1 | calculoTarifa(500000, 10, -1) | Incorrecto |
   | 2 | calculoTarifa(5000000, 30, 0) | Correcto |
   | 3 | calculoTarifa(5000000, 30, 135) | Correcto |
   | 4 | calculoTarifa(500000, 10, 136) | Incorrecto |
   | 5 | calculoTarifa(500000, -1, 20) | Incorrecto |
   | 6 | calculoTarifa(5000000, 0, 20) | Correcto |
   | 7 | calculoTarifa(-1, 30, 30) | Incorrecto |
   | 8 | calculoTarifa(0, 20, 30) | Correcto |
