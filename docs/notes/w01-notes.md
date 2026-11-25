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