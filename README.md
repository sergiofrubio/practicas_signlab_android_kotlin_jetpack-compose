# Proyecto Android: Llamadas a API con Retrofit, MVVM, Hilt y Jetpack Compose

Este proyecto Android consume una API utilizando Retrofit, implementa MVVM con arquitectura limpia para una mejor organización del código, Hilt para la inyección de dependencias y Jetpack Compose para crear interfaces de usuario modernas y declarativas.

Funcionalidades:

    Realiza llamadas a una API externa.
    Muestra datos de usuarios, álbumes, portadas y detalles de usuarios.
    Arquitectura limpia y MVVM para un código más mantenible y testable.
    Inyección de dependencias con Hilt para simplificar la gestión de dependencias.
    Interfaces de usuario modernas y declarativas con Jetpack Compose.

Tecnologías:

    Kotlin: Lenguaje de programación oficial para Android.
    Jetpack Compose: Framework para crear interfaces de usuario declarativas.
    Retrofit: Librería para realizar peticiones HTTP asíncronas.
    MVVM: Patrón arquitectónico para separar la lógica de negocio de la interfaz de usuario.
    Arquitectura limpia: Estructura el código en capas para mejorar la modularidad y la testabilidad.
    Hilt: Librería para inyección de dependencias basada en Dagger 2.
    SharedPreferences: Mecanismo para almacenar datos clave-valor de forma persistente.

Estructura del proyecto:

    app/src/main/java:
        com.example.tuproyecto: Contiene las clases del proyecto, incluyendo:
            Interfaz API: Define los métodos para realizar las llamadas a la API.
            Modelo de datos: Representa las entidades devueltas por la API.
            Repositorio: Implementa las operaciones de acceso a datos, utilizando Retrofit y SharedPreferences.
            ViewModel: Exponen los datos y la lógica de negocio a la vista.
            Activity/Fragment (Jetpack Compose): Muestra la interfaz de usuario y consume los datos del ViewModel.
            Hilt: Módulos de Hilt para inyectar dependencias.
    app/src/main/res:
        layouts: Contiene los diseños de la interfaz de usuario (Jetpack Compose).
    app/src/main/assets:
        Imagenes: Almacena las imágenes necesarias para la aplicación.

Configuración:

    Clona el repositorio o descarga el proyecto.
    Abre el proyecto en Android Studio.
    Configura tu API key en el archivo app/src/main/res/values/strings.xml.
    Ejecuta la aplicación en un dispositivo Android o emulador.

Uso:

    Abre la aplicación.
    La aplicación mostrará una lista de usuarios.
    Selecciona un usuario para ver sus detalles, álbumes y portadas.
