import numpy as np
A = np.array([[3.0, 2.0, -4.0],
              [2.0, 3.0, 3.0],
              [5.0, -3.0, 1.0]])

B = np.array([3.0, 15.0, 14.0])

x = np.linalg.solve(A, B)

print("\nEJERCICIO 3")
print("Solución:", x)

#EJERCICIO 3
#Solución: [3. 1. 2.]