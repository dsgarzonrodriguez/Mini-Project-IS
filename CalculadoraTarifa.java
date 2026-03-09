public class CalculadoraTarifa
{
    public double calcularTarifa(double hora, Vehiculo vehiculo) {
        return hora * vehiculo.tarifa();
    }    
}
