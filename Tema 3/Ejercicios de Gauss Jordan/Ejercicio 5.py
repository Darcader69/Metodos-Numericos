print("EJERCICIO 5")

A = [
    [2.0, 1.0, 5.0],
    [1.0, -1.0, 1.0]
]

n = 2

for i in range(n):
    pivote = A[i][i]

    for j in range(n + 1):
        A[i][j] = A[i][j] / pivote

    for k in range(n):
        if k != i:
            factor = A[k][i]

            for j in range(n + 1):
                A[k][j] = A[k][j] - factor * A[i][j]

print("x =", A[0][2])
print("y =", A[1][2])

# Resultado:
# x = 2
# y = 1