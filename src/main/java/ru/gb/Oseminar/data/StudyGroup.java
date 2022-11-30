package ru.gb.Oseminar.data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student>studentList;
    private static long groupID=0;

//    public List<Student> fillingStudentList()


    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
//        groupID = ++groupID;
//        for (Student item:studentList) {
//            item.setStudentGroupID(groupID);
//        }
    }

    public static long getGroupID() {
        return groupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
//                ", groupID=" +groupID+
                '}';
    }

}
