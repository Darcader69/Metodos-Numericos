## Errores Absolutos

### Definición

El error absoluto representa la diferencia numérica directa entre el valor exacto y el valor aproximado. Indica cuánto se aleja una medición o cálculo del resultado verdadero, sin considerar la escala del dato.

### Fórmula

Ea = |Valor Exacto - Valor Aproximado|

### Algoritmo

1. Obtener el valor exacto.
2. Obtener el valor aproximado.
3. Restar ambos valores.
4. Aplicar valor absoluto.
5. Mostrar el error calculado.

### Pseudocódigo

Inicio

```
Leer valor_exacto
Leer valor_aproximado

error_absoluto ← abs(valor_exacto - valor_aproximado)

Mostrar error_absoluto
```

Fin

---

## Errores de Precisión

### Definición

El error de precisión surge debido a las limitaciones en la cantidad de cifras significativas que puede almacenar o representar un sistema numérico. Es frecuente en computadoras, donde los números reales deben ajustarse a formatos finitos.

### Fórmula

Error de precisión:

Ep = |Valor Real - Valor Representado|

Redondeo:

x_r = round(x,n)

donde:

* x = valor original.
* n = número de decimales conservados.

### Algoritmo

1. Obtener un valor numérico.
2. Redondear o limitar sus cifras significativas.
3. Comparar el valor original con el valor representado.
4. Calcular la diferencia.
5. Mostrar el error.

### Pseudocódigo

Inicio

```
Leer valor_real
Leer decimales

valor_redondeado ← redondear(valor_real, decimales)

error_precision ← abs(valor_real - valor_redondeado)

Mostrar error_precision
```

Fin
