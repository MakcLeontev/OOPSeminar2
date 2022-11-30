package ru.gb.Oseminar;

import ru.gb.Oseminar.controller.Controller;
import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.User;
import ru.gb.Oseminar.service.StudyGroupService;
import ru.gb.Oseminar.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createUser("Иван","Иванов","Иванович",1);
        controller.createUser("Иван","Петров","Сергеевич",1);
        controller.createUser("Федор","Александров","Петрович",1);
        controller.createUser("Галя","Иванова","Ивановна",1);
        controller.createUser("Варя","Васильева","Сергеевна",1);
        controller.createTeacher("Эльдар","Джарахов","Сергеевич",1,1);
        controller.createTimeTable(controller.showTeacherGroup(1),controller.showOneGroupStudents(1));

        controller.createUser("Дима","Александров","Иванович",2);
        controller.createUser("Еремей","Петров","Сергеевич",2);
        controller.createUser("Ирина","Александрова","Петровна",2);
        controller.createUser("Татьяна","Иванова","Ивановна",2);
        controller.createUser("Евгения","Петрова","Сергеевна",2);
        controller.createTeacher("Алексей","Урываев","Сергеевич",2,2);
        controller.createTimeTable(controller.showTeacherGroup(2),controller.showOneGroupStudents(2));

        controller.sortAllStudyGroup(controller.getStudyGroup());


}
}