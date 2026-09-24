import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        StayPlus stayPlus = new StayPlus(
                "StayPlus",
                123456789,
                "Armenia",
                1234567,
                "www.stayplus.com"
        );

        int opcion;

        do {

            String menu = """
                    ===== STAYPLUS =====
                    
                    1. Registrar huésped
                    2. Crear reserva
                    3. Registrar habitación
                    4. Registrar servicio
                    5. Buscar reserva
                    6. Eliminar reserva
                    0. Salir
                    
                    Seleccione una opción:
                    """;

            String opcionTexto = JOptionPane.showInputDialog(menu);

            if (opcionTexto == null) {
                break;
            }

            opcion = Integer.parseInt(opcionTexto);

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog(
                            "Ingrese el nombre del huésped:"
                    );

                    if (nombre == null) {
                        break;
                    }

                    String documentoTexto = JOptionPane.showInputDialog(
                            "Ingrese el documento:"
                    );

                    if (documentoTexto == null) {
                        break;
                    }

                    int documento = Integer.parseInt(documentoTexto);

                    String telefonoTexto = JOptionPane.showInputDialog(
                            "Ingrese el teléfono:"
                    );

                    if (telefonoTexto == null) {
                        break;
                    }

                    int telefono = Integer.parseInt(telefonoTexto);

                    String correo = JOptionPane.showInputDialog(
                            "Ingrese el correo electrónico:"
                    );

                    if (correo == null) {
                        break;
                    }

                    String procedencia = JOptionPane.showInputDialog(
                            "Ingrese el país de procedencia:"
                    );

                    if (procedencia == null) {
                        break;
                    }

                    stayPlus.registrarHuesped(
                            nombre,
                            documento,
                            telefono,
                            correo,
                            procedencia
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Huésped registrado correctamente."
                    );

                    break;


                case 2:

                    String documentoHuespedTexto = JOptionPane.showInputDialog(
                            "Ingrese el documento del huésped:"
                    );

                    if (documentoHuespedTexto == null) {
                        break;
                    }

                    int documentoHuesped = Integer.parseInt(
                            documentoHuespedTexto
                    );

                    Huesped huesped = stayPlus.buscarHuesped(
                            documentoHuesped
                    );

                    if (huesped == null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No se encontró el huésped."
                        );

                        break;
                    }

                    String numeroHabitacionTexto = JOptionPane.showInputDialog(
                            "Ingrese el número de la habitación:"
                    );

                    if (numeroHabitacionTexto == null) {
                        break;
                    }

                    int numeroHabitacion = Integer.parseInt(
                            numeroHabitacionTexto
                    );

                    Habitacion habitacion = stayPlus.buscarHabitacion(
                            numeroHabitacion
                    );

                    if (habitacion == null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No se encontró la habitación."
                        );

                        break;
                    }

                    String codigoTexto = JOptionPane.showInputDialog(
                            "Ingrese el código de la reserva:"
                    );

                    if (codigoTexto == null) {
                        break;
                    }

                    int codigo = Integer.parseInt(codigoTexto);

                    String fechaRealizacion = JOptionPane.showInputDialog(
                            "Ingrese la fecha de realización:"
                    );

                    if (fechaRealizacion == null) {
                        break;
                    }

                    String fechaEntrada = JOptionPane.showInputDialog(
                            "Ingrese la fecha de entrada:"
                    );

                    if (fechaEntrada == null) {
                        break;
                    }

                    String fechaSalida = JOptionPane.showInputDialog(
                            "Ingrese la fecha de salida:"
                    );

                    if (fechaSalida == null) {
                        break;
                    }

                    String estadoReserva = JOptionPane.showInputDialog(
                            "Ingrese el estado de la reserva:"
                    );

                    if (estadoReserva == null) {
                        break;
                    }

                    String metodoPago = JOptionPane.showInputDialog(
                            "Ingrese el método de pago:"
                    );

                    if (metodoPago == null) {
                        break;
                    }

                    String valorTotalTexto = JOptionPane.showInputDialog(
                            "Ingrese el valor total:"
                    );

                    if (valorTotalTexto == null) {
                        break;
                    }

                    double valorTotal = Double.parseDouble(
                            valorTotalTexto
                    );

                    stayPlus.crearReserva(
                            codigo,
                            fechaRealizacion,
                            fechaEntrada,
                            fechaSalida,
                            estadoReserva,
                            metodoPago,
                            valorTotal,
                            huesped,
                            habitacion
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Reserva creada correctamente."
                    );

                    break;


                case 3:

                    String numeroTexto = JOptionPane.showInputDialog(
                            "Ingrese el número de la habitación:"
                    );

                    if (numeroTexto == null) {
                        break;
                    }

                    int numero = Integer.parseInt(numeroTexto);

                    String pisoTexto = JOptionPane.showInputDialog(
                            "Ingrese el piso:"
                    );

                    if (pisoTexto == null) {
                        break;
                    }

                    int piso = Integer.parseInt(pisoTexto);

                    String tipoHabitacion = JOptionPane.showInputDialog(
                            "Ingrese el tipo de habitación:"
                    );

                    if (tipoHabitacion == null) {
                        break;
                    }

                    String capacidadTexto = JOptionPane.showInputDialog(
                            "Ingrese la capacidad máxima:"
                    );

                    if (capacidadTexto == null) {
                        break;
                    }

                    int capacidadMaxima = Integer.parseInt(
                            capacidadTexto
                    );

                    String precioTexto = JOptionPane.showInputDialog(
                            "Ingrese el precio por noche:"
                    );

                    if (precioTexto == null) {
                        break;
                    }

                    double precioNoche = Double.parseDouble(
                            precioTexto
                    );

                    String disponibilidadHabitacion =
                            JOptionPane.showInputDialog(
                                    "Ingrese la disponibilidad:"
                            );

                    if (disponibilidadHabitacion == null) {
                        break;
                    }

                    String estadoHabitacion =
                            JOptionPane.showInputDialog(
                                    "Ingrese el estado de la habitación:"
                            );

                    if (estadoHabitacion == null) {
                        break;
                    }

                    stayPlus.registrarHabitacion(
                            numero,
                            piso,
                            tipoHabitacion,
                            capacidadMaxima,
                            precioNoche,
                            disponibilidadHabitacion,
                            estadoHabitacion
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Habitación registrada correctamente."
                    );

                    break;


                case 4:

                    String codigoServicioTexto =
                            JOptionPane.showInputDialog(
                                    "Ingrese el código del servicio:"
                            );

                    if (codigoServicioTexto == null) {
                        break;
                    }

                    int codigoServicio = Integer.parseInt(
                            codigoServicioTexto
                    );

                    String nombreServicio =
                            JOptionPane.showInputDialog(
                                    "Ingrese el nombre del servicio:"
                            );

                    if (nombreServicio == null) {
                        break;
                    }

                    String descripcionServicio =
                            JOptionPane.showInputDialog(
                                    "Ingrese la descripción del servicio:"
                            );

                    if (descripcionServicio == null) {
                        break;
                    }

                    String precioServicioTexto =
                            JOptionPane.showInputDialog(
                                    "Ingrese el precio del servicio:"
                            );

                    if (precioServicioTexto == null) {
                        break;
                    }

                    double precioServicio = Double.parseDouble(
                            precioServicioTexto
                    );

                    String disponibilidadServicio =
                            JOptionPane.showInputDialog(
                                    "Ingrese la disponibilidad del servicio:"
                            );

                    if (disponibilidadServicio == null) {
                        break;
                    }

                    stayPlus.registrarServicio(
                            codigoServicio,
                            nombreServicio,
                            descripcionServicio,
                            precioServicio,
                            disponibilidadServicio
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Servicio registrado correctamente."
                    );

                    break;


                case 5:

                    String codigoBuscarTexto =
                            JOptionPane.showInputDialog(
                                    "Ingrese el código de la reserva:"
                            );

                    if (codigoBuscarTexto == null) {
                        break;
                    }

                    int codigoBuscar = Integer.parseInt(
                            codigoBuscarTexto
                    );

                    Reserva reserva = stayPlus.buscarReserva(
                            codigoBuscar
                    );

                    if (reserva != null) {

                        JOptionPane.showMessageDialog(
                                null,
                                reserva.toString()
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "No se encontró la reserva."
                        );
                    }

                    break;


                case 6:

                    String codigoEliminarTexto =
                            JOptionPane.showInputDialog(
                                    "Ingrese el código de la reserva:"
                            );

                    if (codigoEliminarTexto == null) {
                        break;
                    }

                    int codigoEliminar = Integer.parseInt(
                            codigoEliminarTexto
                    );

                    Reserva reservaEliminada =
                            stayPlus.eliminarReserva(
                                    codigoEliminar
                            );

                    if (reservaEliminada != null) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Reserva eliminada correctamente."
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "No se encontró la reserva."
                        );
                    }

                    break;


                case 0:

                    JOptionPane.showMessageDialog(
                            null,
                            "Saliendo del sistema..."
                    );

                    break;


                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );

                    break;
            }

        } while (opcion != 0);
    }
}