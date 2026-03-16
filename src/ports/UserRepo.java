package src.ports;

import java.util.List;

import src.entities.Usuario;

public interface UserRepo
{
    void guardarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(int id);
    Usuario obtenerUsuarioPorDocumento(String documento);
    List<Usuario> obtenerTodos();
}
