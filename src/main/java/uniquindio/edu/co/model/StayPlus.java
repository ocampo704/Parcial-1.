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

    public Huesped buscarHuesped(int documento) {

        for (Huesped huesped : listHuespedes) {

            if (huesped.getDocumento() == documento) {
                return huesped;
            }
        }

        return null;
    }

    public Huesped buscarHuespedPorTelefono(String telefono) {

        for (Huesped huesped : listHuespedes) {

            if (huesped.getTelefono().equals(telefono)) {
                return huesped;
            }
        }

        return null;
    }

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

    public Habitacion buscarHabitacion(int numero) {

        for (Habitacion habitacion : listHabitaciones) {

            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }

        return null;
    }

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

    public Reserva buscarReserva(int codigo) {

        for (Reserva reserva : listReservas) {

            if (reserva.getCodigo() == codigo) {
                return reserva;
            }
        }

        return null;
    }

    public Reserva eliminarReserva(int codigo) {

        Reserva reserva = buscarReserva(codigo);

        if (reserva != null) {

            listReservas.remove(reserva);

            return reserva;
        }

        return null;
    }

    /**
     * metodo que verifica si un numero es perfecto
     * @param telefono numero que se va a verificar
     * @return true si el numero es perfecto
     */
    public boolean esNumeroPerfecto(String telefono) {

        int numero = Integer.parseInt(telefono);
        int suma = 0;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;
    }

    /**
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

        return total;
    }
}