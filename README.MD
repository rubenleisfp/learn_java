# Evaluación Inicial

## Objetivo

Proporcionar una guía a los alumnos sobre qué contenido ver sobre Java y qué ejercicios pueden realizar para practicar su uso. Se proporciona una base teórica que tiene su correspondencia con actividades de refuerzo, de tal manera que el alumno deberá primero informarse sobre la teoría para luego aplicarla realizando los ejercicios correspondientes.

---

## Teoría

### Videotutoriales de Programación

- [Curso de Lógica de Programación Desde Cero](https://www.youtube.com/watch?v=1frV9cIgAow&list=PL46-B5QR6sHm_qTw3tet7XHynE8bEucoa&index=7&ab_channel=Pasosporingenier%C3%ADa)
- [JAVA Desde Cero: Primeros Pasos en una Hora](https://www.udemy.com/course/algoritmos-desde-cero/)
- [Curso Java: ¿Se pide Java en las ofertas de empleo?](https://www.youtube.com/watch?v=SZTXmCbfjP0&ab_channel=CompilaTec)

### 1 - Entorno: IntelliJ, Debug, Librerías y Maven

- [Instalar JDK](https://www3.ntu.edu.sg/home/ehchua/programming/howto/jdk_howto.html)
- [Guía de IntelliJ](https://www.jetbrains.com/help/idea/sdk.html#access-external-documentation)
- **Atajos en IntelliJ:**
  - Ir a clase: `Ctrl + N`
  - Ir a fichero: `Ctrl + Mayús + N`
  - Formatear código: `Ctrl + Alt + L`
  - Organizar imports: `Ctrl + Alt + O`

### 2 - Java Básico

- [Variables, Condicionales, Bucles y Arrays](https://www.w3schools.com/java/default.asp)

### 3 - Clases y Objetos

- [Conceptos de Clases y Objetos](https://www.w3schools.com/java/java_classes.asp)

### 4 - Static como Atributo

- [Explicación de Static](https://refactorizando.com/directiva-static-java/)

---

## Actividades de Refuerzo

### **Grupo 1 - IntelliJ, Librerías y Maven**

#### **Actividad 101: Crear un Proyecto Java**

1. Descarga e instala IntelliJ.
2. Crea un proyecto llamado `calculadora`.
3. Dentro de él, crea un paquete `com.fp`.
4. Implementa una clase `Calculadora` con métodos `sumar`, `restar`, `multiplicar` y `dividir`.
5. Utiliza el debugger para comprobar su funcionamiento.

#### **Actividad 102: Crear y Usar un JAR**

1. Exporta el proyecto anterior como un `jar` llamado `calculadora.jar`.
2. Crea un nuevo proyecto Java llamado `matemáticas`.
3. Importa el `jar` anterior y utilízalo en una clase.

### **Grupo 2 - Java Básico**

#### **Actividad 201: Tipos de Datos**

1. Crea un paquete `org.learn.basico.actividad201`.
2. Escribe variables de los siguientes tipos: `char`, `String`, `int`, `double`, `BigDecimal`, `boolean`.
3. Realiza conversiones entre ellos e imprime los valores.

#### **Actividad 202: Operaciones Matemáticas**

1. Crea un paquete `org.learn.basico.actividad202`.
2. Escribe un programa que realice las operaciones básicas con dos números ingresados por el usuario.

#### **Actividad 203: Condicionales**

1. Crea un paquete `org.learn.basico.actividad203`.
2. Escribe un programa que reciba dos números e indique cuál es mayor y si cada uno es par o impar.

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
