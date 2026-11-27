# Día 1
# W01 - Fundamentos de Java

## JDK, JRE y JVM

- **JVM (Java Virtual Machine):** ejecuta programas Java.
- **JRE (Java Runtime Environment):** contiene la JVM y las bibliotecas necesarias para ejecutar aplicaciones.
- **JDK (Java Development Kit):** contiene el JRE y herramientas para desarrollar aplicaciones Java.

```text
JDK
└── JRE
    └── JVM
```

## Ciclo de compilación y ejecución

```text
Archivo .java
      ↓
    javac
      ↓
Archivo .class (bytecode)
      ↓
      JVM
      ↓
   Ejecución
```

## Tipos primitivos

| Tipo | Ejemplo |
|--------|----------|
| byte | 10 |
| short | 100 |
| int | 1000 |
| long | 1000L |
| float | 3.14f |
| double | 3.14 |
| char |

## Nota Feynman — Día 1 (Maven, pom.xml y JUnit 5):
Imagina que Maven es como un asistente de cocina que toma tus recetas (código Java), consigue los ingredientes que faltan (librerías como JUnit 5) y prepara el plato siguiendo un menú (pom.xml). El pom.xml padre es el menú general de todo el restaurante y el de cada módulo es el detalle de un platillo en particular. JUnit 5 es el probador que revisa cada bocado (@Test) para avisarte si sabe como esperabas o si algo salió mal antes de servirlo.

## Preguntas de repaso:
1. JDK, JRE y JVM: ¿Cuál es la diferencia esencial entre los tres y qué papel cumple cada uno al compilar y ejecutar tu código Java 17?

2. Maven y pom.xml: ¿Para qué sirve el pom.xml padre en la raíz frente al pom.xml del módulo w01-java-foundations, y qué verifica el comando mvn -B -ntp verify?

3. Paquetes y estructura de carpetas: ¿Por qué un archivo con package com.upskilling.w01; debe ubicarse en src/main/java/com/upskilling/w01/ o src/test/java/com/upskilling/w01/ y qué ocurre si no coincide?

4. Tipos primitivos, casting y overflow: ¿Qué ocurre al hacer un casting explícito de un tipo mayor o fuera de rango hacia uno menor (por ejemplo, de double a int o de int a byte), y cómo puedes anticipar un overflow en byte?

5. JUnit 5 y pruebas unitarias: ¿Qué rol cumplen @Test y aserciones como assertEquals o assertThrows al validar tanto el camino feliz como los casos límite o de error?
#
#
# Día 2
# W01: Control de flujo, bucles y Scanner en Java

## 1. Control de flujo

Permite controlar el orden en que se ejecutan las instrucciones de un programa, tomando decisiones según determinadas condiciones.

### 1.1. `if / else`
### 1.2. `switch` tradicional
### 1.3. Switch expressions
Introducidas oficialmente en Java 14, permiten utilizar `switch` para
obtener y asignar directamente un resultado.

Utilizan `->` en lugar de `:` y no necesitan `break`.

``` java
String resultado = switch (nota) {
    case 10 -> "Excelente";
    case 8, 9 -> "Bueno";
    default -> "Necesita mejorar";
};
```

**Diferencia principal:** El `switch` tradicional ejecuta instrucciones,
mientras que las *switch expressions* permiten devolver un valor.

------------------------------------------------------------------------

## 2. Bucles (Loops)

Permiten repetir instrucciones mientras se cumpla una condición o
durante un número determinado de veces.

### 2.1. `for`
### 2.2. `while`
### 2.3. `do-while`
### 2.4. `for-each`

## 3. `break` y `continue`

Son instrucciones que permiten modificar el comportamiento de los
bucles.

### `break`

Interrumpe completamente el bucle o la estructura `switch`.

``` java
if (numero == 5) {
    break;
}
```

### `continue`

Omite la iteración actual y continúa con la siguiente repetición del
bucle.

``` java
if (numero == 3) {
    continue;
}
```

**Diferencia:** - `break`: sale del bucle. - `continue`: salta la
iteración actual.

------------------------------------------------------------------------

## 4. Lectura de entrada con Scanner

`Scanner` es una clase del paquete `java.util` que permite leer datos
introducidos por el usuario, principalmente mediante el teclado.

### 4.1. Importación y creación

``` java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

### 4.2. Métodos principales
  ----------------- -------------------------
`nextInt()`       Lee números enteros.
`nextDouble()`    Lee números decimales.
`nextFloat()`     Lee valores `float`.
`nextBoolean()`   Lee valores booleanos.
`next()`          Lee una palabra.
`nextLine()`      Lee una línea completa.
`nextLong()`      Lee números `long`.

Al terminar de utilizar el `Scanner`, se puede cerrar con
`scanner.close()`.

------------------------------------------------------------------------
###
**Reforcé el tema de MAVEN**, aprendí que maven es una Herramienta de automatización para compilar, probar, empaquetar y verificar proyectos Java multi-módulo:
- mvn validate: verifica que el proyecto y los pom.xml estén bien configurados.
- mvn test: compila el código y ejecuta las pruebas unitarias.
- mvn package: empaqueta el proyecto en un archivo .jar o .war.
- mvn verify: ejecuta todas las fases anteriores junto con las verificaciones de calidad/integración configuradas (en CI se usa mvn -B -ntp verify para modo no interactivo y salida limpia).

**Sobre JUnit 5** aprendí que es un Framework para escribir y ejecutar pruebas unitarias en Java (**@Test, assertEquals, assertTrue, assertThrows**), cubriendo casos normales (happy path) y casos borde o de error. Para habilitarlo en un módulo Maven, se declara en **pom.xml** con alcance de pruebas (**test**):
## Nota Feynman — Día 2
Controlar el flujo de un programa es decidir qué camino toma según las condiciones y cuántas veces repite una acción, como seguir instrucciones en una receta según lo que tengas en la cocina. Con if y switch eliges entre opciones, mientras que los bucles repiten pasos hasta cumplir una meta o detenerse con break o saltar un turno con continue. Leer datos con Scanner es simplemente escuchar lo que escribe la persona en la pantalla. Separar las reglas del cálculo de esa lectura por pantalla permite probar que las decisiones y cuentas funcionan bien sin tener que teclear a mano cada vez.

## Preguntas de repaso:
1. ¿Cuál es la diferencia entre una switch expression con -> y una con bloque { ... } usando yield? La switch expression con -> devuelve directamente el resultado de una expresión simple en una línea, mientras que un bloque { ... } se usa cuando necesitas ejecutar varias sentencias o validaciones antes de producir el valor, empleando yield para devolver ese valor de la rama sin salir del método completo.
2. ¿Cómo actúan break y continue dentro de un bucle como while o for?break termina y sale por completo del bucle en ese momento, mientras que continue omite el resto de la iteración actual y pasa directamente a la siguiente vuelta del ciclo.
3. ¿Por qué conviene separar la lógica pura de las clases o métodos que usan Scanner?
Porque aislar las reglas o cálculos de la entrada/salida por consola permite probar la lógica de forma rápida, determinista y automatizada con JUnit sin simular teclado manualmente ni depender de la consola.
4. ¿Qué hace mvn verify a diferencia de mvn validate, mvn test y mvn package? mvn validate revisa la configuración del proyecto; mvn test compila y corre las pruebas unitarias; mvn package empaqueta el artefacto (como JAR o WAR); y mvn verify ejecuta las fases anteriores junto con las verificaciones configuradas (el estándar que usa tu flujo de CI con mvn -B -ntp verify).   
5. ¿Para qué sirve <scope>test</scope> al declarar junit-jupiter en el pom.xml?
Indica que la dependencia solo es necesaria para compilar y ejecutar las pruebas y no debe incluirse en el artefacto final de producción.


# Día 3

## - Métodos y Sobrecarga (Overloading) en Java
Estructura y firma:
- Un método agrupa lógica reutilizable con modificadores, tipo de retorno, nombre, parámetros y cuerpo.
- La firma solo incluye nombre + tipos y orden de parámetros (no incluye tipo de retorno, modificadores, nombres de parámetros ni throws).

Parámetros y paso por valor:

- Java siempre pasa argumentos por valor.

- En primitivos se pasa una copia del valor; en referencias (objetos/arreglos) se pasa una copia de la referencia (puedes mutar el estado interno del arreglo, pero no reasignar la variable original fuera del método).

Retorno (return):
- Debe devolver un valor compatible con el tipo declarado en todas las rutas (o usar void, con return; opcional para salir antes), cuidando conversiones implícitas (widening) y casting explícito.

Sobrecarga (Method Overloading):
- Varios métodos con el mismo nombre en la misma clase pero distinta firma (cantidad, tipo u orden de parámetros); se resuelve en tiempo de compilación.
- Cambiar solo el tipo de retorno no es válido, y abusar de widening/autoboxing/varargs o null puede causar ambigüedad.
- Distinta de overriding (misma firma en subclase, resuelto en tiempo de ejecución).

## - Alcance (Scope) en Java
El alcance (scope) determina la parte del código donde una variable puede ser utilizada. El ciclo de vida (lifetime) indica cuánto tiempo existe una variable durante la ejecución del programa.
Tipos de alcance
1. Bloque: variable declarada dentro de { }. Solo puede utilizarse dentro de ese bloque (por ejemplo, un if o un for).

2. Método: variable local declarada dentro de un método. Puede utilizarse dentro de su alcance en ese método, pero no desde otros métodos.

3. Clase: variable declarada dentro de una clase y fuera de sus métodos. Se conoce como atributo o campo y puede utilizarse desde distintos métodos, según sus modificadores de acceso.
   Diferencia entre alcance y ciclo de vida
- Alcance: dónde se puede acceder a una variable.
- Ciclo de vida: cuánto tiempo existe una variable.
  Importante: Las variables locales existen durante la ejecución del contexto donde fueron declaradas. Los atributos de instancia existen mientras exista su objeto y las variables static pertenecen a la clase.

En resumen: el alcance controla la visibilidad de las variables y el ciclo de vida determina su duración.

## Recursividad (Recursion) en Java
La recursividad es una técnica de programación en la que un método se llama a sí mismo para resolver un problema mediante partes más pequeñas del mismo problema.
Conceptos principales
1. Caso base (Base Case): condición que detiene las llamadas recursivas y evita que se ejecuten indefinidamente.

2. Llamada recursiva (Recursive Call): cuando un método se llama a sí mismo, generalmente utilizando un problema más pequeño o sencillo.

3. Pila de llamadas (Call Stack): estructura de memoria donde Java almacena las llamadas a los métodos mientras se ejecutan. Al finalizar cada llamada, se libera su espacio en la pila.

4. StackOverflowError: error que ocurre cuando la pila de llamadas se queda sin espacio, generalmente por una recursividad infinita o demasiado profunda.
   
¿Cómo evitar errores?
- Definir siempre un caso base.
- Asegurarse de que cada llamada se acerque al caso base.
- Evitar llamadas recursivas infinitas.
- Controlar la profundidad de la recursividad.
  En resumen: la recursividad permite que un método se llame a sí mismo para resolver problemas. Para funcionar correctamente necesita un caso base, llamadas recursivas que avancen hacia él y un control adecuado de la pila de llamadas.

## Arreglos 1D y 2D (Arrays) en Java
Los arreglos (arrays) son estructuras de datos que permiten almacenar varios elementos del mismo tipo en una sola variable. Cada elemento se identifica mediante un índice que comienza desde 0.
Tipos de arreglos
1. Unidimensionales (1D): almacenan datos en una sola dimensión, como una lista. Utilizan un solo índice.
   int[] numeros = {10, 20, 30, 40};
   System.out.println(numeros[0]); // 10


2. Bidimensionales (2D): almacenan datos en filas y columnas, como una matriz. Utilizan dos índices: uno para la fila y otro para la columna.

   int[][] matriz = {
   {1, 2, 3},
   {4, 5, 6} };

### Conceptos principales
- Declaración: definir el tipo de dato y el nombre del arreglo (int[] numeros).
- Inicialización: asignar valores al arreglo.
- Indexación: acceder a los elementos mediante su posición, comenzando desde 0.
- Recorrido: utilizar ciclos for para acceder a todos los elementos. En matrices 2D se utilizan dos ciclos anidados.

## Fundamentos de JUnit 5
En Java, JUnit 5 es un framework que permite crear y ejecutar pruebas unitarias (Unit Tests) para comprobar que los métodos de un programa funcionan correctamente.

Su objetivo es detectar errores y validar que la lógica del código produzca los resultados esperados.

Una prueba unitaria generalmente tiene tres pasos:
1. Arrange (Preparar): preparar los datos y objetos necesarios.
2. Act (Ejecutar): ejecutar el método que se desea probar.
3. Assert (Verificar): comparar el resultado obtenido con el esperado. 

Anotaciones principales de JUnit 5
- @Test: indica que un método es una prueba.
- @BeforeEach: se ejecuta antes de cada prueba.
- @AfterEach: se ejecuta después de cada prueba.
- @BeforeAll: se ejecuta una vez antes de todas las pruebas.
- @AfterAll: se ejecuta una vez después de todas las pruebas.
- @DisplayName: permite asignar un nombre descriptivo a una prueba.

Métodos de verificación (Assertions)
   Permiten comprobar si los resultados son los esperados.
- assertEquals(esperado, obtenido): comprueba que dos valores sean iguales.
- assertTrue(condicion): comprueba que una condición sea verdadera.
- assertFalse(condicion): comprueba que una condición sea falsa.
- assertNull(valor): comprueba que un valor sea null.
- assertNotNull(valor): comprueba que un valor no sea null.
- assertThrows(): comprueba que se produzca una excepción determinada. 

Ejemplo básico
   
   public class Calculadora {

   public int sumar(int a, int b) {
   return a + b;
   }
   }
#

Clase de prueba con JUnit 5:

import org.junit.jupiter.api.Test;<br>
import static org.junit.jupiter.api.Assertions.*;<br>
public class CalculadoraTest {

    @Test
    public void probarSuma() {

        // Arrange
        Calculadora calc = new Calculadora();

        // Act
        int resultado = calc.sumar(5, 3);

        // Assert
        assertEquals(8, resultado);
    }
}

Si el resultado obtenido es 8, la prueba pasa. Si es diferente, la prueba falla.

## 
 **Construí** ArrayUtils (con reverse, rotateRight, rotateLeft, max sobrecargado para int[] y double[], y mergeSorted), MatrixUtils (con sum y transpose), RecursionUtils (con factorial, fibonacci, power y gcd), además de Day3Cli con Scanner y sus pruebas unitarias en JUnit 5. Aprendí a manejar índices y límites en arreglos 1D y 2D, a normalizar rotaciones, a diseñar casos base y recursivos evitando StackOverflowError, y a validar entradas como valores null, arreglos vacíos y matrices irregulares. Lo que me falta por reforzar es revisar casos límite de desbordamiento (overflow) en factorial y potencia, así como seguir practicando recursividad antes de entrar al bloque de DSA.

## Resumen tipo Feynman — Día 3
Un método es una cajita de instrucciones reutilizable que recibe datos, hace un trabajo y devuelve un resultado, y sobrecargarlo es tener varias versiones con el mismo nombre para distintos tipos o cantidades de datos. Un arreglo es una fila de casillas numeradas (o una cuadrícula si tiene filas y columnas) donde cada posición guarda un valor, mientras que la recursividad es cuando un método se llama a sí mismo con un problema más pequeño hasta llegar a una parada segura (el caso base). Probar todo con JUnit 5 permite comprobar automáticamente que los arreglos, matrices y llamadas recursivas respondan bien incluso en casos límite.

## Preguntas de repaso 
¿Cuál es la diferencia entre sobrecarga (overloading) y sobrescritura (overriding) de métodos en Java?

¿Cómo afecta el alcance (scope) de una variable declarada dentro de un bloque for o if?

¿Por qué toda función recursiva necesita un caso base y qué ocurre si falta o nunca se alcanza?

En una matriz de r filas y c columnas, ¿qué dimensiones tiene su transpuesta y qué índice ocupa el elemento [r][c]?

¿Por qué conviene separar la lógica pura de las clases CLI con Scanner al escribir pruebas unitarias en JUnit 5?