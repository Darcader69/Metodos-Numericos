
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

### Código

```
numero = 1 / 3

print("Valor completo:", numero)
print("2 decimales:", round(numero, 2))
print("5 decimales:", round(numero, 5))


# Valor completo: 0.3333333333333333
# 2 decimales: 0.33
# 5 decimales: 0.33333
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%201/ERRORES%20PRECISI%C3%93N)


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
