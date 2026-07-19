// Clase derivada para las reparaciones del centro de carga y conectores.
public class ReparacionCarga extends Reparacion {
    private String tipoConector;
    private boolean incluyeLimpiezaInterna;

    // super reutiliza la inicialización de una orden de reparación general.
    public ReparacionCarga(int folio, Cliente cliente, Celular celular,
                           Tecnico tecnico, String tipoConector, boolean incluyeLimpiezaInterna) {
        super(folio, cliente, celular, tecnico);
        this.tipoConector = tipoConector;
        this.incluyeLimpiezaInterna = incluyeLimpiezaInterna;
    }

    // Sobrescribe el cálculo cuando la reparación incluye limpieza interna.
    @Override
    public double calcularCostoTotal() {
        return super.calcularCostoTotal() + (incluyeLimpiezaInterna ? 80.00 : 0.00);
    }

    // Sobrescribe el resumen para describir los datos propios de la subclase.
    @Override
    public String mostrarResumen() {
        return super.mostrarResumen()
                + " | Conector: " + tipoConector
                + " | Limpieza interna: " + (incluyeLimpiezaInterna ? "Sí" : "No");
    }

    // Método exclusivo de ReparacionCarga.
    public String verificarLimpieza() {
        return incluyeLimpiezaInterna ? "La limpieza interna está incluida."
                : "La limpieza interna no está incluida.";
    }
}
