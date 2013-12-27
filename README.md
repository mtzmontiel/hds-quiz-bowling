hds-quiz-bowling
================

Quiz para personal de HDS Boliche

El objetivo de este quizz es probar las habilidades de programación pruebas unitarias y utilización de frameworks nuevos con poca información inicial. Deberán utilizar los recursos a su disposición para resolver los siguientes requerimientos.

# Tablero de Boliche
El sistema debe ser capaz de representar un tablero de boliche para 1 o más jugadores
# Solución en base a API
No se requiere una interfaz gráfica, la verificación de sistema propuesto se realizará mediante pruebas integrales mediante *maven* y *concordion*. 
## Maven
La solución será verificada ejecutando la siguiente línea de comando
```
mvn clean test
```
## JUnit / Concordion
El kit inicial para desarrollo de la solución ya incluye la configuración inicial siguiente:
1. pom.xml - Configuración de proyecto con dependencias previamente configuradas, no debe modificarse
2. src/test/java - código de JUnit + Concordion con las pruebas a realizar con el sistema, no debe modificarse
3. src/test/resources - especificaciones de concordion en formato html, no debe modificarse
## Especificaciones
En la ruta de especificaciones de concordion se encuentran archivos HTML que les permitirá conocer todo lo que se espera del sistema esperado. 
Para poder resolver el quizz deberá colocar las clases Java en la ruta adecuada para permitir lo siguiente
1. Compilar el proyecto de manera adecuada
2. Compilar las pruebas de manera adecuada
3. Ejecutar las prueba de manera adecuada
Los primeros dos puntos son obligatorios para poder aceptar una respuesta.
El tercer punto se puede cubrir de manera parcial y determinará la calificación final que se otorgará
# Entrega de solución propuesta
Para realizar su entrega esta SOLO podrá ser realizada mediante un pull request de github.


