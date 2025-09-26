package punto1;

// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("Creando configuraciones de automóviles...");

        // --- Coche 1: Configuración Deportiva Completa ---
        // Se usan los métodos encadenados para una configuración clara.
        Automovil cocheDeportivo = new Automovil.AutomovilBuilder()
            .conMotor("V8 Turbo")
            .conColor("Rojo Ferrari")
            .conLlantas("Deportivas 19\"")
            .conSistemaSonido("Bose Surround")
            .conInteriores("Cuero Alcántara")
            .conTechoSolar(true)
            .conNavegacionGPS(true)
            .build();

        System.out.println("\n--- Coche Deportivo ---");
        System.out.println(cocheDeportivo);

        // --- Coche 2: Configuración Económica y Básica ---
        // Se omiten los atributos opcionales, demostrando la flexibilidad.
        Automovil cocheEconomico = new Automovil.AutomovilBuilder()
            .conMotor("1.6L 4 cilindros")
            .conColor("Plata")
            .conSistemaSonido("Estéreo Básico con Bluetooth")
            .build(); // No se especifican llantas, interiores, techo solar ni GPS.

        System.out.println("\n--- Coche Económico ---");
        System.out.println(cocheEconomico);

        // --- Coche 3: Configuración Familiar ---
        Automovil cocheFamiliar = new Automovil.AutomovilBuilder()
            .conMotor("2.0L Híbrido")
            .conColor("Azul Marino")
            .conInteriores("Tela Premium")
            .conNavegacionGPS(true)
            .build();

        System.out.println("\n--- Coche Familiar ---");
        System.out.println(cocheFamiliar);
    }
}
