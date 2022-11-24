package ru.gb.Oseminar.controller;

import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.User;
import ru.gb.Oseminar.service.UserService;
import ru.gb.Oseminar.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName,lastName, patronymic);
        List<User>students = userService.getAll();
        studentView.sendOnConsole(students);

    }

}
