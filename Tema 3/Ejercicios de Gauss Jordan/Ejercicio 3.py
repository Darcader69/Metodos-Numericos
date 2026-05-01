print("\nEJERCICIO 3")

A = [
    [3.0, 2.0, -1.0, 1.0],
    [2.0, -2.0, 4.0, -2.0],
    [-1.0, 0.5, -1.0, 0.0]
]

n = 3

for i in range(n):
    pivote = A[i][i]

    for j in range(n + 1):
        A[i][j] /= pivote

    for k in range(n):
        if k != i:
            factor = A[k][i]

            for j in range(n + 1):
                A[k][j] -= factor * A[i][j]

print("x =", A[0][3])
print("y =", A[1][3])
print("z =", A[2][3])

# Resultado:
# x = 0.9999999999999998
# y = -1.9999999999999993
# z = -1.9999999999999993