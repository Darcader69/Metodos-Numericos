# ==================================================
# MÉTODO DE EULER
# Ejercicio 5
# dy/dx = 2x - 3y
# ==================================================

def f(x, y):
    return 2*x - 3*y

x = 0
y = 2

h = 0.1
n = 10

print("Iteración\t x\t\t y")

for i in range(n):

    y = y + h * f(x, y)
    x = x + h

    print(i + 1, "\t\t", round(x,4), "\t", round(y,4))

# Resultado final aproximado:
# Iteración        x               y
#1                0.1     1.4
#2                0.2     1.0
#3                0.3     0.74
#4                0.4     0.578
#5                0.5     0.4846
#6                0.6     0.4392
#7                0.7     0.4275
#8                0.8     0.4392
#9                0.9     0.4675
#10               1.0     0.5072