# Manual de Aprendizaje - Proyecto AppGemini

Este documento resume los conceptos y componentes implementados durante el desarrollo de la aplicación AppGemini.

## 1. Recursos en Android (Resources)
Aprendimos a gestionar recursos estáticos de la aplicación para mantener el código limpio y organizado.
*   **Colores (`colors.xml`)**: Definimos nuevos colores (ej. `dark_orange`) en `res/values/colors.xml` y los aplicamos a los botones usando el atributo `android:backgroundTint="@color/dark_orange"`.

## 2. Diseño de Interfaz (Layouts XML)
Trabajamos con `ConstraintLayout` para diseñar interfaces flexibles.
*   **Vistas utilizadas**: `TextView` (texto), `Button` (botones), `ImageView` (imágenes).
*   **Posicionamiento**: Uso de constraints (restricciones) para fijar elementos relativos al padre o a otros elementos.
*   **Estilos**: Modificación de atributos como `textSize`, `textColor`, `textStyle` (bold, italic).

## 3. Componentes de Android (Activities)
Creamos y configuramos nuevas pantallas (Activities).
*   **Estructura**: Cada pantalla consta de una clase Kotlin (`Activity`) y un archivo de diseño XML.
*   **Manifest**: Registramos las nuevas actividades (`CatActivity`, `CitaActivity`) en el `AndroidManifest.xml` para que el sistema las reconozca.
*   **Navegación (Intents)**: Usamos `Intent` explícitos para navegar desde la `MainActivity` a otras pantallas:
    ```kotlin
    val intent = Intent(this, NombreActivity::class.java)
    startActivity(intent)
    ```

## 4. Programación en Kotlin
Implementamos varios conceptos fundamentales del lenguaje Kotlin:

### 4.1. Clases y Objetos
*   **Clases Simples**: `class Cuadrado(val lado: Int)`. Propiedades inmutables en el constructor y métodos (`imprimirArea()`).
*   **Validación (`init`)**: Uso del bloque `init` para validar datos al crear una instancia y lanzar excepciones (`IllegalArgumentException`) si los datos no son válidos (ej. clase `Email`).
*   **Data Classes**: Clases diseñadas para contener datos (`data class Libro`). Vimos cómo usar `copy()` para crear nuevas instancias modificando solo algunas propiedades.
*   **Singletons (`object`)**: Creación de objetos únicos globales (`object AppConfig`) para almacenar configuración o utilidades compartidas.

### 4.2. Colecciones y Lógica
*   **Listas**: Uso de `listOf(...)` para crear listas inmutables de objetos.
*   **Aleatoriedad**: Uso de la función `.random()` para obtener un elemento aleatorio de una lista.

### 4.3. Interacción con la UI
*   **lateinit**: Uso del modificador `lateinit var` para declarar variables de vistas que se inicializarán más tarde en el `onCreate`.
*   **findViewById**: Método para encontrar y asignar las vistas del layout a las variables.
*   **Listeners**: Configuración de `setOnClickListener` para definir acciones al pulsar botones.

## 5. Ejercicios Realizados
1.  **Botones Naranjas**: Personalización de estilos.
2.  **Gato Azul Ruso**: Creación de una actividad con imagen.
3.  **Cita del Día**: Aplicación completa de una pantalla con lógica de negocio (lista de citas, selección aleatoria) e interacción con la UI.
4.  **Clases de Prueba**: Implementación de `Cuadrado`, `Email`, `Libro` y `AppConfig` probados en el `MainActivity`.
