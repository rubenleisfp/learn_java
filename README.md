# Learning Java

## Objetivo

Proporcionar una guía a los alumnos sobre qué contenido ver sobre Java y qué ejercicios pueden realizar para practicar su uso. Se proporciona una base teórica que tiene su correspondencia con actividades de refuerzo, de tal manera que el alumno deberá primero informarse sobre la teoría para luego aplicarla realizando los ejercicios correspondientes.

---

## Teoría

### Videotutoriales de Programación

- [Curso Gratis Java Para Principiantes](https://www.youtube.com/watch?v=qxXcI56NfnE&ab_channel=TodoCode)
- [JAVA Desde Cero: Primeros Pasos en una Hora](https://www.udemy.com/course/algoritmos-desde-cero/)

### 0 - Aprende algoritmos y diagramas de flujo

- [Algoritmo y diagrama de flujo](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)
- [Diagramas de flujo](https://www.youtube.com/watch?v=1frV9cIgAow&list=PL46-B5QR6sHm_qTw3tet7XHynE8bEucoa&index=8&ab_channel=EstudiaConMarisol)

### Algoritmos

- [Curso de Algoritmos desde Cero](https://www.udemy.com/course/algoritmos-desde-cero/)
- [Libro de Algoritmos](https://editorial.uaa.mx/docs/algoritmos.pdf)
- [Video sobre Algoritmos](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)

### Diagramas de Flujo

- [Receta de Cocina](https://www.diagramadeflujo.net/receta-de-cocina/)
- [Control de Flujo](http://lsi.vc.ehu.es/asignaturas/Inf_Bas/2005-06/comun/04%20Control%20flujo.pdf)
- [Bucles](http://lsi.vc.ehu.es/asignaturas/Inf_Bas/2005-06/comun/05%20Bucles.pdf)
- [Diagramas de Flujo - Área Tecnología](https://www.areatecnologia.com/diagramas-de-flujo.htm#google_vignette)


### 1 - Entorno: IntelliJ, Debug, Librerías y Maven

- [Instalar JDK](https://www3.ntu.edu.sg/home/ehchua/programming/howto/jdk_howto.html)
- [Guía de IntelliJ](https://www.jetbrains.com/help/idea/sdk.html#access-external-documentation)
- **Atajos en IntelliJ:**
  - Ir a clase: `Ctrl + N`
  - Ir a fichero: `Ctrl + Mayús + N`
  - Formatear código: `Ctrl + Alt + L`
  - Organizar imports: `Ctrl + Alt + O`

#### Debug:

- **DEPURACIÓN (DEBUG) en JAVA con INTELLIJ IDEA - Tutorial Completo Fácil**  
  [Debugging Your First Java Application](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#analyzing-state)

#### Jar/Librería:

- **LIBRERÍAS (bibliotecas) vs FRAMEWORKS ¿Cuáles son sus DIFERENCIAS? 🖥️ | DESARROLLO WEB 🌎**  
  - Exportar: [Compiling Applications](https://www.jetbrains.com/help/idea/compiling-applications.html#package_into_jar)  
  - Importar: [Working with Module Dependencies](https://www.jetbrains.com/help/idea/working-with-module-dependencies.html)

![Intellij import jar](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_import_jar.PNG)

- **Librerías top de Java:**  
  [20 Essential Java Libraries and APIs](https://medium.com/javarevisited/20-essential-java-libraries-and-apis-every-programmer-should-learn-5ccd41812fc7)

#### Maven:

- **¿Qué es MAVEN? ¿Cómo usar MAVEN? MAVEN vs Gradle 🖥️ | DESARROLLO JAVA 🌎**  
  - [Curso de Maven - 1 Introducción](https://www.arquitecturajava.com/que-es-maven/)

### 2 - Java Básico

- [Variables, Condicionales, Bucles y Arrays](https://www.w3schools.com/java/default.asp)

### 3 - Clases y Objetos

- [Conceptos de Clases y Objetos](https://www.w3schools.com/java/java_classes.asp)

### 4 - Static como Atributo

- [Explicación de Static](https://refactorizando.com/directiva-static-java/)

---

## Actividades de Refuerzo

### **Grupo 1 - IntelliJ, Librerías y Maven**

#### **Actividad 101: Crear un Proyecto Java Calculadora**

1. Descarga e instala IntelliJ.
2. Crea un proyecto Java (que no sea Maven) llamado `calculadora`.
3. Dentro de él, crea un paquete `com.fp`.
4. Implementa una clase `Calculadora` con métodos `sumar`, `restar`, `multiplicar` y `dividir`.
5. Utiliza el debugger para comprobar su funcionamiento.

#### **Actividad 102: Crear y Usar un JAR**

1. Exporta el proyecto anterior como un `jar` llamado `calculadora.jar`.
2. Prueba que funciona correctamente ejecutando el siguiente comando: java -jar calculadora.jar
3. Crea un nuevo proyecto Java (no Maven) Java llamado `matemáticas`.
4. Importa el `jar` anterior y utilízalo en una clase.

#### **Actividad 103: Crea un proyecto Maven Calculadora**

1. Crea un proyecto Maven en Intellij con estos datos:
   1. Group id: `com.fp`
   2. Artifact id: `calculadoramaven`
2. Crea un paquete `com.fp`
3. Copia la clase `Calculadora` del anterior proyecto dentro de dicho paquete

![Crear proyecto Maven](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_calculadora_maven.PNG)

#### **Actividad 104: Crea un proyecto Maven Matematicas donde uses Calculadora**
1. Crea un proyecto Maven en IntellIij con estos datos:
   1. Group id:  com.fp
   2. Artifact id: matematicasmaven
2. Crea un paquete com.fp
3. Importa como dependencia el proyecto del anterior ejercicio com.fp:calculadoramaven
4. Utiliza la clase calculadora dentro de tu proyecto matemáticas


#### **Actividad 105: Crea un proyecto para los siguientes Grupos. Learn Java**
1. Crea un proyecto Maven en IntellIij con estos datos:
  1. Group id: org.learn
  2. Artifact id: learn_java
2. Será el proyecto dónde ubicamos las siguiente actividades que realicemos a lo largo de esta documento
3. Cuando tengas que crear código en las siguientes actividades, hazlo dentro de su subpaquete con el código de la actividad a la que pertenece.
4. Otra opción es clonarlo dentro de esta ubicación de Git, concretamente la rama starter: https://github.com/rubenleisfp/java_learn

![Intellij learn java](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/intellij_learn_java.PNG)


#### **Actividad 116: Crea un proyecto para las siguientes actividades. Learn Java. Hola Mundo**
1. Dentro del proyecto anterior:
  1. Group id: org.learn
  2. Artifact id: learn_java
3. Crea un paquete llamado  org.example.entorno
4. Dentro de ese paquete crea otro llamado actividad116
5. Crea una clase HolaMundo en el paquete anterior que ejecute un “Hola Mundo” en IntellIij .


#### **Actividad 117: Learn Java. Fibonacci** 
1. Vamos a evaluar tu conocimiento sobre Java. Sino eres capaz de realizar este ejercicio, no te preocupes, 
simplemente es que necesitas aprender más sobre el siguiente tema[Java Básico](# **Grupo-2-Java-Básico**)
2. Crea el paquete:  `org.learn.entorno.actividad117`
3. Crea un programa que escriba por pantalla el valor enésimo de la secuencia de Fibonacci. El valor n se recibirá como argumento por pantalla.

[//]: # (Ejemplo)
Introduce el número de la secuencia de Fibonacci que deseas ver: 6

El número en sexta posición de la secuencia de Fibonacci es: 8

[//]: # (Hint)
En matemáticas, la sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597…  
El sexto número de la serie es el 8  
Los 2 primeros números de la serie son fijos a los que podríamos llamar a y b, los siguientes serán a suma de a y b.



#### **Actividad 118: Learn Java. Usar librería externa**
1. Dentro del proyecto anterior
2. Queremos comprobar si un determinado texto, es numérico o no. Como somos un poco vagos, queremos aprovechar el código de alguien que ya haya hecho una función semejante. Buscando en google vemos que existe una clase StringUtils del proyecto commons-lang3 que ya contiene lo que buscamos:
```java
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        boolean numeric = StringUtils.isNumeric("AAAA");
        System.out.println(numeric);
    }
}
```
3. Vamos a aprender a añadir una dependencia de terceros o jar, para eso debemos seguir los siguientes pasos:
4. Crea el paquete: org.learn.entorno.actividad118
5. Importa la dependencia Maven en el de commons-lang3, que nos provee Maven de su repositorio central: https://mvnrepository.com/
5. Acude a esta página y busca la dependencia indicada en el anterior paso
6. Debería redirigir aquí: https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.13.0
7. Añade esa dependencia a tu POM, de manera semejante a como ya has hecho anteriormente
8.Crea una clase App en tu paquete que realice la comprobación de si un texto es numérico o no


#### Actividades Complementarias
1. Conocer los atajos de IntelliJ, para ello visita la teoría.
2. Intenta depurar tu programa en busca de errores en modo debug

### **Grupo 2 - Java Básico**

#### **Actividad 201: Tipos de Datos**

1. Crea un paquete `org.learn.basico.actividad201`.
2. Escribe variables de los siguientes tipos: `char`, `String`, `int`, `double`, `BigDecimal`, `boolean`.
3. Realiza las siguientes conversiones e imprime los valores.

* String -> int
* int->String
* int -> double
* double ->int
* boolean-> String
* String -> boolean

![Distribucion paquetes](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/package_distribution_basico.PNG))

#### **Actividad 202: Operaciones Matemáticas**

1. Crea un paquete `org.learn.basico.actividad202`.
2. Escribe un programa que realice las operaciones básicas (suma, resta, multiplicación, división y módulo) con dos números ingresados por el usuario.

#### **Actividad 203: Condicionales**

1. Crea un paquete `org.learn.basico.actividad203`.
2. Escribe un programa que reciba dos números e indique cuál es mayor y para cada uno de ellos si es par o impar.

#### **Actividad 210: Ordenar Mayor a Menor**

1. Crea un paquete `org.learn.basico.actividad210`.
2. Escribe un programa en Java que reciba 3 números enteros.
3. Debe mostrar por la salida los elementos ordenados de mayor a menor.

Ejemplo salida:
Introduzca 3 elementos:
A=3
B=5
C=2
Los elementos ordenados de mayor a menor son: B,A,C

Hint:
Una manera de hacerlo es anidando if else, dónde vaya comparando 2 números, así cubriría las 
6 posibilidades existentes:

A,B,C
A,C,B
B,A,C
B,C,A
C,A,B
C,B,A

![Actividad210_diagrama](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/actividad210_diagrama.PNG))


#### **Actividad 211: Calificaciones**

1. Crea un paquete `org.learn.basico.actividad211`.
2. Escribe un programa que reciba un número entero que representa una nota.
3. Debe mostrar por la salida la calificación correspondiente.
	* Insuficiente (<5)
	* Suficiente (5)
	* Bien (6)
	* Notable (7 o 8)
	* SobreSaliente (9,10)

##### Ejemplo:

Ingrese la nota: 7

La calificación correspondiente es: Notable

#### **Actividad 213: Sumar enteros**

1. Crea un paquete llamado `org.learn.basico.actividad213`.
2. Escribe un programa en Java que reciba un número entero.
3. Debe mostrar por la salida la suma de todos los números anteriores al número recibido.

##### Ejemplo de salida:
Ingrese un número: 4  
Salida: 6  

##### Ejemplos aclaratorios para varios posibles números:
- 1 => 0
- 2 => 1
- 3 => 1 + 2 = 3
- 4 => 1 + 2 + 3 = 6
- 5 => 1 + 2 + 3 + 4 = 10

#### **Actividad 214: Tabla de multiplicar**

1. Crea un paquete llamado `org.learn.basico.actividad214`.
2. Dentro escribe un programa Java que tome un número como entrada e imprima su tabla de multiplicar hasta 10.

##### Ejemplo de salida:
Ingrese un número: 8  
Salida esperada:  
- 8 x 1 = 8
- 8 x 2 = 16
- 8 x 3 = 24
- ...
- 8 x 10 = 80
Ejemplo de salida:
Ingrese un número: 8
Salida esperada :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80


#### **Actividad 215: Promedio**
1. Crea un paquete llamado `org.learn.basico.actividad215`.
2. Dentro escribe un programa que realice el cálculo de la media aritmética de 3 números enteros recibidos como entrada.

##### Ejemplo salida:
Primer número: 2  
Segundo número: 4  
Tercer número: 6  
Promedio: 4  

#### **Actividad 216: Número Primo**
1. Crea un paquete llamado `org.learn.basico.actividad216`.
2. Realiza una función que calcule si un número es primo o no (es aquel que solo es divisible por 1 o por sí mismo).
3. Prueba la función con el número 4 y 5.
4. Ahora haz una nueva función que sume todos los números que son primos hasta 100.
5. Prueba esta segunda función.

##### Ejemplo:
5 true  
4 false  
1060 es la suma de los 100 primeros primos  

#### **Actividad 217: Clasificación de Números**
1. Crea un paquete llamado `org.learn.basico.actividad217`.
2. Realiza un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
3. El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.

##### Ejemplo:
Introduce la cantidad de números a ingresar: 5  
Ingrese el número 1: 1  
Ingrese el número 2: -3  
Ingrese el número 3: 0  
Ingrese el número 4: 2  
Ingrese el número 5: 4  
Cantidad de números mayores que 0: 3  
Cantidad de números menores que 0: 1  
Cantidad de números iguales a 0: 1  

#### **Actividad 218: Análisis de Cadenas - ¿Sólo Vocales?**
1. Crea un paquete llamado `org.learn.basico.actividad218`.
2. En este ejercicio debemos pedir al cliente que introduzca una cadena de caracteres y posteriormente debemos analizarla para ver si se han incluido sólo vocales o hay algún otro tipo de carácter.

#### **Actividad 219: Distribuir Números**
1. Crea un paquete llamado `org.learn.basico.actividad219`.
2. Haz un programa que reciba como argumento con `Scanner` un número.
3. El programa creará 2 arrays, uno para los elementos pares y otro para los impares hasta el número ofrecido como argumento.
4. Finalmente recorrerá ambos arrays para ver su contenido.

##### Ejemplo:
Ingrese un número: 5  
Elementos pares: 2 4  
Elementos impares: 1 3 5  

#### **Actividad 220: Voltear Matriz**
1. Crea un paquete llamado `org.learn.basico.actividad220`.
2. Escribe un programa para rotar los argumentos de una matriz.
3. La matriz inicial la definirás hardcodeada en el programa.

##### Datos de prueba: 
{20, 30, 40}  
##### Salida esperada: 
{40, 30, 20}  

#### **Actividad 221: Multiplicar Matriz**
1. Crea un paquete llamado `org.learn.basico.actividad221`.
2. Escriba un programa Java para multiplicar los elementos correspondientes de dos matrices de enteros.
3. Las matrices serán siempre de una dimensión y tendrán 4 elementos.

##### Salida de muestra:
Matriz1: [1, 3, -5, 4]  
Matriz2: [1, 4, -5, -2]  
Resultado: 1 12 25 -8

### **Grupo 3 - Clases y Objetos**

#### **Actividad 301: Clase Círculo**

1. Crea un paquete `org.learn.clases.actividad301`.
2. Implementa una clase `Círculo` con métodos para calcular su perímetro y área.

#### **Actividad 302: Clase Cuenta Bancaria**

1. Crea un paquete `org.learn.clases.actividad302`.
2. Implementa una clase `Cuenta` con titular y cantidad.
3. Implementa métodos para ingresar y retirar dinero.
4. Crea una clase `App` para probar su funcionamiento.

### **Grupo 4 - Static**

#### **Actividad 402: Tienda de Productos**

1. Crea un paquete `org.learn.staticproperty.actividad402`.
2. Implementa una clase `Producto` con nombre y precio.
3. Implementa una clase `Tienda` con un contador estático de ventas.
4. Implementa un método `realizarVenta(Producto p)`.
5. Prueba el sistema en una clase `Main`.

### **Grupo 5 - Colecciones**

#### **Actividad 502: CRUD de Artistas**

1. Crea un paquete `org.learn.colecciones.actividad502`.
2. Implementa un sistema CRUD para una lista de artistas.
3. Ofrece opciones para agregar, eliminar, consultar y actualizar.

### **Grupo 6 - Herencia**

#### **Actividad 602: Gestión de Empleados**

1. Crea un paquete `org.learn.herencia.actividad602`.
2. Implementa una clase base `Empleado` con nombre y salario.
3. Implementa `EmpleadoTemporal` y `EmpleadoPermanente` con diferentes cálculos de salario.
4. Prueba las clases en un `Main`.

### **Grupo 7 - Interfaces**

#### **Actividad 702: Caravana de Vehículos**

1. Crea un paquete `org.learn.interfaz.actividad702`.
2. Implementa una interfaz `Vehiculo` con métodos de velocidad.
3. Implementa clases `Turismo`, `Autobús` y `Camión`.
4. Crea una lista de vehículos y muestra sus velocidades.

### **Grupo 8 - Polimorfismo**

#### **Actividad 801: Entender el Polimorfismo**

1. Crea un paquete `org.learn.interfaz.actividad801`.
2. Implementa el ejemplo del blog [Arquitectura Java](https://www.arquitecturajava.com/java-polimorfismo-herencia-y-simplicidad/).

---

## Anexo: Más Ejercicios

- [Ejercicios de Java Básico](https://www.w3resource.com/java-exercises/basic/index.php)
- [Ejercicios de Bucles](https://manolohidalgo.com/ejercicios-bucles-en-java/)
- [Ejercicios de Arrays](https://dam.org.es/ejercicios-de-arrays-resueltos/)
- [Ejercicios de POO](https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/)

Este documento incluye toda la información estructurada en Markdown para facilitar su uso y comprensión.
