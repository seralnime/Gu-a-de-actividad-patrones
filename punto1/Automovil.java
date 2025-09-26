package punto1;

public class Automovil {

    // Atributos del automóvil (inmutables)
    private final String motor;
    private final String color;
    private final String llantas;
    private final String sistemaSonido;
    private final String interiores;
    private final boolean techoSolar;
    private final boolean navegacionGPS;

    // 1. Constructor privado que recibe el Builder
    // Esto asegura que el objeto solo pueda ser instanciado desde el Builder.
    private Automovil(AutomovilBuilder builder) {
        this.motor = builder.motor;
        this.color = builder.color;
        this.llantas = builder.llantas;
        this.sistemaSonido = builder.sistemaSonido;
        this.interiores = builder.interiores;
        this.techoSolar = builder.techoSolar;
        this.navegacionGPS = builder.navegacionGPS;
    }

    // Getters para acceder a las propiedades (no hay setters para mantener la inmutabilidad)
    public String getMotor() { return motor; }
    public String getColor() { return color; }
    public String getLlantas() { return llantas; }
    public String getSistemaSonido() { return sistemaSonido; }
    public String getInteriores() { return interiores; }
    public boolean tieneTechoSolar() { return techoSolar; }
    public boolean tieneNavegacionGPS() { return navegacionGPS; }

    @Override
    public String toString() {
        return "Automovil Configuración: \n" +
               " - Motor: " + (motor != null ? motor : "Básico") + "\n" +
               " - Color: " + (color != null ? color : "Blanco") + "\n" +
               " - Llantas: " + (llantas != null ? llantas : "Estándar") + "\n" +
               " - Sistema de Sonido: " + (sistemaSonido != null ? sistemaSonido : "Básico") + "\n" +
               " - Interiores: " + (interiores != null ? interiores : "Tela") + "\n" +
               " - Techo Solar: " + (techoSolar ? "Sí" : "No") + "\n" +
               " - Navegación GPS: " + (navegacionGPS ? "Sí" : "No");
    }

    // 2. Clase Builder anidada y estática
    // Es responsable de la construcción del objeto Automovil.
    public static class AutomovilBuilder {

        // Los mismos atributos que la clase principal, pero no son finales
        private String motor;
        private String color;
        private String llantas;
        private String sistemaSonido;
        private String interiores;
        private boolean techoSolar = false; // Valor por defecto
        private boolean navegacionGPS = false; // Valor por defecto

        // 3. Métodos "fluidos" para configurar cada atributo.
        // Devuelven el propio builder para permitir el encadenamiento de llamadas (fluent interface).
        public AutomovilBuilder conMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public AutomovilBuilder conColor(String color) {
            this.color = color;
            return this;
        }

        public AutomovilBuilder conLlantas(String llantas) {
            this.llantas = llantas;
            return this;
        }

        public AutomovilBuilder conSistemaSonido(String sistemaSonido) {
            this.sistemaSonido = sistemaSonido;
            return this;
        }

        public AutomovilBuilder conInteriores(String interiores) {
            this.interiores = interiores;
            return this;
        }

        public AutomovilBuilder conTechoSolar(boolean tieneTechoSolar) {
            this.techoSolar = tieneTechoSolar;
            return this;
        }

        public AutomovilBuilder conNavegacionGPS(boolean tieneNavegacionGPS) {
            this.navegacionGPS = tieneNavegacionGPS;
            return this;
        }

        // 4. Método final 'build' para construir el objeto Automovil.
        // Llama al constructor privado de la clase externa.
        public Automovil build() {
            return new Automovil(this);
        }
    }
}

