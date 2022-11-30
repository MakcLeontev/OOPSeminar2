package ru.gb.Oseminar.data;

public class Teacher extends User{
    private long teacherID;
    private  long teacherGroupID;

    public Teacher(String firstName, String lastName, String patronymic, long teacherID,long teacherGroupID) {
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
        this.teacherGroupID = teacherGroupID;
    }

    public long getTeacherGroupID() {
        return teacherGroupID;
    }

    public void setTeacherGroupID(long teacherGroupID) {
        this.teacherGroupID = teacherGroupID;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                "teacherID=" + teacherID +
                '}';
    }
}
