package ru.gb.Oseminar.view;

import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.StudyGroup;
import ru.gb.Oseminar.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User>users){
        Logger logger = Logger.getAnonymousLogger();
        for (User item:users) {
            logger.info(item.toString());
        }
    }
    public void showOnConsole(List<StudyGroup>studyGroups){
        Logger logger = Logger.getAnonymousLogger();
        List<Student>students = new ArrayList<>();
        for (StudyGroup item:studyGroups) {
            logger.info((item.getTeacher().toString()));
            students=item.getStudentList();
            for (Student item2:students) {
                logger.info(item2.toString());
            }
        }
    }
    public void showStudents(List<Student>students){
        Logger logger = Logger.getAnonymousLogger();
        for (Student item:students) {
            logger.info(item.toString());
        }
    }
}
