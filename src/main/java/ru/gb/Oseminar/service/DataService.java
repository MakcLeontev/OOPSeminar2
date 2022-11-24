package ru.gb.Oseminar.service;

import ru.gb.Oseminar.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(long id);


}
