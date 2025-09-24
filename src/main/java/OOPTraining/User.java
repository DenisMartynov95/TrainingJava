package OOPTraining;

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
}
