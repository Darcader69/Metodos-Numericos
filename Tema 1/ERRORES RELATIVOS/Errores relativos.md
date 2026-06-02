## Errores Relativos

### Definición

El error relativo expresa la magnitud del error en proporción al valor real de una cantidad. Se obtiene dividiendo el error absoluto entre el valor exacto, lo que permite evaluar qué tan significativa es la diferencia respecto al tamaño del dato original.

### Fórmula

Error absoluto:

Ea = |Valor Exacto - Valor Aproximado|

Error relativo:

Er = Ea / |Valor Exacto|

Error relativo porcentual:

Er% = (Ea / |Valor Exacto|) × 100

### Algoritmo

1. Obtener el valor exacto.
2. Obtener el valor aproximado.
3. Calcular el error absoluto.
4. Dividir el error absoluto entre el valor exacto.
5. Mostrar el resultado.

### Pseudocódigo

Inicio

```
Leer valor_exacto
Leer valor_aproximado

error_absoluto ← abs(valor_exacto - valor_aproximado)

error_relativo ← error_absoluto / valor_exacto

Mostrar error_relativo
```

Fin
