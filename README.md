# VictoriaTest_1

Prerequisitos 
Tener instalado maven en la maquina

correr el siguiente command para instalar el proyecto
    mvn install 

El siguiente comando correra 2 hilos en paralelo con los tests dentro de la suite
    mvn test -Pregressions
    
    
Los tests (y el chromedriver) estan seteados para correr en chrome con la version 89

Additional info:
El proyecto fue creado usando la estructura disponible que propone maven, usando testng como manager para los test, basado en java y por supuesto usando Selenium WebDriver.
Se sigue el esquema de pageObject y ademas hay un paquete de helpers con una clase que contiene metodos que no son especificos de los tests.

