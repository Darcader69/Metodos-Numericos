# ==================================================
# MÉTODO DE EULER
# Ejercicio 1
# dy/dx = x + y
# ==================================================

def f(x, y):
    return x + y

x0 = 0
y0 = 1
h = 0.1
n = 10

print("Iteración\t x\t\t y")

for i in range(n):

    y0 = y0 + h * f(x0, y0)
    x0 = x0 + h

    print(i + 1, "\t\t", round(x0,4), "\t", round(y0,4))

# Resultado final aproximado:
# Iteración        x               y
    #1                0.1     1.1
    #2                0.2     1.22
    #3                0.3     1.362
    #4                0.4     1.5282
    #5                0.5     1.721
    #6                0.6     1.9431
    #7                0.7     2.1974
    #8                0.8     2.4872
    #9                0.9     2.8159
    #10               1.0     3.1875