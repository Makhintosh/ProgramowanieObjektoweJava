package Klasy;

public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        setAge(age);
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny.");
        }
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void showUser() {
        System.out.println(
                "Login: " + login + ", hasło: ***" + ", wiek: " + age
        );
    }
}