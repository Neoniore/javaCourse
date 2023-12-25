package pro.sky.my.javacourse.course2.lesson_5;

public class CheckCredencials {
    public static void checkLoginPassword(String login, String password, String confirmPassword) {
        if (checkLogin(login) != 0){
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword) && checkPassword(password) != 0 && checkPassword(confirmPassword) != 0) {
            throw new WrongPasswordException();
        }
    }

    private static int checkLogin(String login) {
        if (login.contains("dsad") && !login.isEmpty() && login.length() <= 20) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int checkPassword(String password) {
        if (password.contains("dasd") && !password.isEmpty() && password.length() <= 20) {
            return 0;
        } else {
            return 1;
        }
    }
}
