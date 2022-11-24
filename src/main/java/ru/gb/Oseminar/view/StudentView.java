package ru.gb.Oseminar.view;

import ru.gb.Oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User>users){
        Logger logger = Logger.getAnonymousLogger();

        for (User item:users) {
            logger.info(item.toString());
        }
    }
}
