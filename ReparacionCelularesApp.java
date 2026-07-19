public class ReparacionCelularesApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
                "Laura Martínez", "81 1234 5678", "laura@email.com");
        Cliente cliente2 = new Cliente(
                "Daniel Rodríguez", "81 8765 4321", "daniel@email.com");

        Celular celular1 = new Celular(
                "Samsung", "Galaxy A54", "SAM-A54-001", "Pantalla rota");
        Celular celular2 = new Celular(
                "Motorola", "Moto G84", "MOT-G84-002", "No carga la batería");

        Tecnico tecnico1 = new Tecnico(
                101, "Jorge Ramírez", "Pantallas y componentes");
        Tecnico tecnico2 = new Tecnico(
                102, "Mónica Salas", "Sistemas de carga");

        // Se instancian las clases derivadas de Reparacion.
        ReparacionPantalla reparacion1 = new ReparacionPantalla(
                1001, cliente1, celular1, tecnico1, "AMOLED", 3);
        ReparacionCarga reparacion2 = new ReparacionCarga(
                1002, cliente2, celular2, tecnico2, "USB-C", true);

        reparacion1.registrarDiagnostico(
                "Pantalla dañada; el resto de los componentes funciona correctamente");
        reparacion1.registrarCostos(450.00, 1250.00);
        reparacion1.actualizarEstado("En reparación");

        reparacion2.registrarDiagnostico(
                "Centro de carga dañado y batería en buen estado");
        reparacion2.registrarCostos(380.00, 420.00);
        reparacion2.actualizarEstado("Reparado");

        // Una sola lista administra ambos tipos de reparación mediante polimorfismo.
        RegistroReparaciones registro = new RegistroReparaciones();
        registro.agregarReparacion(reparacion1);
        registro.agregarReparacion(reparacion2);

        System.out.println("=== SISTEMA DE REPARACIÓN DE CELULARES ===");
        System.out.println(cliente1.mostrarInformacion());
        System.out.println(celular1.mostrarInformacion());
        System.out.println(tecnico1.mostrarInformacion());

        System.out.println("\n=== ÓRDENES DE REPARACIÓN ===");
        registro.mostrarReparaciones();

        // Pruebas de métodos exclusivos de las clases derivadas.
        System.out.println("\n" + reparacion1.emitirGarantia());
        System.out.println(reparacion2.verificarLimpieza());

        // Referencia de la clase base que usa el método sobrescrito de ReparacionPantalla.
        Reparacion reparacionPolimorfica = reparacion1;
        System.out.println("Costo polimórfico: $" + reparacionPolimorfica.calcularCostoTotal());

        reparacion1.actualizarEstado("Entregado");
        System.out.println("\n=== ESTADO ACTUALIZADO ===");
        System.out.println(reparacion1.mostrarResumen());
    }
}
