// Clase base: representa la información y operaciones comunes de una orden.
public class Reparacion {
    private int folio;
    private Cliente cliente;
    private Celular celular;
    private Tecnico tecnico;
    private String diagnostico;
    private String estado;
    private double costoManoObra;
    private double costoRefacciones;

    public Reparacion(int folio, Cliente cliente, Celular celular,
                      Tecnico tecnico) {
        if (folio <= 0) {
            throw new IllegalArgumentException("El folio debe ser mayor que cero.");
        }
        if (cliente == null || celular == null || tecnico == null) {
            throw new IllegalArgumentException(
                    "El cliente, el celular y el técnico son obligatorios.");
        }
        this.folio = folio;
        this.cliente = cliente;
        this.celular = celular;
        this.tecnico = tecnico;
        this.diagnostico = "Pendiente";
        this.estado = "Recibido";
        this.costoManoObra = 0;
        this.costoRefacciones = 0;
    }

    public void registrarDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.isBlank()) {
            throw new IllegalArgumentException("El diagnóstico no puede estar vacío.");
        }
        this.diagnostico = diagnostico;
        this.estado = "Diagnosticado";
    }

    public void registrarCostos(double costoManoObra, double costoRefacciones) {
        if (costoManoObra < 0 || costoRefacciones < 0) {
            throw new IllegalArgumentException("Los costos no pueden ser negativos.");
        }
        this.costoManoObra = costoManoObra;
        this.costoRefacciones = costoRefacciones;
    }

    // Este método puede sobrescribirse en las reparaciones especializadas.
    public double calcularCostoTotal() {
        return costoManoObra + costoRefacciones;
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado == null || nuevoEstado.isBlank()) {
            throw new IllegalArgumentException("El estado no puede estar vacío.");
        }
        this.estado = nuevoEstado;
    }

    // Este método también es reutilizado y ampliado por las clases derivadas.
    public String mostrarResumen() {
        return "Folio: " + folio
                + " | Cliente: " + cliente.getNombre()
                + " | Serie: " + celular.getNumeroSerie()
                + " | Técnico: " + tecnico.getNombre()
                + " | Falla: " + celular.getFallaReportada()
                + " | Diagnóstico: " + diagnostico
                + " | Total: $" + String.format("%.2f", calcularCostoTotal())
                + " | Estado: " + estado;
    }
}
