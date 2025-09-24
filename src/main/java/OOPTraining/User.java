package OOPTraining;

import java.util.Scanner;

public class User {
    /*
    ❓ Задача 1. Класс User

    Создай класс User:

    Приватные поля: login, password.

    Конструктор, который инициализирует оба поля.

    Сделай так, чтобы получить пароль напрямую нельзя (никакого getPassword()).

    Добавь метод checkPassword(String input) → возвращает true/false.

    👉 Попробуй создать пользователя и проверить несколько паролей.
     */

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String input = scanner.next();
        if (input.equals(password)) {
            System.out.println("true");
        }
        System.out.println("false");
    }



}
