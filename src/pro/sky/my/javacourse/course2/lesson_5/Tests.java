package pro.sky.my.javacourse.course2.lesson_5;

public class Tests {
    public static void main(String[] args) {
        String login = "log_in";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            CheckCredencials.checkLoginPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Некорректный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Некорректный пароль или пароли не совпадают");
        }
    }
}
