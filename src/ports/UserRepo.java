package src.ports;

import src.entities.Usuario;

public interface UserRepo
{
    void guardarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(int id);
    Usuario obtenerUsuarioPorDocumento(String documento);
}
