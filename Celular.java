public class Celular {
    private String marca;
    private String modelo;
    private String numeroSerie;
    private String fallaReportada;

    public Celular(String marca, String modelo, String numeroSerie,
                   String fallaReportada) {
        if (numeroSerie == null || numeroSerie.isBlank()) {
            throw new IllegalArgumentException("El número de serie es obligatorio.");
        }
        if (fallaReportada == null || fallaReportada.isBlank()) {
            throw new IllegalArgumentException("Se debe registrar la falla del celular.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.fallaReportada = fallaReportada;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFallaReportada() {
        return fallaReportada;
    }

    public String mostrarInformacion() {
        return "Celular: " + marca + " " + modelo
                + " | Serie: " + numeroSerie
                + " | Falla: " + fallaReportada;
    }
}
