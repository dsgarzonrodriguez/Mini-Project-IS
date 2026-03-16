package src.usecases;
import java.time.Duration;
import src.entities.Ticket;
import src.infraestructure.CalculadoraTarifa;


public class CalcularTarifaUseCase
{
    public double calcularTarifa(Ticket ticket)
    {
        Duration duracion = Duration.between(ticket.getHoraIngreso(), ticket.getHoraSalida());
        long minutos = duracion.toMinutes();
        CalculadoraTarifa calculadora = new CalculadoraTarifa();
        return calculadora.calcularTarifa(minutos, ticket.getVehiculo());
    }
}
