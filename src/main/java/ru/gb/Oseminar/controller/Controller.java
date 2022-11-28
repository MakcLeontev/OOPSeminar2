package ru.gb.Oseminar.controller;

import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.StudyGroup;
import ru.gb.Oseminar.data.Teacher;
import ru.gb.Oseminar.data.User;
import ru.gb.Oseminar.service.StudyGroupService;
import ru.gb.Oseminar.service.UserService;
import ru.gb.Oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName,lastName, patronymic);
    }
    public void createTeacher(String firstName, String lastName, String patronymic, long teacherID){
        userService.createUser(firstName, lastName, patronymic, teacherID);
    }
    public void createTimeTable(Teacher teacher, List<Student>studentList){
        studyGroupService.formationStudyGroup(teacher,studentList);
        //System.out.println(studyGroupService.getStudyGroupList());
        studentView.showOnConsole(studyGroupService.getStudyGroupList());
    }

    public List<Student> showAllStudents() {
        List<Student> students = new ArrayList<>();
        List<User> users = userService.getAll();
        for (User item:users) {
            if (item instanceof Student){
                students.add((Student)item);
            }
        }
        return students;
    }
    public Teacher showTeacher(){
        List<User> users = userService.getAll();
        List<Teacher>teachers= new ArrayList<>();
        for (User item:users) {
            if (item instanceof Teacher){
                teachers.add((Teacher) item);
                return (Teacher) item;
            }
        }
        return null;
    }

//        studentView.showConsole(users);

//    public void showStudyGroup(List<Student>students){
//        Collections.sort(students,new StudyGroupComparator());
//        studentView.sh
//    }
}
