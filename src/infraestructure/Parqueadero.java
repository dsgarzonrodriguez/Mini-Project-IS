package src.infraestructure;
import java.util.ArrayList;
import java.util.List;

import src.entities.Ticket;

public class Parqueadero
{
    private String nombre;
    private List<Ticket> tickets;

    public Parqueadero(String nombre)
    {
        this.nombre = nombre;
        this.tickets = new ArrayList<>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void addTicket(Ticket ticket)
    {
        tickets.add(ticket);
    }

    public List<Ticket> getTickets()
    {
        return tickets;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setTickets(List<Ticket> tickets)
    {
        this.tickets = tickets;
    }
    


}
