package src.entities;
public class Carro extends Vehiculo 
{
    // Tarifa fija para carros
    final public double TARIFA_CARRO = 10.0;

    //constructor
    public Carro(String placa)
    {
        super(placa);
    }


    @Override
    public double tarifa() 
    {
        
        return TARIFA_CARRO;
    }
}