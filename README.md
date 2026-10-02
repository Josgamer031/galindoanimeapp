# Galindo Anime

MVP Android de una experiencia de descubrimiento de anime, con interfaz premium, catálogo dinámico mediante Jikan, perfiles independientes, avatares, listas personales y PIN local.

## Compilar

Requiere JDK 17, Android SDK 35 y Gradle 8.10+.

```bash
gradle assembleDebug
```

El APK se genera en `app/build/outputs/apk/debug/app-debug.apk`.

## Fuentes de contenido

La aplicación muestra metadatos públicos obtenidos mediante Jikan. Los adaptadores visuales de LatAnime y JKAnime están preparados como proveedores configurables, pero no eluden anuncios, controles de acceso ni protecciones. La reproducción debe conectarse a fuentes para las que se disponga de autorización.
