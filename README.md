# Sistema de gestion de alimentos
Sistema de gestion de alimentos implementado en java, realizado como proyecto final de la materia AyD2 de la carrera Ingenieria en Sistemas de la UNLPAM en el año 2017.

4 Casos de usos implementados:
* Carga de producto alimenticio
* Consulta por CUIT
* Consulta por RNE
* Estadistica cantidad por rubro


## Como ejecutar
Estas instrucciones son para tener una copia del sistema funcionando en local.

### Requisitos previos
* [MySQL](https://www.mysql.com/) (Con la base de datos importada)
* [Java JDK](http://www.oracle.com/technetwork/es/java/javase/downloads/index.html)

### Ejecutando
Descargar el ultimo Release: [2.Iteracion.zip](https://github.com/francomor/gestion_alimentos/releases/download/v0.2/2.Iteracion.zip)

Importar la base de datos con [phpMyAdmin](https://www.phpmyadmin.net/), la cual se encuentra en el script base_de_datos_uresa.sql

Luego situarse en el directorio donde se descargo el programa y ejecutar:
```
java -jar "Sistema_URESA.jar" 
```

## Como compilar
Estas instrucciones son para tener una copia del codigo fuente en local y poder compilarlo.

### Requisitos previos
* [NetBeans](https://netbeans.org/)
* [MySQL](https://www.mysql.com/) (Con la base de datos importada)
* [Java JRE](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

### Compilando
Clonar la ultima version del repositorio en local.

Importar la base de datos con [phpMyAdmin](https://www.phpmyadmin.net/), la cual se encuentra en el script base_de_datos_uresa.sql

Luego abrir con NetBeans la carpeta del proyecto y compilar.

## Documentacion
En la carpeta /docs/ se puede encontrar la documentación del proyecto requerida por la materia.


## Autores

* [Franco Morero](https://github.com/francomor)
* [Francisco Herrero](https://github.com/herrerofrancisco)
* [Mauricio Vazquez](https://github.com/mauriVazquez)
