package net.nothing.homework.homework14;

public class User<T> {
    private T id;
    private String userName;

    public User(T id) {
        this.id = id;
    }

    public User(T id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public T getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
