package negocio;

import data.User;
import java.util.List;

public class Facade implements IFacade {
    private UserService userService = new UserService();

    @Override
    public void addUser(int id, String name) {
        userService.createUser(id, name);
    }

    @Override
    public List<User> getAllUsers() {
        return userService.listUsers();
    }
}
