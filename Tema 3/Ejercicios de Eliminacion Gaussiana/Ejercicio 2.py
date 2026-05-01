import numpy as np
A = np.array([[1.0, 1.0, 1.0],
              [2.0, -1.0, 1.0],
              [1.0, 2.0, -1.0]])

B = np.array([6.0, 3.0, 3.0])

n = len(B)

for k in range(n - 1):
    for i in range(k + 1, n):
        factor = A[i][k] / A[k][k]
        for j in range(k, n):
            A[i][j] -= factor * A[k][j]
        B[i] -= factor * B[k]

x = np.zeros(n)

for i in range(n - 1, -1, -1):
    suma = 0
    for j in range(i + 1, n):
        suma += A[i][j] * x[j]
    x[i] = (B[i] - suma) / A[i][i]

print("\nEJERCICIO 2")
print("Solución:", x)

#EJERCICIO 2
#Solución: [1.28571429 2.14285714 2.57142857]