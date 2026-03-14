package src.entities;
import java.time.LocalDateTime;

public class Ticket
{
    private static int contadorTicketId = 1;
    private int id;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private Vehiculo vehiculo;
    private Usuario usuario;

    public Ticket(LocalDateTime horaIngreso, Usuario usuario, Vehiculo vehiculo) {
        this.id = contadorTicketId++;
        this.horaIngreso = horaIngreso;
        this.vehiculo = vehiculo;
        this.usuario = usuario;
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

    public Vehiculo getVehiculo()
    {
        return vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso)
    {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraSalida(LocalDateTime horaSalida)
    {
        this.horaSalida = horaSalida;
    }
    
    public void setVehiculo(Vehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
