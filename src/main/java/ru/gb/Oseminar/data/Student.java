package ru.gb.Oseminar.data;

public class Student extends User{
    private long studentsID;

    public Student(String firstName, String lastName, String patronymic, long studentsID) {
        super(firstName, lastName, patronymic);
        this.studentsID = studentsID;
    }

    public long getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(long studentsID) {
        this.studentsID = studentsID;
    }
}
