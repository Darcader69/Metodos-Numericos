print("\nEJERCICIO 2")

A = [
    [4.0, 2.0, 10.0],
    [1.0, 3.0, 8.0]
]

n = 2

for i in range(n):
    pivote = A[i][i]

    for j in range(n + 1):
        A[i][j] /= pivote

    for k in range(n):
        if k != i:
            factor = A[k][i]

            for j in range(n + 1):
                A[k][j] -= factor * A[i][j]

print("x =", A[0][2])
print("y =", A[1][2])

# Resultado:
# Ejercicio 2
# x = 1.4
# y = 2.2
