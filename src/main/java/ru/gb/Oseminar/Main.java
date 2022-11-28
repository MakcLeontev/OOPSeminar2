package ru.gb.Oseminar;

import ru.gb.Oseminar.controller.Controller;
import ru.gb.Oseminar.data.User;
import ru.gb.Oseminar.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        UserService userService = new UserService();
        controller.createUser("Иван","Иванов","Иванович");
        controller.createUser("Иван","Петров","Сергеевич");
        controller.createUser("Федор","Александров","Петрович");
        controller.createUser("Галя","Иванова","Ивановна");
        controller.createUser("Варя","Васильева","Сергеевна");
        controller.createTeacher("Эльдар","Джарахов","Сергеевич",1);
        controller.createTimeTable(controller.showTeacher(),controller.showAllStudents());
//        List<User>users = userService.getAll();
//        System.out.println(users);
//        controller.showUsers(userService.getAll());
//        https://github.com/Zakella/java_GB/tree/lesson_9

}
}