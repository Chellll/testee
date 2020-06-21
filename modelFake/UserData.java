package com.example.mazito_game.modelFake;

public class UserData {

    public static User getUser(){
        User user = new User();

        user.setEmail("mr.dark051@yandex.ru");
        user.setPassword("zxcvbnmAS123");
        user.setMonet(3000);
        user.setName("Nikita");
        user.setPhone("89674781443");

        return user;
    }

    public static  User getGuestUser(){
        User user = new User();

        user.setMonet(3000);
        user.setName("Guest6451");

        return user;
    }

}
