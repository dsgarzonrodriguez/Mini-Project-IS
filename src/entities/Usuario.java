package src.entities;
public class Usuario
{
    //contadorId se utiliza para generar un id único para cada usuario creado
    private static int contadorUserId = 1;
    private int id;
    private String nombre;
    private String documento;
    private Vehiculo vehiculo;

    public Usuario(String nombre, String documento) {
        this.id = contadorUserId++;
        this.nombre = nombre;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }

    public String setDocumento(String documento) {
        return this.documento = documento;
    }

     public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}