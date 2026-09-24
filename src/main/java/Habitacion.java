public class Habitacion {

    private int numero;
    private int piso;
    private String tipoHabitacion;
    private int capacidadMaxima;
    private double precioNoche;
    private String disponibilidad;
    private String estado;

    /**
     * metodo constructor de la clase Habitacion
     * @param numero de la habitacion
     * @param piso de la habitacion
     * @param tipoHabitacion de la habitacion
     * @param capacidadMaxima de la habitacion
     * @param precioNoche de la habitacion
     * @param disponibilidad de la habitacion
     * @param estado de la habitacion
     */
    public Habitacion ( int numero, int piso, String tipoHabitacion, int capacidadMaxima, double precioNoche, String disponibilidad, String estado ){

        this.numero = numero;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
        this.capacidadMaxima = capacidadMaxima;
        this.precioNoche = precioNoche;
        this.disponibilidad = disponibilidad;
        this.estado = estado;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", piso=" + piso +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", precioNoche=" + precioNoche +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
