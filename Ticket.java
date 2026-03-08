import java.time.LocalDateTime;

public class Ticket
{
    private static int contadorTicketId = 1;
    private int id;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private Vehiculo vehiculo;

    public Ticket(LocalDateTime horaIngreso, Vehiculo vehiculo) {
        this.id = contadorTicketId++;
        this.horaIngreso = horaIngreso;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void calcularTiempo()
    {
        if (horaSalida != null) {
            long horas = java.time.Duration.between(horaIngreso, horaSalida).toHours();
            System.out.println("Tiempo estacionado: " + horas + " horas");
        } else {
            System.out.println("El vehículo aún no ha salido.");
        }
    }

}
