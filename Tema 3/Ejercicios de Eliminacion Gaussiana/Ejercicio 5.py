import numpy as np
A = np.array([[1.0, 2.0, 3.0],
              [2.0, 1.0, 1.0],
              [3.0, 2.0, 2.0]])

B = np.array([14.0, 10.0, 16.0])

x = np.linalg.solve(A, B)

print("\nEJERCICIO 5")
print("Solución:", x)

#EJERCICIO 5
#Solución: [ 4. -4.  6.]