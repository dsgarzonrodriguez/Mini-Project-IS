package src.entities;
public abstract class Vehiculo implements Estacionable
{
    private static int contadorVehiculoId = 1;
    protected int id;
    protected String placa;
    protected Boolean estacionado;
    public abstract double tarifa();

    public Vehiculo(String placa) {
        this.placa = placa;
        this.id = contadorVehiculoId++;
        this.estacionado = false;
    }

    @Override
    public void ingresar() {
        estacionado = true;
        System.out.println("Vehículo con placa " + placa + " ha ingresado al parqueadero.");
    }
    
    @Override
    public void salir() {
        estacionado = false;
        System.out.println("Vehículo con placa " + placa + " ha salido del parqueadero.");
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public Boolean estaEstacionado() {
        return estacionado;
    }

}
