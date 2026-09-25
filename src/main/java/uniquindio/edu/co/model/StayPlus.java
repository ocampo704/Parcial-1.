package uniquindio.edu.co.model;

import java.util.ArrayList;

public class StayPlus {

    public String nombre;
    public int nit;
    public String direccion;
    public int telefono;
    public String paginaWeb;

    private ArrayList<Huesped> listHuespedes;
    private ArrayList<Reserva> listReservas;
    private ArrayList<Habitacion> listHabitaciones;
    private ArrayList<Servicio> listServicios;

    /**
     * metodo constructor de la clase StayPlus
     * @param nombre de StayPlus
     * @param nit de StayPlus
     * @param direccion de StayPlus
     * @param telefono de StayPlus
     * @param paginaWeb de StayPlus
     */
    public StayPlus(String nombre, int nit, String direccion,
                    int telefono, String paginaWeb) {

        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

        this.listHuespedes = new ArrayList<>();
        this.listReservas = new ArrayList<>();
        this.listHabitaciones = new ArrayList<>();
        this.listServicios = new ArrayList<>();
    }

    /**
     * metodo para registrar un huesped
     * @param nombre del huesped
     * @param documento del huesped
     * @param telefono del huesped
     * @param correoElectronico del huesped
     * @param paisProcedencia del huesped
     */
    public void registrarHuesped(String nombre, int documento,
                                 String telefono,
                                 String correoElectronico,
                                 String paisProcedencia) {

        Huesped huesped = new Huesped(
                nombre,
                documento,
                telefono,
                correoElectronico,
                paisProcedencia
        );

        listHuespedes.add(huesped);
    }

    /**
     * metodo para buscar un huesped
     * @param documento del huesped
     * @return
     */
    public Huesped buscarHuesped(int documento) {

        for (Huesped huesped : listHuespedes) {

            if (huesped.getDocumento() == documento) {
                return huesped;
            }
        }

        return null;
    }

    /**
     * metodo para buscar un huesped por telefono
     * @param telefono del huesped
     * @return
     */
    public Huesped buscarHuespedPorTelefono(String telefono) {

        for (Huesped huesped : listHuespedes) {

            if (huesped.getTelefono().equals(telefono)) {
                return huesped;
            }
        }

        return null;
    }

    /**
     * metodo para crear una reserva
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
    public void crearReserva(int codigo,
                             String fechaRealizacion,
                             String fechaEntrada,
                             String fechaSalida,
                             String estado,
                             String metodoPago,
                             double valorTotal,
                             Huesped huesped,
                             Habitacion habitacion) {

        Reserva reserva = new Reserva(

                codigo,
                fechaRealizacion,
                fechaEntrada,
                fechaSalida,
                estado,
                metodoPago,
                valorTotal,
                huesped,
                habitacion
        );

        listReservas.add(reserva);
    }

    /**
     * metodo para registrar una habitacion
     * @param numero de la habitacion
     * @param piso de la habitacion
     * @param tipoHabitacion de la habitacion
     * @param capacidadMaxima de la habitacion
     * @param precioNoche de la habitacion
     * @param disponibilidad de la habitacion
     * @param estado de la habitacion
     */
    public void registrarHabitacion(int numero,
                                    int piso,
                                    String tipoHabitacion,
                                    int capacidadMaxima,
                                    double precioNoche,
                                    String disponibilidad,
                                    String estado) {

        Habitacion habitacion = new Habitacion(
                numero,
                piso,
                tipoHabitacion,
                capacidadMaxima,
                precioNoche,
                disponibilidad,
                estado
        );

        listHabitaciones.add(habitacion);
    }

    /**
     * metodo para buscar una habitacion
     * @param numero de la habitacion
     * @return
     */
    public Habitacion buscarHabitacion(int numero) {

        for (Habitacion habitacion : listHabitaciones) {

            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }

        return null;
    }

    /**
     * metodo para registrar servicios
     * @param codigo del servicio
     * @param nombre del servicio
     * @param descripcion del servicio
     * @param precio del servicio
     * @param disponibilidad del servicio
     */
    public void registrarServicio(int codigo,
                                  String nombre,
                                  String descripcion,
                                  double precio,
                                  String disponibilidad) {

        Servicio servicio = new Servicio(
                codigo,
                nombre,
                descripcion,
                precio,
                disponibilidad
        );

        listServicios.add(servicio);
    }

    /**
     * metodo para buscar reserva
     * @param codigo de la reserva
     * @return
     */
    public Reserva buscarReserva(int codigo) {

        for (Reserva reserva : listReservas) {

            if (reserva.getCodigo() == codigo) {
                return reserva;
            }
        }

        return null;
    }

    /**
     * metodo para eliminar una reserva
     * @param codigo de la reserva
     * @return
     */
    public Reserva eliminarReserva(int codigo) {

        Reserva reserva = buscarReserva(codigo);

        if (reserva != null) {

            listReservas.remove(reserva);

            return reserva;
        }

        return null;
    }

    /**
<<<<<<< HEAD:src/main/java/StayPlus.java
     * metodo para buscar numero perfecto
     * @param numero telefono
     * @return
     */
    public boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) return false;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
=======
     * metodo que verifica si un numero es perfecto
     * @param telefono numero que se va a verificar
     * @return true si el numero es perfecto
     */
    public boolean esNumeroPerfecto(String telefono) {

        int numero = Integer.parseInt(telefono);
        int suma = 0;

        for (int i = 1; i < numero; i++) {

>>>>>>> origin/dev_campo704:src/main/java/uniquindio/edu/co/model/StayPlus.java
            if (numero % i == 0) {
                suma += i;
            }
        }
<<<<<<< HEAD:src/main/java/StayPlus.java
=======

>>>>>>> origin/dev_campo704:src/main/java/uniquindio/edu/co/model/StayPlus.java
        return suma == numero;
    }

    /**
<<<<<<< HEAD:src/main/java/StayPlus.java
     * metodo para calcular ingresos por fecha
     * @param fecha de reserva
     * @return
     */
    public double calcularIngresosPorFecha(String fecha) {
        double total = 0;
        for (Reserva r : listReservas) {
            if (r.getFechaRealizacion().equals(fecha)) {
                total += r.getValorTotal();
            }
        }
=======
     * metodo que calcula los ingresos de las reservas realizadas en una fecha
     * @param fecha fecha de realizacion de las reservas
     * @return valor total de las reservas
     */
    public double calcularIngresosPorFecha(String fecha) {

        double total = 0;

        for (Reserva reserva : listReservas) {

            if (reserva.getFechaRealizacion().equals(fecha)) {
                total += reserva.getValorTotal();
            }
        }

>>>>>>> origin/dev_campo704:src/main/java/uniquindio/edu/co/model/StayPlus.java
        return total;
    }
}