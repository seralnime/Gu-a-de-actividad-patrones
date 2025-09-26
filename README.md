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

## Punto 2
### Patrón de Diseño Utilizado
Tipo de Patrón: Estructural

El problema se centra en evitar la explosión de subclases al combinar diferentes tipos de notificación (mensaje, alerta, advertencia, confirmación) con diferentes medios de presentación (web, móvil, escritorio). Por esta causa, la solución se clasifica dentro de los patrones estructurales, ya que estos se dedican a organizar y mejorar las conexiones entre clases y objetos para crear estructuras más adaptables y que se pueden ampliar fácilmente.

### Patrón Seleccionado: Bridge
Se ha implementado el patrón de diseño Bridge. Esta elección es la solución canónica para desacoplar una abstracción (tipo de notificación) de su implementación (plataforma de presentación), evitando la creación de una subclase por cada combinación posible.

El patrón Bridge fue seleccionado porque:

Reduce la explosión de clases: En lugar de necesitar clases como NotificacionAlertaWeb o NotificacionMensajeMovil, se maneja la relación en tiempo de ejecución mediante la composición.

Escalabilidad y flexibilidad: Permite añadir nuevas plataformas o tipos de notificación sin modificar el código existente, cumpliendo el principio abierto/cerrado (OCP).

Cambio dinámico en tiempo de ejecución: El tipo de notificación puede cambiar de plataforma en cualquier momento, ofreciendo gran adaptabilidad en contextos heterogéneos (ej. mostrar la misma alerta en web y móvil).

Separa la abstracción de la implementación: Los tipos de notificación (Mensaje, Alerta, Advertencia, Confirmación) están desacoplados de las plataformas (Web, Móvil, Escritorio).

## Punto 3
### Patrón de Diseño Utilizado
Tipo de Patrón: Comportamental

El problema se enfoca en cómo los usuarios interactúan y se comunican entre sí. La principal dificultad recae en la gestión del flujo de mensajes y la red de dependencias que se genera cuando todos necesitan hablar con todos. Por esta causa, la solución se clasifica dentro de los patrones de comportamiento, ya que estos se especializan en gestionar algoritmos y la asignación de responsabilidades entre objetos para simplificar su comunicación.

### Patrón Seleccionado: Mediator
Se ha implementado el patrón de diseño Mediator ya que permite centralizar la comunicación de un grupo de objetos, evitando que tengan que conocerse entre sí. El ChatRoom actúa como el mediador central que gestiona toda la interacción.

El patrón Mediator fue seleccionado porque:

Mejora la escalabilidad y el mantenimiento: Añadir o eliminar usuarios del chat es sencillo. Solo se necesita registrar al usuario en el mediador (chatRoom.agregarUsuario(nuevoUsuario)). Los demás usuarios no se ven afectados ni necesitan ser actualizados.

Centraliza la lógica de comunicación: La responsabilidad de distribuir un mensaje a todos los participantes recae exclusivamente en el ChatRoom. Si en el futuro se quiere añadir una nueva regla (ej. filtrar palabras, registrar mensajes), solo se modifica el mediador, sin tocar la clase Usuario.

Reduce el acoplamiento directo: En lugar de que cada Usuario mantenga una referencia a todos los demás usuarios, solo necesita conocer al objeto ChatRoom. Esto reduce las dependencias de una red compleja (N a N) a una simple estrella (N a 1).
