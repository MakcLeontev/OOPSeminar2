package ru.gb.Oseminar;

import ru.gb.Oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("name","lastname","patronimic");
}
}