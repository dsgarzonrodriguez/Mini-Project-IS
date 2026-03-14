package src.usecases;
import src.entities.Vehiculo;
import src.infraestructure.Parqueadero;
import java.time.LocalDateTime;
import src.entities.Ticket;
import src.entities.Usuario;

public class IngresarVehiculoUseCase
{
    public Ticket ingresarVehiculo(Parqueadero parqueadero, Usuario usuario)
    {
        Vehiculo vehiculo = usuario.getVehiculo();
        LocalDateTime fechaIngreso = LocalDateTime.now();
        Ticket ticket = new Ticket(fechaIngreso, usuario, vehiculo);
        parqueadero.addTicket(ticket);
        return ticket;
    }
}



