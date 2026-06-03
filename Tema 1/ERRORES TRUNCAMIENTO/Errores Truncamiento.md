## Error por truncamiento

### Definición

El error por truncamiento se origina al interrumpir una serie infinita o al simplificar una fórmula matemática en su desarrollo. Es característico de métodos que aproximan funciones continuas mediante polinomios o fórmulas discretas, como la derivación e integración numérica. Este error refleja la diferencia entre la solución exacta y su representación simplificada.

### Fórmula

Error de truncamiento:

E_t = Valor Exacto - Valor Aproximado

En series de Taylor:

f(x) = P_n(x) + R_n(x)

donde:

* P_n(x): aproximación polinómica.
* R_n(x): error de truncamiento.

### Algoritmo

1. Obtener el valor exacto de una función o expresión matemática.
2. Construir una aproximación utilizando un número limitado de términos.
3. Calcular la diferencia entre el valor exacto y la aproximación.
4. Analizar la magnitud del error generado.

### Código

```python
numero = 3.1415926535
truncado = int(numero * 10000) / 10000
error = numero - truncado

print("Número original:", numero)
print("Número truncado a 4 decimales:", truncado)
print("Error generado:", error)

#Número original: 3.1415926535
#Número truncado a 4 decimales: 3.1415
#Error generado: 9.265349999987293e-05
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%201/ERRORES%20TRUNCAMIENTO)


### Pseudocódigo

Inicio

```
Leer valor_exacto
Leer valor_aproximado

error ← valor_exacto - valor_aproximado

Mostrar error
```

Fin
