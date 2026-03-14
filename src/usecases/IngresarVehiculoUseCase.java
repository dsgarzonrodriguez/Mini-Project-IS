package src.usecases;
import src.entities.Vehiculo;
import src.infraestructure.Parqueadero;
import src.ports.UserRepo;

import java.time.LocalDateTime;
import src.entities.Ticket;
import src.entities.Usuario;

public class IngresarVehiculoUseCase
{
    private UserRepo userRepo;

    public IngresarVehiculoUseCase(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public Ticket ingresarVehiculo(Parqueadero parqueadero, String documentoUsuario)
    {
        Usuario usuario = userRepo.obtenerUsuarioPorDocumento(documentoUsuario);
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario no encontrado");
        }
        Vehiculo vehiculo = usuario.getVehiculos().get(0); 
        LocalDateTime fechaIngreso = LocalDateTime.now();
        Ticket ticket = new Ticket(fechaIngreso, usuario, vehiculo);
        parqueadero.addTicket(ticket);
        return ticket;
    }

}



