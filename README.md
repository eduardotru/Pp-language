# Avance de Análisis léxico y sintáctico
La gramática funciona para los ejemplos en la carpeta Examples. Estos ejemplos
son cortos pero extensivos para tocar los siguientes aspectos:
- Declaración de variables
- Declaración de funciones
- Declaración de matrices
- Operaciones con matrices
- Operaciones aritméticas
- Asignaciones
- Llamadas a funciones
- Ciclos while
- Condicionales if/else

La herramienta ANTLR es capaz de compilar nuestra gramática y no arroja ningún
error de recursiones por la izquierda. La gramática no ha sido extensamente
probada para asegurarnos que no haya ambigüedades. ANTLR genera errores
genéricos los cuales tendremos que utilizar para arrojar errores más elaborados
en el proceso de compilación.

El código que utilizamos para probar la gramática está en Java ya que ANTLR
proporciona una interfaz gráfica para probar la gramática.

Sin embargo, el código generado es temporal ya que  el proyecto será desarrollado
con Python3.
