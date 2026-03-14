package src.entities;
public class Moto extends Vehiculo {

    // Tarifa fija para motos
    final public double TARIFA_MOTO = 5.0;

    //constructor
    public Moto(String placa)
    {
        super(placa);
    }


    @Override
    public double tarifa() 
    {
        return TARIFA_MOTO;
    }
}