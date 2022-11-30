package ru.gb.Oseminar.controller;

import ru.gb.Oseminar.data.*;
import ru.gb.Oseminar.service.StudyGroupService;
import ru.gb.Oseminar.service.UserService;
import ru.gb.Oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String lastName, String patronymic,long groupID){
        userService.createStudent(firstName,lastName, patronymic, groupID);
    }
    public void createTeacher(String firstName, String lastName, String patronymic, long teacherID, long groupID){
        userService.createTeacher(firstName, lastName, patronymic, teacherID, groupID);
    }
    public void createTimeTable(Teacher teacher, List<Student>studentList){
        studyGroupService.formationStudyGroup(teacher,studentList);
        //studentView.showOnConsole(studyGroupService.getStudyGroupList());
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
    public List<Student> showOneGroupStudents(int numberGroup){
        List<Student>students = new ArrayList<>();
        List<User> users = userService.getAll();
        for (User item:users) {
            if (item instanceof Student){
                if (((Student)item).getStudentGroupID() == numberGroup){
                    students.add((Student) item);
                }
            }
        }
        return students;
    }
    public Teacher showTeacherGroup(int numberGroup){
        List<User> users = userService.getAll();
        for (User item:users) {
            if (item instanceof Teacher){
                if (((Teacher) item).getTeacherGroupID() == numberGroup){
                    return (Teacher) item;
                }
            }
        }
        return null;
    }
//    public void showSortStudentsINStudyGroup(List<Student>students){
//        Collections.sort(students,new StudyGroupComparator());
//        studentView.showStudents(students);
//    }
    public List<StudyGroup> getStudyGroup(){
        return studyGroupService.getStudyGroupList();
    }
    public void sortAllStudyGroup(List<StudyGroup>studyGroups){
        List<Student>students = new ArrayList<>();
        for (StudyGroup item:studyGroups) {
            students.addAll(item.getStudentList());
        }
        Collections.sort(students,new StudyGroupComparator());
        studentView.showStudents(students);
    }
}
