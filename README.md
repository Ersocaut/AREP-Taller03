# AREP-Taller03 (Clientes y servicios)

## EJERCICIO 1
Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla cada uno de los componentes de una URL. Es decir , debe usar los siguientes métodos: getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile, getRef. Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use para su objeto debe contener datos suficientes.
---
## EJERCICIO 2
Escriba una aplicación browser que dada una URL lea datos de esa dirección y que los almacene en un archivo con el nombre resultado.html. Intente ver este archivo en el navegador. Su implementación debe ser un programa que reciba el parámetro de URL por medio de la línea de comandos.
---
## EJERCICIO 3
Usando sockets escriba un servidor que reciba un número y responda el cuadrado de este número. Escriba un cliente para probarlo y envíele una secuencia de 20 números.
---
## RETO 1
Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con javascript para probar su servidor. Despliegue su solución en Heroku. NO use frameworks web como Spark o Spring use solo Java y las librerías para manejo de la red.
---
## RETO 2
Usando su  servidor y java (NO use frameworks web como Spark o Spring). Escriba un framework similar a Spark que le permita publicar servicios web "get" con funciones lambda y le permita acceder a recursoso estáticos como páginas, javascripts, imágenes, y CSSs. Cree una aplicación que conecte con una base de datos desde el servidor para probar su solución. Despliegue su solución en Heroku

---

## Cómo utilizar el repositorio

- Verificar que cumple con los requisitos necesarios para ejecutar el programa:
> - Maven
> - Java

- Descargarlo por medio de un clon con el siguiente comando por medio de la línea de comandos:

```
git clone https://github.com/Ersocaut/AREP-Taller03
```

- Ubicarse dentro del repositorio:

```
cd AREP-Taller03
```

- Verificar que el código compile correctamente:

```
mvn clean compile package
```

- En caso de que la compilación anterior no haya arrojado ningún tipo de error, lo podemos ejecutar con el comando:

```
mvn exec:java -Dexec.mainClass=edu.escuelaing.arep.Framework
```
