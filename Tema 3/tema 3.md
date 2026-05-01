### T-3 Métodos de solución de Sistemas de Ecuaciones.

#### Introducción:

> Los sistemas de ecuaciones lineales aparecen con frecuencia en problemas de ingeniería, física, estadística, economía y simulación computacional. Cuando el número de incógnitas crece o los cálculos manuales resultan extensos, los métodos numéricos permiten obtener soluciones de forma ordenada y eficiente. Estos procedimientos se dividen en métodos directos, que buscan la solución en una secuencia finita de operaciones, y métodos iterativos, que generan aproximaciones sucesivas hasta alcanzar una tolerancia deseada.

### Métodos Correspondientes:

* [Método de Eliminación Gaussiana]

  > * El método de eliminación gaussiana es un procedimiento directo que transforma la matriz aumentada del sistema en una forma triangular superior mediante operaciones elementales por filas. Una vez lograda esta estructura, las incógnitas se obtienen aplicando sustitución regresiva. Es uno de los algoritmos fundamentales del álgebra lineal computacional por su eficiencia y amplio uso práctico.

* [Método de Gauss-Jordan]

  > * El método de Gauss-Jordan es una extensión de la eliminación gaussiana que continúa el proceso hasta convertir la matriz en forma escalonada reducida. Esto permite obtener directamente el valor de cada incógnita sin necesidad de sustitución posterior. Además de resolver sistemas lineales, es ampliamente utilizado para calcular matrices inversas y analizar dependencia lineal.

* [Método de Gauss-Seidel]

  > * El método de Gauss-Seidel es un método iterativo que mejora sucesivamente una solución inicial utilizando los valores más recientes calculados en cada iteración. Su velocidad de convergencia suele ser mayor que otros métodos iterativos simples, especialmente en sistemas diagonalmente dominantes o bien condicionados. Es muy empleado en problemas grandes donde los métodos directos resultan costosos.

* [Método de Jacobi]

  > * El método de Jacobi es un método iterativo en el cual cada variable se recalcula usando exclusivamente los valores obtenidos en la iteración anterior. Esto permite actualizar todas las incógnitas de forma simultánea, siendo útil en procesos paralelos y aplicaciones computacionales distribuidas. Aunque su convergencia suele ser más lenta que Gauss-Seidel, destaca por su simplicidad conceptual y facilidad de implementación.
