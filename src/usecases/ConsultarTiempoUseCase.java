package src.usecases;
import src.entities.Ticket;

public class ConsultarTiempoUseCase
{
    public long consultarTipo(Ticket ticket)
    {
        if (ticket.getHoraSalida() == null)
        {
            return java.time.Duration.between(ticket.getHoraIngreso(), java.time.LocalDateTime.now()).toMinutes();
        }
        else
        {
            return java.time.Duration.between(ticket.getHoraIngreso(), ticket.getHoraSalida()).toMinutes();
        }
    }
}
