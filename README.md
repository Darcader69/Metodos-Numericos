# Metodos-Numericos
## Repositorio creado para alojar los programas a revisión de la materia
> * Para consultar Pseudocódigos acceder a los siguientes vinculos
[Pseudocódigos](Pseudocódigos)

> * Para consultar Códigos acceder a los siguientes vinculos
[Códigos](Códigos)
---------------------------------------------------------------------
### T-1 Introducción a los métodos númericos.
#### Introducción:
>Los métodos numéricos son técnicas algorítmicas diseñadas para resolver problemas matemáticos complejos mediante aproximaciones computacionales. A diferencia de los métodos analíticos, que buscan soluciones exactas, los métodos numéricos proporcionan resultados aproximados con un margen de error controlado, lo que los hace indispensables en situaciones donde las soluciones exactas son imposibles o impracticales de obtener.
### Métodos Correspondientes:
* [Error de redondeo](https://github.com/Darcader69/Metodos-Numericos/tree/a14217f60f5c91e0ab1e53edf5b8e0c85a6e0e3c/C%C3%B3digos/Tema%201/1.%20Error%20de%20redondeo)
 >- El error de redondeo ocurre cuando un número no puede representarse con exactitud en el sistema de cómputo debido a la cantidad limitada de cifras significativas. Este tipo de error es común en los sistemas de punto flotante, donde los valores deben aproximarse a la base y precisión del sistema. Aunque suele ser pequeño, puede acumularse en cálculos extensos y afectar significativamente los resultados finales.
* [Error por truncamiento](https://github.com/Darcader69/Metodos-Numericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/2.%20Error%20por%20truncamiento)
  >- El error por truncamiento se origina al interrumpir una serie infinita o al simplificar una fórmula matemática en su desarrollo. Es característico de métodos que aproximan funciones continuas mediante polinomios o fórmulas discretas, como la derivación e integración numérica. Este error refleja la diferencia entre la solución exacta y su representación simplificada.
* [Error numerico total](https://github.com/Darcader69/Metodos-Numericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/3.%20Error%20n%C3%BAmerico%20total)
  >- El error numérico total es la diferencia entre el valor real o exacto de una cantidad y su valor aproximado calculado. Este error puede descomponerse en errores de redondeo y truncamiento, además de otros factores como la incertidumbre en los datos o errores por equivocación. Es un indicador global de la precisión del método utilizado.
* [Errores por equivocación](https://github.com/Darcader69/MetodosNumericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/4.%20Errores%20por%20equivocaci%C3%B3n)
   >- Estos errores provienen de equivocaciones humanas al programar, interpretar o aplicar un algoritmo numérico. Pueden deberse a errores en la lógica, el uso incorrecto de fórmulas, o una mala interpretación de los resultados. Aunque pueden evitarse con cuidado y revisión, son frecuentes en la práctica, especialmente en fases iniciales de desarrollo.
* [Errores de formulacion](https://github.com/Darcader69/Metodos-Numericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/5.%20Errores%20de%20Formulaci%C3%B3n)
  >- Los errores de formulación surgen cuando el modelo matemático utilizado para describir un fenómeno real no representa con fidelidad dicho fenómeno. Esto puede deberse a suposiciones incorrectas, simplificaciones excesivas o la omisión de variables importantes. Un modelo mal formulado genera resultados que, aunque precisos desde el punto de vista numérico, no tienen validez práctica.
* [Incertidumbre de datos](https://github.com/Darcader69/Metodos-Numericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/6.%20Incertidumbre%20de%20datos)
  >- La incertidumbre de datos se refiere a la inexactitud inherente en los valores de entrada utilizados en un cálculo numérico, ya sea por errores de medición, instrumentos limitados o falta de información. Esta incertidumbre puede propagarse a lo largo de un proceso computacional y afectar la confiabilidad de los resultados obtenidos.
* [Error por cancelación numerica](https://github.com/Darcader69/Metodos-Numericos/tree/cc27adcf13b3dc2b3245485c81f48ab7268ccd64/C%C3%B3digos/Tema%201/7.%20Error%20por%20cancelaci%C3%B3n%20num%C3%A9rica)
  >- Este error ocurre cuando se realiza una operación de resta entre dos números que tienen valores cercanos, lo que provoca la pérdida de cifras significativas. La cancelación numérica puede hacer que los resultados sean poco precisos, especialmente en algoritmos que dependen de diferencias pequeñas entre grandes cantidades.
---------------------------------------------------------------------
### T-2 Métodos de solución de ecuaciones.
#### Introducción:
>En los métodos numéricos, resolver ecuaciones no lineales (como f(x)=0) es un problema fundamental, ya que muchas ecuaciones no tienen soluciones analíticas exactas. Métodos como el de bisección, Newton-Raphson o secante permiten aproximar raíces iterativamente, equilibrando precisión y eficiencia computacional. Estos algoritmos son esenciales en física, ingeniería y optimización, donde las soluciones exactas son inalcanzables.
### Métodos Correspondientes:
* [Método de Intervalo](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%202/1.%20M%C3%A9todo%20de%20Intervalo)
 >- El método de intervalo es una estrategia de búsqueda de raíces de ecuaciones que se basa en identificar un intervalo donde la función cambia de signo, lo que garantiza, por el teorema de Bolzano, la existencia de al menos una raíz en dicho intervalo. Este método proporciona un enfoque seguro pero lento, ideal como punto de partida antes de aplicar métodos más precisos.
* [Método de Bisección](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%202/2.%20M%C3%A9todo%20de%20Bisecci%C3%B3n)
  >- El método de bisección es un algoritmo sencillo y robusto para encontrar raíces de funciones continuas. Consiste en dividir repetidamente un intervalo en dos mitades y seleccionar la subintervalo donde la función cambia de signo. Aunque su velocidad de convergencia es lenta, garantiza la reducción progresiva del error y la localización precisa de la raíz.
* [Método de Aproximaciones Sucesivas](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%202/3.%20M%C3%A9todo%20de%20Aproximaciones%20Sucesivas)
  >- El método de aproximaciones sucesivas, también conocido como método de punto fijo, se basa en reescribir la ecuación original en la forma x=g(x) y utilizar iteraciones sucesivas a partir de un valor inicial. Si se cumplen ciertas condiciones de convergencia, como la continuidad y una derivada acotada de g(x), el método asegura que la secuencia se acerque a la raíz buscada.
* [Métodos de Interpolación](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%202/4.%20M%C3%A9todos%20de%20Interpolaci%C3%B3n)
  >- Los métodos de interpolación permiten estimar valores intermedios de una función a partir de un conjunto discreto de datos conocidos. Se utilizan ampliamente en análisis numérico para construir funciones aproximadas, facilitando cálculos cuando no se dispone de una función explícita. Entre los métodos más comunes están la interpolación lineal, cuadrática y la interpolación de Lagrange.
---------------------------------------------------------------------
### T-3 Métodos de solución de sistemas de ecuaciones.
#### Introducción:
>Los sistemas de ecuaciones lineales y no lineales aparecen en modelos de circuitos eléctricos, mecánica de fluidos y machine learning. Técnicas como eliminación gaussiana, descomposición LU o métodos iterativos (Jacobi, Gauss-Seidel) permiten manejar matrices grandes y dispersas. La elección del método depende de la estructura del sistema (diagonal dominante, simetría) y los recursos computacionales disponibles.
### Métodos Correspondientes:
* [Método de Eliminación Gaussiana](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%203/1.%20M%C3%A9todo%20de%20Eliminaci%C3%B3n%20Gaussiana)
  >- El método de eliminación gaussiana es una técnica sistemática para resolver sistemas de ecuaciones lineales. Consiste en transformar la matriz aumentada del sistema en una forma escalonada mediante operaciones elementales sobre las filas. Una vez alcanzada esta forma, se utiliza el procedimiento de sustitución hacia atrás para encontrar las soluciones. Es uno de los métodos más fundamentales del álgebra lineal numérica.
* [Método de Gauss-Jordan](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%203/2.%20M%C3%A9todo%20de%20Gauss-Jordan)
  >- El método de Gauss-Jordan es una extensión del método de eliminación gaussiana que lleva la matriz aumentada a su forma reducida por filas, también conocida como forma escalonada reducida. A diferencia del método gaussiano, este no requiere sustitución hacia atrás, ya que se obtiene directamente la solución del sistema. Aunque puede ser más costoso computacionalmente, es útil para encontrar la inversa de una matriz y resolver sistemas múltiples simultáneamente.
* [Método de Gauss-Seidel](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%203/3.%20M%C3%A9todo%20de%20Gauss-Seidel)
  >- El método de Gauss-Seidel es un método iterativo para resolver sistemas de ecuaciones lineales, especialmente útil cuando el sistema es grande o disperso. A partir de una estimación inicial, el método actualiza cada variable utilizando inmediatamente los valores más recientes disponibles. Si se cumplen ciertas condiciones de convergencia, como la diagonal dominante de la matriz de coeficientes, el método proporciona una solución aproximada con rapidez.
* [Método de Jacobi](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%203/4.%20M%C3%A9todo%20de%20Jacobi)
  >- El método de Jacobi es otro algoritmo iterativo para resolver sistemas de ecuaciones lineales, donde cada componente de la solución se actualiza de forma independiente utilizando los valores de la iteración anterior. Aunque generalmente converge más lento que Gauss-Seidel, es más fácil de paralelizar computacionalmente, lo que lo hace útil en aplicaciones de alto rendimiento y estructuras matriciales específicas.
---------------------------------------------------------------------
### T-4 Diferenciación e integración númerica.
#### Introducción:
>Cuando las funciones son complejas o solo se conocen mediante datos discretos, la derivación numérica (diferencias finitas) y la integración numérica (trapecio, Simpson, cuadratura gaussiana) son herramientas clave. Estos métodos aproximan pendientes y áreas bajo curvas, útiles en simulaciones de movimiento, procesamiento de señales y cálculo de probabilidades. La precisión depende del paso (h) y del método seleccionado.
* [Método del Trapecio](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%204/1.%20M%C3%A9todo%20del%20Trapecio)
  >- El método del trapecio es una técnica de integración numérica que aproxima el área bajo una curva utilizando un trapecio para cada subintervalo. Es simple y efectivo para funciones suaves, y su precisión mejora al aumentar el número de subintervalos. Es especialmente útil cuando la función no tiene una integral analítica.
* [Método de Simpson un tercio](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%204/2.%20M%C3%A9todo%20de%20Simpson%20un%20tercio)
  >- El método de Simpson 1/3 es una técnica de integración basada en aproximar la función por parábolas sobre cada par de subintervalos. Proporciona una mayor precisión que el método del trapecio para funciones suaves, ya que utiliza polinomios de segundo grado.
* [Método de Simpson tres octavos](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%204/3.%20M%C3%A9todo%20de%20Simpson%20tres%20octavos)
  >- El método de Simpson 3/8 también aproxima la integral mediante polinomios, pero en este caso usa tres subintervalos y un polinomio cúbico. Es útil cuando el número total de subintervalos no es divisible por dos pero sí por tres, y puede complementar el método 1/3.
* [Método de la Cuadratura Gaussiana](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%204/4.%20M%C3%A9todo%20de%20la%20Cuadratura%20Gaussiana)
  >- La cuadratura gaussiana es un método avanzado de integración que selecciona puntos de evaluación y pesos óptimos para maximizar la precisión con pocos puntos. A diferencia de métodos clásicos, no requiere subintervalos uniformes y puede integrar exactamente polinomios de alto grado.
 ---------------------------------------------------------------------
 ### T-5 Interpolación y ajuste de funciones.
#### Introducción:
>La interpolación (Lagrange, splines) construye funciones que pasan exactamente por puntos dados, ideal para reconstruir datos experimentales. El ajuste de curvas (regresión lineal, mínimos cuadrados) busca modelos que minimicen el error global, útil en machine learning y estadística. Ambos enfoques son fundamentales para predecir valores intermedios o extrapolar tendencias.
### Métodos Correspondientes:
* [Interpolación Líneal](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%205/1.%20Interpolaci%C3%B3n%20L%C3%ADneal)
  >- La interpolación lineal estima valores intermedios entre dos puntos conocidos asumiendo que la función sigue una línea recta entre ellos. Es sencilla, rápida y adecuada para funciones que cambian de forma relativamente uniforme. 
* [Interpolación Polinómica](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%205/2.%20Interpolaci%C3%B3n%20Polin%C3%B3mica)
  >- La interpolación polinómica utiliza un polinomio de grado n para ajustar exactamente n+1 puntos de datos. Aunque es precisa localmente, puede sufrir oscilaciones para conjuntos grandes (fenómeno de Runge), por lo que debe aplicarse con precaución.
* [Método de Regresión](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%205/3.%20M%C3%A9todo%20de%20Regresi%C3%B3n)
  >- La regresión es una técnica estadística que ajusta una función (generalmente lineal o polinómica) a un conjunto de datos experimentales, minimizando el error entre los valores reales y los predichos. A diferencia de la interpolación, no exige que los puntos se ajusten exactamente.
* [Método de Correlación](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%205/4.%20M%C3%A9todo%20de%20Correlaci%C3%B3n)
  >- El método de correlación mide la relación lineal entre dos variables. Cuantifica qué tan fuerte y en qué dirección se relacionan los datos, con un coeficiente que varía entre -1 y 1. Es clave en el análisis estadístico y el modelado de datos.
* [Método de Mínimos Cuadrados](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%205/5.%20M%C3%A9todo%20de%20M%C3%ADnimos%20Cuadrados)
  >- El método de mínimos cuadrados busca minimizar la suma de los cuadrados de las diferencias entre los datos reales y el modelo ajustado. Es la base de la regresión lineal y otros modelos estadísticos de ajuste, muy útil cuando hay ruido o errores en los datos.
 ---------------------------------------------------------------------
 ### T-6 Solución de ecuaciones diferenciales.
#### Introducción:
>Las ecuaciones diferenciales modelan fenómenos dinámicos como el crecimiento poblacional o el movimiento de planetas. Métodos como Euler, Runge-Kutta o diferencias finitas convierten estas ecuaciones en sistemas discretos manejables por computadora. Su estabilidad y precisión son críticas en simulaciones climáticas, ingeniería aeroespacial y biología computacional.
### Métodos Correspondientes:
* [Método de Un Paso](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%206/1.%20M%C3%A9todo%20de%20Un%20Paso)
  >- Los métodos de un paso calculan la solución de una EDO utilizando únicamente el valor de la iteración anterior. Son simples de implementar y computacionalmente eficientes, pero pueden ser sensibles a la elección del paso de integración.
* [Método de Paso Múltiple](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%206/2.%20M%C3%A9todo%20de%20Paso%20M%C3%BAltiple)
  >- Los métodos de paso múltiple utilizan varios valores previos para calcular el siguiente valor de la solución. Esto permite alcanzar mayor precisión y estabilidad, aunque requieren condiciones iniciales adicionales y una estructura más compleja.
* [Método de Euler](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%206/3.%20M%C3%A9todo%20de%20Euler)
  >- El método de Euler es la forma más simple de resolver EDO numéricamente. Calcula el siguiente punto utilizando la pendiente actual. Aunque es fácil de implementar, su precisión y estabilidad son limitadas si no se usa un paso pequeño.
* [Método de Runge-Kutta](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%206/4.%20M%C3%A9todo%20de%20Runge-Kutta)
  >- Los métodos de Runge-Kutta, especialmente el de cuarto orden, son técnicas de un paso que mejoran significativamente la precisión del método de Euler. Calculan varios promedios de la pendiente dentro del intervalo para obtener una mejor aproximación.
* [Método de Taylor](https://github.com/Darcader69/Metodos-Numericos/tree/a0add31eeaf2b5055860451b3ce8c31abb7fc23d/C%C3%B3digos/Tema%206/5.%20M%C3%A9todo%20de%20Taylor)
  >- El método de Taylor utiliza una expansión en series de Taylor para aproximar soluciones de EDO. Al considerar derivadas de orden superior, ofrece gran precisión, pero requiere calcular derivadas adicionales, lo cual puede ser complejo para ciertas funciones.
