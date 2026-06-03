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

### Código

```python
real = 250
aprox = 243

error = abs(real - aprox)

print("Valor real:", real)
print("Valor aproximado:", aprox)
print("Error absoluto:", error)


# Valor real: 250
# Valor aproximado: 243
# Error absoluto: 7
```
### [Códigos](https://github.com/Darcader69/Metodos-Numericos/tree/main/Tema%201/ERRORES%20PRECISI%C3%93N)


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
