package uniquindio.edu.co;

import javax.swing.JOptionPane;
import uniquindio.edu.co.model.*;
/**
 * clase principal del programa StayPlus
 */
public class App {

    /**
     * metodo principal que muestra el menu y permite ejecutar las opciones del programa
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
    public static void main(String[] args) {

        StayPlus stayPlus = new StayPlus(
                "StayPlus", 123456789, "Armenia",
                1234567, "www.stayplus.com"
        );

        int opcion;

        do {
            String menu = """
                    ===== STAYPLUS =====
                    
                    1. Registrar huésped
                    2. Registrar habitación
                    3. Registrar servicio
                    4. Crear reserva
                    5. Buscar reserva
                    6. Eliminar reserva
                    7. Buscar huésped por teléfono
                    8. Calcular ingresos por fecha
                    0. Salir
                    
                    Seleccione una opción:
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    int documento = Integer.parseInt(
                            JOptionPane.showInputDialog("Documento:")
                    );
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String correo = JOptionPane.showInputDialog("Correo:");
                    String procedencia = JOptionPane.showInputDialog("Procedencia:");

                    stayPlus.registrarHuesped(
                            nombre, documento, telefono, correo, procedencia
                    );

                    JOptionPane.showMessageDialog(
                            null, "Huésped registrado correctamente."
                    );
                    break;

                case 2:
                    int numero = Integer.parseInt(
                            JOptionPane.showInputDialog("Número de habitación:")
                    );
                    int piso = Integer.parseInt(
                            JOptionPane.showInputDialog("Piso:")
                    );
                    String tipo = JOptionPane.showInputDialog("Tipo de habitación:");
                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Capacidad máxima:")
                    );
                    double precio = Double.parseDouble(
                            JOptionPane.showInputDialog("Precio por noche:")
                    );
                    String disponibilidad = JOptionPane.showInputDialog(
                            "Disponibilidad:"
                    );
                    String estado = JOptionPane.showInputDialog("Estado:");

                    stayPlus.registrarHabitacion(
                            numero, piso, tipo, capacidad,
                            precio, disponibilidad, estado
                    );

                    JOptionPane.showMessageDialog(
                            null, "Habitación registrada correctamente."
                    );
                    break;

                case 3:
                    int codigoServicio = Integer.parseInt(
                            JOptionPane.showInputDialog("Código del servicio:")
                    );
                    String nombreServicio = JOptionPane.showInputDialog("Nombre:");
                    String descripcion = JOptionPane.showInputDialog("Descripción:");
                    double precioServicio = Double.parseDouble(
                            JOptionPane.showInputDialog("Precio:")
                    );
                    String disponibilidadServicio = JOptionPane.showInputDialog(
                            "Disponibilidad:"
                    );

                    stayPlus.registrarServicio(
                            codigoServicio, nombreServicio, descripcion,
                            precioServicio, disponibilidadServicio
                    );

                    JOptionPane.showMessageDialog(
                            null, "Servicio registrado correctamente."
                    );
                    break;

                case 4:
                    int documentoHuesped = Integer.parseInt(
                            JOptionPane.showInputDialog("Documento del huésped:")
                    );

                    Huesped huesped = stayPlus.buscarHuesped(documentoHuesped);

                    if (huesped == null) {
                        JOptionPane.showMessageDialog(
                                null, "No se encontró el huésped."
                        );
                        break;
                    }

                    int numeroHabitacion = Integer.parseInt(
                            JOptionPane.showInputDialog("Número de habitación:")
                    );

                    Habitacion habitacion =
                            stayPlus.buscarHabitacion(numeroHabitacion);

                    if (habitacion == null) {
                        JOptionPane.showMessageDialog(
                                null, "No se encontró la habitación."
                        );
                        break;
                    }

                    int codigo = Integer.parseInt(
                            JOptionPane.showInputDialog("Código de reserva:")
                    );
                    String fechaRealizacion = JOptionPane.showInputDialog(
                            "Fecha de realización:"
                    );
                    String fechaEntrada = JOptionPane.showInputDialog(
                            "Fecha de entrada:"
                    );
                    String fechaSalida = JOptionPane.showInputDialog(
                            "Fecha de salida:"
                    );
                    String estadoReserva = JOptionPane.showInputDialog(
                            "Estado de la reserva:"
                    );
                    String metodoPago = JOptionPane.showInputDialog(
                            "Método de pago:"
                    );
                    double valorTotal = Double.parseDouble(
                            JOptionPane.showInputDialog("Valor total:")
                    );

                    stayPlus.crearReserva(
                            codigo, fechaRealizacion, fechaEntrada,
                            fechaSalida, estadoReserva, metodoPago,
                            valorTotal, huesped, habitacion
                    );

                    JOptionPane.showMessageDialog(
                            null, "Reserva creada correctamente."
                    );
                    break;

                case 5:
                    int codigoBuscar = Integer.parseInt(
                            JOptionPane.showInputDialog("Código de reserva:")
                    );

                    Reserva reserva = stayPlus.buscarReserva(codigoBuscar);

                    if (reserva != null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Reserva encontrada:\n\n" + reserva
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null, "No se encontró la reserva."
                        );
                    }
                    break;

                case 6:
                    int codigoEliminar = Integer.parseInt(
                            JOptionPane.showInputDialog("Código de reserva:")
                    );

                    Reserva eliminada =
                            stayPlus.eliminarReserva(codigoEliminar);

                    if (eliminada != null) {
                        JOptionPane.showMessageDialog(
                                null, "Reserva eliminada correctamente."
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null, "No se encontró la reserva."
                        );
                    }
                    break;

                case 7:
                    String telefonoBuscar =
                            JOptionPane.showInputDialog("Teléfono del huésped:");

                    Huesped encontrado =
                            stayPlus.buscarHuespedPorTelefono(telefonoBuscar);

                    if (encontrado != null) {

                        boolean perfecto =
                                stayPlus.esNumeroPerfecto(telefonoBuscar);

                        String mensaje =
                                "Huésped encontrado:\n" +
                                        "Nombre: " + encontrado.getNombre() + "\n" +
                                        "Documento: " + encontrado.getDocumento() + "\n" +
                                        "Teléfono: " + encontrado.getTelefono() + "\n";

                        if (perfecto) {
                            mensaje += "\nEl número es perfecto.";
                        } else {
                            mensaje += "\nEl número no es perfecto.";
                        }

                        JOptionPane.showMessageDialog(null, mensaje);

                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "No se encontró un huésped con ese teléfono."
                        );
                    }
                    break;

                case 8:
                    String fecha = JOptionPane.showInputDialog(
                            "Fecha de realización:"
                    );

                    double ingresos =
                            stayPlus.calcularIngresosPorFecha(fecha);

                    JOptionPane.showMessageDialog(
                            null,
                            "Ingresos de la fecha: $" + ingresos
                    );
                    break;

                case 0:
                    JOptionPane.showMessageDialog(
                            null, "Saliendo del sistema..."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null, "Opción no válida."
                    );
            }

        } while (opcion != 0);
    }
}