public class Cliente {
    private String nombre;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String telefono, String correo) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente es obligatorio.");
        }
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInformacion() {
        return "Cliente: " + nombre
                + " | Teléfono: " + telefono
                + " | Correo: " + correo;
    }
}
