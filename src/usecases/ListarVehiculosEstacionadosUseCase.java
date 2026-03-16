package src.usecases;

import java.util.ArrayList;
import java.util.List;

import src.entities.Usuario;
import src.entities.Vehiculo;
import src.ports.UserRepo;

public class ListarVehiculosEstacionadosUseCase {

    private UserRepo userRepository;

    public ListarVehiculosEstacionadosUseCase(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<Vehiculo> listarVehiculosEstacionados() {

        List<Vehiculo> estacionados = new ArrayList<>();

        List<Usuario> usuarios = userRepository.obtenerTodos();

        for (Usuario usuario : usuarios) {

            for (Vehiculo vehiculo : usuario.getVehiculos()) {

                if (vehiculo.estaEstacionado()) {
                    estacionados.add(vehiculo);
                }

            }
        }

        return estacionados;
    }
}