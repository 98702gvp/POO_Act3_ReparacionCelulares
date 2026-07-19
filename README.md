ACTIVIDAD FORMATIVA 3 - SISTEMA DE REPARACIÓN DE CELULARES CON HERENCIA

Aplicación desarrollada en Java que permite registrar clientes, celulares,
técnicos y órdenes de reparación, extendida para aplicar herencia.

CONCEPTOS APLICADOS
- Creación de clases y atributos privados.
- Constructores para inicializar objetos.
- Instanciación y colaboración entre objetos.
- Métodos para registrar diagnósticos y costos.
- Cálculo del costo total de una reparación.
- Actualización del estado de cada orden.
- Validaciones básicas mediante excepciones.
- Clase base Reparacion.
- Clases derivadas ReparacionPantalla y ReparacionCarga.
- Reutilización de código mediante extends y super.
- Sobrescritura de calcularCostoTotal() y mostrarResumen() con @Override.
- Métodos exclusivos para cada clase derivada.
- Polimorfismo mediante RegistroReparaciones y ArrayList<Reparacion>.

CLASE PRINCIPAL
ReparacionCelularesApp.java

CLASES AGREGADAS
ReparacionPantalla.java
ReparacionCarga.java
RegistroReparaciones.java

COMPILACIÓN Y EJECUCIÓN
Desde la carpeta src:

javac *.java
java ReparacionCelularesApp
