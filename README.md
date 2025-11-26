# AppGemini 📱

Bienvenido a **AppGemini**, una aplicación Android desarrollada como parte de un proyecto de aprendizaje práctico. Esta app demuestra el uso de conceptos fundamentales de desarrollo en Android con Kotlin, incluyendo navegación entre actividades, manejo de recursos y lógica de programación orientada a objetos.

## 🚀 Características

La aplicación consta de un menú principal y varias funcionalidades demostrativas:

*   **Pantalla Principal**: Menú de navegación con botones personalizados.
*   **Gato Azul Ruso**: Una actividad dedicada a mostrar una imagen y descripción.
*   **Cita del Día**: Generador de citas aleatorias con interfaz interactiva.
*   **Ejercicios de Lógica**: Implementación interna (visible en logs) de ejercicios de clases, data classes, validaciones y patrones Singleton.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje**: Kotlin
*   **IDE**: Android Studio
*   **Componentes**:
    *   `Activity` & `Intent` para navegación.
    *   `ConstraintLayout` para diseño de interfaces.
    *   `TextView`, `Button`, `ImageView`.
    *   Recursos XML (Colors, Strings, Layouts).

## 📂 Estructura del Proyecto

El código fuente principal se encuentra en `app/src/main/java/com/chema/appgemini/`:

*   `MainActivity.kt`: Punto de entrada y orquestador de ejercicios.
*   `CatActivity.kt`: Actividad simple de visualización.
*   `CitaActivity.kt`: Lógica de selección aleatoria de citas.
*   Clases de Modelo: `Cita.kt`, `Cuadrado.kt`, `Email.kt`, `Libro.kt`.
*   `AppConfig.kt`: Ejemplo de Singleton.

## 📖 Documentación

Puedes encontrar un manual detallado de lo aprendido durante el desarrollo de este proyecto en la carpeta de documentación:
👉 [Manual de Aprendizaje](docs/manual_aprendizaje.md)

## 🔧 Instalación

1.  Clona este repositorio.
2.  Abre el proyecto en **Android Studio**.
3.  Sincroniza el proyecto con Gradle.
4.  Ejecuta la aplicación en un emulador o dispositivo físico.

---
Desarrollado con ❤️ aprendiendo Kotlin y Android.