package pe.edu.upc.catchthem.serviceInterfaces;

import pe.edu.upc.catchthem.entities.Role;
import java.util.List;

public interface IRoleService {
    public void ingresar(Role role);
    public List<Role> listar();

    public void eliminar(long id);
}
