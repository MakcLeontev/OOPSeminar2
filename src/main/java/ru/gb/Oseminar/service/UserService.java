package ru.gb.Oseminar.service;

import ru.gb.Oseminar.data.Student;
import ru.gb.Oseminar.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserService implements DataService{
    private final List<User>users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        long id = 0L;
        for (User item:users) {
            if(item instanceof Student){
                if(id>((Student)item).getStudentsID()){
                    id=((Student)item).getStudentsID();
                }
            }
        }
        this.users.add(new Student(firstName,lastName,patronymic,++id));

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(long id) {
        for (User item:this.users) {
            if(item instanceof Student){
                if(Objects.equals(id, ((Student) item).getStudentsID())){
                   this.users.remove(item);
                }
            }
        }
    }
}
