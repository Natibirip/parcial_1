
PRUEBA PARCIAL

ESCENARIO DE ANÁLISIS
Se comparan dos opciones de sistema de impresión:
- Opción A: Tres colas simples (High, Mid, Low).
- Opción B: Una sola lista enlazada ordenada por prioridad.


<h3>1. COMPLEJIDAD ASINTÓTICA DE LAS OPERACIONES</h3>


> OPCIÓN A: TRES COLAS SIMPLES (High, Medium, Low)

a. Operación Enqueue (Insertar)
Se chequea la prioridad y se pone al final de la cola de esa prioridad usando un puntero 'tail'.
- Notación O (Peor caso):   O(1)
- Notación Ω (Mejor caso):  Ω(1)
- Notación Θ (Caso promedio): Θ(1)
No importa cuántos elementos hayan, al acceder al 'tail' y enlazar el nuevo nodo siempre es el mismo tiempo.

b. Operación Dequeue (Procesar/Eliminar)
Se revisa secuencialmente si la cola H tiene datos, luego la M, luego la L.
- Notación O (Peor caso):   O(1)
- Notación Ω (Mejor caso):  Ω(1)
- Notación Θ (Caso promedio): Θ(1)
Siempre es igual porque son máximo 3 verificaciones fijas, sin importar el N.

> OPCIÓN B: UNA SOLA LISTA ENLAZADA ORDENADA

a. Operación Enqueue (Insertar)
Se debe de recorrer la lista desde el inicio para encontrar la posición correcta para insertar el nodo.
- Notación O (Peor caso):   O(N)
- Notación Ω (Mejor caso):  Ω(1)
- Notación Θ (Caso promedio): Θ(N)

b. Operación Dequeue (Procesar/Eliminar)
Descripción: Se elimina siempre el primer elemento (head), porqie la lista ya está ordenada.
- Notación O (Peor caso):   O(1)
- Notación Ω (Mejor caso):  Ω(1)
- Notación Θ (Caso promedio): Θ(1)


<h3>2. COMPLEJIDAD TOTAL DEL PROCESO (N TRABAJOS)</h3>

Supuesto: Se reciben N trabajos y luego se procesan todos.

>OPCIÓN A (3 Colas)
- Insertar N trabajos: N * O(1) = O(N)
- Procesar N trabajos: N * O(1) = O(N)
- COMPLEJIDAD TOTAL: O(N) (Lineal)

> OPCIÓN B (Lista Ordenada)
- Insertar N trabajos:
  La 1ra inserción: 1 paso
  La 2da inserción: 2 pasos
  ...
  La N-ésima inserción: N pasos
  Sumatoria: N(N+1)/2 = N²
- Procesar N trabajos: N * O(1) = O(N)
- COMPLEJIDAD TOTAL: O(N²) (Cuadrática)


3. CONCLUSIÓN Y JUSTIFICACIÓN


a. ¿Cuál implementación es más eficiente en el peor caso?
> La OPCIÓN A (Tres colas).

Su complejidad total es O(N), es muchisimo más rápido que la opción B (O(N²)) cuando N crece. En la Opción B, el costo de mantener la lista ordenada en cada inserción empeora mucho el
rendimiento general.

b. ¿Cuál sería más simple de mantener?

>La OPCIÓN A (Tres colas).
1. tiene un diseño Modular
2. tambien tiene menor riesgo de errores

c. Argumento Final:

Para una linea de impresión, lo que dura en recibir (enqueue) es
critico. La opción A me garantiza que el usuario nunca espere para enviar
un trabajo (tiempo constante).