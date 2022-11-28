package ru.gb.Oseminar.service;

import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.StudyGroup;
import ru.gb.Oseminar.data.Teacher;
import ru.gb.Oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final List<StudyGroup>studyGroupList;

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void formationStudyGroup(Teacher teacher, List<Student>studentList){
        this.studyGroupList.add(new StudyGroup(teacher,studentList));
    }

}
