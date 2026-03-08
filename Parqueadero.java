import java.util.List;

public class Parqueadero
{
    private String nombre;
    private List<Ticket> tickets;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    


}
