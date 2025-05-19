# Programación Estructurada

# 🧠 Actividad 3 – Funciones y Programación Modular en Java

Este repositorio contiene una colección de **cinco miniproyectos prácticos en Java** desarrollados con NetBeans como parte de la **Actividad 3** del curso de Programación II. Cada miniproyecto fue diseñado para reforzar un concepto clave sobre el uso de **funciones (métodos)**, la **modularización del código**, el uso de **parámetros y retorno**, y la **documentación con Javadoc**.

---

## 📚 Tabla de Contenidos

- [🎉 Parte 1: fiesta_de_dracula](#parte-1-fiesta_de_dracula-)
- [🔁 Parte 2: FuncionesConRetorno](#parte-2-funcionesconretorno-)
- [👤 Parte 3: FuncionesIntro](#parte-3-funcionesintro-)
- [📣 Parte 4: FuncionesSinRetorno](#parte-4-funcionessinretorno-)
- [📚 Parte 5: documentacionAppCalculadora](#parte-5-documentacionappcalculadora-)
- [✅ Conclusión y aprendizajes](#-conclusión-y-aprendizajes)

---

## 🧩 Parte 1 `fiesta_de_dracula` 🦇

**🎯 Objetivo:** Comprender cómo dividir un proceso en pasos reutilizables con funciones sin retorno.

**📖 Descripción:**  
Simula una fiesta en la que tres focos cambian de color una cantidad determinada de veces:  
- 5 veces el primer foco  
- 8 veces el segundo  
- 12 veces el tercero  

**📦 Funciones implementadas:**
- `cambiarColorFocoVariasVeces(int n)`
- `cambiarColorDelFoco()`
- `pasarAlSiguienteFoco()`
- `empezarFiesta()`

**✅ Conceptos cubiertos:**
- Uso de funciones `void`  
- Parámetros como control de flujo  
- Claridad y reutilización de código  

---

## 🧩 Parte 2: `FuncionesConRetorno` 🔁

**🎯 Objetivo:** Entender cómo crear funciones que devuelven valores.

**📖 Descripción:**  
Implementa tres funciones que reciben argumentos y retornan resultados simples:

**📦 Funciones implementadas:**
- `siguiente(int n)` → retorna el número siguiente  
- `saludar(String nombre)` → retorna "Hola <nombre>"  
- `repetirSimbolo(char simbolo, int veces)` → retorna un string con el símbolo repetido  

**✅ Conceptos cubiertos:**
- Uso de `return`  
- Diferencia entre `void` y funciones con retorno  
- Reutilización de resultados  

---

## 🧩 Parte 3: `FuncionesIntro` 👤

**🎯 Objetivo:** Introducir funciones a partir de un programa clásico con entrada del usuario.

**📖 Descripción:**  
Un programa básico que solicita nombre y un número (edad) al usuario. Modularizamos el código en funciones simples para separar entrada, lógica y salida.

**📦 Funciones implementadas:**
- `pedirNombre(Scanner input)`  
- `pedirNumero(Scanner input)`  
- `mostrarResultados(String nombre, int edad)`  

**✅ Conceptos cubiertos:**
- Uso de `Scanner`  
- Separación de responsabilidades  
- Claridad y reutilización  

---

## 🧩 Parte 4: `FuncionesSinRetorno` 📣

**🎯 Objetivo:** Comparar funciones con retorno y sin retorno en un mismo ejercicio.

**📖 Descripción:**  
Muestra cómo una misma tarea puede resolverse:
- Usando una función `void` que imprime directamente
- Usando una función `String` que devuelve una línea construida

**📦 Funciones implementadas:**
- `imprimirLineaConAsteriscos(int cantidad)`  
- `generarLineaConGuiones(int cantidad)`  

**✅ Conceptos cubiertos:**
- Diferencias prácticas entre funciones con y sin retorno  
- Decisión de diseño según contexto  
- Ejemplo visual claro para estudiantes  

---

## 🧩 Parte 5: `documentacionAppCalculadora` 📚

**🎯 Objetivo:** Aprender a documentar funciones de forma profesional usando **Javadoc**.

**📖 Descripción:**  
Una clase utilitaria (`CalculadoraUtils`) con métodos matemáticos simples. Cada método está completamente documentado utilizando etiquetas de Javadoc y acompañado por una clase `AppCalculadora` con `main()` para probar el código.

**📦 Funciones implementadas:**
- `sumar(int a, int b)`  
- `esMultiplo(int a, int b)`  
- `obtenerResto(int num1, int num2)`  

**🏷️ Etiquetas Javadoc usadas:**
- `@param`: descripción de los parámetros  
- `@return`: valor devuelto  
- `@throws`: posibles excepciones  
- `@author`  
- `@version`  
- `@since`  
- `@code` y `<pre>`: para insertar bloques de código

**✅ Conceptos cubiertos:**
- Documentación clara para terceros  
- Uso de herramientas de autocompletado de NetBeans  
- Buenas prácticas para proyectos reales  

---

## ✅ Conclusión y aprendizajes

Estos 5 proyectos forman una progresión clara y efectiva para dominar los fundamentos de funciones en Java:

- 🧱 Modularización: Se aprende a dividir tareas en partes reutilizables.
- 🔁 Retorno de datos: Se ve cuándo conviene retornar y cuándo imprimir.
- 💬 Interacción: Se integran funciones con entrada del usuario.
- 📚 Documentación: Se profesionaliza el código para que sea legible y mantenible.

Gracias a este recorrido, vas a poder desarrollar programas más claros, ordenados y escalables, aplicando lo aprendido tanto en trabajos académicos como en proyectos reales.

---

### 🧪 ¿Cómo correr los proyectos?

1. Cloná o descargá este repositorio.
2. Abrí NetBeans → File > Open Project.
3. Abrí cada carpeta (`fiesta_de_dracula`, `FuncionesIntro`, etc.) como proyecto independiente o integralo en uno solo.
4. Ejecutá el archivo con `main()` en cada uno (`Shift + F6`).



