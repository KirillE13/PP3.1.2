package kata.group.pp_3_1_2.service;


import kata.group.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
