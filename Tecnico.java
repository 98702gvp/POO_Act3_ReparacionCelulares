public class Tecnico {
    private int numeroEmpleado;
    private String nombre;
    private String especialidad;

    public Tecnico(int numeroEmpleado, String nombre, String especialidad) {
        if (numeroEmpleado <= 0) {
            throw new IllegalArgumentException("El número de empleado no es válido.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del técnico es obligatorio.");
        }
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInformacion() {
        return "Técnico: " + nombre
                + " | Número de empleado: " + numeroEmpleado
                + " | Especialidad: " + especialidad;
    }
}
