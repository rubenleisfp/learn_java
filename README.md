# Learning Java
 
## Objetivo

Proporcionar una guía a los alumnos sobre qué contenido ver sobre Java y qué ejercicios pueden realizar para practicar su uso. Se proporciona una base teórica que tiene su correspondencia con actividades de refuerzo, de tal manera que el alumno deberá primero informarse sobre la teoría para luego aplicarla realizando los ejercicios correspondientes.

---

## Teoría

### Videotutoriales de Programación

- [Curso Gratis Java Para Principiantes](https://www.youtube.com/watch?v=qxXcI56NfnE&ab_channel=TodoCode)
- [JAVA Desde Cero: Primeros Pasos en una Hora](https://www.udemy.com/course/algoritmos-desde-cero/)
- [Aprende Java con Brais Moure](https://github.com/mouredev/hello-java/tree/main)

### 0 - Aprende algoritmos y diagramas de flujo

- [Algoritmo y diagrama de flujo](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)
- [Diagramas de flujo](https://www.youtube.com/watch?v=1frV9cIgAow&list=PL46-B5QR6sHm_qTw3tet7XHynE8bEucoa&index=8&ab_channel=EstudiaConMarisol)

#### Algoritmos

- [Curso de Algoritmos desde Cero](https://www.udemy.com/course/algoritmos-desde-cero/)
- [Libro de Algoritmos](https://editorial.uaa.mx/docs/algoritmos.pdf)
- [Video sobre Algoritmos](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)

#### Diagramas de Flujo

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
- [Composicion](https://www.arquitecturajava.com/java-composicion-y-la-reutilizacion-del-codigo/)

### 4 - Static

- [Explicación de Static](https://javamagician.com/java-palabra-clave-static/)

### 5 - Colecciones

- [ArrayList](https://www.w3schools.com/java/java_arraylist.asp)
- [Map](https://www.w3schools.com/java/java_hashmap.asp)
- [Comparator](https://www.baeldung.com/java-comparator-comparable)

### 6 - Herencia

- [Abstracción](https://www.w3schools.com/java/java_abstract.asp)
- [Herencia](https://www.w3schools.com/java/java_inheritance.asp)

### 7 - Interfaces

- [Interfaz](https://www.w3schools.com/java/java_interface.asp)

### 8 - Polimorfismo

- [Polimorfismo](https://www.w3schools.com/java/java_polymorphism.asp)

### 9 - Excepciones

- [Checked_unchecked](https://codegym.cc/es/quests/lectures/es.cgu.module1.lecture29)
- [Ejemplos](https://openwebinars.net/blog/introduccion-a-poo-en-java-excepciones/)

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
#TiposDatos

1. Crea un paquete `org.learn.basico.actividad201`.
2. Escribe variables de los siguientes tipos: `char`, `String`, `int`, `double`, `BigDecimal`, `boolean`.
3. Realiza las siguientes conversiones e imprime los valores.

* String -> int
* int->String
* int -> double
* double ->int
* boolean-> String
* String -> boolean

![Distribucion paquetes](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/package_distribution_basico.PNG)

#### **Actividad 202: Operaciones Matemáticas**
#Operaciones
1. Crea un paquete `org.learn.basico.actividad202`.
2. Escribe un programa que realice las operaciones básicas (suma, resta, multiplicación, división y módulo) de 2 números.

#### **Actividad 203: Intercambiar valores**
#Operaciones
1. Crea un paquete `org.learn.basico.actividad203`.
2. Escribe un programa que inicie 2 variables e intercambie su valor.
3. ¿Cómo lo harías? Quizás iniciar una tercera variable te pueda ayudar.

#### **Actividad 205: Área y perimetro del cuadrado**
#TiposDatos
1. Crea un paquete `org.learn.basico.actividad205`.
2. Crea una función llamada calcularArea que reciba el lado y devuelva el area
3. Crea una función llamada calcularPerimetro que reciba el lado y devuelva el perimetro
4. No es necesario pedir los datos al usuario. Pueden estar escritos directamente en el main

#### **Actividad 220: Condicionales**
#Condicionales
1. Crea un paquete `org.learn.basico.actividad220`.
2. Escribe un programa que reciba dos números e indique cuál es mayor y para cada uno de ellos si es par o impar.

#### **Actividad 221: Bisiesto**
#Condicionales
1. Crea un paquete `org.learn.basico.actividad221`.
2. Escribe un programa que reciba dos números e indique si un año es bisiesto o no (Un año es bisiesto si es divisible entre 4, pero no es divisible entre 100, a menos que sea divisible entre 400.)
3. No es necesario pedir los datos al usuario. Pueden estar escritos directamente en el main

#### **Actividad 222: Calificaciones**
#Condicionales
1. Crea un paquete `org.learn.basico.actividad222`.
2. Escribe un programa que reciba un número entero que representa una nota.
3. Crea una función llamada obtenerCalificacion que reciba el entero y devuelva la calificación
4. El programa debe mostrar por la salida la calificación correspondiente.
    * Insuficiente (<5)
    * Suficiente (5)
    * Bien (6)
    * Notable (7 o 8)
    * SobreSaliente (9,10)

##### Ejemplo:

Ingrese la nota: 7

La calificación correspondiente es: Notable

#### **Actividad 223: Ordenar Mayor a Menor**
#Condicionales
1. Crea un paquete `org.learn.basico.actividad223`.
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


#### **Actividad 230: Bucle del 1 al 10**
#Bucles #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad230'`.
2. Escribe un programa en Java que para haga un bucle del 1 al 10 de 3 formas distintas

#### **Actividad 231: Contar pares del 0 al 20**
#Bucles #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad231'`.
2. Escribe un programa en Java que  cuente los números pares del 0 al 20

#### **Actividad 233: Sumar enteros**
#Bucles #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad233`.
2. Escribe un programa en Java que para un numero entero
   muestre por la salida la suma de todos los números anteriores al número recibido.
3. No es necesario pedir los datos al usuario. Los puede tener escritos directamente en el main


##### Ejemplo:
Ingrese un número: 4  
Salida: 6

##### Ejemplos aclaratorios para varios posibles números:
- 1 => 0
- 2 => 1
- 3 => 1 + 2 = 3
- 4 => 1 + 2 + 3 = 6
- 5 => 1 + 2 + 3 + 4 = 10

#### **Actividad 234: Tabla de multiplicar**
#Bucles #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad234`.
2. Dentro escribe un programa Java que tome un número como entrada e imprima su tabla de multiplicar hasta 10.

##### Ejemplo:
Ingrese un número: 8  
Salida esperada:
- 8 x 1 = 8
- 8 x 2 = 16
- 8 x 3 = 24
- ...
- 8 x 10 = 80

#### **Actividad 235: Promedio**
#Operaciones #Condicionales #Bucles
1. Crea un paquete llamado `org.learn.basico.actividad235`.
2. Dentro escribe un programa que realice el cálculo de la media aritmética de 3 números enteros recibidos como entrada.

##### Ejemplo:
Primer número: 2  
Segundo número: 4  
Tercer número: 6  
Promedio: 4

#### **Actividad 236: Número Primo**
#Bucles #Condicionales #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad236`.
2. Realiza una función que calcule si un número es primo o no (es aquel que solo es divisible por 1 o por sí mismo).
3. Prueba la función con el número 4 y 5.
4. Ahora haz una nueva función que sume todos los números que son primos hasta 100.
5. Prueba esta segunda función.

##### Ejemplo:
5 true  
4 false  
1060 es la suma de los 100 primeros primos

#### **Actividad 237: Clasificación de Números**
#Bucles #Condicionales #Operaciones
1. Crea un paquete llamado `org.learn.basico.actividad237`.
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


#### **Actividad 250: Crea un array con los días de la semana**
#Array
1. Crea un paquete llamado `org.learn.basico.actividad250`.
2. Crea un array vacío
3. Rellenalo con los días de la semana
4. Recorrelo y muestra todos los días

#### **Actividad 251: Distribuir Números**
#Array
1. Crea un paquete llamado `org.learn.basico.actividad251`.
2. Haz un programa que reciba como argumento con `Scanner` un número.
3. El programa creará 2 arrays, uno para los elementos pares y otro para los impares hasta el número ofrecido como argumento.
4. Finalmente recorrerá ambos arrays para ver su contenido.

##### Ejemplo:
Ingrese un número: 5  
Elementos pares: 2 4  
Elementos impares: 1 3 5

#### **Actividad 252: Rotar Matriz**
#Array
1. Crea un paquete llamado `org.learn.basico.actividad252`.
2. Escribe un programa para rotar los argumentos de una matriz.
3. La matriz inicial la definirás hardcodeada en el programa.

##### Datos de prueba:
{20, 30, 40}
##### Salida esperada:
{40, 30, 20}

#### **Actividad 253: Multiplicar Matriz**
#Array
1. Crea un paquete llamado `org.learn.basico.actividad253`.
2. Escriba un programa Java para multiplicar los elementos correspondientes de dos matrices de enteros.
3. Las matrices serán siempre de una dimensión y tendrán 4 elementos.

##### Salida de muestra:
Matriz1: [1, 3, -5, 4]  
Matriz2: [1, 4, -5, -2]  
Resultado: 1 12 25 -8

#### **Actividad 260: Repetir palabra**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad260`.
2. Haz un programa que tenga una funcion que reciba una palabra y el número de veces que deseamos repetirla
   y devuela la palabra repetida n veces
   Ej: "Hola" 5 => "Hola Hola Hola Hola Hola"

#### **Actividad 261: Caracteres totales**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad261`.
2. Haz un programa que tenga una funcion que reciba una frase y devuelve el número total de caracteres que contiene
   Ej: "Estoy aprendiendo Java" => 23

#### **Actividad 262: Numero palabras**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad262`.
2. Haz un programa que tenga una funcion que reciba una frase y devuelva el número de palabras

3. Ej: “Me gusta mucho la programación” => 5

#### **Actividad 263: Palabra más larga**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad263`.
2. Haz un programa que tenga una funcion que reciba una frase y devuelva la palabra más larga

3. Ej: “Me gusta mucho la programación” => programación

#### **Actividad 264: Cadena al revés**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad264`.
2. Haz un programa que tenga una funcion que reciba una frase y la devuelva al revés

Ej: “Me gusta mucho la programación” => “programación la mucho gusta Me”

#### **Actividad 265: Análisis de Cadenas - ¿Sólo Vocales?**
#Cadenas
1. Crea un paquete llamado `org.learn.basico.actividad265`.
2. En este ejercicio debemos pedir al cliente que introduzca una cadena de caracteres y posteriormente debemos analizarla para ver si se han incluido sólo vocales o hay algún otro tipo de carácter.

### **Grupo 3 - Clases y Objetos**

#### **Actividad 301: Clase Círculo**

1. Crea un paquete llamado `org.learn.clases.actividad301`.
2. Crear una clase `Círculo` que represente esta figura geométrica.
3. Crea métodos para calcular su perímetro y área.

#### **Actividad 302: Clase Coche**

1. Crea un paquete llamado `org.learn.clases.actividad312`.
2. Crea una clase Motor con los atributos potencia y tipo (por ejemplo, "eléctrico" o "gasolina").
2. Luego, crea una clase Coche para que tenga un objeto de tipo Motor.
3. En una clase principal llamada AppCoche,en el main(), crea un coche con su motor e imprime la información.

#### **Actividad 303: Clase Coche acelerar**

1. Crea un paquete llamado `org.learn.clases.actividad313`.
2. Crea una clase Motor y Coche, iguales que las del ejercicio 302
3. En la clase Coche, crea un nuevo atributo llamado velocidad
3. En la clase coche, crea 2 métodos acelerar. El primero incrementará la velocidad en 10km y el segundo recibirá un argumento
   para incrementar lo que gustemos.
4. En la clase AppCoche, crea 2 coches y haz que incrementen su velocidad de forma aleatoria

#### **Actividad 312: Clase Cuenta**

1. Crea un paquete llamado `org.learn.clases.actividad312`.
2. Crea una clase llamada `Cuenta` con los siguientes atributos:
    - `titular`: obligatorio.
    - `cantidad`: opcional, puede tener decimales.
3. Crea dos constructores que cumplan lo anterior.
4. Implementa los métodos `get`, `set` y `toString`.
5. Métodos especiales:
    - `ingresar(double cantidad)`: Si la cantidad es negativa, no se hará nada.
    - `retirar(double cantidad)`: Si el saldo resulta negativo, pasa a ser 0.

Crea una clase `App` para realizar operaciones de ingreso y retiro en una cuenta.

#### **Actividad 313: Transferencias entre Cuentas**

1. En la clase `App`, crea un método para transferir dinero entre cuentas:
   ```java
   public void transferencia(double cantidad, Cuenta cuentaDestino) {
   ```
2. Implementa el método para transferir dinero de la cuenta origen a la cuenta destino.
3. Crea dos cuentas, inicialízalas con un saldo y realiza una transferencia entre ellas.

#### **Actividad 314: Clase Nave Espacial**

1. Crea un paquete llamado `org.learn.clases.actividad314`.
2. Completa la clase `NaveEspacial` que simula el movimiento de una nave en un plano bidimensional:
    - Métodos para moverse a izquierda, derecha, arriba y abajo.
    - La nave no puede salirse de los límites definidos por `xMax`, `xMin`, `yMax` y `yMin`.
    - Si se supera un límite, el método devuelve `false`; si no, avanza y devuelve `true`.

Atributos de la clase `NaveEspacial`:
- `x`: posición horizontal actual.
- `y`: posición vertical actual.
- `xMax`: límite máximo horizontal.
- `xMin`: límite mínimo horizontal.
- `yMin`: límite mínimo vertical.
- `yMax`: límite máximo vertical.

Crea una clase `App` para crear una nave espacial y probar los movimientos posibles. Después de cada movimiento, muestra la posición actual.

### **Grupo 4 - Static**

Resumen:
static como atributo es un valor compartido por todas las instancias de un objeto
### **Actividad 402: Tienda de Productos**

En este ejercicio, simularás una tienda de productos electrónicos.
Crearás una clase llamada **Producto** que represente un producto en la tienda.
Cada producto tendrá un nombre y un importe.
Además, crearás una clase llamada **Tienda** que tendrá:
- Un contador estático para realizar un seguimiento del total de ventas en la tienda
- Una variable para almacenar el importe total de las ventas realizadas

Instrucciones:
1. Crea una clase llamada **Producto** con variables de instancia para el nombre y el precio del producto,
2. Define un constructor para la clase **Producto** que tome el nombre y el precio del producto como parámetros.
3. Crea una clase llamada **Tienda** con dos variables estáticas:
    - Número de ventas
    - Importe total de las ventas realizadas
4. Define un método estático llamado `realizarVenta(Producto p)` en la clase **Tienda** que tome el producto como parámetro e incremente el importe total y el número de ventas.
5. En el método `main`, crea varios objetos **Producto**, realiza ventas y luego imprime tanto el total de productos vendidos como el total de ventas en la tienda.

![Ejemplo 402](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/actividad402_ejemplo.PNG)

### **Grupo 5 - Colecciones**

#### **Actividad 501: Probar colecciones**

1. Crea un paquete llamado `org.learn.colecciones.actividad501`.
2. Revisa en la teoría aquellos videos de las colecciones que necesites repasar.
3. Copia en IntellIij los ejemplos de w3schools, entiendelos, ejecútalos e intenta utilizar más opciones del API de cada colección.
    - [Ejemplos de w3schools](https://www.w3schools.blog/list-set-map-java)
4. ¿Qué pasa si añades en un Set un elemento que ya existe en la lista?
    - ¿Permite duplicados?
5. ¿Qué sucede si añades a un Map un elemento con clave que ya existe?

Replica los ejemplos anteriores para List, Set y Mapa, pero utilizando en vez de un String en las colecciones, un objeto. P.ej:
- Alumno (String nombre, int id)

#### **Actividad 502: Manipulación básica de listas**
1. Crea un paquete llamado `org.learn.colecciones.actividad502`.
2. Escribe un programa en Java que:
3. Cree una ArrayList<String> con los nombres de tres ciudades.
4. Añada una cuarta ciudad al final de la lista.
5. Elimine la segunda ciudad.
6. Muestre el contenido de la lista tras cada operación.

#### **Actividad 503: Uso de Set para eliminar duplicados**
1. Crea un paquete llamado `org.learn.colecciones.actividad503`.
2. Escribe un programa que:
3. Cree un HashSet<Integer>.
4. Añada los números: 10, 20, 30, 20, 10, 40, 50.
5. Muestre el contenido del Set.

#### **Actividad 504: Diccionario con Map**
1. Crea un paquete llamado `org.learn.colecciones.actividad504`.
2. Implementa un programa que:
3. Cree un HashMap<String, String> para almacenar palabras y su traducción en inglés.
4. Añada al menos tres pares de palabras.
5. Busque la traducción de una palabra.
6. Imprima todas las claves y valores del mapa.

#### **Actividad 505: Búsqueda en lista de objetos**
1. Crea un paquete llamado `org.learn.colecciones.actividad505`.
2. Escribe un programa que:
3. Defina una clase Alumno con String nombre e int id.
4. Cree una ArrayList<Alumno> con al menos tres objetos.
5. Busque si un alumno con un id específico está en la lista.

#### **Actividad 512: Gestor Artistas**

1. Crea un paquete llamado `org.learn.colecciones.actividad512`.
2. Haz una clase App con un main, que realice la siguiente tarea:
    - Ofrece al usuario la opción de realizar un CRUD (Create, Remove, Read,Update) sobre una lista de artistas musicales, el artista se define como un String.

           1. Nuevo artista
           2. Consultar artistas
           3. Eliminar artista
           4. Actualizar artista
           5. Salir del programa

             Introduzca una opción:

6. Ordena la lista resultante de mayor a menor calificación.

Implementación de cada opción:

1. Nuevo artista => el programa solicitará que se introduzca un String con el nombre del artista
2. El programa mostrará por consola todos los artistas introducidos hasta el momento. Su posición en la lista (id) y nombre
3. El programa solicitará que introduzcamos la posición en la lista (id) para borrar ese artista.
4. El programa solicitará el id del artista a actualizar y posteriormente un String con el nombre del nuevo artista. Hint: contains, indexOf, set
5. Salir del programa

En la rama starter ya se provee una maqueta

#### **Actividad 513: Software de Encriptación/Desencriptación**

1. Crea un paquete llamado `org.learn.colecciones.actividad513`.
2. Haz una clase `App` con un `main`, que realice la siguiente tarea:
    - Desarrolla un software de encriptación/desencriptación para los teléfonos de nuestros agentes secretos.

##### Implementación:

- El software tiene 2 modos de funcionamiento, dependiendo del valor introducido por el usuario por teclado: `C` (Cifrado), `D` (Descifrado).
- Después de introducir el modo de funcionamiento, el usuario introducirá el número de teléfono a cifrar o descifrar.
- El mapa de cifrado/descifrado es el siguiente:

  | Original | Cifrado/Descifrado |
        |----------|--------------------|
  | 0        | 9                  |
  | 1        | 1                  |
  | 2        | 3                  |
  | 3        | 7                  |
  | 4        | 8                  |
  | 5        | 6                  |
  | 6        | 2                  |
  | 7        | 4                  |
  | 8        | 5                  |
  | 9        | 0                  |

##### Ejemplo:

- Introduzca el modo de funcionamiento: `C`
- Introduzca el teléfono: `615051847`
- Teléfono cifrado: `296169584`

#### **Actividad 514: App Gustos**

1. Crea un paquete llamado org.learn.colecciones.actividad514.

2. Implementa un programa que permita al usuario ingresar distintas tareas y asignarles una puntuación del 0 al 10 según su nivel de gusto o preferencia.

3. Usa un Map<Integer, List<String>>, donde la clave sea la puntuación y el valor sea una lista de tareas con esa puntuación.

4. El programa deberá:

    - Solicitar tareas al usuario hasta que este escriba "SALIR".

    - Pedir una puntuación entre 0 y 10 para cada tarea.

    - Almacenar la tarea en la lista correspondiente a su puntuación dentro del Map.

    - No permitir puntuaciones fuera del rango.

    - Al finalizar la entrada de datos, mostrará todas las tareas agrupadas por puntuación.

![Ejemplo 514](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/actividad514_appgustos.PNG)

#### **Actividad 515: Filtrado de películas**

##### Cómo puede hacerse:

1. Crea un paquete llamado org.learn.colecciones.actividad515.

2. Implementa una clase Pelicula con los siguientes atributos:

    -  String titulo

    -  String genero

    - Double calificacion (valor entre 0.0 y 10.0)

3. Un constructor y los métodos toString, equals y hashCode adecuados.

4. En la función main, crea una lista de al menos 8 películas de distintos géneros y calificaciones.

5. Filtra la lista para quedarte solo con las películas de un género específico (por ejemplo, "Acción").
6. Ordena la lista de peliculas por su calificacion primero de forma ascendente y luego descendente.
7. Quedate con las n primeras peliculas que indique el usuario

#### **Actividad 516: Carta mas alta**
1. Crea un paquete llamado org.learn.colecciones.actividad516.
2. Implementar las clases necesarias para representar un partida de cartas al juego de "Carta mas alta".
3. Podrá indicarse el número de rondas a disputar
3. Podrá haber n parcipantes, se pedirá al usuario los nombres de estos por la entrada standard hasta que escriba
   la palabra FIN
4. En ese momento se creará una partida, en la cual se repartirá una carta a cada jugador, obviamente
   la baraja no puede tener cartas repetidas.
5. Ganará el jugador con la carta mas alta

![Juego carta mas alta](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/carta_mas_alta.png)

Hint:

![UML Diagrama de clases](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/actividad_516_UML_Juego_Cartas.PNG)



### **Grupo 6 - Herencia**

### **Actividad 601: Entender la Herencia**

1. Crea un paquete llamado `org.learn.herencia.actividad601`.
2. Copia en IntelliJ los ejemplos de w3schools, entiendelos, ejecutalos. Agrega un método más que devuelva el número de ruedas de un vehículo. Imprime las ruedas de `myCar`.
3. Seguramente no te funcionen desde IntelliJ, es es debido a cómo está estructurado el código, separa cada Clase en su correspondiente fichero, de manera que tengas 3 clases:
    - `Vehicle`
    - `Car`
    - `App`: contendrá un método `static void main(String[] args)` dónde instancies el Coche y realices el código que vienen en el ejemplo

[//]: # (Ejemplo)
https://www.w3schools.com/java/java_inheritance.asp

### **Actividad 602: Entender la Herencia en una aplicación real**

1. Crea un paquete llamado `org.learn.herencia.actividad602`.
2. Crea una aplicación Java para gestionar empleados en una empresa. Hay tres tipos de empleados: `Empleado`, `EmpleadoTemporal` y `EmpleadoPermanente`. Todos los empleados tienen un nombre, un salario y un método `calcularSalarioAnual()` que calcula el salario.
3. La clase `Empleado` es la clase base. Debe tener los siguientes atributos y métodos:
    - Atributos: `nombre` (String), `salario` (double). Salario se refiere al salario base mensual.
    - Métodos:
        - Constructor: Un constructor que inicializa el nombre y el salario del empleado.
        - `calcularSalarioAnual()`: Un método que devuelve el salario anual del empleado.
4. La clase `EmpleadoTemporal` hereda de `Empleado`. Además de los atributos y métodos de `Empleado`, tiene un atributo adicional `duracionContrato` (int) que representa la duración del contrato en meses. Sobrescribe el método `calcularSalarioAnual()` para calcular el salario de acuerdo con la duración del contrato (por ejemplo, el salario base por mes multiplicado por la duración del contrato).
5. La clase `EmpleadoPermanente` también hereda de `Empleado`. Además de los atributos y métodos de `Empleado`, tiene un atributo adicional `beneficios` (double) que representa el valor de los beneficios adicionales que recibe el empleado permanente. Sobrescribe el método `calcularSalarioAnual()` para calcular el salario sumando el salario base y los beneficios.
6. Crea una clase `Main` que tenga el método `main()` para probar tu implementación. Crea instancias de cada tipo de empleado, asigna valores y muestra los salarios calculados para cada uno.
7. Este ejercicio proporciona una buena práctica para comprender los conceptos de herencia en Java y cómo se pueden sobrescribir métodos en las clases derivadas.

7. Obtén las 5 películas mejor valoradas.

8. Muestra en consola la lista final

### **Grupo 7 - Interfaces**

### **Actividad 701: Entender Interfaces**

1. Crea un paquete llamado `org.learn.interfaz.actividad701`.
2. Revisa primero el apartado de teoría correspondiente.
3. En Intellij, crea los ejemplos proporcionados en el ejemplo de w3schools:
    - https://www.w3schools.com/java/java_interface.asp

### **Actividad 702: Implementar Interfaces**

1. Crea un paquete llamado `org.learn.interfaz.actividad702`.
2. Vamos a realizar una caravana de vehículos, la típica que vemos todos los años en la tele en verano desplazándose a las playas.
3. Para eso nos han facilitado una interfaz que deben implementar todos los vehículos a motor, ya que debe controlarse su velocidad en todo tipo de carretera:

![Ejemplo 702](https://github.com/rubenleisfp/java_learn/blob/main/src/main/resources/git_images/actividad702_velocidad.PNG)

```java
public interface Vehiculo {

    int velAutopista();
    int velCarretera();
    int velCarreteraSepFisica();
    int velSinPavimentar();
}
```



Implementa esa interfaz para los vehículos del gráfico e implementa su velocidad. Pueden ser 3 clases: Turismo, Autobus y Camion.

Crea un App  con un main dónde vamos a crear una lista “caravana de vehículos”. Rellénala con varios vehículos de diversa índole

```java
List<Vehiculo> caravana = new ArrayList<Vehiculo>
caravana.add(new Turismo());
        caravana.add(new Camion());
```

Crea un método que reciba como argumento nuestra caravana e imprima por consola su velocidad por autopista.



### **Grupo 8 - Polimorfismo**

### **Actividad 801: Entender el polimorfismo**

Actividad 801
Crea un paquete llamado llamado org.learn.interfaz.actividad801
Sobre el ejemplo de este blog: https://www.arquitecturajava.com/java-polimorfismo-herencia-y-simplicidad/
Entiéndelo, haz preguntas a tu profesor e implementalo en IntellIj.


### **Actividad 802: Supermercado polimorfico**

Crea un paquete llamado `org.learn.interfaz.actividad802`.
Implementa lo comentado a continuación:

Suponga que debe crear distintas clases Java para describir los productos que vende un supermercado. Para unificar el código de los distintos programadores del equipo debe crear las siguientes Interfaces Java para describir algunas características de los productos:

#### **Interfaz `EsLiquido`**

Esta interfaz indica que los objetos creados a partir de la clase serán líquidos, y tendrá los siguientes métodos:

* `public void setVolumen(double v);`
* `public double getVolumen();`
* `public void setTipoEnvase(String env);`
* `public String getTipoEnvase();`

#### **Interfaz `EsAlimento`**

Esta interfaz indica que los objetos creados a partir de la clase serán alimentos, y tendrá los siguientes métodos:

* `public void setCaducidad(LocalDate fc);`
* `public LocalDate getCaducidad();`
* `public int getCalorias();`

#### **Interfaz `ConDescuento`**

Esta interfaz indicará que el producto tiene descuento e incluirá los siguientes métodos:

* `public void setDescuento(double des);`
* `public double getDescuento();`
* `public double getPrecioDescuento();`

#### Creación de clase productos
-------------------------

Se pide que programe las siguientes clases de productos, implementando las interfaces que sean necesarias. Aquellos datos que puedan tener decimales: precio, volumen, etc, será de tipo `double`.

#### **Clase `Detergente`**

Define un detergente (debe tener en cuenta que este producto puede tener descuento). Sus propiedades principales serán: `marca` (String) y `precio` (double).

- Incluya otras propiedades según sea necesario a la hora de implementar las interfaces.
- Programe un constructor que reciba como parámetros una marca y un precio.
- Programe métodos set y get para la marca y el precio.
- Programe los métodos de las interfaces.
- Programe el método toString con todas las características del producto.

#### **Clase `Cereales`**

Define el producto caja de cereales. (Este producto no tiene descuentos)

Las propiedades del producto serán `marca`, `precio` y `tipoCereal` (String).

Programe un constructor que reciba como parámetros las tres propiedades anteriores.

Programe los métodos set y get para dichas propiedades. Programe los métodos de las interfaces implementadas. (Si es necesario añada más propiedades a la clase)

A tener en cuenta: las calorías serán las siguientes: 5 si el cereal es espelta, 8 si es maíz, 12 si es trigo, y 15 en los demás casos.

Programe el método toString para devolver una cadena con todas las características del producto.

#### **Clase `Vino`**

Esta clase describe el producto botella de vino. (Este producto es susceptible de tener descuento) El producto tendrá como propiedades la `marca`, el `tipo de vino`, los `grados de alcohol` y el `precio`.

Programe al igual que los productos anteriores un constructor con estas cuatro propiedades como parámetros. Programe también los métodos set, get, toString y los métodos de las interfaces. Añada nuevas propiedades si es necesario. A tener en cuenta: las calorías se calcularán multiplicando por 10 la graduación alcohólica.

### **Programa de prueba**

Realice un programa de prueba dónde cree varios productos de tipo Vino y Cereal. Haga un ejemplo de polimorfismo creando un ArrayList de productos de tipo `EsAlimento` y calculando la suma de sus calorías.

¿Ves la potencia del polimorfismo?
Evitamos el uso de la típica sentencia condicional para averiguar el tipo de alimento, si es vino o cereal y en base a ello hallar sus calorías. Tenemos una lista de objetos de tipo `EsAlimento` y cada uno sabe calcular perfectamente sus calorías dependiendo de su implementación: Vino o Cereal.

### **Opcional (Test unitarios)**

Para aquellos que vayáis más avanzados (50% más adelantados), podéis realizar este apartado sobre pruebas unitarias.

Echa un vistazo a esta valiosa información sobre test unitarios:

* [Qué son](https://es.parasoft.com/blog/junit-tutorial-setting-up-writing-and-running-java-unit-tests/)
* [Cuál es su propósito](https://www.youtube.com/watch?v=EOkoVm3rtNQ&list=PLTd5ehIj0goML37B7s9I9iN2zhJCfxJBC&index=1&ab_channel=makigas%3Aaprendeaprogramar)
* [Cómo puedo elaborar uno en Junit](https://www.youtube.com/watch?v=1k22KuD4si0&list=PLTd5ehIj0goML37B7s9I9iN2zhJCfxJBC&index=2&ab_channel=makigas%3Aaprendeaprogramar)

En el proyecto dispones de unos test unitarios para comprobar si has programado bien tu solución

CerealesTest y VinoTest

Intenta realizar el test unitario para `Detergente`, dónde compruebes que funciona correctamente el descuento.

Como puedes ver, los test aportan seguridad a nuestro código para asegurarnos que cumple con el propósito para el que fue creado, que no se nos escapa algún caso que no teníamos contemplado y que en caso de cambios en el mismo, tenemos un mecanismo para verificar que sigue funcionando como se esperaba.

### **Grupo 9 - Excepciones**

### **Actividad 901: Piscina**
Dentro del paquete org.learn.excepcion.actividad901

a) Crea una clase PiscinaException que herede de Exception. Recibirá un String con el motivo de la excepcion

b) Crea una clase piscina que reciba como argumento en su constructor su capacidad maxima en litros
Tendrá 3 métodos:

- capacidadActual(): Devuelve la capacidad actual de la piscina
- anadirLitros(litros): Anade litros a la piscina, si la suma de los litros supera la capacidad maxima, lanza una excepcion de tipo PiscinaException
- quitarLitros(litros): Quita litros de la piscina, si la resta de los litros es negativa, lanza una excepcion de tipo PiscinaException

c) Crea otra clase llamada AppPiscina donde realices las siguientes pruebas.
- Crea una piscina de 1000 litros
- Anade 500 litros
- Anade 600 litros
- Quita 500 litros
- Quita 700 litros

Despues de agregar o quitar litros, muestra la capacidad actual

d) ¿Se te ocurre alguna manera de permitir que la aplicación siga funcionando aunque se produzca una excepcion? Para ello solo puedes modificar tu clase AppPiscina

e) Modifica tu clase PiscinaException para que ahora herede de RuntimeException ¿qué provoca esto en tu aplicación?

### **Actividad 902: ConversorTemperatura**
Dentro del paquete org.learn.excepcion.actividad902

Crea una clase llamada `ConversorTemperatura` con un método:

public static double convertirACelsius(String valorFahrenheit) throws ValorNoNumericoException

Este método debe:

Intentar convertir el String recibido a un número decimal (double).

Si el valor no es numérico (por ejemplo, "abc"), debe lanzar una excepción personalizada llamada ValorNoNumericoException, que debe ser de tipo checked (extiende Exception).

Si el valor es numérico, calcular los grados Celsius usando la siguiente fórmula:

Celsius = (Fahrenheit - 32) * 5 / 9
Devolver el valor en grados Celsius.


## Anexo: Más Ejercicios

Nota: Realiza estos ejercicios en un paquete aparte dónde no interfiera con los ejemplos realizados en este documento.
- [Ejercicios de Java Basico - w3resource](https://www.w3resource.com/java-exercises/basic/index.php)
- [Bucles](https://manolohidalgo.com/ejercicios-bucles-en-java/)
- [Arrays](https://dam.org.es/ejercicios-de-arrays-resueltos/)

Ejercicios POO
- [POO discoduro](https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/)
- [POO puntocomun](http://puntocomnoesunlenguaje.blogspot.com/p/blog-page.html)

Static
- [Static class](https://javaparajavatos.wordpress.com/2016/01/11/ejercicio-de-ampliacion-de-clases-static-i)

Colecciones
- [Colections](http://myfpschool.com/ejercicios-de-java-collections/)

Ejercicios todo tipo
- [Retos Programacion](https://retosdeprogramacion.com/ejercicios)
- [Geeks](https://www.geeksforgeeks.org/java-exercises/#array-programs-in-java)
- [Hacker](https://elhacker.info/manuales/Lenguajes%20de%20Programacion/Java/Ejercicios-de-Programacion-en-Java.pdf)

