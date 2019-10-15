# Bitacora de avances
## Avance de Análisis léxico y sintáctico
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

## Avance de Semantica Basica (tabla de simbolos y cubo semantico)
En este avance creamos la Tabla de simbolos y el Cubo semantico. Logramos con la
tabla de simbolos agregar funciones y variables asi como checar si estas existian.
Agregamos en el recorrido del arbol sintactico puntos neuralgicos para agregar
funciones y variables asi como para checar la existencia de estas en estatutos.
Tambien manejamos los errores de semantica y desplegamos la variable que no fue
declarada asi como el renglon y columna donde fue usado. La tabla de simbolos solo
soporta tipos de datos basicos por el momento. Hace falta extender su funcionalidad
para tipos de datos estructurados.

El cubo semantico no es utilizado aun, solo se creo. 
