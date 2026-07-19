import java.util.ArrayList;

// Administra reparaciones de distintos tipos mediante polimorfismo.
public class RegistroReparaciones {
    private ArrayList<Reparacion> reparaciones = new ArrayList<>();

    // Acepta la clase base y, por herencia, también sus clases derivadas.
    public void agregarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);
    }

    public void mostrarReparaciones() {
        for (Reparacion reparacion : reparaciones) {
            // Java ejecuta el mostrarResumen() correspondiente al objeto real.
            System.out.println(reparacion.mostrarResumen());
        }
    }
}
