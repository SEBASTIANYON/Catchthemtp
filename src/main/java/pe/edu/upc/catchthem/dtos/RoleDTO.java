package pe.edu.upc.catchthem.dtos;

import pe.edu.upc.catchthem.entities.Users;

public class RoleDTO {
    private long id;
    private String rol;
    private Users user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
