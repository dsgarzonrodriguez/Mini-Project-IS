package src.usecases;

import src.entities.Usuario;
import src.ports.UserRepo;

public class RegistrarUsuarioUseCase
{
    private UserRepo userRepo;

    public void registrarUsuario(String nombre, String documento)
    {
        if (userRepo.obtenerUsuarioPorDocumento(documento) != null) {
            throw new IllegalArgumentException("El documento ya está registrado");
        }

        Usuario nuevoUsuario = new Usuario(nombre, documento);
        userRepo.guardarUsuario(nuevoUsuario);
    }
}
