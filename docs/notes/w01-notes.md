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