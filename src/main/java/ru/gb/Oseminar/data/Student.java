package ru.gb.Oseminar.data;

public class Student extends User{
    private long studentsID;
    private long studentGroupID;

    public Student(String firstName, String lastName, String patronymic, long studentsID,long studentGroupID) {
        super(firstName, lastName, patronymic);
        this.studentsID = studentsID;
        this.studentGroupID = studentGroupID;
    }

    public long getStudentGroupID() {
        return studentGroupID;
    }

    public void setStudentGroupID(long studentGroupID) {
        this.studentGroupID = studentGroupID;
    }

    public long getStudentsID() {
        return studentsID;
    }

    public void setStudentsID(long studentsID) {
        this.studentsID = studentsID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", studentsID=" + studentsID +
                ", GroupID=" + studentGroupID +
                '}';
    }
}
