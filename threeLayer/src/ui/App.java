package ui;

import negocio.Facade;
import negocio.IFacade;
import data.User;

import java.util.List;

public class App {
    public static void main(String[] args) {
        IFacade facade = new Facade();

        facade.addUser(1, "Alice");
        facade.addUser(2, "Bob");

        List<User> users = facade.getAllUsers();
        System.out.println("Usuários cadastrados:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
