import java.util.ArrayList;

public class Reserva {

    private int codigo;
    private String fechaRealizacion;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;
    private String metodoPago;
    private double valorTotal;
    private Huesped huesped;
    private Habitacion habitacion;
    private ArrayList<Servicio> listServicios;

    /**
     * metodo constructor de la clase Reserva
     * @param codigo de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada de la reserva
     * @param fechaSalida de la reserva
     * @param estado de la reserva
     * @param metodoPago de la reserva
     * @param valorTotal de la reserva
     * @param huesped de la reserva
     * @param habitacion de la reserva
     */
    public Reserva ( int codigo, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, Huesped huesped, Habitacion habitacion){

        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.listServicios = new ArrayList<>();

    }

    /**
     * metodo para agregar servicios a la clase Reserva
     * @param servicio de la reserva
     */
    public void agregarServicio(Servicio servicio) {
        listServicios.add(servicio);
    }

    /**
     * metodo para eliminar servicios de la clase Reserva
     * @param codigoServicio de la reserva
     */
    public void eliminarServicio(int codigoServicio) {
        listServicios.removeIf(s -> s.getCodigo() == codigoServicio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Servicio> getListServicios() {
        return listServicios;
    }

    public void setListServicios(ArrayList<Servicio> listServicios) {
        this.listServicios = listServicios;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", estado='" + estado + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", valorTotal=" + valorTotal +
                ", huesped=" + huesped +
                ", habitacion=" + habitacion +
                ", listServicios=" + listServicios +
                '}';
    }
}
