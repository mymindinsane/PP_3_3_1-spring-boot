package ru.javamentor.spring_mvc_hibernate.DAO;

import ru.javamentor.spring_mvc_hibernate.Model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);
    void deleteUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    void updateUser(long id,String name,String email,int age);
}
