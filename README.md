# VictoriaTest_1

Prerequisitos 
Tener instalado maven en la maquina

correr el siguiente command para instalar el proyecto
    mvn install 

El siguiente comando correra 2 hilos en paralelo con los tests dentro de la suite
    mvn test -Pregressions
    
    
Los tests (y el chromedriver) estan seteados para correr en chrome browser con la version 89

Additional info:
El proyecto fue creado usando la estructura disponible que propone maven, usando testng como manager para los test, basado en java y por supuesto usando Selenium WebDriver.
Se sigue el esquema de pageObject y ademas hay un paquete de helpers con una clase que contiene metodos que no son especificos de los tests.


Possible Improvements:
Para mejorar aun mas el proyecto, se podria agregar un esquema de reportes que luego puedan ser consumidos por una herramienta de CI. Se puede parametrizar la corrida para que los tests se corran de acuerdo al browser elegido. 
Se pueden agregar capturas de pantalla cuando fallen los tests OnTestFailure (para eso se configura los listeners de Testng)
Se puede agregar mas hilos para correr en paralelo de acuerdo a la necesidad.
Se puede dar soporte para que los tests corran en headless mode que seria el default mode para ser consumidos por herramientas como jenkins.
Quedaron algunos bloques de codigo comentados sin remover (envie la version equivocada al apresurarme para mandar los cambios)

