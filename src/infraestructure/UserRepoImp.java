package src.infraestructure;

import java.util.List;

import src.entities.Usuario;
import src.ports.UserRepo;

public class UserRepoImp implements UserRepo
{
    private List<Usuario> usuarios;
    
    public UserRepoImp(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public void guardarUsuario(Usuario usuario) 
    {
        usuarios.add(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) 
    {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null; 
    }

    @Override
    public Usuario obtenerUsuarioPorDocumento(String documento)
    {
        for (Usuario usuario : usuarios) {
            if (usuario.getDocumento().equals(documento)) {
                return usuario;
            }
        }
        return null;
    }
    
}
