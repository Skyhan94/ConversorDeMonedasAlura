Conversor de Monedas
Descripción
Este proyecto es una aplicación de consola que permite convertir entre diferentes monedas, como dólares estadounidenses, pesos argentinos, reales brasileños y pesos colombianos. El usuario puede seleccionar la dirección de la conversión y calcular el valor en la moneda deseada.

Características
Conversión de monedas entre:
Dólar estadounidense (USD) y Peso argentino (ARS)
Dólar estadounidense (USD) y Real brasileño (BRL)
Dólar estadounidense (USD) y Peso colombiano (COP)
Manejo de excepciones para entradas inválidas.
Resultados precisos con dos decimales.
Menú interactivo para seleccionar opciones.
Requisitos previos
Antes de ejecutar el proyecto, asegúrate de tener instalado:

Java JDK 8 o superior
Un editor de texto o IDE como IntelliJ IDEA, Eclipse, o VS Code.
Instalación
Clona este repositorio en tu máquina local:
bash
Copiar código
git clone https://github.com/tuusuario/conversor-monedas.git
Navega al directorio del proyecto:
bash
Copiar código
cd conversor-monedas
Compila el código:
bash
Copiar código
javac Principal.java
Ejecuta la aplicación:
bash
Copiar código
java Principal

Uso
Al iniciar la aplicación, se mostrará un menú con las opciones de conversión.
Selecciona la opción deseada ingresando un número entre 1 y 7.
Ingresa el valor a convertir cuando se te solicite.
Observa el resultado en la consola.
Ejemplo de salida
markdown
Copiar código
***********************************************************
Sea bienvenido/a al conversor de monedas

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Salir
Elija una opción valida:
***********************************************************
2
Ingrese el valor que desea convertir:
1500
El valor 1500.0 [ARS] corresponde al valor final de =>>> 5.26 [USD]
Estructura del proyecto

.
├── Principal.java          // Clase principal que contiene el menú y la lógica principal
├── ConsultaMoneda.java     // Clase para buscar valores de cambio de monedas
├── Moneda.java             // Clase que representa una moneda
├── Conversiones.java       // Clase que contiene métodos para cálculos matemáticos
└── README.md               // Documentación del proyecto

Posibles mejoras
Implementar una interfaz gráfica.
Agregar más monedas y tasas de cambio.
Consultar tasas de cambio en tiempo real desde una API externa.
Crear un archivo de configuración para las tasas de cambio.


Contribuciones
Si deseas contribuir a este proyecto, sigue los siguientes pasos:

Haz un fork del repositorio.
Crea una nueva rama:
bash
Copiar código
git checkout -b feature/nueva-funcionalidad
Realiza tus cambios y realiza un commit:
bash
Copiar código
git commit -m "Añadida nueva funcionalidad"
Sube tus cambios:
bash
Copiar código
git push origin feature/nueva-funcionalidad
Abre un pull request.

Autor
Cristian Johan Varon Varon
[GitHub](https://github.com/Skyhan94) | [LinkedIn](https://www.linkedin.com/in/cristian-johan-var%C3%B3n-var%C3%B3n-595419210/)

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo LICENSE.
