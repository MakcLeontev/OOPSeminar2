package ru.gb.Oseminar.service;

import ru.gb.Oseminar.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String lastName, String patronymic);

    void createUser(String firstName, String lastName, String patronymic, long teacherID);

    List<User> getAll();
    void deleteUser(long id);


}
