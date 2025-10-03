package negocio;

import data.User;
import java.util.List;

public interface IFacade {
    void addUser(int id, String name);
    List<User> getAllUsers();
}
