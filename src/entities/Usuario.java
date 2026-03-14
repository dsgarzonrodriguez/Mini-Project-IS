package src.entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    //contadorId se utiliza para generar un id único para cada usuario creado
    private static int contadorUserId = 1;
    private int id;
    private String nombre;
    private String documento;
    private List<Vehiculo> vehiculos;

    public Usuario(String nombre, String documento) {
        this.id = contadorUserId++;
        this.nombre = nombre;
        this.documento = documento;
        this.vehiculos = new ArrayList<>();
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

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
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

    public List<Vehiculo> setVehiculos(List<Vehiculo> vehiculos) {
        return this.vehiculos = vehiculos;
    }
}