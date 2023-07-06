package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Harry", "Potter", (byte) 11);
        userService.saveUser("Петр", "Верховенский", (byte) 32);
        userService.saveUser("Haruki", "Murakami", (byte) 37);
        userService.saveUser("Barsic", null, (byte) 2);
        List<User> list = userService.getAllUsers();
        System.out.println(list);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
