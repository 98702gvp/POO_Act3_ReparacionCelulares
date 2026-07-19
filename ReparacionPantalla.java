// Clase derivada para las reparaciones relacionadas con la pantalla del equipo.
public class ReparacionPantalla extends Reparacion {
    private String tipoPantalla;
    private int mesesGarantia;

    // super llama al constructor de la clase base y reutiliza sus atributos.
    public ReparacionPantalla(int folio, Cliente cliente, Celular celular,
                              Tecnico tecnico, String tipoPantalla, int mesesGarantia) {
        super(folio, cliente, celular, tecnico);
        this.tipoPantalla = tipoPantalla;
        this.mesesGarantia = mesesGarantia;
    }

    // Sobrescribe el cálculo para incluir el servicio de calibración de pantalla.
    @Override
    public double calcularCostoTotal() {
        return super.calcularCostoTotal() + 120.00;
    }

    // Sobrescribe el resumen e incorpora los atributos exclusivos de esta subclase.
    @Override
    public String mostrarResumen() {
        return super.mostrarResumen()
                + " | Tipo de pantalla: " + tipoPantalla
                + " | Garantía: " + mesesGarantia + " meses";
    }

    // Método exclusivo de ReparacionPantalla.
    public String emitirGarantia() {
        return "Garantía de pantalla vigente por " + mesesGarantia + " meses.";
    }
}
