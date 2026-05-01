import numpy as np
A = np.array([[4.0, 2.0],
              [1.0, 3.0]])

B = np.array([10.0, 8.0])

x = np.linalg.solve(A, B)

print("\nEJERCICIO 4")
print("Solución:", x)

#EJERCICIO 4
#Solución: [1.4 2.2]
