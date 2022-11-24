package ru.gb.Oseminar.data;

public class Teacher extends User{
    private long teacherID;

    public Teacher(String firstName, String lastName, String patronymic, long teacherID) {
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }
}
