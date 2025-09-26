# Gu-a-de-actividad-patrones
## Punto 1
### Patrón de Diseño Utilizado
Tipo de Patrón: Creacional 
El problema se enfoca en el proceso de instanciación de un objeto Automovil que posee múltiples y complejas configuraciones. Por esta razón, la solución pertenece a la familia de patrones creacionales, ya que estos se especializan en optimizar y flexibilizar los mecanismos de creación de objetos.

### Patrón Seleccionado: Builder
Se ha implementado el patrón de diseño Builder. Esta elección es la solución canónica para el anti-patrón conocido como "constructor telescópico" (constructores con una larga y confusa lista de parámetros), que era el problema central del ejercicio.

El patrón Builder fue seleccionado porque:

Separa la construcción de la representación: La lógica para configurar el automóvil (AutomovilBuilder) está completamente separada del objeto final e inmutable (Automovil).

Permite la creación paso a paso: Facilita la construcción de objetos complejos mediante una interfaz fluida y métodos encadenados (fluent interface), lo que aumenta drásticamente la legibilidad del código.

Ofrece alta flexibilidad: Permite que los atributos opcionales sean omitidos limpiamente durante la creación, sin necesidad de pasar valores null o definir múltiples constructores sobrecargados.

Facilita la inmutabilidad: Asegura que el objeto Automovil, una vez construido, no pueda ser modificado, garantizando su integridad y seguridad en el uso.