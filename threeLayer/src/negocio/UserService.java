package negocio;

import data.User;
import data.UserDAO;

import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void createUser(int id, String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        userDAO.save(new User(id, name));
    }

    public List<User> listUsers() {
        return userDAO.findAll();
    }
}
