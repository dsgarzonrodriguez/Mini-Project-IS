import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        List<Usuario> usuarios = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        CalculadoraTarifa calculadora = new CalculadoraTarifa();

        int opcion;

        do {

            System.out.println("\n===== PARQUEADERO =====");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar vehículo");
            System.out.println("3. Ingreso vehículo");
            System.out.println("4. Salida vehículo");
            System.out.println("5. Calcular tiempo estacionado");
            System.out.println("6. Calcular tarifa");
            System.out.println("7. Mostrar vehículos estacionados");
            System.out.println("8. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Documento: ");
                    String documento = sc.nextLine();

                    Usuario usuario = new Usuario(nombre, documento);
                    usuarios.add(usuario);

                    System.out.println("Usuario registrado con ID: " + usuario.getId());

                    break;

                case 2:

                    System.out.print("ID del usuario: ");
                    int idUsuario = sc.nextInt();
                    sc.nextLine();

                    Usuario usuarioEncontrado = null;

                    for (Usuario u : usuarios) {
                        if (u.getId() == idUsuario) {
                            usuarioEncontrado = u;
                            break;
                        }
                    }

                    if (usuarioEncontrado == null) {
                        System.out.println("Usuario no encontrado");
                        break;
                    }

                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    Vehiculo vehiculo;

                    if (tipo == 1) {
                        vehiculo = new Carro(placa);
                    } else {
                        vehiculo = new Moto(placa);
                    }

                    usuarioEncontrado.setVehiculo(vehiculo);

                    System.out.println("Vehículo registrado correctamente.");

                    break;

                case 3:

                    System.out.print("ID del usuario: ");
                    int idIngreso = sc.nextInt();

                    for (Usuario u : usuarios) {

                        if (u.getId() == idIngreso && u.getVehiculo() != null) {

                            Vehiculo v = u.getVehiculo();

                            if (v.estaEstacionado()) {
                                System.out.println("El vehículo ya está estacionado.");
                                break;
                            }

                            v.ingresar();

                            Ticket ticket = new Ticket(LocalDateTime.now(), v);
                            tickets.add(ticket);

                            System.out.println("Ticket generado con ID: " + ticket.getId());
                        }
                    }

                    break;

                case 4:

                    System.out.print("ID del ticket: ");
                    int idTicket = sc.nextInt();

                    for (Ticket t : tickets)
                    {

                        if (t.getId() == idTicket && t.getHoraSalida() == null) {

                            t.setHoraSalida(LocalDateTime.now());
                            t.getVehiculo().salir();

                            System.out.println("Salida registrada.");
                        }
                    }

                    break;

                case 5:

                    System.out.print("ID del ticket: ");
                    int idTiempo = sc.nextInt();

                    for (Ticket t : tickets) {

                        if (t.getId() == idTiempo) {
                            t.calcularTiempo();
                        }
                    }

                    break;

                case 6:

                    System.out.print("ID del ticket: ");
                    int idTarifa = sc.nextInt();

                    for (Ticket t : tickets) {

                        if (t.getId() == idTarifa && t.getHoraSalida() != null) {

                            long horas = java.time.Duration
                                    .between(t.getHoraIngreso(), t.getHoraSalida())
                                    .toHours();

                            double total = calculadora.calcularTarifa(horas, t.getVehiculo());

                            System.out.println("Total a pagar: $" + total);
                        }
                    }

                    break;

                case 7:

                    System.out.println("\nVehículos actualmente estacionados:");

                    boolean hayVehiculos = false;

                    for (Usuario u : usuarios) {

                        if (u.getVehiculo() != null && u.getVehiculo().estaEstacionado()) {

                            System.out.println("-----------------------");
                            System.out.println("Usuario: " + u.getNombre());
                            System.out.println("Placa: " + u.getVehiculo().getPlaca());

                            hayVehiculos = true;
                        }
                    }

                    if (!hayVehiculos) {
                        System.out.println("No hay vehículos estacionados.");
                    }

                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

     
        sc.close();
        
    }
   
}

