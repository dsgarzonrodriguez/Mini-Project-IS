package src.usecases;
import java.time.LocalDateTime;
import src.entities.Ticket;
import src.infraestructure.Parqueadero;

public class SalidaVehiculoUseCase
{
    public void salidaVehiculo(Parqueadero parqueadero, String placa)
    {
        for (Ticket ticket : parqueadero.getTickets())
        {
            if(ticket.getVehiculo().getPlaca().equals(placa) && ticket.getHoraSalida() == null)
            {
                ticket.setHoraSalida(LocalDateTime.now());
                ticket.getVehiculo().salir();
                double tiempoEstacionado = new CalcularTarifaUseCase().calcularTarifa(ticket);
                System.out.println("El vehículo con placa " + placa + " ha salido. Tiempo estacionado: " + tiempoEstacionado + " minutos.");
            }
        }
    }
}
