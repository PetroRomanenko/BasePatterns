package com.ferros.basepatterns.behavioral.chain.MyVariant;

public class User {
    private int userId;
    private String userName;
    private int userPoint;

    public User(int userId, String userName, int userPoint) {
        this.userId = userId;
        this.userName = userName;
        this.userPoint = userPoint;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserPoint() {
        return userPoint;
    }
}
