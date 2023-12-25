package pro.sky.my.javacourse.course2.lesson_5;

public class CheckCredencials {

    public static void checkLoginPassword(String login, String password, String confirmPassword) {
        if (checkCredencialsString(login) != 0){
            throw new WrongLoginException();
        }
        if (!password.equals(confirmPassword) && checkCredencialsString(password) != 0 && checkCredencialsString(confirmPassword) != 0) {
            throw new WrongPasswordException();
        }
    }

    private static int checkCredencialsString(String s) {
        if (s != null && !s.isEmpty() && s.length() <= 20 && s.contains("")) {
            return 0;
        } else {
            return 1;
        }
    }
}
