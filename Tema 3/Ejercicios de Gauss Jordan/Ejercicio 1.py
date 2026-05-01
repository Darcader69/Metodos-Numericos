print("\nEJERCICIO 1")

A = [
    [1.0, 2.0, 3.0, 14.0],
    [2.0, 1.0, 1.0, 10.0],
    [3.0, 2.0, 2.0, 16.0]
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
# x = 4.000000000000003
# y = -4.000000000000009
# z = 6.000000000000005